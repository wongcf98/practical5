
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tarc
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        displayBackward(array, array.length - 1);

    }

    public static void displayBackward(int[] list, int index) {
        if (index == 0) {
            System.out.println(list[index]);
        } else {
            System.out.println(list[index]);
            index--;
            displayBackward(list, index);
        }
    }
}
