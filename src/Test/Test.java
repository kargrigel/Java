package Test;

public class Test {
    public static  int search(int[] array, int key){
        int index = -1;
        for (int i = 0; i<array.length; i++){
            if (array[i] == key){
                index=i;
                System.out.println(index);
            }

        }return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,4,3,7};
        search(arr,3);
    }
}
