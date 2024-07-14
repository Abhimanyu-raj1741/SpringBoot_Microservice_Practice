package in.ashok.it;

public class ATM {
    
	private Printer printer;
	
	public ATM() {
		// TODO Auto-generated constructor stub
		System.out.println(" ATM :: Constructor ");
	}
	public ATM(Printer printer) {
		System.out.println("ATM :: Param  - Constructor");
		this.printer = printer;
	}

	public void setPrinter(Printer printer) {
		System.out.println("SetPrinter() - Method called....");
		this.printer = printer;
	}
    
	public void withdraw() {
		System.out.println("Withdraw Completed...");
		printer.print();
	}
	
	
}
