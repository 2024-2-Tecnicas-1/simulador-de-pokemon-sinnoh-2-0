package simulador;

import java.util.LinkedList;
import java.util.Scanner;
import simulador.entrenador.Entrenador;
import simulador.entrenador.Entrenadores;
import simulador.pokemon.Bellsprout;
import simulador.pokemon.Exeggcute;
import simulador.pokemon.Farfetchd;
import simulador.pokemon.Growlithe;
import simulador.pokemon.Hitmonlee;
import simulador.pokemon.Onix;
import simulador.pokemon.Pokemon;
import simulador.pokemon.Pokemones;
import simulador.pokemon.Psyduck;
import simulador.pokemon.Tentacool;
import simulador.pokemon.TipoPokemon;
import simulador.pokemon.Voltorb;
import simulador.pokemon.Zubat;
import simulador.pokemon.nuevoPokemon;

public class Principal {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner scLetras = new Scanner(System.in);
    static Entrenadores listaEntrenadores = new Entrenadores();
    static Pokemones listaPokemones = new Pokemones();

    public static void main(String[] args) {
        // TODO: Aquí va tu código

        System.out.println("Simulador de Batallas Pokémon");
        menuPrincipal();

    }

    public static void menuPrincipal() {
        int opcionPrincipal;
        System.out.println("1. Gestionar Entrenadores");
        System.out.println("2. Gestionar Pokémones");
        System.out.println("3. Iniciar Batalla");
        System.out.println("4. Salir");

        opcionPrincipal = sc.nextInt();

        switch (opcionPrincipal) {
            case 1:
                subMenuUno();
                break;
            case 2:
                subMenuDos();
                break;
            case 3:
                subMenuTres();
                break;
            default:
                break;
        }
    }

    public static void subMenuUno() {
        int opcionSubMenuUno;
        System.out.println("Gestionar Entrenadores");
        System.out.println("1. Registrar nuevo entrenador");
        System.out.println("2. Ver lista de entrenadores");
        System.out.println("3. Seleccionar un entrenador");
        System.out.println("4. Volver a menú principal");

        opcionSubMenuUno = sc.nextInt();

        switch (opcionSubMenuUno) {
            case 1:
                System.out.print("Ingresa el nombre del nuevo entrenador: ");
                String nombre = scLetras.nextLine();
                listaEntrenadores.registrarEntrenador(nombre);
                subMenuUno();
                break;
            case 2:
                LinkedList<Entrenador> entrenadoreslista = listaEntrenadores.verListaEntrenadores();
                mostrarListaEntrenadores(entrenadoreslista);
                subMenuUno();
                break;
            case 3:
                LinkedList<Pokemon> pokemones = listaPokemones.verListaPokemones();
                LinkedList<Entrenador> entrenadoreseleccion = listaEntrenadores.verListaEntrenadores();
                if (pokemones != null) {
                    seleccionarEntrenador(entrenadoreseleccion, pokemones);

                } else {
                    System.out.println("No hay pokemones registrados.");
                    subMenuDos();

                }

                break;
            case 4:
                menuPrincipal();
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }

    public static void subMenuDos() {
        int opcionSubMenuDos;
        System.out.println("Gestionar Pokémones");
        System.out.println("1. Ver todos los Pokémones registrados");
        System.out.println("2. registrar nuevo Pokémon");
        System.out.println("3. Volver a menú principal");

        opcionSubMenuDos = sc.nextInt();

        switch (opcionSubMenuDos) {
            case 1:
                LinkedList<Pokemon> pokemones = listaPokemones.verListaPokemones();
                mostrarLista(pokemones);
                subMenuDos();
                break;
            case 2:
                
                System.out.println("Elige el Pokémon que deseas agregar:");
                System.out.println("1. Growlithe \n2. Psyduck \n3. Bellsprout \n4.Voltorb \n5.Exeggcute \n6. Onix \n7.Zubat \n8.Farfetchd \n9.Hitmonlee \n10.Tentacool \n11.Nuevo Pokemon ");
                int opcion = sc.nextInt();
               
                Pokemon pokemon;
                switch (opcion) {
                    case 1:
                        pokemon = new Growlithe();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 2:
                        pokemon = new Psyduck();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 3:
                        pokemon = new Bellsprout();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 4:
                        pokemon = new Voltorb();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 5:
                        pokemon = new Exeggcute();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 6:
                        pokemon = new Onix();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 7:
                        pokemon = new Zubat();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 8:
                        pokemon = new Farfetchd();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 9:
                        pokemon = new Hitmonlee();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 10:
                        pokemon = new Tentacool();
                        listaPokemones.agregarPokemon(pokemon);
                        break;
                    case 11:
                       System.out.print("Ingresa el nombre del nuevo pokemon: ");
                        String nombre = scLetras.nextLine();
                        int salud = (int) Math.round(Math.random() * 30 + 30);
                        int puntosDeAtaque = (int) Math.round(Math.random() * 60 + 30);

                        TipoPokemon tipo1 = TipoPokemon.getRandomTipo();
                        TipoPokemon tipo[] = new TipoPokemon[]{tipo1};

                        listaPokemones.registrarPokemon(nombre, salud, puntosDeAtaque, tipo);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        return;
                }
                
                
                subMenuDos();
                break;

            case 3:
                menuPrincipal();
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }

    public static void subMenuTres() {
        System.out.println("Iniciar Batalla");
        System.out.println("1. Elegir entrenador 1");
        System.out.println("2. Elegir entrenador 2");
        System.out.println("3. Seleccionar Pokémon de entrenador 1");
        System.out.println("4. Seleccionar Pokémon de entrenador 2");
        System.out.println("5. Comenzar batalla");
        System.out.println("6. Volver a menú principal");
    }

    public static void duranteBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("1. " + pokemon1.getNombre() + " Atacar");
        System.out.println("2. " + pokemon2.getNombre() + " Atacar");
        System.out.println("3. Finalizar la batalla");
    }

    public static void mostrarLista(LinkedList<Pokemon> pokemones) {
        if (pokemones != null) {
            System.out.println("Lista de Pokemones:");
            for (int i = 0; i < pokemones.size(); i++) {
                System.out.println((i + 1) + ". " + pokemones.get(i).getNombre());
            }
            System.out.println("-----------------------------------");
        } else {

            System.out.println("No hay pokemones registrados.");
        }

    }

    public static void mostrarListaEntrenadores(LinkedList<Entrenador> entrenadoreslista) {
        if (entrenadoreslista.isEmpty()) {
            System.out.println("No hay entrenadores registrados.");
        } else {
            System.out.println("Lista de Entrenadores:");
            for (int i = 0; i < entrenadoreslista.size(); i++) {
                System.out.println((i + 1) + ". " + entrenadoreslista.get(i).getNombre());
            }
            System.out.println("-----------------------------------");
        }

    }

    public static void seleccionarEntrenador(LinkedList<Entrenador> entrenadores, LinkedList<Pokemon> pokemones) {
        Entrenador entrenadorSeleccionado;
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores registrados para seleccionar.");
            subMenuUno();
        }

        mostrarListaEntrenadores(entrenadores);
        System.out.print("Selecciona un entrenador por número: ");
        int seleccion = sc.nextInt();

        if (seleccion > 0 && seleccion <= entrenadores.size()) {
            entrenadorSeleccionado = entrenadores.get(seleccion - 1);
            mostrarsubmenuentrenador(entrenadorSeleccionado, pokemones);

        } else {
            System.out.println("Selección no válida.");

        }
    }

    public static void mostrarsubmenuentrenador(Entrenador entrenador, LinkedList<Pokemon> pokemones) {
        System.out.println("1. Ver equipo de Pokémones");
        System.out.println("2. Agregar Pokémon al equipo");
        System.out.println("3. Entrenar Pokémon");
        System.out.println("4. Volver a Gestionar Entrenadores");

        int opcionSubEntrenador = sc.nextInt();

        switch (opcionSubEntrenador) {
            case 1:
                listaEntrenadores.verEquipoPokemones(entrenador);
                mostrarsubmenuentrenador(entrenador, pokemones);
            case 2:
                if (pokemones.isEmpty()) {
                    System.out.println("No hay pokemones registrados para seleccionar.");
                    subMenuDos();
                }else{
                    listaEntrenadores.seleccionarPokemonAgregar(entrenador, pokemones);
                    mostrarsubmenuentrenador(entrenador, pokemones);
                }
            case 3:
                listaEntrenadores.entrenarPokemon(entrenador);
                mostrarsubmenuentrenador(entrenador, pokemones);
            case 4:
                subMenuUno();
            default:
                System.out.println("Opcion invalida");
                subMenuUno();
        }

    }

}
