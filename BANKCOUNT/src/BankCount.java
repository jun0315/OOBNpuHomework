public class BankCount {
    private double balance ;
    public BankCount(){
        this.balance = 0.0 ;
    }
    public boolean deposite(double s){
        if(s >= 0) {
            this.balance += s;
            return true ;
        }
        else return false ;
    }
    public double getBalance(){
        return this.balance ;
    }
    private boolean withdraw(double s){
        if(s <= this.balance && s >= 0){
            this.balance -= s ;
            return true ;
        }
        else return false ;
    }
}
