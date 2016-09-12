package Poems;

/**
 * Created by jc319912 on 12/09/16.
 */
public class DemoPoems {
    public static void main(String[] args)
    {
        Poem poem1 = new Poem("Very original name", 69);
        Couplet poem2 = new Couplet("This is a couplet");
        Haiku poem3 = new Haiku("This is a Haiku");
        Limerick poem4 = new Limerick("This is a Limerick");

        display(poem1);
        display(poem2);
        display(poem3);
        display(poem4);
    }

    public static void display(Poem poem)
    {
        System.out.println("The poem called " + '"' +poem.getTitle() + '"' + " has " + poem.getLines() + " lines");
    }
}
