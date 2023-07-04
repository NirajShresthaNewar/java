public class Constructor
{
    public Constructor()//here constructor is a method name and since constructor doesnt have any return type not even void
    {
        System.out.println("no integer passed");

    } 
    public Constructor(int a)
    {
        System.out.println("we got one integer"+a);

    }  
     public static void show()//as you ca see its method and have return type static void
     {
         int b=4;
         int c=1;
         int d=b+c;
         System.out.println("we got output"+d);
        
     }
    public static void main(String[]args)
    {   
        int a=1;
        Constructor con= new Constructor(a);//CREATING A NEW OBJECT when object is created it calls constructor automatically
        Constructor co= new Constructor();//creating new object
        show();//calling method without paramater
    
    }

}
