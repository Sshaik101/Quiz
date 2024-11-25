@FunctionalInterface
interface Square {
    int calculate(int x, int y);
}

class Main {
    public static void main(String args[]) {

        Square s = ((int x, int y) -> {
            int a = 0;
            for (int i = x; i <= y; i++) {
                a += i;  
            }
            return a;  
        });

        int ans = s.calculate(5, 25);  
        System.out.println(ans);  
    }
}
