class SecondClass extends Figure implements Printable {
    public SecondClass(String name) {
        super(name);
    }

    public SecondClass() {
        super();
    }
    // Реализация для SecondClass с его специфичными полями

    @Override
    public void print() {
        // Реализация для вывода информации о SecondClass
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
