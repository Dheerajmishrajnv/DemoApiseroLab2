package abstractAndInterface;

public class InterfaceDriver {

	public static void main(String[] args) {
		Loan l1 = new HomeLoan(1200000, 9.3f, 12);
		System.out.println(l1.emi());
		System.out.println(l1.interest());
		Loan l2 = new CarLoan(200000, 11.3f, 6);
		System.out.println(l2.emi());
		System.out.println(l2.interest());
		Loan l3 = new EducationLoan(1500000, 6.3f, 4);
		System.out.println(l3.emi());
		System.out.println(l3.interest());
	}

}
