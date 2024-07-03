package main.Materia.Models;

import java.util.LinkedList;
import java.util.List;

public class NodeGraph {
    public int value;
    private List <NodeGraph> neighbors;

    // Constructor
    public NodeGraph(int value){
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

    // Getters and setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<NodeGraph> getNeighbors() {
        return neighbors;
    }

    public void setNeighboors(List<NodeGraph> neighboors) {
        this.neighbors = neighboors;
    }   

    public void addNeighbor(NodeGraph neighbor){
        neighbors.add(neighbor);
    }
}
