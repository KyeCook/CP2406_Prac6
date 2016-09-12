package Poems;

/**
 * Created by jc319912 on 12/09/16.
 */
public class Poem {
    private String title;
    private int lines;

    public Poem(String poemTitle, int poemNoLines)
    {
        title = poemTitle;
        lines = poemNoLines;
    }

    public String getTitle()
    {
        return title;
    }
    public int getLines()
    {
        return lines;
    }
}
