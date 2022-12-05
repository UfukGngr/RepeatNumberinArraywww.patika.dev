import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     int[] numArr={10, 20, 20, 10, 10, 20, 5, 20};
        int count=1;
     ArrayList<Integer> arr= new ArrayList<>();

     for(int a :numArr){
         arr.add(a);
     }
        System.out.println("Tekrar Sayıları:");
     for (int i = 0; i < arr.size(); i++){
         for (int j = 0; j < arr.size(); j++){
             if(i != j && arr.get(i).equals(arr.get(j))){
                 count++;
                 arr.remove(j);
                 j--;
             }
         }
         System.out.println(arr.get(i)+ " sayısı " + count + " kere tekrar edildi.");
         count=1;
     }




    }
}