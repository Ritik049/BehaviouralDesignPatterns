package IteratorDesignPattern;
import java.util.*;

public class SongsIterator implements IteratorNew {

      List<Songs> songs;
      int curr = 0;

      public SongsIterator(List<Songs> songs)
      {
          this.songs = songs;
          this.curr = 0;
      }

      public boolean hasNext()
      {
          return songs.size()!=0 ;
      }

      public Object next()
    {
         Object t = songs.get(curr);
          curr = curr+1;

          return t;
    }
}
