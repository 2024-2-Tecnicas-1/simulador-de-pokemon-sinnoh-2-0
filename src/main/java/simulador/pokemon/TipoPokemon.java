package simulador.pokemon;

public enum TipoPokemon {
    FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA;

    public double obtenerMultiplicadorDeDano(TipoPokemon atacante, TipoPokemon defensor) {
        switch (atacante) {
            case FUEGO:
                switch (defensor) {
                    case AGUA: return 0.5;
                    case PLANTA: return 2.0;
                    case ROCA: return 0.5;
                    case ACERO: return 0.5;
                    case BICHO: return 2.0;
                    case HIELO: return 2.0;
                }
                break;

            case AGUA:
                switch (defensor) {
                    case FUEGO: return 2.0;
                    case PLANTA: return 0.5;
                    case ROCA: return 2.0;
                    case TIERRA: return 2.0;
                }
                break;

            case PLANTA:
                switch (defensor) {
                    case FUEGO: return 0.5;
                    case AGUA: return 2.0;
                    case PLANTA: return 0.5;
                    case VENENO: return 0.5;
                    case ROCA: return 2.0;
                    case TIERRA: return 2.0;
                    case VOLADOR: return 0.5;
                    case ACERO: return 0.5;
                    case BICHO: return 0.5;
                }
                break;

            case VENENO:
                switch (defensor) {
                    case PLANTA: return 2.0;
                    case ROCA: return 0.5;
                    case TIERRA: return 0.5;
                    case FANTASMA: return 0.5;
                }
                break;

            case ELECTRICO:
                switch (defensor) {
                    case AGUA: return 2.0;
                    case PLANTA: return 0.5;
                    case TIERRA: return 0.0;
                    case VOLADOR: return 2.0;
                }
                break;

            case PSIQUICO:
                switch (defensor) {
                    case VENENO: return 2.0;
                    case LUCHA: return 2.0;
                    case ACERO: return 0.5;
                    case PSIQUICO: return 0.5;
                }
                break;

            case ROCA:
                switch (defensor) {
                    case FUEGO: return 2.0;
                    case AGUA: return 0.5;
                    case PLANTA: return 0.5;
                    case VOLADOR: return 2.0;
                    case ACERO: return 0.5;
                }
                break;

            case TIERRA:
                switch (defensor) {
                    case FUEGO: return 2.0;
                    case AGUA: return 0.5;
                    case PLANTA: return 0.5;
                    case VENENO: return 2.0;
                    case ROCA: return 2.0;
                    case ELECTRICO: return 2.0;
                    case VOLADOR: return 0.0;
                }
                break;

            case VOLADOR:
                switch (defensor) {
                    case PLANTA: return 2.0;
                    case ROCA: return 0.5;
                    case LUCHA: return 2.0;
                    case BICHO: return 2.0;
                    case ELECTRICO: return 0.5;
                }
                break;

            case HIELO:
                switch (defensor) {
                    case FUEGO: return 0.5;
                    case AGUA: return 0.5;
                    case PLANTA: return 2.0;
                    case ROCA: return 0.5;
                    case TIERRA: return 2.0;
                    case VOLADOR: return 2.0;
                }
                break;

            case LUCHA:
                switch (defensor) {
                    case NORMAL: return 2.0;
                    case ROCA: return 2.0;
                    case HIELO: return 2.0;
                    case VOLADOR: return 0.5;
                    case PSIQUICO: return 0.5;
                    case BICHO: return 0.5;
                    case HADA: return 0.5;
                }
                break;

            case FANTASMA:
                switch (defensor) {
                    case NORMAL: return 0.0;
                    case PSIQUICO: return 2.0;
                    case FANTASMA: return 2.0;
                }
                break;

            case NORMAL:
                switch (defensor) {
                    case ROCA: return 0.5;
                    case ACERO: return 0.5;
                    case FANTASMA: return 0.0;
                }
                break;

            default:
                return 1.0; // Daño neutro si no hay coincidencias
        }
        return 1.0; // Por defecto, daño neutro
    }
    
    public static TipoPokemon getRandomTipo() {
            // Obtener todos los valores del enum
            TipoPokemon[] poke = values();
            // Seleccionar un índice aleatorio
            int randomIndex = (int)(Math.random()*15);
            // Retornar el valor aleatorio
            return poke[randomIndex];
        }
    
    
}
