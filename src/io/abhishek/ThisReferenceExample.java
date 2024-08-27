package io.abhishek;

public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this); // points to the object on which execute() method is called
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            // System.out.println(this); // This will not work
        });

        thisReferenceExample.execute();
    }

    /** This string will be returned instead of `this` reference variable 
     * if we override toString method */
    // @Override
    // public String toString() {
    //     return "This is the main ThisReferenceExample class instance";
    // }
}
