public class Fish implements Pet {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Glub");
    }

    @Override
    public void getFood() {
        System.out.println("Pellets");
    }
}
