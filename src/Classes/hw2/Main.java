package Classes.hw2;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 95, 40);
        Fighter alex = new Fighter("Alex", 10, 95, 90, 30);
        Ring r = new Ring(marc, alex, 90, 100);
        
        r.setStarterFighter();

        r.run();
    }
}