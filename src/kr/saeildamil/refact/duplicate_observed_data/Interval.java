package kr.saeildamil.refact.duplicate_observed_data;

import java.util.Observable;

public class Interval extends Observable {
	private String _end = "0";
	private String _start = "0";
	private String _length = "0";
	
	String getEnd(){
		return _end;
	}

	String getStart() {
		return _start;
	}

	String getLength() {
		return _length;
	}

	void setLength(String arg){
		_length = arg;
		setChanged();
		notifyObservers();
	}
	void setStart(String arg){
		_start = arg;
		setChanged();
		notifyObservers();
	}
	void setEnd(String arg){
		_end = arg;
		setChanged();
		notifyObservers();
	}
	
	void calculateEnd() {
		try {
			int start = Integer.parseInt(getStart());
			int length = Integer.parseInt(getLength());
			int end = start + length;
			setEnd(String.valueOf(end));
		} catch (NumberFormatException e) {
			throw new RuntimeException("잘못된 숫자 형식 에러-end");
		}		
	}
	void calculateLength() {
		try {
			int start = Integer.parseInt(getStart());
			int end = Integer.parseInt(getEnd());
			int length = end - start;
			setLength(String.valueOf(length));
		} catch (NumberFormatException e) {
			throw new RuntimeException("잘못된 숫자 형식 에러-len");
		}
	}
}
