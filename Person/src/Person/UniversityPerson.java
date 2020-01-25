package Person;

public abstract class UniversityPerson implements Person {
    private int _age;
    private String _name;

    UniversityPerson(int age , String name ){
        this._age = age;
        this._name = name;
    }

    public void SetName(String name) {
        this._name = name;
    }

    public String GetName() {
       return _name;
    }

    public void SetAge(int age) {
       this._age = age;
        GetAge();
    }

    private void GetAge(){
        System.out.println("Wiek to " + _age);
    }

}