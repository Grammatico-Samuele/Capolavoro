package LinkedListLibrary;

//<T> allows you to parameterize the type of data or object
public class Node<T> {
    //data and next item
    private T data; 
    private Node<T> next; 
    private Node<T> previous; 

    //constructor for creating a new node
    public Node(T data) {
        this.data = data; 
        next = null; 
    }

    //getter and setter for setting next node, return data and next node
    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}
