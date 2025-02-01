package Section_9;

public class Program1_Practising_1D_Array {
    
    public static void main(String[] args) {
        
        int A[] = new int[5];
        int B[] = {20, 52, 16, 24, 48};
        
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();

        for (int i : A) {
            System.out.format("%02d ", i);
        }
    }
}
