package nested_class;

import java.util.Iterator;

public class Inner_Class_II {
    //Create an array
    private final static int SIZE = 15;
    private final int[] arrayOfInts = new int[SIZE];

    public Inner_Class_II() {
        //Fill the array with ascending integer values.
        for(int i = 0; i < SIZE; i++){
            arrayOfInts[i] = i;
        }
    }

    public void printEven(){
        //Print out values of even indices of the array.
        DataStructureIterator iterator = this.new EvenIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
        System.out.println();
    }

    //Inner interface DataStructureIterator.
    interface  DataStructureIterator extends Iterator<Integer>{}

    //Inner Class EventIterator implements the DataStructureIterator interface

    private class EvenIterator implements DataStructureIterator{

        //Start stepping through the array from the beginning
        private int nextIndex = 0;


        @Override
        public boolean hasNext() {
            //check if the current element is the last in the array
            return nextIndex<= SIZE-1;
        }

        @Override
        public Integer next() {
            //Record a value of an even index of the array
            Integer retValue = arrayOfInts[nextIndex];
            nextIndex += 2;
            return retValue;
        }


    }

}
