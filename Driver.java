
import java.util.*;

public class Driver implements CollectionTest {
    /**
     * @author Joseph James
     * Driver class
     */
    private HashMap<Integer, Person> hashTable = new HashMap<Integer, Person>();

    private LinkedList<Person> linkedList = new LinkedList<Person>();

    private ArrayList<Person> arrayList = new ArrayList<Person>();

    private int size;


    public Driver() {
    }


    /**
     * @param size the number of unique items to add to each collection.
     */
    public void setSize(int size) {
        this.size = size;
        hashTable = new HashMap<Integer, Person>(size);
        arrayList = new ArrayList<Person>(size);
        linkedList = new LinkedList<Person>(arrayList);
    }

    /**
     * @param type enum of the type of collection to be tested.
     * @param test enum of the type of test to be undertaken.
     * @param iterations the number of times to repeat the given test before returning.
     */

    public void runTest(CollectionType type, TestType test, int iterations) {
        boolean Add = false, Index = false, Search = false;

        /**
         * used to decide what collection and test is being performed
         */

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
        /**
         * LinkedList and ADD
         */

        if (Ll && Add) {

            for (int x = 0; x < iterations; x++) {
                for (int i = 0; i < size; i++) {
                    Person person = new Person("Bob", 21);
                    linkedList.add(person);
                }
                linkedList = new LinkedList<Person>(arrayList);
            }
            /**
             * LinkedList and INDEX
             * */
        } else if (Ll && Index) {

            for (int x = 0; x < iterations; x++) {
                try {
                    int targetIndex = size / 2;
                    Person person = linkedList.get(targetIndex);
                } catch (Exception ignored) {
                }
            }
            linkedList = new LinkedList<Person>(arrayList);

            /**
             * LinkedList and SEARCH
             */
        } else if (Ll && Search) {

            for (int y = 0; y < size; y++) {
                Person fella = new Person(Integer.toString(y), 10);
                linkedList.add(fella);
            }

            int index = 0;
            try {
                index = size / 2;
            } catch (Exception ignored) {
            }
            Person person = new Person(Integer.toString(index), 10);
            for (int i = 0; i <= iterations; i++) {
                for (int x = 0; x < size; x++) {
                    if (linkedList.get(x).equals(person)) {
                        break;
                    }
                }
            }
        }

        /**
         * ArrayList and ADD
         */
        if (Al && Add) {
            for (int x = 0; x < iterations; x++) {
                for (int i = 0; i < size; i++) {
                    Person person = new Person("Bob", 21);
                    arrayList.add(person);
                }
                arrayList = new ArrayList<Person>(size);
            }

            /**
             * ArrayList and INDEX
              */
        } else if (Al && Index) {

            for (int x = 0; x < iterations; x++) {
                try {
                    int targetIndex = size / 2;
                    Person person = arrayList.get(targetIndex);
                } catch (Exception ignored) {
                }
            }
            arrayList = new ArrayList<>(size);

            /**
             * ArrayList and SEARCH
             */
        } else if (Al && Search) {

            for (int y = 0; y < size; y++) {
                Person fella = new Person(Integer.toString(y), 10);
                arrayList.add(fella);
            }

            int index = 0;
            try {
                index = size / 2;
            } catch (Exception ignored) {
            }
            Person person = new Person(Integer.toString(index), 10);
            for (int i = 0; i <= iterations; i++) {
                for (int x = 0; x < size; x++) {
                    if (arrayList.get(x).equals(person)) {
                        break;
                    }
                }
            }
        }

        /**
         * HashMap and ADD
         */
        if (Hm && Add) {

            for (int x = 0; x < iterations; x++) {
                for (int i = 0; i < size; i++) {
                    Person person = new Person("Bob", 21);
                    hashTable.put(i, person);
                }
            }

            /**
             * HashMap and INDEX
             */
        } else if (Hm && Index) {

            for (int x = 0; x < iterations; x++) {
                try {
                    int targetIndex = size / 2;
                    Person person = arrayList.get(targetIndex);
                } catch (Exception ignored) {
                }
            }
            arrayList = new ArrayList<>(size);

            /**
             * HashMap and SEARCH
             */
        } else if (Hm && Search) {
            for (int y = 0; y < size; y++) {
                Person fella = new Person(Integer.toString(y), 10);
                hashTable.put(size, fella);
            }

            int index = 0;
            try {
                index = size / 2;
            } catch (Exception ignored) {
            }
            Person person = new Person(Integer.toString(index), 10);
            for (int i = 0; i <= iterations; i++) {
                for (int x = 0; x < size; x++) {
                    if (hashTable.get(x).equals(person)) {
                        break;
                    }
                }
            }
        }
    }
}