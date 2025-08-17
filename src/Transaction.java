public class Transaction {
    private String description;
    private int amount;

    // 생성자
    public Transaction(String description, int amount){
        this.description = description;
        this.amount = amount;
    }

    // getter 메서드
    public String getDescription(){
        return description;
    }

    public int getAmount(){
        return amount;
    }
}
