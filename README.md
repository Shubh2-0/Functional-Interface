# Functional-Interface

An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, static methods but can contain only one abstract method. It can also declare methods of object class.

Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. It is a new feature in Java, which helps to achieve functional programming approach.

# Example 

@FunctionalInterface  

interface sayable{  

    void say(String msg);  
    
}  
public class FunctionalInterfaceExample implements sayable{  

    public void say(String msg){  
    
        System.out.println(msg);     
    }
    public static void main(String[] args) {  
    
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        
        fie.say("Hello there");  
        
    }  
}  



# Output:

Hello there
