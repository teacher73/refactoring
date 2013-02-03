/**
 *
 * @package		: kr.saeildamil.refact.conditional.decompose_conditional
 * @FileName	: Decompose_Conditional.java
 * @Date  		: 2013. 2. 3.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.refact.conditional;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 조건문 쪼개기
 * @author	mskim
 * @since	2013. 2. 3. 오전 10:49:52
 * @version	1.0.0
 */

public class Decompose_Conditional {
	public static Date SUMMER_START;
	public static Date SUMMER_END;
	public Date date;
	private double charge;
	private double quantity=195;
	private double _winterRate=1.1;
	private double _winterServiceCharge=10;
	private double _summerRate=0.9;
	

	public Decompose_Conditional(String date){
		try {
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
			SUMMER_START = sdFormat.parse("2013/05/01");
			SUMMER_END =sdFormat.parse("2013/07/31");
			this.date = sdFormat.parse(date);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	void cal(){
		if (date.before(SUMMER_START) || date.after(SUMMER_END)){
			setCharge(quantity * _winterRate + _winterServiceCharge);
		}else{
			setCharge(quantity * _summerRate);
		}
	}
	/**
	 * @param charge the charge to set
	 */
	public void setCharge(double charge) {
		DecimalFormat df = new DecimalFormat("###.#");
		this.charge = Double.parseDouble(df.format(charge));
	}
	/**
	 * @return the charge
	 */
	public double getCharge() {
		return charge;
	}
	
}
