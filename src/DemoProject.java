public class DemoProject {

    public static void main(String[] args) {
        CircleOfPeople cirOfPeop = new CircleOfPeople();

        for (int i = 0; i < 10; ++i) {
            cirOfPeop.add(new Person());
        }

        int coutnDeletdPeople = 0;

        while (cirOfPeop.deleteSecond()) {
            ++coutnDeletdPeople;
        }

        if (cirOfPeop.getLength() > 0) {
            System.out.format("Removed %d Person, stayed Person with id: %d", coutnDeletdPeople, cirOfPeop.getPerson(0).getId());
        }
    }
}
