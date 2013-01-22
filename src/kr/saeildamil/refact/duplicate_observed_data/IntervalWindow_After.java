package kr.saeildamil.refact.duplicate_observed_data;

import java.awt.EventQueue;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntervalWindow_After extends JFrame implements Observer {
	private Interval _subject;

	private JPanel contentPane;
	private JTextField _startField;
	private JTextField _endField;
	private JTextField _lengthField;

	private JDialog dlg;
	private boolean isShowDlg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntervalWindow_After frame = new IntervalWindow_After();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IntervalWindow_After() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("5dlu"),
						FormFactory.DEFAULT_COLSPEC, ColumnSpec.decode("5dlu"),
						ColumnSpec.decode("default:grow"), }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, }));

		JLabel lblStart = new JLabel("Start");
		contentPane.add(lblStart, "2, 2");

		_startField = new JTextField("0");
		_startField.addFocusListener(listener);
		contentPane.add(_startField, "4, 2, fill, default");
		_startField.setColumns(10);

		JLabel lblEnd = new JLabel("End");
		contentPane.add(lblEnd, "2, 4");

		_endField = new JTextField("0");
		_endField.addFocusListener(listener);
		contentPane.add(_endField, "4, 4, fill, default");
		_endField.setColumns(10);

		JLabel lblLength = new JLabel("Length");
		contentPane.add(lblLength, "2, 6");

		_lengthField = new JTextField("0");
		_lengthField.addFocusListener(listener);
		contentPane.add(_lengthField, "4, 6, fill, default");
		_lengthField.setColumns(10);

		btnOpenIntervalProperties = new JButton("Open Interval Properties");
		btnOpenIntervalProperties
				.addActionListener(new BtnOpenIntervalPropertiesActionListener());
		contentPane.add(btnOpenIntervalProperties, "4, 10");

		_subject = new Interval();
		_subject.addObserver(this);
		update(_subject, null);
	}

	FocusAdapter listener = new FocusAdapter() {
		public void focusLost(FocusEvent e) {
			Object object = e.getSource();
			if (object == _startField)
				StartField_FocusLost(e);
			else if (object == _endField)
				EndField_FocusLost(e);
			else if (object == _lengthField)
				LengthField_FocusLost(e);
		}

		@Override
		public void focusGained(FocusEvent e) {
			Object object = e.getSource();
			if (object == _startField)
				_startField.selectAll();
			else if (object == _endField)
				_endField.selectAll();
			else if (object == _lengthField)
				_lengthField.selectAll();
		}
	};
	private JButton btnOpenIntervalProperties;

	public void StartField_FocusLost(FocusEvent e) {
		setStart(_startField.getText());
		if (isNotInteger(getStart()))
			setStart("0");
		calculateLength();
	}

	public void LengthField_FocusLost(FocusEvent e) {
		setLength(_lengthField.getText());
		if (isNotInteger(getLength()))
			setLength("0");
		calculateEnd();
	}

	public void EndField_FocusLost(FocusEvent e) {
		setEnd(_endField.getText());
		if (isNotInteger(getEnd()))
			setEnd("0");
		calculateLength();
	}

	private boolean isNotInteger(String text) {
		try {
			Integer.parseInt(text);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		_endField.setText(_subject.getEnd());
		_startField.setText(_subject.getStart());
		_lengthField.setText(_subject.getLength());
	}

	String getStart() {
		return _subject.getStart();
	}

	String getEnd() {
		return _subject.getEnd();
	}

	String getLength() {
		return _subject.getLength();
	}

	void setStart(String arg) {
		_subject.setStart(arg);
	}

	void setEnd(String arg) {
		_subject.setEnd(arg);
	}

	void setLength(String arg) {
		_subject.setLength(arg);
	}

	void calculateEnd() {
		_subject.calculateEnd();
	}

	void calculateLength() {
		_subject.calculateLength();
	}

	private class BtnOpenIntervalPropertiesActionListener implements
			ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (isShowDlg){
				dlg.setVisible(false);
				isShowDlg = false;
			} else {
				dlg = new JDialog();
				dlg.setSize(200, 120);
				IntervarPanel panel = new IntervarPanel();
				panel.getStartfield().setText(getStart());
				panel.getEndfield().setText(getEnd());
				panel.getLengthfield().setText(getLength());
				dlg.add(panel);

				dlg.setVisible(true);
				isShowDlg = true;
			}
		}
	}
}
