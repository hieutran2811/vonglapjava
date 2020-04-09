import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int Number = scanner.nextInt();
        int count =0;
        int N=1;
        while(count<Number){
            N++;
            int i = 2;
            boolean check=true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(N + " ");
                count++;
            }
        }
    }
}
