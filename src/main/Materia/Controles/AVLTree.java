package main.Materia.Controles;

import main.Materia.Models.Node;

public class AVLTree {

    private Node root;

    // Obtener la altura de un nodo
    private int height (Node node){
        if (node == null){
            return 0;
        }
        return node.getHeight();
    }

    // Método que obtenga el factor de balanceo o equilibrio 
    private int getBalance (Node node){
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    public Node insert (Node node, int value ){

        if (node == null) {
            return new Node(value);
        }
        if (value > node.getValue()){
            node.setRight(insert(node.getRight(), value));
        }else if (value < node.getValue()){
            node.setLeft(insert(node.getLeft(), value));
        }else{
            return node;
        }
        
        // Actualizar la altura del predecesor 
        node.setHeight(1 + Math.max(height(node.getLeft()), height(node.getRight())));

        // Calcular el balance
        int balance = getBalance(node);

        // Si el nodo está desbalenceado se tiene 3 casos
        // Caso Izquierda - Izquierda:
        if (balance > 1 && value < node.getLeft().getValue()) {
            return rightRotate(node);
            
        }
        
        // Caso Derecha - Derecha:
        if (balance < -1 && value > node.getRight().getValue()) {
            return leftRotate(node);
            
        }
        
        // Caso Izquierda - Derecha:
        if (balance > 1 && value > node.getLeft().getValue()) {
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        }
        
        // Caso Derecha - Izquierda:
        if (balance < -1 && value < node.getRight().getValue()) {
            node.setRight(rightRotate(node.getRight()));
            return leftRotate(node);
        }

        System.out.println("Inserted Node: " + node.getValue() + " Balance :" + balance);

        return node;
    }

    private Node rightRotate (Node nodeR){
        System.out.println("Right Rotate on: " + nodeR.getValue() + " Balance " + getBalance(nodeR));
        Node x = nodeR.getLeft();
        System.out.println("New root after right rotate :" + x.getValue());
        Node temp = x.getRight();

        // Realizar la rotación
        x.setRight(nodeR);
        nodeR.setLeft(temp);

        // Actualizar las alturas
        nodeR.setHeight(Math.max(height(nodeR.getLeft()), height(nodeR.getRight()))+1);
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight()))+1);

        // Devolver una raíz
        return x;
    }
    
    private Node leftRotate (Node nodeL){
        System.out.println("Left Rotate on: " + nodeL.getValue() + " Balance " + getBalance(nodeL));
        Node y = nodeL.getRight();
        System.out.println("New root after left rotate :" + y.getValue());
        Node temp = y.getLeft();
        
        // Realizar la rotación
        y.setLeft(nodeL);
        nodeL.setRight(temp);

        // Actualizar las alturas
        nodeL.setHeight(Math.max(height(nodeL.getLeft()), height(nodeL.getRight()))+1);
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight()))+1);
    
        // Devolver una raíz
        return y;
    }
    
    // Metodo para insertar nodos
    public void insert(int value){
        System.out.println("\nNodo a insertar será el "+value);
        root = insert(root, value);
        printTree();
        System.out.println("\n-------\n");
    } 
    
    // Método para imprimir
    public void printTree (){
        printTreeNode2(root, "", true);
    }

    public void printTreeNode2(Node root, String prefix, boolean isLeft) {

        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTreeNode2(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (root.getRight() != null) {
                    printTreeNode2(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }
}