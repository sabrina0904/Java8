
import java.util.Scanner;



public class test {
    public static void main (String []args){
    
        float bi;
        float bm;
        float sej;
        float purata;
        String ulasan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan markah BM :");
        bm=input.nextFloat();
        
        System.out.println("masukkan markah BI :");
        bi=input.nextFloat();
        
        System.out.println("masukkan markah SEJARAH");
        sej=input.nextFloat();
        
        
        purata=(bm+bi+sej)/3;
        
        //System.out.println(purata);
        
       
        
    }
}
