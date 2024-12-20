package simulador.pokemon;

import java.util.LinkedList;


public class Pokemones {
    private LinkedList<Pokemon> pokemones = new LinkedList<>();
    private LinkedList<Pokemon> allPokemones = new LinkedList<>();
    
    public LinkedList<Pokemon> verListaPokemones() {
        return this.pokemones;
    }
    public LinkedList<Pokemon> verListaAllPokemones() {
        return this.allPokemones;
    }
    public void registrarPokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon[] tipo) {
        
        Pokemon nuevoPokemon = new nuevoPokemon(nombre,salud,puntosDeAtaque,tipo);
        
        pokemones.add(nuevoPokemon);
        allPokemones.add(nuevoPokemon);
        System.out.println("Pokemon registrado exitosamente: " + nombre);
        
    }
        public void agregarPokemon(Pokemon pokemon){
         pokemones.add(pokemon);
         allPokemones.add(pokemon);
    }
}