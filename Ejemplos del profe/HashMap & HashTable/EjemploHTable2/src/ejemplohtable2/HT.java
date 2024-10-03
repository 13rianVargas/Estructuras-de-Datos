/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohtable2;

/**
 *
 * @author ASUS
 */
public class HT {
    
        // data members of HT
    protected int divisor; // hash function divisor
    protected HashEntry[] table; // hash table array
    protected int size; // number of elements in table

    // constructor
    public HT(int theDivisor) {
        divisor = theDivisor;

        // allocate hash table array
        table = new HashEntry[divisor];
    }

    // methods
    /**
     * @return true iff the table is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @return current number of elements in the table
     */
    public int size() {
        return size;
    }

    /**
     * search an open addressed hash table for an element with key theKey
     *
     * @return location of matching element if found, otherwise return location
     * where an element with key theKey may be inserted provided the hash table
     * is not full
     */
    private int search(Object theKey) {
        int i = Math.abs(theKey.hashCode()) % divisor;  // home bucket
        int j = i;    // start at home bucket
        do {
            if (table[j] == null || table[j].key.equals(theKey)) {
                return j;
            }
            j = (j + 1) % divisor;  // next bucket
        } while (j != i);          // returned to home bucket?

        return j;  // table full
    }

    /**
     * @return element with specified key
     * @return null if no matching element
     */
    public Object get(Object theKey) {
        // search the table
        int b = search(theKey);

        // see if a match was found at table[b]
        if (table[b] == null || !table[b].key.equals(theKey)) {
            return null;           // no match
        }
        return table[b].element;  // matching element
    }

    /**
     * insert an element with the specified key overwrite old element if there
     * is already an element with the given key
     *
     * @throws IllegalArgumentException when the table is full
     * @return old element (if any) with key theKey
     */
    public Object put(Object theKey, Object theElement) {
        // search the table for a matching element
        int b = search(theKey);

        // check if matching element found
        if (table[b] == null) {
            // no matching element and table not full
            table[b] = new HashEntry(theKey, theElement);
            size++;
            return null;
        } else if (table[b].key.equals(theKey)) {
            Object elementToReturn = table[b].element;
            table[b].element = theElement; //overwrite if key is equal
            return elementToReturn;
        } else //table is full
        {
            throw new IllegalArgumentException("table is full");
        }
    }

    /**
     * output the hash table
     */
    public void output() {
        for (int i = 0; i < divisor; i++) {
            if (table[i] == null) {
                System.out.println("null");
            } else {
                System.out.println(table[i].key + "\t" + table[i].element);
            }
        }
    
    }
   
    
}
