public class BubbleSort {
    public static void sortingArray (int[] arr, char option){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(option == 'a'){
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                if(option == 'd'){
                    if(arr[i] < arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
    
    public static void main (String[] args){
            int[] nilai = {65, 78, 45, 89, 90, 98, 72, 15, 64, 94};
            System.out.println("\nData nilai sebelum di urutkan :");
            for(int value : nilai)
                System.out.print(value + ", ");

            char option = 'a';

            System.out.println("\n\nData setelah diurutkan secara ascending : ");

            sortingArray(nilai, option);
            for(int value : nilai)
                System.out.print(value + ", ");

            option = 'd';

            System.out.println("\n\nData setelah diurutkan secara desceding :");

            sortingArray(nilai, option);
            for(int value : nilai)
                System.out.print(value + ", ");
    }
    
}
