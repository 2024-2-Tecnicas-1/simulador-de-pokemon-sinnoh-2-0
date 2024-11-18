package simulador;

import java.util.Scanner;
import simulador.pokemon.Pokemon;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner scLetras = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO: Aquí va tu código
        
        System.out.println("Simulador de Batallas Pokémon");

    }
    
    public static void menuPrincipal(){
        int opcionPrincipal;
        System.out.println("1. Gestionar Entrenadores");
        System.out.println("2. Gestionar Pokémones");
        System.out.println("3. Iniciar Batalla");
        System.out.println("4. Salir");
         
        opcionPrincipal = sc.nextInt();
        
        switch(opcionPrincipal){
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
    public static void subMenuUno(){
        int opcionSubMenuUno;
        System.out.println("Gestionar Entrenadores");
        System.out.println("1. Registrar nuevo entrenador");
        System.out.println("2. Ver lista de entrenadores");
        System.out.println("3. Seleccionar un entrenador");
        System.out.println("4. Volver a menú principal");
        
        opcionSubMenuUno = sc.nextInt();
        
        switch(opcionSubMenuUno){
            case 1:
                
                break;
            case 2:
                
                break;
            case 3: 
                seleccionarEntrenador();
                break;
            default: 
                break;
        }
        
    }
    
    public static void seleccionarEntrenador(){
        System.out.println("1. Ver equipo de Pokémones");
        System.out.println("2. Agregar Pokémon al equipo");
        System.out.println("3. Entrenar Pokémon");
        System.out.println("4. Volver a Gestionar Entrenadores");
    }
    
    public static void subMenuDos(){
        System.out.println("Gestionar Pokémones");
        System.out.println("1. Ver todos los Pokémones registrados");
        System.out.println("2. registrar nuevo Pokémon");
        System.out.println("3. Volver a menú principal");
    }
    
    public static void subMenuTres(){
        System.out.println("Iniciar Batalla");
        System.out.println("1. Elegir entrenador 1");
        System.out.println("2. Elegir entrenador 2");
        System.out.println("3. Seleccionar Pokémon de entrenador 1");
        System.out.println("4. Seleccionar Pokémon de entrenador 2");
        System.out.println("5. Comenzar batalla");
        System.out.println("6. Volver a menú principal");
    }
    
    public static void duranteBatalla(Pokemon pokemon1, Pokemon pokemon2 ){
        System.out.println("1. "+pokemon1.getNombre()+" Atacar");
        System.out.println("2. "+pokemon2.getNombre()+" Atacar");
        System.out.println("3. Finalizar la batalla");
    }
    
}


