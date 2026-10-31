class Activity2 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("==========Guess The Answers=========");

        System.out.println("Urinary Operator"+ (a++));
        System.out.println("Urinary Operator"+ (++b));
        System.out.println("Binary Operator");
        System.out.println("1+2 " +1+2);
        System.out.println("1+2 " +(1+2));
        int increment = ++a * b++;
        System.out.println(increment);
        System.out.println("Ternary Operator");
        int largestnumber=(a>b)?a:b;
        System.out.println("Largest Number is "+largestnumber);

    }
}