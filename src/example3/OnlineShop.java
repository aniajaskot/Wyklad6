package example3;

public class OnlineShop {
    public static void main(String[] args) {
        Address address1 = new Address("Wrocław", "wybrzeże Wyspiańskiego", "27", "321");
        Address address2 = new Address("Wrocław", "Plac Grunwaldzki", "13", "015");

        Person person1 = new Person("Jan", "Kowalski", address1);
        Person person2 = new Person("Jan", "Kowalski", address1);
        Person person3 = new Person("Jan", "Kowalski", address2);
        Person person4 = new Person("Karol", "Nowak", address2);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        printComapareInfo(person1, person2, "person1", "person2");
        printComapareInfo(person1, person3, "person1", "person3");
        printComapareInfo(person1, person4, "person1", "person4");
        printComapareInfo(person2, person3, "person2", "person3");
        printComapareInfo(person2, person4, "person2", "person4");
        printComapareInfo(person3, person4, "person3", "person4");

    }

    private static void printComapareInfo(Person person1, Person person2, String p1, String p2) {
        if (person1.equals(person2)) {
            System.out.println(p1 + " jest równe " + p2);
        } else {
            System.out.println(p1 + " jest różne od " + p2);
        }
    }
}
