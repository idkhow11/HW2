import java.util.Scanner;
import java.util.ArrayList;
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(); // -1 입력받을때까지 동적 할당
        double sum = 0;
        System.out.print("양의 정수를 입력하세요. -1 입력 시 종료됩니다. : ");


        while (true) {
            String input = scanner.next(); // 배열을 문자열로 받고
            try{
                int num = Integer.parseInt(input); // 문자열 받은걸 정수로 변환

                if (num == -1) break; // -1 입력 시 종료

                if(num<= 0) {// 입력받은 정수가 0이나 음수일 때
                    System.out.print(num + " 제외\n");
                    continue; // 제외한 후 다음 입력을 받음
                }
                numbers.add(num); // 양의 정수만 추가
            }
            catch(NumberFormatException e){ // 예외 발생 시 제외
                System.out.println(input + " 제외");
            }
        }
            // 양수일 때
        for (int n : numbers) { // 합계 계산하는 for each문
            sum += n;
        }
        double avg = (numbers.size() > 0) ? sum / numbers.size() : 0; // 평균 계산하는 3중 조건문
        System.out.print("평균은 : " + avg);

        scanner.close();
    }
}
