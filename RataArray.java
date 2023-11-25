public class RataArray{
    static void rataRata (int[] arr){
        int n = arr.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            total += arr[i];
        }
     double rataRata = total/n;
     System.out.println(rataRata);
    }
    
    public static void main (String[] args){
        RataArray ra = new RataArray();
        
        int[] deretBilangan = {7, 5, 2, 4, 3, 1};
        System.out.println();
        for(int value : deretBilangan)
            System.out.print(+ value + ", ");
        System.out.print("\nRata rata deret angka itu adalah :  ");
        ra.rataRata(deretBilangan);
        System.out.println();
    }
}
