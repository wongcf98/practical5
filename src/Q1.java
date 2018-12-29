/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarc
 */
public class Q1 {

    static int count = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        countUp(10);
    }
    
    public static int countUp(int n){
        if(count == n){
            return count;
        }
        count++;
        System.out.println(count);
        countUp(n);
        return count;
    }
}
