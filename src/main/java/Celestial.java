public class Celestial {
    private String name;
    private int distance;

    public Celestial(String name, int distance) {
        this.name=name;
        this.distance=distance;
    }
    public void setName(String newName) {
        name=newName;
    }
    public void setDistance(int newDistance) {
        distance=newDistance;
    }
    public int getDistance() {
        return distance;
    }
    public String getName() {
        return name;
    }
    public void kmToAU(int newValue) {
        newValue=distance/150;
        distance=newValue;
    }
}
