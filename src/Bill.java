import java.util.Calendar;
import java.util.Date;

public class Bill {

	private String operationName;
	private double amount;
	private Date date;
	private boolean isPaid;
	
	public Bill(String operationName, double amount, Date date, boolean isPaid) {
		
		this.operationName = operationName;
		this.amount = amount;
		this.date = date;
		this.isPaid = isPaid;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	
	public String toString() {
		return "Info: "+getOperationName()+" Amount: "+getAmount()+" Date: "+getDate()+" Is Bill Paid: "+isPaid();
	}
	
}
