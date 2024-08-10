package in.ashokit.exception;

import java.time.LocalDate;

public class ExInfo {
 
	private String exCode;
	
	private String exMsg;
	
	private LocalDate ex;

	public String getExCode() {
		return exCode;
	}

	public void setExCode(String exCode) {
		this.exCode = exCode;
	}

	public String getExMsg() {
		return exMsg;
	}

	public void setExMsg(String exMsg) {
		this.exMsg = exMsg;
	}

	public LocalDate getEx() {
		return ex;
	}

	public void setEx(LocalDate ex) {
		this.ex = ex;
	}
	
	
}
