public class Test {
    public static void main(String[] args){
        double totalBalance = 0 ;
        BankCount bankCountone = new BankCount();
        BankCount bankCounttwo = new BankCount();
        bankCountone.deposite(100);
        bankCounttwo.deposite(200);
        Client client = new Client("FUCK");
        client.addBankCount(bankCountone);
        client.addBankCount(bankCounttwo);
        for(BankCount bankCount : client){
            totalBalance += bankCount.getBalance() ;
        }
        if(totalBalance == 300.0){
            System.out.print("wowowoow,you are so clever~~~~");
        }
        else System.out.print("defeat!!!");
    }
}
