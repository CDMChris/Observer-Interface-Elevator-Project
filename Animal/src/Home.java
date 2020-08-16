public class Home {
    public static void main(String[] args) {
        Dog d = new Dog("Bucky");
        sayHi(d);
    }

    public static void sayHi(Pet p) {
        p.makeNoise();
    }

}
