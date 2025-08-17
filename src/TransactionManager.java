import java.util.ArrayList;
import java.util.List;


public class TransactionManager {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public void printTransactions(){
        for(Transaction t : transactions){
            System.out.println(t);
        }
    }
}
