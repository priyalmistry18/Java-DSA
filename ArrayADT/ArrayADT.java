package ArrayADT;


public class ArrayADT {

    private int arr[];
    private int size;
    private int capacity;

    // Constructor to initialize a array.
    public ArrayADT( int capacity)
    {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
        
    }

    //Inserting an element.
    public void insertion( int element)
    {
        if(size == capacity){
        
            System.out.println("Array is full, Can not insert more elements.");
            return;
        }

        arr[size] = element;
        size++;
    }

    //Deleting an element.

    public void delete(int index)
    {
       if(index<0 || index>=size)
       {
        System.out.println("Invalid Index");
       }
       //Shift element to the left.
       for(int i = index; i<size ;i++)
       {
          arr[i] = arr[i+1];
       }
       size--;
    }

    //Searching an element.
    public int searching(int element)
    {
        for(int i=0; i<size ; i++)
        {
            if(arr[i]==element)
            {
                return i;
            }
        }
        return -1;
    }

    //Update the element at specific index.
    public void update(int index, int newVal)
    {
       if(index<0 || index>=size)
            System.out.println("Invalid Index");

       arr[index] = newVal;
    }

    //Traversal: Print all the elements of the array.
    public void traversal()
    {
        if(size == 0)
          System.out.println("Array is empty.");
      
       
        for (int i : arr) {                 
            System.out.print(i + " ");
        }
    }
    
//Get the size of the Arrray.
public int getSize()
{
    return size;

}

//Get the Capacity of the Array
public int getCapacity()
{
    return capacity;
}

public static void main(String[] args)
{
    //Creating an Array ADT with capacity of 10.
    ArrayADT array = new ArrayADT(10);

    //Inserting an element.
    array.insertion(5);
    array.insertion(10);
    array.insertion(15);
    array.insertion(20);

    //Traversing an array.
    System.out.println("Array Elemrnts are : ");
    array.traversal();
    System.out.println("\n-------------------------------");

    //Searching an element.
    int index = array.searching(15);
    System.out.println("Element 15 found at index "+index);
    System.out.println("\n-------------------------------");

    //Updating an Array.
    array.update(2, 26);
    System.out.println("After updating an element : ");
    array.traversal();
    System.out.println("\n-------------------------------");

    //Deleting an element.
    array.delete(1);
    System.out.println("After deleting an element at index 1 : ");
    array.traversal();
    System.out.println("\n-------------------------------");

    System.out.println("Current size of an array " + array.getSize());
    System.out.println("Capacity of an array " + array.getCapacity());
}

}