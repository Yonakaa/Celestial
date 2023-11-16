public class Main {
    public static void main(String[] args) {
        Celestial[] Celestials = { new Celestial("Mercury", 58), new Celestial("Venus", 108),
        new Celestial("Earth",150), new Celestial("Mars",228),
                new Celestial("Jupiter",780), new Celestial("Saturn", 1425),
                new Celestial("Uranus",2280), new Celestial("Neptune ",4515) };
        for (int i=0; i< Celestials.length; i++) {
            System.out.print(Celestials[i]);
        }
    }
}
