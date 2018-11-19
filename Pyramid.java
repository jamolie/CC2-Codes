package pyramid;
import java.io.*;

public class Pyramid {

    public static void main(String[] args) throws IOException {

        
   
        
        for (int i = 0; i < 8; i+=2) {
            for (int j = 0; j < 8 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        System.out.println("\n");
        
        int x,y;
        for(y = 4; y >=1;y--){
            for(x=0; x< 5- y; x++){
                System.out.print("  ");
            }
            for( x = (2-y); x<(2-y)+(2*y-1);x++){
                    System.out.print(" *");
            
            }    
            System.out.println("");
            }
        }
        

    
}
