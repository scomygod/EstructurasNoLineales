package main;

import main.Materia.Controles.AVLTree;
import main.Materia.Controles.ArbolBinario;
import main.Materia.Controles.Graph;
import main.Materia.Controles.Sets;
import main.Materia.Models.Node;
import main.Materia.Models.NodeGraph;

public class App {
    public static void main(String[] args) {

        /*
         * ArbolBinario arbolBinario = new ArbolBinario();
         * Node nodeRoot = new Node(1);
         * nodeRoot.setLeft(new Node(2));
         * nodeRoot.setRight(new Node(3));
         * nodeRoot.getLeft().setLeft(new Node(4));
         * nodeRoot.getLeft().setRight(new Node(5));
         * nodeRoot.getRight().setRight(new Node(6));
         * nodeRoot.getLeft().getLeft().setLeft(new Node(7));
         * nodeRoot.getLeft().getRight().setLeft(new Node(8));
         * 
         * System.out.println("PreOrder - Loop:");
         * arbolBinario.preOrderLoop(nodeRoot);
         * System.out.println("\nPreOrder - Recursivo:");
         * arbolBinario.preOrderRec(nodeRoot);
         * System.out.println("\nPostOrder - Loop:");
         * arbolBinario.postOrderLoop(nodeRoot);
         * System.out.println("\nPostOrder - Recursivo");
         * arbolBinario.postOrderRec(nodeRoot);
         * System.out.println("\nInOrder - Recursivo");
         * arbolBinario.inOrderRec(nodeRoot);
         * 
         * AVLTree tree = new AVLTree();
         * 
         * int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };
         * 
         * for (int value : values) {
         * tree.insert(value);
         * }
         */

        System.out.println("Estructuras de Datos No Lineales");
        runGraph();
        runSets();
    }
    private static void runGraph() {
        Graph graph = new Graph();

        NodeGraph node1 = graph.addNode(1);
        NodeGraph node2 = graph.addNode(2);
        NodeGraph node3 = graph.addNode(3);
        NodeGraph node4 = graph.addNode(4);
        NodeGraph node5 = graph.addNode(5);

        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node5);

        // Imprime el Grafo
        graph.printGraph();
    }

    private static void runSets() {
        new Sets();
    }
}
