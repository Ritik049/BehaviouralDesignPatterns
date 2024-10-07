package IteratorDesignPattern;

public class Songs {
      public  String name;
     public  String length;
      public Songs(String name, String length)
      {
          this.name =name;
          this.length = length;
      }

      public void play()
      {
          System.out.println("Playigng the song "+name+" of length "+length);
      }
}
