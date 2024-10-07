package IteratorDesignPattern;

public class Client {

    public static void main(String[]args) {
        Songs song = new Songs("Mene Pyar Kia ", "10");
        Songs song2 = new Songs("Teri ankhon ne ..", "20");
        Songs song3 = new Songs("Sham ko jaane do ", "39");

        PlaylistNew playlist = new PlaylistNew();

        playlist.addSong(song);
        playlist.addSong(song2);
        playlist.addSong(song3);

        IteratorNew iterator = playlist.createIterator();

        System.out.println(iterator.hasNext());

        Songs ret = (Songs)iterator.next();


        System.out.println(ret.name);

    }

}
