public class Main {
    public static void main(String[] args) {
        System.out.println("if....else");
        /*Use if to specify a block of code to be executed, if a specified condition is true
        * Use else to specify a block of code to be executed, if the same condition is false
        * Use else if to specify a new condition to test, if the first condition is false
        * Use switch to specify many alternative blocks of code to be executed */
        //The if statement
        if (20>16) {
            System.out.println("20 is greater than 16");
        }
        int a=5;
        int b=6;
        if (a<b) {
            System.out.println("a is less than b");
        }
        //The else statement
        if (32>43) {
            System.out.println("32 is bigger");
        } else {
            System.out.println("32 is lesser");
        }
        // The else if statement
        int time=10;
        if (time>=12) {
            System.out.println("Good Afternoon");
        } else if (time<=12) {
            System.out.println("Good morning");

        } else {
            System.out.println("good time");
        }
        //SHORT HAND IF...ELSE
        /*it is a ternary operator because it contains three operands
        * it can be used to replace multiple lines of code with a single line
        * and is often used to replace simple if else  statement */
        // variable =(condition) ? expressionTrue : expressionFalse;
        int tme=20;
        String result= (tme<12) ? "Good morning" : "Good Afternoon";



    }
}