package linkedList;
import  java.util.*;
/**
 * Created by youngz on 16-7-1.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        SortedSet<Item> sortByDescription = new TreeSet<>(new
                Comparator<Item>(){
                    public int compare(Item a, Item b) {
                        String descrA = a.getDescription();
                        String descrB = b.getDescription();
                        return descrA.compareTo(descrB);
                    }
                });
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
class Item implements Comparable<Item>{
    private String description;
    private int partNumber;

    public Item(String aDescription, int aPartNumber) {
        this.description = aDescription;
        this.partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }
    public String toString() {
        return "[description = " + description + ",parNumber = " + partNumber + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (partNumber != item.partNumber) return false;
        return description != null ? description.equals(item.description) : item.description == null;

    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(partNumber, other.partNumber);
    }
}
