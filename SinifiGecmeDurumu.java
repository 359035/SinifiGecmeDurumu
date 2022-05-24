/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sinifigecmedurumu;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class SinifiGecmeDurumu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mat,tur,kim,fiz,muz,sayac=0,toplam=0;
        double ort;
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Matematik Notunuz:");
        mat=input.nextInt();
        if((mat>=0)&&(mat<=100)){
            sayac++;
            mat+=toplam;
        }
        
        
        System.out.print("Turkce Notunuz:");
        tur=input.nextInt();
        if((tur>=0)&&(tur<=100)){
            sayac++;
            tur+=toplam;
        }
        
        
        System.out.print("Kimya Notunuz:");
        kim=input.nextInt();
        if((kim>=0)&&(kim<=100)){
            sayac++;
            kim+=toplam;
        }
        System.out.print("Fizik Notunuz:");
        fiz=input.nextInt();
        if((fiz>=0)&&(fiz<=100)){
            sayac++;
            fiz+=toplam;
        }
        System.out.print("Muzik Notunuz:");
        muz=input.nextInt();
        if((muz>=0)&&(muz<=100)){
            sayac++;
            muz+=toplam;
        }
        
        ort=(mat+tur+kim+fiz+muz)/5;
        
        if(ort>55){
            System.out.println("Tebrikler Sýnýfý Geçtiniz");
           
        }else{
            System.out.println("Sýnýfta Kaldýnýz");
            
        }
        System.out.println("Ortalamýnýz:"+ort);
                    
        
        
         
    }
    
}
