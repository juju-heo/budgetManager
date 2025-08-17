import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TransactionManager manager = new TransactionManager(); // 내역 관리 객체

        while(true) {
            System.out.println("=== 콘솔 가계부 ===");
            System.out.println("1. 내역 추가");
            System.out.println("2. 내역 조회");
            System.out.println("3. 종료");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            if(choice == 1){
                System.out.print("내역 설명: ");
                String description = scanner.nextLine();

                System.out.print("금액: ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                manager.addTransaction(description, amount);
            }else if(choice == 2){
                manager.showTransactions();
            }else if(choice == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
        scanner.close();
    }
}
