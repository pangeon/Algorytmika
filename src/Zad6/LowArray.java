/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
