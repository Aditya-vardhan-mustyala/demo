class Text
{
    protected String author;
    protected String content;

    Text()
    {}
    Text(String author, String content)
    {
        this.author = author;
        this.content=content;
    }
    void manipulate()
    {
        System.out.println("manipulating content");
    }

}

interface SendFuntionality
{
    public void sending_content();
}
interface SaveFuntionality
{
    public void saving_content(SaveContent reference);
}


abstract class Sendtext extends Text implements SendFuntionality
{
    Sendtext(String author, String content)
    {
        super(author,content);
    }
}

class Whatsapp extends Sendtext
{
    String to_number;
    Whatsapp(String author,String content,String to_number)
    {
        super(author,content);
        this.to_number=to_number;
    }

    public void sending_content()
    {
        System.out.println("sending message to :"+to_number);
    }
}

class Telegram extends Sendtext
{
    String to_number;
    Telegram(String author,String content,String to_number)
    {
        super(author,content);
        this.to_number=to_number;
    }

    public void sending_content()
    {
        System.out.println("sending Telegram message to :"+to_number);
    }
}
class Notepad extends Text implements SaveFuntionality
{

    Notepad(String author, String content)
    {
        super(author,content);
    }

    public void saving_content( SaveContent reference)
    {
        reference.save();
    }
}

interface  SaveContent
{
    public void save();
}


class savetodisk implements SaveContent
{

    public void save()
    {
        System.out.println("saving text to disk");
    }
}
class savetocloud implements SaveContent
{

    public void save()
    {
        System.out.println("saving text to cloud");
    }
}

public class Solid_demo
{
    public static void main(String[] args)
    {
        Whatsapp p1=new Whatsapp("aditya","hi all","5678");
        p1.sending_content();
        Telegram person2=new Telegram("ram","hello","5678");
        person2.sending_content();
        Notepad note1=new Notepad("user2","bye all");
        note1.saving_content(new savetodisk());
        note1.saving_content(new savetocloud());
    }
}