public class Cat extends Animals{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC31");
    }
}
