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
public class HashEntry {
    
      // data members
    protected Object key;
    protected Object element;

    // constructors
    public HashEntry() {
    }

    public HashEntry(Object theKey, Object theElement) {
        key = theKey;
        element = theElement;
    }
}
