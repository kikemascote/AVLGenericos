package src.app;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import src.tree.AVLTree;

/**
 *
 * @author fires
 * blog: http://proyectosbeta.blogspot.com/
 */
public class ProbarAVLTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // comienza la medida del taim
        long time_start, time_end;
        time_start = System.currentTimeMillis();

        AVLTree<Integer> arbolAVL = new AVLTree<>();
        AVLTree<String> names = new AVLTree<>();

        names.insert("jalil");
        names.insert("alex");
        names.insert("gaby");
        names.insert("andrik");
        names.insert("armando");
        names.insert("chardo");
        names.insert("meme");
        names.imprimirPorNiveles();
        //termina la medida del taim
        time_end= System.currentTimeMillis();
        System.out.println("\nTiempo para la insercion:"+(time_end-time_start)+"ms");

        //inicia el taim de nuevo
        time_start= System.currentTimeMillis();
        Integer elemento1 = new Integer("1");
        Integer elemento2 = new Integer("2");
        Integer elemento3 = new Integer("3");
        Integer elemento4 = new Integer("4");
        Integer elemento5 = new Integer("5");
        Integer elemento6 = new Integer("6");
        Integer elemento7 = new Integer("7");
        Integer elemento8 = new Integer("15");
        Integer elemento9 = new Integer("14");
        Integer elemento10 = new Integer("13");

        arbolAVL.insert(elemento1);
        arbolAVL.insert(elemento2);
        arbolAVL.insert(elemento3);
        arbolAVL.insert(elemento4);
        arbolAVL.insert(elemento5);
        arbolAVL.insert(elemento6);
        arbolAVL.insert(elemento7);
        arbolAVL.insert(elemento8);
        arbolAVL.insert(elemento9);
        arbolAVL.insert(elemento10);
        arbolAVL.imprimirPorNiveles();
        //termina la medida del taim
        time_end= System.currentTimeMillis();
        System.out.println("\nTiempo para la insercion:"+(time_end-time_start)+"ms");
        System.out.println("\n");

        

    }

}
