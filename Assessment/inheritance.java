package Assessment;

class Animal {
    public void sound() {
        System.out.println("Animal make Sound");
    }
}
    class Dog extends Animal {
        public void show() {
            System.out.println("Dog barks");
        }
    }


public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.show();
    }
}
