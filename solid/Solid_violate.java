class Text
{
    protected String author;
    protected String matter;

    Text()
    {}
    Text(String author, String matter)
    {
        this.author = author;
        this.matter=matter;
    }
    void manipulate()
    {
        System.out.println("manipulating matter");
    }

    void display()
    {
        System.out.println("matter is: "+matter);
    }
}

class Saving extends Text 
{
    Saveimplement sd;
    Saving(Saveimplement sd)
    {
        this.sd = sd;
    }

    void display()
    {
        System.out.println("error : doesnot have display function");
    }

    void savetext()
    {
        sd.disk();
    }
}

interface savetodisk
{
    public void disk();
    public void cloud();
    public void file();
}

class Saveimplement
{
    public void disk()
    {
        System.out.println("saving to disk");
    }
    public void file()
    {
        System.out.println("saving to file");
    }
}




public class Solid_violate{
     public static void main(String []args)
     {
        Saving obj =new Saving(new Saveimplement());
        obj.manipulate();
        obj.display();
        obj.savetext();
        
     }
}