/*Write a program in java to differentiate between instance variables and class variables. And also 
 *show the scope of each.  
 Hint: - Class variables are those variables which are declared as static. */

package asst3_1;

class MainClass
{
       static String s = "Czech";     // Declaring Static Variable
}
 
public class ClassVariable
{      
    public static void main(String[] args) 
    {    
    	MainClass obj1 = new MainClass();
         
    	MainClass obj2 = new MainClass();
         
        //Accessing class variables through obj1
           
         System.out.println("Actual value of obj1 is " + obj1.s);      
         
        //Accessing class variables through obj2
         
         System.out.println("Actual value of obj2 is " + obj2.s);     
         
        //Making changes to class variables through obj2
         
          obj2.s = "Czech Republic";
         
        //Accessing class variables through obj1
          
          System.out.println("\nExample of Class Variable");    
          System.out.println("*********************************************************");    
          System.out.println("Value of obj1 after making changes is " + obj1.s);     
                 
        //Accessing class variables through obj2
                 
          System.out.println("Value of obj2 after making changes is " + obj2.s); 
    }    
}

//Scope of Class Variable:
// Class variables can be referred through class name as well as object reference.

/*class A
{
    static int i = 100;        //Class Variable
}
 
public class ClassVariable 
{      
    public static void main(String[] args) 
    {    
        //Referring class variable through class name
         
        System.out.println(A.i);
         
        A a = new A();
         
        //Referring class variable through object reference
         
        System.out.println(a.i);
    }    
}*/

