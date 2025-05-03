public class StudentAccount extends Account {
    private String studentId;

    public StudentAccount(String accountNumber, double balance, String studentId) {
        super(accountNumber, balance);
        this.studentId = studentId;
        this.depositStrategy = new StudentDepositStrategy();
        this.withdrawStrategy = new StudentWithdrawStrategy();
    }

    public String getStudentId() {
        return studentId;
    }
}