package Zad6;

class LowArray {  
    private double[] a; // referencja do tablicy a
    public LowArray(int size) { // konstructor tablicy a 
        a = new double[size];
    }
    // put element into array
    public void setElem(int index, double value) {
        a[index] = value;
    }
    public double getElem(int index) {// get element from array
        return a[index];
    }
 }
