package simulador.entrenador;

import java.util.LinkedList;
import simulador.pokemon.Pokemon;


public class Entrenador {
    String nombre;
    LinkedList<Pokemon> pokemones = new LinkedList<>();

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public LinkedList<Pokemon> mostrarPokemones(){
        return pokemones;
    }
    
    public void agregarPokemon(Pokemon pokemon){
        this.pokemones.add(pokemon);
    }
     public void entrenarPokemon(Pokemon pokemon){
        pokemon.entrenar();
    }    
    public Pokemon prepararBatalla(Pokemon pokemon){
       
    return pokemon;
    }
    public void este(){
    
    }
}

    
