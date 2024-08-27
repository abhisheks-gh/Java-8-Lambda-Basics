package io.abhishek;

@FunctionalInterface
public interface Greeting {

    public void perform();

}



/*Lambda Expression psuedo examples: 

 * greetingFunction = () -> System.out.println("Hello world!"); 
 * 
 * 
 * doubleNumberFunction = (int a) -> a * 2;
 * 
 * 
 * addFunction = (int a, int b) -> a + b;
 * 
 * 
 * safeDivideFunction = (int a, int b) -> { 
 *    if (b == 0) return 0;
 *    return a / b;
 *  };
 * 
 * 
 * stringLengthCountFunction = (String str) -> str.length();
 * 
 */