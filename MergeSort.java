package mergesort;
import java.util.Random;
public class MergeSort {

    public static void main(String[] args) {
        int Merge[]={1,2,3,4,5,6,7,8,9,10,
                    +11,12,13,14,15,16,17,18,19,20,
                    +21,22,23,24,25,26,27,28,29,30,
                    +31,32,33,34,35,36,37,38,39,40,
                    +41,42,43,44,45,46,47,48,49,50,
                    +51,52,53,54,55,56,57,58,59,60,
                    +61,62,63,64,65,66,67,68,69,70,
                    +71,72,73,74,75,76,77,78,79,80,
                    +81,82,83,84,85,86,87,88,89,90,
                    +91,92,93,94,95,96,97,98,99,100};
        //==============================================
//        System.out.println("VALUES:");
//        System.out.print("[ ");
//        for(int i=0; i<Merge.length; i++){
//            System.out.print(Merge[i]+", ");
//        }
//        System.out.println("]\n");
//        //==============================================
//        
        asc(Merge);
        desc(Merge);
        ShuffleArray(Merge);
    }
    public static void asc(int Merge[]){
        int temp;
        boolean sorted=false;
        while(sorted==false){
            sorted=true;
            for(int i = 0; i<Merge.length-1; i++){
                if(Merge[i] > Merge[i+1]){
                    temp = Merge[i+1];
                    Merge[i+1] = Merge[i];
                    Merge[i] = temp;
                    sorted=false;
                }
            }
        }
        System.out.println("ASCENDING:");
        System.out.print("[ ");
        for(int i=0; i<Merge.length; i++){
            System.out.print(Merge[i]+", ");
        }
        System.out.println("]");
    }
    
    public static void desc(int Merge[]){
        int temp;
        boolean sorted=false;
        while(sorted==false){
            sorted=true;
            for(int i = 0; i<Merge.length-1; i++){
                if(Merge[i] < Merge[i+1]){
                    temp = Merge[i+1];
                    Merge[i+1] = Merge[i];
                    Merge[i] = temp;
                    sorted=false;
                }
            }
            //Jp Code
        }
        System.out.println("DECENDING:");
        System.out.print("[ ");
        for(int i=0; i<Merge.length; i++){
            System.out.print(Merge[i]+", ");
        }
        System.out.println("]");
    }
    
    public static void ShuffleArray(int []Merge){
        int index, temp;
        Random random = new Random();
        for(int i = Merge.length-1; i>0; i--){
            index = random.nextInt(i+1);
            temp = Merge[index];
            Merge[index] = Merge[i];
            Merge[i] = temp;
        }
        System.out.println("RANDOM:");
        System.out.print("[ ");
        for(int i=0; i<Merge.length; i++){
            System.out.print(Merge[i]+", ");
        }
        System.out.println("]");
    }
}