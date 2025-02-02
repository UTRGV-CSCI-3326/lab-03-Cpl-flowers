public class BankAccount {

    

    public static void main(String[] args) {

        float account = (float) 2175.37;
        //System.out.println(account);
        account -= 302.50;
        //System.out.println(account);
        account += 50.03;
        //System.out.println(account);
        account = (account / 2) + 20;
        //System.out.println(account);
        --account;
        //System.out.println(account);
        account = account * 2;
        //System.out.println(account);
        ++account;
        

        System.out.println("Bob's new balance: " + String.format("%.2f", account));
    }
}
