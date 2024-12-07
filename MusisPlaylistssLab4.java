import java.util.Scanner;

class Song {
    String title;
    Song next;

    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class MusicPlaylist {
    private Song head = null;
    private Song tail = null;

    // Add a song to the playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
            tail = newSong;
            tail.next = head; // Circular link
        } else {
            tail.next = newSong;
            tail = newSong;
            tail.next = head; // Maintain circular link
        }
        System.out.println("Added: " + title);
    }

    // Remove a song from the playlist
    public void removeSong(String title) {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        Song current = head, previous = tail;
        do {
            if (current.title.equals(title)) {
                if (current == head) { // Removing the head
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) { // Removing the tail
                    tail = previous;
                    tail.next = head;
                } else { // Removing a middle song
                    previous.next = current.next;
                }
                System.out.println("Removed: " + title);
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Song not found.");
    }

    // Play songs starting from the head
    public void play() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        Song current = head;
        System.out.println("Playing songs in the playlist:");
        do {
            System.out.println("Now playing: " + current.title);
            current = current.next;
        } while (current != head);
    }

    // Display the playlist
    public void display() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        Song current = head;
        System.out.println("Playlist:");
        do {
            System.out.println(current.title);
            current = current.next;
        } while (current != head);
    }
}

public class MusisPlaylistssLab4 {
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Play Songs");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter song title to add: ");
                    String songToAdd = scanner.nextLine();
                    playlist.addSong(songToAdd);
                    break;

                case 2:
                    System.out.print("Enter song title to remove: ");
                    String songToRemove = scanner.nextLine();
                    playlist.removeSong(songToRemove);
                    break;

                case 3:
                    playlist.play();
                    break;

                case 4:
                    playlist.display();
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
