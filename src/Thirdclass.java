class ThirdClass extends Figure implements Printable {
    public ThirdClass(String name) {
        super(name);
    }

    public ThirdClass() {

    }
    // Реализация для ThirdClass с его специфичными полями

    @Override
    public void print() {
        // Реализация для вывода информации о ThirdClass
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }

    @Override
    public String draw() {
        return null;
    }
}
