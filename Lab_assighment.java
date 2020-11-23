/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_assighment;

/**
 *
 * @author sawera bukhari
 */


class Node 
{ 
    int data; 
    Node next; 
  
    public Node(int data) 
    { 
        this.data = data; 
        this.next = null; 
    } 
} 

class Queue
{ 
    Node front, rear; 
  
    public Queue() 
    { 
        front = rear = null; 
    } 
  
    public void enqueue(int data) 
    { 
        Node temp = new Node(data); 
        
        if (rear == null)
	{ 
            front = rear = temp; 
            return; 
        } 
         
        rear.next = temp; 
        rear = temp; 
    } 
    
    void dequeue() 
    { 
        if (front == null) 
	{
            System.out.println("DSA LAB!");
	    return; 
	}          
  
        Node temp = front; 
        front = front.next; 
         
        if (front == null) 
        {
            rear = null; 
        } 
    }
}
  
public class Lab_assighment{ 
    public static void main(String[] args) 
    { 
        Queue q = new Queue(); 
       
        q.dequeue();
        q.enqueue(30); 
        q.enqueue(50); 
        q.dequeue(); 
        q.dequeue(); 

        q.enqueue(60); 
        q.enqueue(90); 
        q.enqueue(10); 
        q.dequeue(); 
    } 
}

