package io.abhishek;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        // Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello World!");

        // Inline implementation of an interface
        Greeting innerClassGreeting = new Greeting() {      // Anonymous inner class
            public void perform() {
                System.out.println("Hello world");
            }
        };

        // innerClassGreeting.perform();
        
        // helloWorldGreeting.perform();
        // lambdaGreeting.perform();
    
        // MyLambda myLambdaFunction = () -> System.out.println("Hello World!");
        
        // greeter.greet(helloWorldGreeting);
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);

        // MyAdd addFunction = (int a, int b) -> a + b;
    }

}

// interface MyLambda {
//     void foo();
// }

// interface MyAdd {
//     int add(int a, int b);
// }
