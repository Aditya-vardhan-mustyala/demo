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
}

class Printtext extends Text 
{
    Printtext(String author, String matter)
    {
        super(author,matter);
    }

    void display()
    {
        System.out.println("matter is: "+matter);
    }
}
interface savetodisk
{
    public void disk();
}

interface savetocloud
{
   public void cloud();
}

interface savetofile
{
   public void file();
}

class Saveimplement implements savetodisk,savetofile
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

class Saving extends Text 
{
    savetodisk sd;
    Saving(savetodisk sd)
    {
        this.sd = sd;
    }
    
    void savetext()
    {
        sd.disk();
    }
}


public class solid{
     public static void main(String []args)
     {
        Saving obj =new Saving(new Saveimplement());
        obj.manipulate();
        obj.savetext();
        
     }
}