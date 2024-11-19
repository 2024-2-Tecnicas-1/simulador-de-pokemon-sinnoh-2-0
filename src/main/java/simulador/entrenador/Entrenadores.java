package simulador.entrenador;
import java.util.LinkedList;
import java.util.Scanner;
import simulador.pokemon.*;

public class Entrenadores{    
    private final LinkedList<Entrenador> entrenadores = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
   

    public void registrarEntrenador(String nombre) {
        
        Entrenador nuevoEntrenador = new Entrenador(nombre);
        
        entrenadores.add(nuevoEntrenador);
        System.out.println("Entrenador registrado exitosamente: " + nombre);
        
    }
    public LinkedList<Entrenador> verListaEntrenadores() {
        return this.entrenadores;
    }
    
    
    
    public void verEquipoPokemones(Entrenador entrenador) {
        if (entrenador.mostrarPokemones().isEmpty()) {
            System.out.println(entrenador.getNombre() + " No tiene Pokémones en su equipo.");
            return;
        } else {
            System.out.println("Pokémones de " + entrenador.getNombre() + ":");
            for (Pokemon pokemon : entrenador.mostrarPokemones()) {
                int i=1;
                System.out.println(i+". "+ pokemon.getNombre() );
                i++;
            }
        }
    }
    
    public void seleccionarPokemonAgregar(Entrenador entrenador, LinkedList<Pokemon> pokemones) {
        
        
        if (pokemones.isEmpty()) {
            System.out.println("No hay pokemones registrados para seleccionar.");
            return;
        }

        pantallaPokemones(pokemones);
        System.out.print("Selecciona un pokemon por número: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        if (seleccion > 0 && seleccion <= pokemones.size()) {
            Pokemon pokemon = pokemones.get(seleccion - 1);
            entrenador.agregarPokemon(pokemon);
            pokemones.remove(pokemon);
        } else {
            System.out.println("Selección no válida.");
        }
       
    }
    public void entrenarPokemon(Entrenador entrenador){
        
        
         if (entrenador.mostrarPokemones().isEmpty()) {
             System.out.println("No tiene pokemones");
        } else {
            verEquipoPokemones(entrenador);
            System.out.println("Seleccionar un pokemon a entrenar");
            int poke = scanner.nextInt()- 1;
            Pokemon pokeEntrenar = entrenador.mostrarPokemones().get(poke);
            entrenador.entrenarPokemon(pokeEntrenar);
        }
        
    }
    
    public void pantallaPokemones(LinkedList<Pokemon> pokemones){
        int i=1;
        for (Pokemon pokemon : pokemones) {
                System.out.println(i+". "+ pokemon.getNombre() );
                i++;
            }
    }
}

