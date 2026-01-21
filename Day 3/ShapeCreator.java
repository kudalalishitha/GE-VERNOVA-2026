interface ShapeCreator {
    Shape create();
}

abstract class Shape {}

class Rectangle extends Shape {
    Rectangle() {
        System.out.println("Rectangle created");
    }
}

class TestShape {
    public static void main(String[] args) {
        ShapeCreator creator = Rectangle::new;
        Shape s = creator.create();
    }
}
