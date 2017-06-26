/*Write a program in java to differentiate between instance variables and class variables. And also 
 *show the scope of each.  
 Hint: - Class variables are those variables which are declared as static. */

package asst3_1;

class MainClass_Instance
{
       String s = "Virat";     // Declaring Instance Variable
}
 
public class InstanceVariable
{      
    public static void main(String[] args) 
    {    
    	MainClass_Instance obj1 = new MainClass_Instance();
         
    	MainClass_Instance obj2 = new MainClass_Instance();
         
        //Accessing Instance variables through obj1
           
         System.out.println("Actual value of obj1 is " + obj1.s);      
         
        //Accessing Instance variables through obj2
         
         System.out.println("Actual value of obj2 is " + obj2.s);     
         
        //Making changes to Instance variables through obj1
         
          obj1.s = "Virat Kohli";
         
        //Accessing Instance variables through obj1
          
          System.out.println("\nExample of Instance Variable");    
          System.out.println("*********************************************************"); 
         
          System.out.println("Value of obj1 after making changes is " + obj1.s);     
                 
        //Accessing Instance variables through obj2
                 
         System.out.println("Value of obj2 after making changes is " + obj2.s); 
    }    
}

//Scope of Instance Variable:
// Instance variables can be referred only through object reference.
// We cannot refer instance variable through class name, we will get compile time error.

/*class A
{
    int i = 100;        //Instance Variable
}
 
public class InstanceVariable 
{      
    public static void main(String[] args) 
    {    
        A a = new A();
         
        //Referring instance variable through object reference
         
        System.out.println(a.i);
         
       // We cannot refer instance variable through class name, we will get compile time error.
         
        //System.out.println(A.i);
    }    
}*/
