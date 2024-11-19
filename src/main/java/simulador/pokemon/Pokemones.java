
package simulador.pokemon;

import java.util.LinkedList;


public class Pokemones {
    private LinkedList<Pokemon> pokemones = new LinkedList<>();
    
    public LinkedList<Pokemon> verListaPokemones() {
        return this.pokemones;
    }
    
    public void registrarPokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon[] tipo) {
        
        Pokemon nuevoPokemon = new nuevoPokemon(nombre,salud,puntosDeAtaque,tipo);
        
        pokemones.add(nuevoPokemon);
        System.out.println("Pokemon registrado exitosamente: " + nombre);
        
    }
}
