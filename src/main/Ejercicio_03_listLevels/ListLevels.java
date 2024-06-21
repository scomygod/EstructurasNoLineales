package main.Ejercicio_03_listLevels;
import java.util.ArrayList;
import java.util.List;
import main.Materia.Models.Node;

public class ListLevels {

    //Método que devuelve una lista enlazada con los nodos de cada nivel de un árbol binario
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        listLevelsRecursive(root, 0, result);
        return result;
    }

    private void listLevelsRecursive(Node node, int level, List<List<Node>> result) {
        if (node == null) {
            return;
        }

        if (level >= result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(node);
        listLevelsRecursive(node.getLeft(), level + 1, result);
        listLevelsRecursive(node.getRight(), level + 1, result);
    }
}
