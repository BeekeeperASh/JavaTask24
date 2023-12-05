package Task2;

// ChairFactory.java
public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicChair();
    MultifunctionalChair createMultifunctionalChair();
}
