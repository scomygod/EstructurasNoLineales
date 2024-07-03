package main.Materia.Controles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.NodeGraph;

public class Graph {
    private List<NodeGraph> nodes;

    // Constructor 
    public Graph() {  
        this.nodes = new ArrayList<>();
    }

    // Método para añadir un nodo
    public NodeGraph addNode(int value) {
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }

    // Método para añadir una arista
    public void addEdge(NodeGraph src, NodeGraph dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src); // Para grafos no dirigidos
    }

    // Método para imprimir el grafo
    public void printGraph() {
        for (NodeGraph node : nodes){
            System.out.print("Vertex " + node.getValue() + ":");
            for (NodeGraph neighbor : node.getNeighbors()){
                System.out.print(" -> " + neighbor.getValue());
            }
            System.out.println();
        }
    }

    // Método de búsqueda en profundidad (DFS)
    public void getDFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        getDFSUtil(startNode, visited);
    }

    // Método de búsqueda en profundidad (DFS) con recursividad
    private void getDFSUtil(NodeGraph node, boolean[] visited) {
        if (node == null || visited[node.value]) { 
            return;
        }
        visited[node.value] = true; 
        System.out.print(node.value + " "); 
        for (NodeGraph neighbor : node.getNeighbors()) { 
            getDFSUtil(neighbor, visited); 
        }
    }

    // Método de búsqueda en anchura (BFS)
    public void getBFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()]; 
        Queue<NodeGraph> queue = new LinkedList<>(); 
        queue.add(startNode); 
        visited[startNode.value] = true; 
        while (!queue.isEmpty()) { 
            NodeGraph node = queue.poll(); 
            System.out.print(node.value + " ");
            for (NodeGraph neighbor : node.getNeighbors()) { 
                if (!visited[neighbor.value]) { 
                    queue.add(neighbor); 
                    visited[neighbor.value] = true; 
                }
            }
        }
    }

    // Método para obtener la matriz de adyacencia 
    public int[][] getAdjacencyMatrix() {
        int size = nodes.size(); 
        int[][] matrix = new int[size][size]; 
        for (NodeGraph node : nodes) { 
            for (NodeGraph neighbor : node.getNeighbors()) { 
                matrix[node.value][neighbor.value] = 1; 
            }
        }
        return matrix; 
    }

    // Método para imprimir la matriz de adyacencia 
    public void printAdjacencyMatrix() {
        int[][] matrix = getAdjacencyMatrix(); 
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) { 
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}
