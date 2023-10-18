
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Кург", 12);
        Ttiangie ttiangie = new Ttiangie("Треугольник", 2, 3, 2);
        Square square = new Square("Квадрат", 45);
        Rectangle rectangle = new Rectangle("Прмоугольник", 5, 5);

        Dog dog = new Dog("Рекс");
        Cat cat = new Cat("Пухляж");

        Drawable[] drawables = {circle, ttiangie, square, rectangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure){
                System.out.println(((Figure) drawables[i]).getName() + " Периметр -> "
                        + ((Figure) drawables[i]).calculatePerimeter());
            }
if (drawables[i] instanceof Animals){
    System.out.println(((Animals) drawables[i]).getName());
}
            drawables[i].draw();


        }

    }
}