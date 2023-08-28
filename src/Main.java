import Fraction.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction nachalnayaDrob = new Fraction();
        Fraction zadaliDrob = new Fraction(7,8);
        System.out.println(nachalnayaDrob);
        System.out.println(zadaliDrob);
        Fraction plus = nachalnayaDrob.plus(zadaliDrob);
        System.out.println(plus);
        Fraction minus = nachalnayaDrob.minus(zadaliDrob);
        System.out.println(minus);
        Fraction delenie = nachalnayaDrob.delenie(zadaliDrob);
        System.out.println(delenie);
        Fraction umnojenie = nachalnayaDrob.umnojenie(zadaliDrob);
        System.out.println(umnojenie);

    }
}