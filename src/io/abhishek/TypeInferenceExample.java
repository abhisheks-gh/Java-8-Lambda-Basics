package io.abhishek;

public class TypeInferenceExample {

    public static void main(String[] args) {
        // StringLengthLambda myLambda = (String s) -> s.length();
        // StringLengthLambda myLambda = (s) -> s.length(); 
        // StringLengthLambda myLambda = s -> s.length();  // This is still a valid lambda expression
        // System.out.println(myLambda.getLength("Hello Lambda"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello lambda"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}