package Figure;

public class Figure  implements NumberOfSidesPrintable {
    private int _numberOfSides;

    Figure(int numberOfSides){
        _numberOfSides = numberOfSides;
    }
    public void printSidesNumber() {
        System.out.println("Liczba bok�w = " + _numberOfSides);
    }

    public void Reset(){
        _numberOfSides = 0;
    }
}
