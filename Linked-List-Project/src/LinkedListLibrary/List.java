package LinkedListLibrary;

public class List<T> {
    //Pointers head and queue
    private Node<T> head; 
    private Node<T> queue; 


    //instantiation of the list
    public List() {
        head = null; 
        queue = null;
    }

    //node insertion without sorting
    public void add(T data) {
        //new node to add to the list
        Node<T> newNode = new Node<>(data); 

        //logic which allows the addition of nodes
        if (head == null) {
            //in the case of the first element it is added at the head and at the queue
            head = queue = newNode; 
        } else {
            //in the case of the head is defined we aim for the next node of queue and initialize the queue a "newNode"
            queue.setNext(newNode);
            newNode.setPrevious(queue);
            queue = newNode;
        }
    }

    //node insertion with string sorting
    public void addWithSortingString(T data) throws IllegalArgumentException {

        //it checks that data is of type string otherwise the IllegalArgumentException exception is raised
        if (data instanceof String) {
            //he comes create a new node
            Node<T> newNode = new Node<>(data); 
            //you initialize dataString through data casting
            String dataString = (String) data; 

            //logic which allows the addition of nodes
            if (head == null) {
                //in the case of the first element it is added at the head and at the queue
                head = queue = newNode; 
            } else if (dataString.compareTo((String) head.getData()) <= 0) {
                //in the case dataString in alphabetical order it is smaller than head.getData() the new node is inserted before the head pointer
                newNode.setNext(head);   
                head.setPrevious(newNode);
                head = newNode; 
            } else {
                Node<T> temp = head; 
                Node<T> next = head.getNext(); 

                while (next != null && dataString.compareTo((String) next.getData()) > 0) {
                    temp = next; 
                    next = next.getNext(); 
                }

                //is added the new node between temp and next
                temp.setNext(newNode);
                newNode.setNext(next);
                newNode.setPrevious(temp);

                //if newNode is positioned as the last node, the queue pointer is updated to newNode otherwise next points as the previous pointer to newNode
                if (next != null) {
                    next.setPrevious(newNode);
                } else {
                    queue = newNode;
                }
            }
        } else {
            throw new IllegalArgumentException("data is not String type");
        }
    }

    //node insertion with Integer sorting
    public void addWithSortingInt(T data) throws IllegalArgumentException {
        if (data instanceof Integer) {
            Node<T> newNode = new Node<>(data);
            int dataInt = (int) data; 

            if (head == null) {
                head = queue = newNode; 
            } else if (dataInt <= (int) head.getData()) {
                newNode.setNext(head); 
                queue = head;   
                head.setPrevious(newNode);
                head = newNode; 
            } else {
                Node<T> temp = head; 
                Node<T> next = head.getNext(); 

                while (next != null && dataInt > (int) next.getData()) {
                    temp = next; 
                    next = next.getNext(); 
                }

                temp.setNext(newNode);
                newNode.setNext(next);
                newNode.setPrevious(temp);

                if (next != null) {
                    next.setPrevious(newNode);
                } else {
                    queue = newNode;
                }
            }
        } else {
            throw new IllegalArgumentException("data is not int type");
        }
    }

    //node insertion with Double sorting
    public void addWithSortingDouble(T data) throws IllegalArgumentException {
        if (data instanceof Double) {
            Node<T> newNode = new Node<>(data);
            double dataDouble = (double) data; 

            if (head == null) {
                head = queue = newNode; 
            } else if (dataDouble <= (double) head.getData()) {
                newNode.setNext(head);   
                head.setPrevious(newNode);
                head = newNode;
            } else {
                Node<T> temp = head; 
                Node<T> next = head.getNext(); 

                while (next != null && dataDouble > (double) next.getData()) {
                    temp = next; 
                    next = next.getNext(); 
                }

                temp.setNext(newNode);
                newNode.setNext(next);
                newNode.setPrevious(temp);

                if (next != null) {
                    next.setPrevious(newNode);
                } else {
                    queue = newNode;
                }
            }
        } else {
            throw new IllegalArgumentException("data is not double type");
        }
    }

    //node insertion with Float sorting
    public void addWithSortingFloat(T data) throws IllegalArgumentException {
        if (data instanceof Float) {
            Node<T> newNode = new Node<>(data);
            float dataInt = (float) data; 

            if (head == null) {
                head = queue = newNode; 
            } else if (dataInt <= (float) head.getData()) {
                newNode.setNext(head);   
                head.setPrevious(newNode);
                head = newNode;  
            } else {
                Node<T> temp = head; 
                Node<T> next = head.getNext(); 

                while (next != null && dataInt > (float) next.getData()) {
                    temp = next; 
                    next = next.getNext(); 
                }

                temp.setNext(newNode);
                newNode.setNext(next);
                newNode.setPrevious(temp);

                if (next != null) {
                    next.setPrevious(newNode);
                } else {
                    queue = newNode;
                }
            }
        } else {
            throw new IllegalArgumentException("data is not double type");
        }
    }

    //node insertion with Byte sorting
    public void addWithSortingByte(T data) throws IllegalArgumentException {
        if (data instanceof Byte) {
            Node<T> newNode = new Node<>(data);
            byte dataInt = (byte) data; 

            if (head == null) {
                head = queue = newNode; 
            } else if (dataInt <= (byte) head.getData()) {
                newNode.setNext(head);   
                head.setPrevious(newNode);
                head = newNode; 
            } else {
                Node<T> temp = head; 
                Node<T> next = head.getNext(); 

                while (next != null && dataInt > (byte) next.getData()) {
                    temp = next; 
                    next = next.getNext(); 
                }

                temp.setNext(newNode);
                newNode.setNext(next);
                newNode.setPrevious(temp);

                if (next != null) {
                    next.setPrevious(newNode);
                } else {
                    queue = newNode;
                }
            }
        } else {
            throw new IllegalArgumentException("data is not double type");
        }
    }

    //node insertion with Short sorting
    public void addWithSortingShort(T data) throws IllegalArgumentException {
        if (data instanceof Short) {
            Node<T> newNode = new Node<>(data);
            short dataInt = (short) data; 

            if (head == null) {
                head = queue = newNode; 
            } else if (dataInt <= (short) head.getData()) {
                newNode.setNext(head);   
                head.setPrevious(newNode);
                head = newNode; 
            } else {
                Node<T> temp = head; 
                Node<T> next = head.getNext(); 

                while (next != null && dataInt > (short) next.getData()) {
                    temp = next; 
                    next = next.getNext(); 
                }

                temp.setNext(newNode);
                newNode.setNext(next);
                newNode.setPrevious(temp);

                if (next != null) {
                    next.setPrevious(newNode);
                } else {
                    queue = newNode;
                }
            }
        } else {
            throw new IllegalArgumentException("data is not double type");
        }
    }

    //node insertion with Long sorting
    public void addWithSortingLong(T data) throws IllegalArgumentException {
        if (data instanceof Long) {
            Node<T> newNode = new Node<>(data);
            long dataInt = (long) data; 

            if (head == null) {
                head = queue = newNode; 
            } else if (dataInt <= (long) head.getData()) {
                newNode.setNext(head);   
                head.setPrevious(newNode);
                head = newNode; 
            } else {
                Node<T> temp = head; 
                Node<T> next = head.getNext(); 

                while (next != null && dataInt > (long) next.getData()) {
                    temp = next; 
                    next = next.getNext(); 
                }

                temp.setNext(newNode);
                newNode.setNext(next);
                newNode.setPrevious(temp);

                if (next != null) {
                    next.setPrevious(newNode);
                } else {
                    queue = newNode;
                }
            }
        } else {
            throw new IllegalArgumentException("data is not double type");
        }
    }

    //return of the length of the list
    public int getLenghtList() {
        int lenght = 0; 
        Node<T> temp = head;

        while (temp != null) {
            lenght++; 
            temp = temp.getNext(); 
        }

        return lenght; 
    }

    //return of the node through index
    public T get(int index) throws NullPointerException {
        Node<T> temp = head;
        int i = -1;  
        
        while (temp != null) {
            i++; 

            if (i == index) {
                return temp.getData(); 
            }

            temp = temp.getNext(); 
        }

        return temp.getData(); 
    }

    //delete of the node through index
    public void deleteWithIndex(int index) throws NullPointerException {
        int i = -1; 
        Node<T> temp = head; 
        Node<T> next = head.getNext(); 

        //deleting of the head
        if (i+1 == index) {
            head = head.getNext(); 
            return; 
        }

        //elimination of central and queue nodes
        while (temp != null) {
            i++; 
            if (i == index-1) {
                temp.setNext(next.getNext());
                //updating of the queue
                if (temp.getNext() == null) {
                    queue = temp; 
                }
                return; 
            }
            temp = next; 
            next = next.getNext(); 
        }

        throw new NullPointerException("outside the limits of the list"); 
    }

    //deleting the last node
    public void pop() {
        Node<T> temp = head; 

        while (temp != null) {
            if (temp.getNext().getNext() == null) {
                temp.setNext(null);
                queue = temp; 
            }
            temp = temp.getNext(); 
        }
    }

    //deletion of a known through use of argument
    public void deleteNodeWithArgument(T data) {
        Node<T> temp = this.head;
        Node<T> next = this.head.getNext();

        if (head == null){
            return; 
        }
          
        if (data.equals(head.getData())) {
            head = head.getNext();
        } else {
            while (next != null) {
                if (next.getData().equals(data)) {
                    temp.setNext(next.getNext());
                    return;
                } 
                temp = next;
                next = next.getNext();
            } 

            if (next == null) {
                this.queue = temp; 
            }   
        } 
    }
      
    //elimination of the head
    public void deleteHead() {
        if (head != null) {
            head = head.getNext();
        } else {
            return;
        } 
    }
      
    //sorting of the entire list, (ONLY FOR SMALL AMOUNTS OF DATA)
    public void sort() {
        Node<T> temp = head;
        Node<T> next = head.getNext();
        T nextTemp = head.getData();
        boolean sortingIteration = false; 

        if (head.getData() instanceof Integer) {
            while (next != null) {
                if ((int) (temp.getData()) > (int) ((next.getData()))) {
                temp.setData(next.getData());
                next.setData(nextTemp);
                sortingIteration = true; 
                }

                temp = next;
                nextTemp = temp.getData();
                next = next.getNext();
            } 
            
            if (sortingIteration) {
                sort();
            } else {
                return; 
            }
        }

        if (head.getData() instanceof Double) {
            while (next != null) {
                if ((double) (temp.getData()) > (double) ((next.getData()))) {
                temp.setData(next.getData());
                next.setData(nextTemp);
                sortingIteration = true; 
                }

                temp = next;
                nextTemp = temp.getData();
                next = next.getNext();
            } 
            
            if (sortingIteration) {
                sort();
            } else {
                return; 
            }
        }

        if (head.getData() instanceof Long) {
            while (next != null) {
                if ((long) (temp.getData()) > (long) ((next.getData()))) {
                temp.setData(next.getData());
                next.setData(nextTemp);
                sortingIteration = true; 
                }

                temp = next;
                nextTemp = temp.getData();
                next = next.getNext();
            } 
            
            if (sortingIteration) {
                sort();
            } else {
                return; 
            }
        }

        if (head.getData() instanceof Byte) {
            while (next != null) {
                if ((byte) (temp.getData()) > (byte) ((next.getData()))) {
                temp.setData(next.getData());
                next.setData(nextTemp);
                sortingIteration = true; 
                }

                temp = next;
                nextTemp = temp.getData();
                next = next.getNext();
            } 
            
            if (sortingIteration) {
                sort();
            } else {
                return; 
            }
        }

        if (head.getData() instanceof Short) {
            while (next != null) {
                if ((short) (temp.getData()) > (short) ((next.getData()))) {
                temp.setData(next.getData());
                next.setData(nextTemp);
                sortingIteration = true; 
                }

                temp = next;
                nextTemp = temp.getData();
                next = next.getNext();
            } 
            
            if (sortingIteration) {
                sort();
            } else {
                return; 
            }
        }

        if (head.getData() instanceof Float) {
            while (next != null) {
                if ((float) (temp.getData()) > (float) ((next.getData()))) {
                temp.setData(next.getData());
                next.setData(nextTemp);
                sortingIteration = true; 
                }

                temp = next;
                nextTemp = temp.getData();
                next = next.getNext();
            } 
            
            if (sortingIteration) {
                sort();
            } else {
                return; 
            }
        }

        if (head.getData() instanceof String) {
            String tempString = ""; 
            String nextString = ""; 
            while (next != null) {
                tempString = (String) temp.getData(); 
                nextString = (String) next.getData(); 

                if (tempString.compareTo(nextString) > 0) {
                temp.setData(next.getData());
                next.setData(nextTemp);
                sortingIteration = true; 
                }

                temp = next;
                nextTemp = temp.getData();
                next = next.getNext();
            } 
            
            if (sortingIteration) {
                sort();
            } else {
                return; 
            }
        }

    }

    //Method that finds the pivot needed for the Partition() and PartitionString() method
    private Node<T> medianOfThree(Node<T> low, Node<T> high) {
        Node<T> mid = low;
        Node<T> fast = low.getNext();
    
        while (fast != high && fast.getNext() != high) {
            mid = mid.getNext();
            fast = fast.getNext().getNext();
        }
    
        return mid;
    }

    //partitioning required for the quicksort sorting algorithm, used by the int, double, float, long, short, byte data types
    private Node<T> partition(Node<T> low, Node<T> high) {
        Node<T> pivot = medianOfThree(low, high);
        Node<T> i = low; 
        Node<T> j = high;

        if (low.getData() instanceof Integer) {


            while (true)  {
                while (i != null && (int) i.getData() < (int) pivot.getData()) {
                    i = i.getNext();
                }
        
                while (j != null && (int) j.getData() > (int) pivot.getData()) {
                    j = j.getPrevious(); 
                }
        
                if (i == null || j == null || i == j || i.getPrevious() == j) {
                    return j;
                }
        
                swap(i, j);

                i = i.getNext(); 
                j = j.getPrevious(); 
            }
        } else if (low.getData() instanceof Double) {
            while (true)  {
                while (i != null && (double) i.getData() < (double) pivot.getData()) {
                    i = i.getNext(); 
                }
        
                while (j != null && (double) j.getData() > (double) pivot.getData()) {
                    j = j.getPrevious(); 
                }
        
                if (i == null || j == null || i == j || i.getPrevious() == j) {
                    return j;
                }
        
                swap(i, j);
    
                i = i.getNext(); 
                j = j.getPrevious(); 
            }
        } else if (low.getData() instanceof Float) {
            while (true)  {
                while (i != null && (float) i.getData() < (float) pivot.getData()) {
                    i = i.getNext(); 
                }
        
                while (j != null && (float) j.getData() > (float) pivot.getData()) {
                    j = j.getPrevious(); 
                }
        
                if (i == null || j == null || i == j || i.getPrevious() == j) {
                    return j;
                }
        
                swap(i, j);
    
                i = i.getNext(); 
                j = j.getPrevious(); 
            }
        } else if (low.getData() instanceof Long) {
            while (true)  {
                while (i != null && (Long) i.getData() < (long) pivot.getData()) {
                    i = i.getNext(); 
                }
        
                while (j != null && (Long) j.getData() > (long) pivot.getData()) {
                    j = j.getPrevious(); 
                }
        
                if (i == null || j == null || i == j || i.getPrevious() == j) {
                    return j;
                }
        
                swap(i, j);
    
                i = i.getNext(); 
                j = j.getPrevious(); 
            }
        } else if (low.getData() instanceof Byte) {
            while (true)  {
                while (i != null && (byte) i.getData() < (byte) pivot.getData()) {
                    i = i.getNext(); 
                }
        
                while (j != null && (byte) j.getData() > (byte) pivot.getData()) {
                    j = j.getPrevious(); 
                }
        
                if (i == null || j == null || i == j || i.getPrevious() == j) {
                    return j;
                }
        
                swap(i, j);
    
                i = i.getNext(); 
                j = j.getPrevious(); 
            }
        } else if (low.getData() instanceof Short) {
            while (true)  {
                while (i != null && (short) i.getData() < (short) pivot.getData()) {
                    i = i.getNext(); 
                }
        
                while (j != null && (short) j.getData() > (short) pivot.getData()) {
                    j = j.getPrevious(); 
                }
        
                if (i == null || j == null || i == j || i.getPrevious() == j) {
                    return j;
                }
        
                swap(i, j);
    
                i = i.getNext(); 
                j = j.getPrevious(); 
            }
        }
        //this method will not get to "return null;" it was inserted to satisfy the typing that java requires
        return null; 
    }

    //quicksort partitioning method reserved for String
    private Node<T> partitionString(Node<T> low, Node<T> high) {
        Node<T> pivot = medianOfThree(low, high); 

        Node<T> i = low; 
        Node<T> j = high; 


        while (true)  {
            while (i != null &&((String) i.getData()).compareTo((String) pivot.getData()) < 0) {
                i = i.getNext();
            }
    
            while (j != null && ((String) j.getData()).compareTo((String) pivot.getData()) > 0) {
                j = j.getPrevious(); 
            }
    
            if (i == null || j == null || i == j || i.getPrevious() == j) {
                return j;
            }
    
            swap(i, j);

            i = i.getNext(); 
            j = j.getPrevious(); 
        }

    }

    //performing quicksort on int, double, float, long, short, byte data types
    private void runQuickSort(Node<T> low, Node<T> high) {
        if (low != high && low != high.getNext() && low != null && high != null) {
            Node<T> pivot = partition(low, high); 
            if (pivot != null) {
                runQuickSort(low, pivot);
                runQuickSort(pivot.getNext(), high);
            }
        }
    }

    //performing quicksort on the String data type
    private void runQuickSortString(Node<T> low, Node<T> high) {
        if (low != high && low != high.getNext() && low != null && high != null) {
            Node<T> pivot = partitionString(low, high); 
            runQuickSortString(low, pivot);
            runQuickSortString(pivot.getNext(), high);
        }
    }

    //data exchange method, needed for quicksort on all data types including the String type
    private void swap(Node<T> a, Node<T> b) {
        T temp = a.getData(); 
        a.setData(b.getData());
        b.setData(temp);
    }

    //Checking the type of data to perform with the quick sort
    public void quickSort() throws IllegalArgumentException {
        if (head.getData() instanceof Integer || head.getData() instanceof Double || head.getData() instanceof Float || head.getData() instanceof Long || head.getData() instanceof Byte || head.getData() instanceof Short ) {
            runQuickSort(head, queue);
        } else if (head.getData() instanceof String) {
            runQuickSortString(head, queue);
        } else {
            throw new IllegalArgumentException("Data type not compatible with sorting"); 
        }
    }

    //Screen output method
    public void output() {
        Node<T> temp = head; 

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext(); 
        }
    }
}
