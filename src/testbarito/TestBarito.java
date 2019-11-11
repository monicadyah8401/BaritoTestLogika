/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbarito;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestBarito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //1
        /*ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();
        String kata;
        int idx = 0;
        arr1.add("pro");
        arr1.add("gram");
        arr1.add("merit");
        arr1.add("program");
        arr1.add("it");
        arr1.add("programmer");
        System.out.print("kata : ");
        kata = inp.nextLine();
        for (int x = 0; x < (kata.length() - 3); x++) {
            if ((kata.substring(x, x + 3)).contains("pro") == true) {
                arr2.add("pro");
                idx++;
                break;
            }
        }
        for (int x = 0; x < (kata.length() - 4); x++) {
            if ((kata.substring(x, x + 4)).contains("gram") == true) {
                arr2.add("gram");
                idx++;
                break;
            }
        }
        for (int x = 0; x < (kata.length() - 5); x++) {
            if ((kata.substring(x, x + 5)).contains("merit") == true) {
                arr2.add("merit");
                idx++;
                break;
            }
        }
        for (int x = 0; x < (kata.length() - 7); x++) {
            if ((kata.substring(x, x + 7)).contains("program") == true) {
                arr2.add("program");
                idx++;
                break;
            }
        }
        for (int x = 0; x < (kata.length() - 2); x++) {
            if ((kata.substring(x, x + 2)).contains("it") == true) {
                arr2.add("it");
                idx++;
                break;
            }
        }
        for (int x = 0; x < (kata.length() - 10); x++) {
            if ((kata.substring(x, x + 10)).contains("programmer") == true) {
                arr2.add("programmer");
                idx++;
                break;
            }
        }
        for (int x = 0; x < idx; x++) {
            if (x == (idx - 1)) {
                System.out.print(arr2.get(x));
            } else {
                System.out.print(arr2.get(x) + ", ");
            }
        }
        System.out.println();
        */
        
        //2
        int[] arr = new int[100];
        int idx, tamp, hsl = 0;
        System.out.print("Banyak Data : ");
        idx = inp.nextInt();
        for (int x = 0; x < idx; x++) {
            System.out.print("Harga Saham hari ke-" + (x + 1) + " = ");
            arr[x] = inp.nextInt();
        }
        for (int x = 0; x < idx; x++) {
            for (int y = 0; y < idx; y++) {
                if (x>y) {
                    if (hsl < (arr[x] - arr[y])) {
                        hsl = arr[x] - arr[y];
                    }
                }

            }
        }
        if(hsl==0){
            System.out.println("\'tidak dapat membeli\'");
        }else{
            System.out.println(hsl);
        }
    }

}
