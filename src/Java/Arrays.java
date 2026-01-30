
import java.util.ArrayList;

public class Arrays{

    public static boolean buscar(ArrayList listaARecorrer, int numeroABuscar){
        for(int i = 0; i < listaARecorrer.size(); i++){
            if(listaARecorrer.get(i).equals(numeroABuscar)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista);

        lista.add(40);
        System.out.println(lista);

        int last =lista.get(3);
        System.out.println(last);

        lista.remove(lista.size()-1);
        System.out.println(lista);

        System.out.println(Arrays.buscar(lista, 50));

        System.out.println(lista.size());

        String [] nombres = {"Angely", "Yariela", "Perez"};
      System.out.println(nombres[1]);


    }
}


/*
1. Si un arreglo tiene 5 elementos, cual es el indice del ultimo elemento?

0-1-2-3-4

Seria 4

2. Porque se dice que los arreglos son eficientes para obtener datos pero no para "insertar" en el medio?

En el caso de los arreglos estaticos, no se puede agregar o eliminar elementos, ya que en el caso de los vectores el 
tamaño se define a la hora de crear el arreglo.

En las listas (ArrayList) son dinamicas, en ellas si se pueden agregar y eliminar elementos pero no en el medio, 
sino que, a hora de eliminar un elemento se elimina el que esta en la ultima posicion.


3. En Java, declaren un arrglo estatico de String con los nombres de tres amigos. Intenten imprimir el segundo nombre.



*/

