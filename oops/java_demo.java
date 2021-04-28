class Employee
{
    private String name;
    Employee(String ename)
    {
        this.name = ename;
    }
    public void display()
    {
        System.out.println("employee name " + name);
    }
}

interface Insurance
{
    public void showdetails();
}

interface Salary
{
   public void showsalary();
}

class Manager extends Employee implements Insurance,Salary
{
    
    private int id;
    Manager(String nam, int id)
    {
        super(nam);
        this.id=id;
    }

    public void display()
    {
        System.out.println("manager id " + id);
    }

    public void showdetails()
    {
        System.out.println("showing insurance details");
    }

    public void showsalary()
    {
        System.out.println("showing salary details");
    }
   
}



public class java_demo
{

     public static void main(String []args)
     {
        Employee emp=new Employee("ram");
        emp.display();
        Manager m1=new Manager("ram",1243);
        m1.display();
        m1.showdetails();
        m1.showsalary();
        Employee emp2=new Manager("someone",5678);
        emp2.display();

     }
}