package Task1;

public class Test {
    public static void main(String[] args) {
        Complex factory1 = new  ConcreteFactory().createComplex();
        Complex factory2 = new  ConcreteFactory().createComplex(23, 34);
        System.out.println(factory2.real + " " + factory2.image + " i");
    }
}
