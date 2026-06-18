import java.util.LinkedList;

public class LL2 {
    public static void main(String[] args) {
        // 1. Create a LinkedList of Strings
        LinkedList<String> cars = new LinkedList<>();

        // 2. Add elements (Insertion)
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        
        // Add elements to specific positions
        cars.addFirst("Tesla");  // Adds to the beginning
        cars.addLast("Mazda");   // Adds to the end

        // 3. Print the entire list
        System.out.println("Initial List: " + cars);

        // 4. Access elements
        String first = cars.getFirst();
        System.out.println("First Car: " + first);

        // 5. Remove elements (Deletion)
        cars.remove("BMW");      // Removes by value
        cars.remove(2);          // Removes by index position
        cars.removeFirst();      // Removes the head node

        // 6. Iterate through the list
        System.out.print("Remaining Cars: ");
        for (String car : cars) {
            System.out.print(car + " -> ");
        }
        System.out.println("null");
    }
}