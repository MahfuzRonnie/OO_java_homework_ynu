public class Sort {
    int[] AscendSort(int array[]){
        for (int pass = 1; pass < array.length; pass++){
            for (int ele = 0; ele < (array.length - 1); ele++){
                if (array[ele] > array[ele + 1])    swap(array, ele, ele + 1);
            }
        }
        return array;
    }

    int[] DescendSort(int array[]){
        for (int pass = 1; pass < array.length; pass++){
            for (int ele = 0; ele < (array.length - 1); ele++){
                if (array[ele] < array[ele + 1])    swap(array, ele, ele + 1);
            }
        }
        return array;
    }

    void swap(int array[], int first, int second){
        int hold = array[first];
        array[first] = array[second];
        array[second] = hold;
    }
}
