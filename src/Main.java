interface Adder {
    int test(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Adder add = (a, b) ->  a + b * a + 9;

        System.out.println(add.test(5,4));
    }
}
