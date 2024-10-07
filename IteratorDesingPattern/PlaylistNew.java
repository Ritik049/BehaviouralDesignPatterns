package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class PlaylistNew {

    List<Songs> lst ;

    public PlaylistNew()
    {
        lst = new ArrayList<>();
    }

    public void addSong(Songs song)
    {
        lst.add(song);
    }

    public void removeSong(Songs song)
    {
        lst.remove(song);
    }

    public IteratorNew createIterator()
    {
        return   new SongsIterator(lst);

    }
}
