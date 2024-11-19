package simulador.entrenador;
import java.util.LinkedList;
import java.util.Scanner;
import simulador.pokemon.*;

public class Entrenadores {    
    private static LinkedList<Entrenador> entrenadores = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    private static void registrarEntrenador() {
        System.out.print("Ingresa el nombre del nuevo entrenador: ");
        String nombre = scanner.nextLine();
        Entrenador nuevoEntrenador = new Entrenador(nombre);
        
        entrenadores.add(nuevoEntrenador);
        System.out.println("Entrenador registrado exitosamente: " + nombre);
        
    }
    private static void verListaEntrenadores() {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados.");
        } else {
            System.out.println("Lista de Entrenadores:");
            for (int i = 0; i < entrenadores.size(); i++) {
                System.out.println((i + 1) + ". " + entrenadores.get(i).getNombre());
            }
        }
    }
    
    private void seleccionarEntrenador() {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados para seleccionar.");
            return;
        }

        verListaEntrenadores();
        System.out.print("Selecciona un entrenador por número: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        if (seleccion > 0 && seleccion <= entrenadores.size()) {
            Entrenador entrenadorSeleccionado = entrenadores.get(seleccion - 1);
            mostrarsubmenuentrenador(entrenadorSeleccionado);
        } else {
            System.out.println("Selección no válida.");
        }
    }
    
    private static void mostrarsubmenuentrenador(Entrenador entrenador){
        System.out.println("1. Ver equipo de Pokémones");
        System.out.println("2. Agregar Pokémon al equipo");
        System.out.println("3. Entrenar Pokémon");
        System.out.println("4. Volver a Gestionar Entrenadores");
    }  
    
    private void verEquipoPokemones(Entrenador entrenador) {
        if (entrenador.mostrarPokemones().isEmpty()) {
            System.out.println(entrenador.getNombre() + " No tiene Pokémones en su equipo.");
        } else {
            System.out.println("Pokémones de " + entrenador.getNombre() + ":");
            for (Pokemon pokemon : entrenador.mostrarPokemones()) {
                int i=1;
                System.out.println(i+". "+ pokemon.getNombre() );
                i++;
            }
        }
    }
    
    private static void seleccionarPokemonAgregar(Entrenador entrenador) {
        System.out.println("Elige el Pokémon que deseas agregar:");
        System.out.println("1. Growlithe \n2. Psyduck \n3. Bellsprout \n4.Voltorb \n5.Exeggcute \n6. Onix \n7.Zubat \n8.Farfetchd \n9.Hitmonlee \n10.Tentacool ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea
        Pokemon pokemon;
        switch (opcion) {
            case 1:
                pokemon = new Growlithe();
                break;
            case 2:
                pokemon = new Psyduck();
                break;
            case 3:
                pokemon = new Bellsprout();
                break;
            case 4: 
                pokemon = new Voltorb();
                break;
            case 5:
                pokemon = new Exeggcute();
                break;
            case 6:
                pokemon = new Onix();
                break;
            case 7:
                pokemon = new Zubat();
                break;
            case 8: 
                pokemon = new Farfetchd();
                break;
            case 9:
                pokemon = new Hitmonlee();
                break;
            case 10:
                pokemon = new Tentacool();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        entrenador.agregarPokemon(pokemon);
    }
    private void entrenarPokemon(Entrenador entrenador){
        verEquipoPokemones(entrenador);
        System.out.println("Seleccionar un poquemon a entrenar");
        int poke = scanner.nextInt()- 1;
        Pokemon pokeEntrenar = entrenador.mostrarPokemones().get(poke);
        entrenador.entrenarPokemon(pokeEntrenar);
        
    }
}

