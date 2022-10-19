package inheritanceDemo;

public class main {

	public main(String[] args) {
		LoanUI loanUI = new LoanUI();
		loanUI.LoanCalculate(new TeacherLoanManager());
		loanUI.LoanCalculate(new SoldierLoanManager());
		
	}

}
