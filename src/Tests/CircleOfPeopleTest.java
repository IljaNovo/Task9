import org.junit.Test;
import static org.junit.Assert.*;

public class CircleOfPeopleTest {

    @Test
    public void testDeleteSecond() throws Exception {
        CircleOfPeople circOfPers = new CircleOfPeople();
        circOfPers.add(new Person());
        circOfPers.add(new Person());

        UniqueNumber.resetCounter();

        circOfPers.deleteSecond();

        assertEquals(circOfPers.getLength(), 1);
        assertEquals(circOfPers.getPerson(0).getId(), 0);
    }

    @Test
    public void testAdd() throws Exception {
        CircleOfPeople circOfPers = new CircleOfPeople();
        circOfPers.add(new Person());

        UniqueNumber.resetCounter();

        assertEquals(circOfPers.getLength(), 1);
    }

    @Test
    public void testGetPerson() throws Exception {
        CircleOfPeople circOfPers = new CircleOfPeople();
        circOfPers.add(new Person());

        UniqueNumber.resetCounter();

        assertEquals(circOfPers.getPerson(0).getId(), 0);
    }

    @Test
    public void testErrorIndexParam() throws Exception {
        CircleOfPeople circOfPers = new CircleOfPeople();
        circOfPers.add(new Person());

        UniqueNumber.resetCounter();

        try {
            circOfPers.getPerson(-1).getId();
            circOfPers.getPerson(1).getId();
        }
        catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }
}