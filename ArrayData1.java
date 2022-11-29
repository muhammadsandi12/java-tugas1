import java.util.ArrayList;
public class ArrayData1 {
    public static void main(String[] args) {
        int[] array1 = {2,3,4,5}; 
        int[] array2 = {1,3,5,7};
        ArrayList hasil = new ArrayList<>();
        for(int i =0; i < array1.length; i++  ){
            for(int j=0; j < array2.length; j++){
                if(array2[j] == array1[i]){
                    hasil.add(array2[j]);
                }    
            }
        }
        System.out.println(hasil);

    }

    
}
