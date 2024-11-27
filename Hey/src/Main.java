import java.util.*;

@FunctionalInterface
interface myInterface {
    int calculate(int x, int y);
}

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        myInterface s = ((int x, int y) -> {
            int a = 0;
            for (int i = x; i <= y; i++) {
                a += i;  
            }
            return a;  
        });
        System.out.print("What's your first number?");
        int firstNum = scan.nextInt();
        System.out.println();        
        System.out.print("What's your second number?");
        int secondNum = scan.nextInt();
        int ans = s.calculate(firstNum, secondNum);  
        System.out.println(ans);  
    }
}
