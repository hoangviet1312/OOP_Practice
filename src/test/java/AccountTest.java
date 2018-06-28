import org.junit.Test;

public class AccountTest {
    @Test
    public void AccountTester() {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5 / 100);

        account.withdraw(2500.0);
        System.out.println("Ban da rut $2500. Ban con " + account.getBalance() + "$");
        System.out.println("------------------------------------------------------------");
        System.out.println();

        account.deposit(3000.0);
        System.out.println("Ban vua them vao $3000. Ban co: " + account.getBalance() + "$");
        System.out.println("------------------------------------------------------------");
        System.out.println();

        System.out.println("THONG TIN TAI KHOAN: ");
        System.out.println();
        System.out.println("So du hien tai la: " + account.getBalance() + "$");
        System.out.println("Tien lai hang thang la: " + account.getMonthlyInterest() + "$");
        System.out.println("Ngay tao la: " + account.getDateCreated());
    }
}
