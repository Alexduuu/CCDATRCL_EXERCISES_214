import java.util.LinkedList;

class Main {

    public static void main(String[] args) {

        LinkedList<String> Playlist = new LinkedList<>();

        Playlist.add("Incomplete");
        Playlist.add("Best Part");
        Playlist.add("Japanese Denim");
        Playlist.add("Don't Matter");
        Playlist.add("Circles");

        Playlist.addFirst("Invincible");

        Playlist.addLast("Iris");

        System.out.println(Playlist.get(0));

        Playlist.set(6, "Photograph");

        Playlist.remove(0);

        System.out.println("Updated playlist: " + Playlist);

    }
}


       
