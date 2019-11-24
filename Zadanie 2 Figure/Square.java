package Figure;

public class Square extends Figure implements Resetable {
    Square(int numberOfSides) {
        super(numberOfSides);

        System.out.println("Figura to Kwadrat");
    }

    public void resetAllAttributes() {
        System.out.println("Reset");
        super.Reset();
    }
}