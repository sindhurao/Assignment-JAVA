package com.assignment.list;

public class LinkedList {
	/* Linked List node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

	public Node head;
 
    /* Function to get the nth node from the last of a linked list */
    public int printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;
 
        // count the number of nodes in Linked List
        while (temp != null)
        {
            temp = temp.next;
            len++;
        }
 
        // check if value of n is not more than length of the linked list
        if (len < n)
            return 0;
 
        temp = head;
 
        // get the (n-len+1)th node from the begining
        for (int i = 1; i < len-n+1; i++)
            temp = temp.next;
 
        return temp.data;
    }
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    
    
    /*Drier program to test above methods */
    public static void main(String [] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(10);
        llist.push(20);
        llist.push(30);
        llist.push(40);
        llist.push(50);
        llist.push(60);
        llist.push(70);
        llist.push(80);
        llist.push(90);
 
        System.out.println(llist.printNthFromLast(5));
    }

}
