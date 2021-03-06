Java: we want a utility function that will print all flattened nodes from a linked list



class LinkedList { 

      

    static Node head; 

      

    class Node { 

          

        int data; 

        Node next, child; 

          

        Node(int d) { 

            data = d; 

            next = child = null; 

        } 

    }

Output: [1,2,3,7,8,11,12,9,10,4,5,6]


Time Complexity: O(n)
