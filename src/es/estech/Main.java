package es.estech;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
            A diferencia de los arrays, las listas deben contener Objetos (no tipos primitivos)
        */

        //ArrayList<int> intArrayList = new ArrayList<>(); // declaración no válida
        ArrayList<Integer> integerArrayList = new ArrayList<>(); // declaración válida
        integerArrayList.add(3);// java parsea el int a Integer automáticamente
        integerArrayList.add(2);// java parsea el int a Integer automáticamente
        integerArrayList.add(1);// java parsea el int a Integer automáticamente
        System.out.println("ArrayList de enteros");
        System.out.println(integerArrayList);
        System.out.println();
        System.out.println();

        ArrayList<String> stringArrayList = new ArrayList<>(); // declaración de un arraylist de String
        stringArrayList.add("Casa");// añadimos un elemento (String) al ArrayList, lo añade al final del array,
                                    // como de momento no tiene nada, la posición final es la 0
        //stringArrayList.add(2, "Coche");// intentamos añadir otro elemento al ArrayList en la posición '2'
        // se produce un error, ya que aún no existe esa posición en el arraylist
        System.out.println("ArrayList de String");
        System.out.println(stringArrayList);
        System.out.println();
        System.out.println();

        /*
            El arraylist es dinámico, eso significa que aumenta su tamaño conforme añadimos valores, pero mientras no tenga creada
            una posición determinada no podemos añadir nada a esa posición (ya que aún no existe)
         */
        System.out.println("Tamaño del arraylist");
        int tamañoArrayList = stringArrayList.size(); // obtenemos el tamaño del arraylist
        System.out.println(tamañoArrayList);
        System.out.println();
        System.out.println();

        /*
            Tenemos dos modos de añadir elementos al array
         */
        System.out.println("Añadimos elementos");
        stringArrayList.add("Coche"); // seguir añadiendo elementos al final del arraylist
        stringArrayList.add(2,"Arbol"); // indicando la posición (debe existir, como vimos anteriormente)
        System.out.println(stringArrayList);
        System.out.println();
        System.out.println();

        System.out.println("Buscamos elementos por posición");
        System.out.println(stringArrayList.get(2)); // obtenemos el elemento que esta en la posición '2' del arraylist
        //System.out.println(stringArrayList.get(5)); // si pedimos una posición que no existe dará error
        System.out.println();
        System.out.println();

        System.out.println("Buscamos elementos por parámetro");
        System.out.println(stringArrayList.contains("Coche"));// comprobamos si existe del elemento pasado como parametro
        System.out.println(stringArrayList.contains("Coches"));// comprobamos si existe del elemento pasado como parametro
        System.out.println();
        System.out.println();

        stringArrayList.add("Casa");//añadimos un elemento repetido
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.indexOf("Casa"));// obtenemos la posición de la primera ocurrencia ('Casa') en el arraylist
        System.out.println(stringArrayList.lastIndexOf("Casa"));// obtenemos la posición de la última ocurrencia ('Casa') en el arraylist
        System.out.println();
        System.out.println();

        ArrayList arrayListCopia = (ArrayList) stringArrayList.clone();// hacemos una copia de un arraylist
        System.out.println("ArrayList original"); //
        System.out.println(stringArrayList);
        System.out.println("ArrayList copia");
        System.out.println(arrayListCopia);
        System.out.println();
        System.out.println();

        System.out.println("Borramos elementos");
        stringArrayList.remove(2);// borramos el elemento de la posición '2' del arraylist
        System.out.println(stringArrayList); //el arraylist se redimensiona
        stringArrayList.remove("Coche");// borramos la primera ocurrencia de 'Casa' pasada como parametro.
        System.out.println(stringArrayList);
        stringArrayList.clear();//borramos todos los elementos de arraylist
        System.out.println(stringArrayList);
        System.out.println();
        System.out.println();

        System.out.println("Averiguamos si el array está vacío");
        System.out.println(stringArrayList.isEmpty());// devuelve True si el arraylist esta vacio
        System.out.println();
        System.out.println();

        Object[] array = stringArrayList.toArray(); //convertimos el arraylist en un array
        System.out.println("Intentamos imprimir el array");
        System.out.println(array);
    }
}
