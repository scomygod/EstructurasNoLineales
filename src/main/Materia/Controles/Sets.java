package main.Materia.Controles;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    // Constructor
    public Sets (){
        buildHashSet();
        buildLinkedHashSet();
        buildTreeSet();
        buildTreeSetWithComparator();
    }

    // Construir y mostrar un HashSet
    public void buildHashSet (){
        HashSet <String> conjunto = new HashSet<>();
        System.out.println("\nHashSet:");
        conjunto.add("Manzana");
        System.out.println(conjunto);
        conjunto.add("Banana");
        System.out.println(conjunto);
        conjunto.add("Naranja");
        System.out.println(conjunto);
        conjunto.add("Manzana"); // Duplicado, no se añadirá
        System.out.println(conjunto);
        conjunto.add("Uva");
        System.out.println(conjunto);
        conjunto.add("Piña");
        System.out.println(conjunto);
        System.out.println("HashSet: " + conjunto);

        // Verifica si existe un elemento [Naranja]
        boolean contieneNaranja = conjunto.contains("Naranja");
        System.out.println("¿HashSet contiene 'Naranja'? " + contieneNaranja);

        // Obtener el tamaño del conjunto
        int tamano = conjunto.size();
        System.out.println("Tanaño del HashSet: " + tamano);
    }

    //  Construir y mostrar un LinkedSet
    public void buildLinkedHashSet (){
        LinkedHashSet <String> conjunto = new LinkedHashSet<>();
        // Agregar elementos
        System.out.println("\nLinkedHashSet:");
        conjunto.add("Manzana");
        System.out.println(conjunto);
        conjunto.add("Banana");
        System.out.println(conjunto);
        conjunto.add("Naranja");
        System.out.println(conjunto);
        conjunto.add("Manzana"); // Duplicado, no se añadirá
        System.out.println(conjunto);
        conjunto.add("Uva");
        System.out.println(conjunto);
        conjunto.add("Piña");
        System.out.println(conjunto);
        System.out.println("LinkedHashSet: " + conjunto);      
    }
    
    //  Construir y mostrar un TreeSet
    public void buildTreeSet (){
        TreeSet<String> conjunto = new TreeSet<>();
        // Agregar elementos
        System.out.println("\nBuildTreeSet");
        conjunto.add("Manzana");
        System.out.println(conjunto);
        conjunto.add("Banana");
        System.out.println(conjunto);
        conjunto.add("Naranja");
        System.out.println(conjunto);
        conjunto.add("Manzana"); // Duplicado, no se añadirá
        System.out.println(conjunto);
        conjunto.add("Uva");
        System.out.println(conjunto);
        conjunto.add("Piña");
        System.out.println(conjunto);
        System.out.println("BuildTreeSet: " + conjunto);      
    }
           
    //  Construir y mostrar un TreeSet con Comparador
    public void buildTreeSetWithComparator (){
        // Comparador personalizado que ordena las cadenas en orden inverso (De Z a A)
        Comparator <String> comparadorOrdenInverso = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        };
        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        // Agregar elementos
        System.out.println("\nTreeSet with Comparator");
        conjunto.add("Manzana");
        System.out.println(conjunto);
        conjunto.add("Banana");
        System.out.println(conjunto);
        conjunto.add("Naranja");
        System.out.println(conjunto);
        conjunto.add("Manzana"); // Duplicado, no se añadirá
        System.out.println(conjunto);
        conjunto.add("Uva");
        System.out.println(conjunto);
        conjunto.add("Piña");
        System.out.println(conjunto);
        System.out.println("TreeSet with Comparator: " + conjunto); 
    }  
}