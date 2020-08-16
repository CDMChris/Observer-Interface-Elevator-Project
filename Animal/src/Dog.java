public class Dog implements Pet {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }

    @Override
    public void getFood() {
        System.out.println("Dog food");
    }
}
