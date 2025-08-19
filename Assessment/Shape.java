package Assessment;

class Shape1 {
    void draw() {
        System.out.println("drawing a shape");
    }
}

// Subclass 1
class Circle extends Shape1 {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass 2
class Square extends Shape1 {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

// Main class to test polymorphism
 public class Shape {
    public static void main(String[] args) {
        // Polymorphism: Shape reference pointing to Circle object
        Shape1 shape1 = new Circle();
        shape1.draw();

        // Polymorphism: Shape reference pointing to Square object
        Shape1 shape2 = new Square();
        shape2.draw();

    }
}

