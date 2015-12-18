public class Person implements Cloneable{

    private int id;

    public Person() {
        this.id = UniqueNumber.generate();
    }

    public int getId() {
        return id;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }
}
