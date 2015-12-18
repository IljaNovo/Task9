import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircleOfPeople<E> {

    private List<Person> persons;

    public CircleOfPeople() {
        this.persons = new ArrayList<>();
    }

    public void add(Person pers) {
        if (pers == null) {
            return;
        }
        try {
            this.persons.add(pers.clone());
        }
        catch (CloneNotSupportedException e) {
            e.getStackTrace();
        }
    }

    public int getLength() {
        return this.persons.size();
    }

    public Person getPerson(int index) {
        if (index < 0 || index > persons.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        Person pers = null;

        try {
            pers = persons.get(index).clone();
        }
        catch (CloneNotSupportedException e) {
            e.getStackTrace();
        }
        return pers;
    }

    public boolean deleteSecond() {
        Iterator<Person> iter = persons.iterator();

        if (iter.hasNext()) {
            iter.next();
        }
        else {
            return false;
        }
        if(iter.hasNext()) {
            iter.next();
            iter.remove();
            return true;
        }
        else {
            return false;
        }
    }
}
