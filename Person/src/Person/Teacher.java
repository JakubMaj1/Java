package Person;

public class Teacher extends UniversityPerson implements VipPerson  {
    private String _contact;

    Teacher(int age, String name , String contact) {
        super(age, name);

        _contact = contact;
    }

    @Override
    public String GetContactNumber() {
        return _contact;
    }
}