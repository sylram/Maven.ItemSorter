package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;

import java.util.*;

/**
 * @author leon on 30/01/2019.
 */


public class ItemSorter {
    Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort (Comparator<Item> comparator) {

        List<Item> itemsGiven = new ArrayList<Item>(Arrays.asList(items));
        Item[] itemsSorted = new Item[itemsGiven.size()];

        Collections.sort(itemsGiven, comparator);
        itemsSorted = itemsGiven.toArray(itemsSorted);

        return itemsSorted;
    }
}
