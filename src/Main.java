import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //uy tapshyrma
//        Scanner sc = new Scanner(System.in);
//        int san = sc.nextInt();
//        int kob = 1;
//        for (int i = 1; i<=san; i++){
//            kob*=i;
//            System.out.print(i);
//            if(i!=san){
//                System.out.print("*");
//            }
//        }
//        System.out.println("="+kob);
        //Массив
//        int [] mas = {10,-90,12,34,45,89,1,90,43};
//        int [] intmas = new int []{23,57,};
//        System.out.println(mas[0]+mas[3]);
//        byte [] bytemas = new byte[3];
//        bytemas [0]=12;

//        byte [] bytemas = new byte [5];
//        bytemas [0]=45;
//        bytemas [1] = 67;
//        bytemas [2] = 34;
//        bytemas [3] = 45;
//        bytemas [4] = 12;
//        System.out.println(bytemas[0]+bytemas[2]);

//        int[] mas = new int[5];
//        mas [0]=76;
//         mas [1]=56;
//        mas [2]=23;
//        mas [3] = 57;
//        mas[4]= 12;
//        for (int i = 0; i < mas.length; i++) {
//            if (i%2==0){
//                System.out.println(mas[i]);
//
//            }
//
//        }
        Random san = new Random();
        /*int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = san.nextInt(10, 100);
            sum += arr[i];
            System.out.println(arr[i]);


        }
        System.out.println(sum/arr.length);*/

        /*int [] mass = new int [10];
        int sch = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = san.nextInt(10,100);
            sch+=mass[i];
            System.out.println(mass[i]);

        }
        System.out.println((double) sch/mass.length);*/


        int [] arr = new int [20];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = san.nextInt(100);
            System.out.println(arr[i]);
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 50) {
                sum1 += arr[j];
                sum3++;

            }else {
                sum2+=arr[j];
                sum4++;

            }
        }
        System.out.println((double) sum1/sum2);
        System.out.println((double) sum2/sum4);

        

//        Random random = new Random();
//        int [] array = new int [20];
//        int sum = 0;
//        int sum1 =0;
//        int sum2 = 0;
//        int sum3 = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(20,100);
//            if (array[i]>50) {
//                sum += array[i];
//                sum2++;
//                System.out.println("array[i]>50" + sum);
//            }
//        }
//        for (int j = 0; j < array.length; j++) {
//            array[j] = random.nextInt();
//            if (array[j]<50) {
//                sum1 += array[j];
//                sum3++;
//                System.out.println("array[j]<50"+sum1);
//
//            }
//        }
//        System.out.println((double) sum/sum1);
//        System.out.println((double) sum1/sum3);
//
//

    }

}