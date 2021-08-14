package abstractAndInterface;

public class EducationLoan implements Loan {
	private int amount;
	private float rate;
	private int time;
	@Override
	public float interest() { 
		return((float)(rate*amount*time));
	}

	public EducationLoan(int amount, float rate, int time) {
		this.rate = rate;
		this.time = time;
		this.amount=amount;
	}

	@Override
	public float emi() {
		return((amount)+(float)(rate*amount*time/12));
	}
}
