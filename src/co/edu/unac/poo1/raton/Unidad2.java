package co.edu.unac.poo1.raton;

import co.edu.unac.poo1.raton.Acciones.Movimiento;
import co.edu.unac.poo1.raton.Clases.Animales;
import co.edu.unac.poo1.raton.Clases.Liebre;
import co.edu.unac.poo1.raton.Raton.Raton;

import java.util.*;

public class Unidad2 {

    public static void verinfomapa(){

        System.out.println(" ######################### ");
        System.out.println(" Lista de objetos tipo Ratón ");
        System.out.println(" ######################### ");

        Animales animal1 = new Animales("Pequeño",2,15F);
        Animales animal2 = new Animales("Grande",5,16F);
        Animales animal3 = new Animales("Hamster",6,18F);
        Animales animal4 = new Animales("Roedor",3,25F);

        List<Raton> listaAnimal = new LinkedList<>();
        listaAnimal.add(animal1);
        listaAnimal.add(animal2);
        listaAnimal.add(animal3);
        listaAnimal.add(animal4);


        listaAnimal.sort(Comparator.comparing(Raton::getNombreOrdenar));


        for ( Raton animal: listaAnimal){
            animal.verInformacion();


        }

        System.out.println(" ######################### ");
        System.out.println(" Mapa de objetos con Movimiento ");
        System.out.println(" ######################### ");

        //Creo 4 instancias de tipo movimiento clase Liebre
        Liebre liebre1 = new Liebre("Europea",15F,5);
        Liebre liebre2 = new Liebre("Americana",16F,10);
        Liebre liebre3 = new Liebre("Artica",18F,12);
        Liebre liebre4 = new Liebre("Pequeña",10F,7);


        //Lista
        List<Liebre> listaLiebre = new LinkedList<>();
        listaLiebre.add(liebre1);
        listaLiebre.add(liebre2);
        listaLiebre.add(liebre3);
        listaLiebre.add(liebre4);


        // Mapa ordenado por Treemap
        Map<String, Movimiento> mapaLiebre = new TreeMap<>();
        mapaLiebre.put(liebre1.getNombre(), liebre1);
        mapaLiebre.put(liebre2.getNombre(), liebre2);
        mapaLiebre.put(liebre3.getNombre(), liebre3);
        mapaLiebre.put(liebre4.getNombre(), liebre4);

        //Recorro el mapa
        List<Movimiento> listaOrdenada = new LinkedList<>(mapaLiebre.values());
        for (Movimiento liebre: listaOrdenada){
            liebre.verInformacion();
}
}
}


