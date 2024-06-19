package main.Materia.Controles;

import java.util.Stack;
import main.Materia.Models.Node;

public class ArbolBinario {

    // PreOrder Loop
    public void preOrderLoop(Node root) {
        if (root == null) {
            return;
        }
        // Nuevo stack
        Stack<Node> stack = new Stack<>();

        // Agregamos a la pila la raíz para empezar el recorrido
        stack.push(root);

        while (!stack.isEmpty()) {

            Node node = stack.pop();
            System.out.print(+node.getValue() + " - ");

            // Agrega los hijos de la derecha a la pila
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }

            // Agrega los hijos de la izquierda a la pila
            if (node.getLeft() != null) {
                stack.push(node.getLeft());

            }
        }
    }

    // PreOrder Recursivo
    public void preOrderRec(Node node) {
        if (node != null) {
            System.out.print(+node.getValue() + " - ");
            preOrderRec(node.getLeft());
            preOrderRec(node.getRight());

        }
    }

    // PostOrder Loop
    public void postOrderLoop(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);

            if (node.getLeft() != null) {
                stack1.push(node.getLeft());
            }
            if (node.getRight() != null) {
                stack1.push(node.getRight());
            }
        }
        while (!stack2.isEmpty()) {
            Node node = stack2.pop();
            System.out.print(node.getValue() + " - ");
        }
    }

    // PostOrder Recursivo
    public void postOrderRec(Node node) {
        if (node != null) {
            postOrderRec(node.getLeft());
            postOrderRec(node.getRight());
            System.out.print(node.getValue() + " - ");
        }
    }

    // InOrder Recursivo
    public void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.getLeft());
            System.out.print(node.getValue() + " - ");
            inOrderRec(node.getRight());
        }
    }
}
