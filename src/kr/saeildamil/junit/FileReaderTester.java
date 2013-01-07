package kr.saeildamil.junit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FileReaderTester extends TestCase {
	private FileReader _input;
	private FileReader _empty;
	
	public FileReaderTester(String name){
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		try{
			_input = new FileReader("data.txt");
			_empty = newEmptyFile();
		}catch (FileNotFoundException e){
			throw new RuntimeException("테스트 파일을 열 수 없음");
		}
	}

	private FileReader newEmptyFile() throws IOException {
		File empty =  new File("empty.txt");
		FileOutputStream out = new FileOutputStream(empty);
		out.close();
		return new FileReader(empty);
	}

	@Override
	protected void tearDown() throws Exception {
		try{
			_input.close();
		}catch(IOException e){
			throw new RuntimeException("테스트 파일 닫는 중 에러 발생");
		}
		super.tearDown();
	}
	
	public void testRead() throws IOException {
		char ch='&';
		for(int i=0; i<5 ; i++)
			ch = (char) _input.read();
		assertEquals('m', ch);
	}
	
	public void testReadAtEnd() throws IOException{
		int ch=-1234;
		for (int i=0; i<140; i++){
			ch = _input.read();
		}
		assertEquals("read at end", -1 , _input.read());
	}
	
	public void testReadBoundaries() throws IOException{
		assertEquals("read first char", 'B', _input.read());
		int ch;
		for(int i=1; i< 139; i++){
			ch = _input.read();
			
		}
		assertEquals("read last char", '6', _input.read());
		assertEquals("read at end", -1, _input.read());
		assertEquals("read past end", -1, _input.read());
	}
	
	public void testEmptyRead() throws IOException{
		assertEquals(-1, _empty.read());
	}
	
	public void testReadAfterClose() throws IOException{
		_input.close();
		try{
			_input.read();
			fail("read past end에 예외가 발생하지 않음");
		}catch(IOException e){
			
		}
	}
	
/*	public static Test suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(new FileReaderTester("testRead"));
		suite.addTest(new FileReaderTester("testReadAtEnd"));
		suite.addTest(new FileReaderTester("testReadBoundaries"));
		return suite;
	}*/
	
	public static void main(String[] args) {
		//junit.textui.TestRunner.runAndWait(suite());
		junit.textui.TestRunner.run(new TestSuite(FileReaderTester.class));
	}
}
