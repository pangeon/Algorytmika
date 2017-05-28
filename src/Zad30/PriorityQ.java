
package Zad30;
class PriorityQ {
    // array in sorted order, from max at 0 to min at size-1
    private int maxSize;
    private double[] queArray;
    private int nItems;
    
    public PriorityQ(int s) { // constructor
        maxSize = s;
        queArray = new double[maxSize];
        nItems = 0;
    }
    public void insert(double item) { // insert item
        int j;
        if(nItems==0) // if no items,
        queArray[nItems++] = item; // insert at 0
        else { // if any items,
            for(j=nItems-1; j>=0; j--) { // start at end,
                if(item > queArray[j]) { // if new item larger,
                queArray[j+1] = queArray[j]; // shift upward
                } else { // if smaller,
                    break; // done shifting
                }
            } // end for
            queArray[j+1] = item; // insert it
            nItems++;
        } // (nItems > 0)
    }

    public double remove() { // remove minimum item
        return queArray[--nItems]; 
    }
    public double peekMin() { // peek at minimum item
        return queArray[nItems-1]; 
    }   
    public boolean isEmpty() { // true if queue is empty
        return (nItems==0); 
    }
    public boolean isFull() { // true if queue is full
        return (nItems == maxSize); 
    }
}
