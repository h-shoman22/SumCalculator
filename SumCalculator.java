import java.util.Scanner;

public class SumCalculator {
    public int firstNumber;
    public int secondNumber;
    

    public SumCalculator(int sFirstNumber, int sSecondNumber){
        firstNumber = sFirstNumber;
        secondNumber = sSecondNumber;
    }

    public int calculateSum(){
        int answer =  firstNumber + secondNumber;
        return answer;
    }

    public static void main(String[] args) {
        // SumCalculator total = new SumCalculator(8, 15);
        // System.out.println(total.calculateSum());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("enter the second number: ");
        int number2 = scanner.nextInt();
        SumCalculator total = new SumCalculator(number1, number2);
        System.out.println(total.calculateSum());    
    }

    
}
