package main;
import main.Materia.Controles.ArbolBinario;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRoot = new Node(1);
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));
        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));
        nodeRoot.getRight().setRight(new Node(6));
        nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        nodeRoot.getLeft().getRight().setLeft(new Node(8));

        System.out.println("PreOrder - Loop:");
        arbolBinario.preOrderLoop(nodeRoot);
        System.out.println("\nPreOrder - Recursivo:");
        arbolBinario.preOrderRec(nodeRoot);
        System.out.println("\nPostOrder - Loop:");
        arbolBinario.postOrderLoop(nodeRoot);
        System.out.println("\nPostOrder - Recursivo");
        arbolBinario.postOrderRec(nodeRoot);
        System.out.println("\nInOrder - Recursivo");
        arbolBinario.inOrderRec(nodeRoot);

    }
}
