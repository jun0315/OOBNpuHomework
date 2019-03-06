import java.util.ArrayList;
import java.util.Iterator;

public class Client implements Iterable<BankCount>{
    private String name ;
    private ArrayList<BankCount> accounts ;
    public Client(String initialName){
        this.name = initialName ;
        this.accounts = new ArrayList<BankCount>();
    }
    public String getName(){
        return this.name ;
    }
    public void addBankCount(BankCount bankCount){
        accounts.add(bankCount);
    }
    public Iterator<BankCount> iterator(){
        return accounts.iterator();
    }
}
