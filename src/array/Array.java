
package array;

import java.util.Scanner;

public class Array {

    private static int i;
    public static void main(String[] args) {
        String [] namaSiswa = {"Deanne", "Victoria", "Erna", "Nathalie", "Armand", "Omar","Alvaro","Ben", "Danny"};
        String cari ;
        int x = 0;
        boolean found = false;
        Scanner input = new Scanner (System.in);
        
        System.out.println("List Data: ");
        for(int i=0;i<namaSiswa.length;i++){
           System.out.println(""+namaSiswa[i]);
           
    }
    System.out.print("Masukkan pencarian anda: ");
    cari = input.next();
    
    for(int index=0;index<namaSiswa.length;index++){
        if (namaSiswa[index].equals(cari)){
            found = true;
            System.out.print("Data Ditemukan");
        }
    }
    if (found == false ){
    System.out.print("Data tidak Ditemukan ");
}
}
}
    

