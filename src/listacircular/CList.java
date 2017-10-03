/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircular;

/**
 *
 * @author Osiris
 */
public class CList<T>{
    Node pivot = null;
    Node pointer = null;
    int length;
    
    CList(){
        length = 0;
    }
    
    CList(T d) {
        Node<T> a = new Node<T>(d);
        pivot = a;
        pivot.next = a;
        length = 1;
    }
    
    public boolean isEmpty(){
        return length==0;
    }
    
    public void insert(T d){
        Node<T> a = new Node<T>(d);
        pivot.next = a.next;
        pivot.next = a;
        length++;
    }
    
    public void deleteNode(T d){
        if (!isEmpty()){
            pointer = pivot;
            for (int i = 0; i < length; i++){
                if (pointer.next.data == d){
                    pointer.next = pointer.next.next;
                    if (pivot.data == d){
                        pivot = pointer;
                    }
                    length--;
                    i = length + 1;
                }
                pointer = pointer.next;
            }
            pointer = null;
        }
    }
    
    public void deleteList(){
        pointer = pivot = null;
        length = 0;
    }
}
