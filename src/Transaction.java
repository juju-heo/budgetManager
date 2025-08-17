public class Transaction {
    private String type; // 수입 or 지출
    private String category;
    private int amount;

    public Transaction(String type, String category, int amount){
        this.type = type;
        this.category = category;
        this.amount = amount;
    }

    @Override
    public String toString(){
        return type + " - " + category + " : " + amount + "원";
    }
}
