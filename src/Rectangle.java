public class Rectangle extends Figure {

    public  int lengthA, widthB;

    public Rectangle(String name, int lengthA, int widthB) {
        super(name);
        this.lengthA = lengthA;
        this.widthB = widthB;
    }

    @Override
    public int calculatePerimeter() {
        return lengthA + widthB * 2;
    }

    @Override
    public void draw() {
        System.out.println("▭");

    }
}
