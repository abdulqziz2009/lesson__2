public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        figures[0] = new Circle("Круг1");
        figures[1] = new Triangle("Треугольник1");
        figures[2] = new Square("Квадрат1");
        figures[3] = new Rectangle("Прямоугольник1");
        figures[4] = createObject("SecondClass");
        figures[5] = createObject("ThirdClass");

        for (Figure figure : figures) {
            System.out.println("Название: " + figure.getName());
            System.out.println("Рисунок: " + figure.draw());
            System.out.println("Периметр: " + figure.calculatePerimeter());
        }
    }

    public static Figure createObject(String className) {
        switch (className) {
            case "SecondClass":
                return new SecondClass();
            case "ThirdClass":
                return new ThirdClass();
            case "FourthClass":
                return new FourthClass() {
                    @Override
                    public void print() {

                    }
                };
            default:
                throw new IllegalArgumentException("Недопустимое название класса");
        }
    }
}

