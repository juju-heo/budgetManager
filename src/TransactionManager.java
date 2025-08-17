import java.util.ArrayList;
import java.util.List;


public class TransactionManager {
    // 내역을 저장할 리스트
    private List<Transaction> transactions;

    // 생성자
    public TransactionManager(){
        transactions = new ArrayList<>();
    }

    // 내역 추가
    public void addTransaction(String description, int amount){
        Transaction transaction = new Transaction(description, amount);
        transactions.add(transaction);
        System.out.println("내역이 추가되었습니다.");
    }

    // 내역 조회
    public void showTransactions(){
        if(transactions.isEmpty()){
            System.out.println("저장된 내역이 없습니다.");
            return;
        }

        System.out.println("==내역 목록==");
        for(int i=0; i<transactions.size();i++){
            Transaction t = transactions.get(i);
            System.out.println((i+1) + ". " + t.getDescription() + " : " + t.getAmount() + "원");
        }
    }
}
