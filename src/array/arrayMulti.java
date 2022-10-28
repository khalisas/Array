
package array;

public class arrayMulti {
    public static void main (String []args){
        int[][] arrayMulti = new int [2][4];
        
        arrayMulti [0][0] = 1;
        arrayMulti [0][1] = 3;
        arrayMulti [0][2] = 5;
        
       
        arrayMulti [1][0] = 2;
        arrayMulti [1][1] = 4;
        arrayMulti [1][2] = 6;
        // MENAMPILKAN ISI ARRAY MULTDIMENSI
        
        for(int x = 0; x <= 1; x++)
        {
            for (int y = 0;y <= 3; y++)
            {
                System.out.format("arrayMultu[%d] [%d] = %d %n", x,y, arrayMulti[x][y]);
            }
        }
        
        //TAMPILKAN NAMA,NO ABSEN,KELAS
      
       

        
    }
    
}
