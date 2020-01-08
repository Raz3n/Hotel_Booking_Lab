import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }
}
