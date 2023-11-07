
import java.util.*;

public class Driver implements CollectionTest {
    private HashMap<Integer, Person> hashTable = new HashMap<Integer, Person>();

    private LinkedList<Person> linkedList = new LinkedList<Person>();

    private ArrayList<Person> arrayList = new ArrayList<Person>();

    private int size;

    public Driver()
    {
    }

    //public static void main(String[] args)
    //{
    //    Driver code = new Driver();
    //    code.runTest(CollectionType.LINKED_LIST, TestType.ADD, 5);
    //}

    public void setSize(int size) {
        this.size = size;
        hashTable = new HashMap<Integer, Person>(size);
        arrayList = new ArrayList<Person>(size);
        linkedList = new LinkedList<Person>(arrayList);
    }

    public void runTest(CollectionType type, TestType test, int iterations) {
        boolean Add = false, Index = false, Search = false;



        switch (test) {
            case ADD:
                Add = true;
                break;

            case INDEX:
                Index = true;
                break;

            case SEARCH:
                Search = true;
                break;
        }

        boolean Ll = false, Al = false, Hm = false;
        switch (type) {
            case LINKED_LIST:
                Ll = true;
                break;

            case ARRAY_LIST:
                Al = true;
                break;

            case HASH_MAP:
                Hm = true;
                break;
        }

        if (Ll && Add) {


            for (int x = 0; x < iterations; x++) {
                for (int i = 0; i < size; i++) {
                    Person person = new Person("Bob", 21);
                    linkedList.add(person);
                }
                linkedList = new LinkedList<Person>(arrayList);
            }
            

        } else if (Ll && Index) {


            for (int x = 0; x < iterations; x++) {
                int targetIndex = size / 2; 
    
                Person person = linkedList.get(targetIndex);
            }
            linkedList = new LinkedList<Person>(arrayList);


        } else if (Ll && Search) {
            for (int y = 0; y < size; y++) {
                Person fella = new Person(Integer.toString(y), 10);
                linkedList.add(fella);
            }

            int index = 0;
            try {
                index = size / 2;
            } catch (Exception e) {

            }
            for (int x = 0; x < iterations; x++) {
                
            }

        }

        if (Al && Add) {
            for (int x = 0; x < iterations; x++) {
                for (int i = 0; i < size; i++) {
                    Person person = new Person("Bob", 21);
                    arrayList.add(person);
                }
                arrayList = new ArrayList<Person>(size);
            }
        } else if (Al && Index) {


            for (int i = 0; i < size; i++) {
                Person person = new Person("Bob", 21);
                arrayList.add(person);
            }
            int min = 0;
            int max = size;

            Random random = new Random();
            for (int x = 0; x < iterations; x++) {
                int i = random.nextInt(max - min + 1) + min;
                Person person = (Person) arrayList.get(i);
            }

            

        } else if (Al && Search) {



        }

        if (Hm && Add) {

            for (int x = 0; x < iterations; x++) {
                for (int i = 0; i < size; i++) {
                    Person person = new Person("Bob", 21);
                    hashTable.put(i, person);
                }
            }

        } else if (Hm && Index) {






        } else if (Hm && Search) {





        }
    }
}