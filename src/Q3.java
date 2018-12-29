/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarc
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodes n1 = new Nodes();
        Nodes n2 = new Nodes(n1);
        Nodes n3 = new Nodes(n2);
        Nodes n4 = new Nodes(n3);
        Nodes n5 = new Nodes(n4);

        System.out.println(countNodes(n5,0));
    }

    public static int countNodes(Nodes node,int count) {
        if (node.next == null) {
            return ++count;
        }
        count++;
        return countNodes(node.next,count);
    }

    static class Nodes {

        Nodes next = null;

        public Nodes() {
        }

        public Nodes(Nodes next) {
            this.next = next;
        }
    }
}
