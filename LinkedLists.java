/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author Valeska
 */
public class LinkedLists {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList(0, null, null);
        
        LinkedList newList = list;
        
        for(int i = 1; i < 1001; i++) {
            
            newList = list.AddElement(i, newList);
            
        }
        
        newList = list;
        list.PrintElement(newList);
        
        for(int i = 0; i < 1000; i++) {
            
            newList = list.getNext(newList);
            list.PrintElement(newList);
            
        }
        
        for(int i = 0; i < 1000; i++) {
            
            list.PrintElement(newList);
            newList = list.getPrev(newList);
            
        }
        
    }
    
}
