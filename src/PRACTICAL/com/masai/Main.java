package PRACTICAL.com.masai;

public class Main {

	
public static void main(String[] args) {

//	MyInterImplements it2 = new MyInterImplements();
//	
//	it2.sayHello();
	
//	MyInterface i = new MyInterface() {
//		
//		@Override
//		public void sayHello() {
//			System.out.println("Anonymous Class");
//			
//		}
//	};
//	
	
//USING OUR INTERFACE WITH THE HELP OF LAMBDA EXPRESSION
	
	MyInterface  i = ()-> System.out.println("LAMBDA EXPRESSIOn");

	
	i.sayHello();
	
  Second_Interface i2 = (a,b)->{
 System.out.println("HELLO.... HOW ARE YOU ?");
       return a+b;
  };
	
	
  System.out.println(i2.add(4, 7));
	
}	

}
