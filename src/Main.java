import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

            ArrayList<Integer> arrayList1 =  new ArrayList<>();
            ArrayList <Integer> arrayList2 =  new ArrayList<>();
            ArrayList <Integer> arrayList3 =  new ArrayList<>();

            Random random = new Random();
            for (int i = 0; i < 50; i++) {
                int randomsan = random.nextInt(1,100);
                arrayList1.add(randomsan);
                if (randomsan%2==0){
                    arrayList2.add(randomsan);
                }else {
                    arrayList3.add(randomsan);
                }

            }
            System.out.println("All numbers: "  + arrayList1);
            System.out.println("___________________________________________________________________________________________");
            System.out.println("Even numbers: "  + arrayList2);
            System.out.println("___________________________________________________________________________________________");
            System.out.println("Exact numbers: "  + arrayList3);
        }
    }
