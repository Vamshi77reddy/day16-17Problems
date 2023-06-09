package orderedList;


public class LinkedList <T> {

    Node<T> head;
    Node<T> tail;

    public void append(T data) {

        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void push(T data) {

        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void display() {

        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("The number is ::"+temp);
    }
    public T pop() {

        if (head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }
    public T poplast(T search) {

        if (head == null)
            return null;
        T popData = tail.data;
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
    }
    public Node<T> delete(T delete) {
        Node<T> temp1 = head;
        Node<T> temp2 = head;
        Node<T> temp3 = head;
        int count = 0;
        while (temp1 != null & temp2 != null & temp3 != null) {
            count++;
            if (count > 2) {
                temp3 = temp3.next;
            }
            if (temp1.data == delete) {
                temp2 = temp2.next;
                temp3.next = temp2;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    	 public void search(T search) {
 	        Node <T> temp = head;
 	        boolean flag= false;
 	        while(temp!=null)
 	        {
 	            if(temp.data.equals(search))
 	            {
 	                flag=true;
 	               delete(search);
 	            }
 	            temp=temp.next;
 	        }
 	        if(!flag){
 	        	append(search);
 	            System.out.println("data added successfully");
 	        }
    	 }
    public Node<T> size() {
        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("LinkedList Size = " + count);
        return temp;
    }
}


