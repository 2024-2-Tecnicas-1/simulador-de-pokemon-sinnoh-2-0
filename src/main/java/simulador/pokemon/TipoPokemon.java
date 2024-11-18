package simulador.pokemon;

public enum TipoPokemon {
    FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA;

    public double obtenerMultiplicadorDeDano(TipoPokemon atacante, TipoPokemon defensor) {
        
        return 1;
    }
}
