/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.io.*;
import java.util.*;

/**
 *
 * @author Valeska
 */
public class LinkedList {
    
    public LinkedList(Object x, LinkedList nextRef, LinkedList prevRef) {
        this.SetData(x, this);
        this.SetNext(nextRef, this);
        this.SetPrev(prevRef, this);
    }
    
    private Object data = null;
    
    private LinkedList next = null;
    private LinkedList prev = null;
    
    /*public LinkedList spawnList(Object x) {
        
        LinkedList i = new LinkedList(x, null, null);
        return i;
        
    }*/

    
    
    public void PrintElement(LinkedList list) { 
        
        String prevRef;
        String nextRef;
        
        if (list.prev != null) {
            prevRef = list.prev.toString();
        }
        
        else {
            prevRef = null;
        }
        
        if (list.next != null) {
            nextRef = list.next.toString();
        }
        
        else {
            nextRef = null;
        }
        
        System.out.println(list.data.toString() + " " + nextRef + " " + prevRef);
        
    }
    
    public LinkedList getPrev(LinkedList list) {
        
        return list.prev;
        
    }
    
    public LinkedList getNext(LinkedList list) {
        
        return list.next;
        
    }
    
    public void SetPrev(LinkedList prevRef, LinkedList list) {
        
        list.prev = prevRef;
        
    }
    
    public void SetNext(LinkedList nextRef, LinkedList list) {
        
        list.next = nextRef;
        
    }
    
    public void SetData(Object x, LinkedList list) {
        
        list.data = x;
        
    }
    
    public LinkedList AddElement(Object x, LinkedList list) {
        
        LinkedList i = new LinkedList(x, null, list);

        list.next = i;
        
        return i;
        
    }
    
    public void RemoveElement(LinkedList list) {
        
        list.prev.next = list.next;
        list.next.prev = list.prev;
        
    }
    
    public void ChangeElement(Object x, LinkedList list) {
        
        list.data = x;
        
    }
    
    public void InsertElement(Object x, LinkedList list, boolean pos) {
        
        LinkedList i = new LinkedList(x, null, null);
        
        if (pos) {
            i.prev = list;
            i.next = list.next;
            list.next = i;
        }
        
        if (!pos) {
            i.next = list;
            i.prev = list.prev;
            list.prev.next = i;
            list.prev = i;
        }
    }
    
}
