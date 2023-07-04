//without static on printsalary.updated version
class Employee
{
    public static int base=10000;
    
    float salary()
    {
        return base;
    
    }

}
class Manager extends Employee
{
    float salary()
    {
        return base+20000;
    }
}
class Clerk extends Employee
{
    float salary()
    {
        return base+10000;
    }

}
class main
{
     void printSalary(Employee e)
    {
        System.out.println("e.salary()");
    }
    public static void main(String args[])
    {
        main obj=new main();
        Employee obj1=new Manager();
        System.out.println("Managers salary:");
        obj.printSalary(obj1);
         Employee obj2=new Clerk();
        System.out.println("Clerks salary:");
        obj.printSalary(obj2);
        
    }
}

