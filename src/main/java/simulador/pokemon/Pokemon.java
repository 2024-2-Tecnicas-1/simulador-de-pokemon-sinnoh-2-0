package simulador.pokemon;

public abstract class Pokemon {
    private String nombre;
    private int salud;
    private int puntosDeAtaque;
    private TipoPokemon[] tipo = new TipoPokemon[2];
    private String estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon[] tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
    }

    public String getNombre(){
        return nombre;
    }
    public int getSalud(){
        return salud;
    }
    
    public void atacar(Pokemon oponente){
        oponente.recibirDaño(puntosDeAtaque);
    }
    
    public void recibirDaño(int daño){
        this.salud -= daño;
        if(this.salud<=0){
            this.salud = 0;
        }
    }
    
    public void entrenar(){
        this.salud = +5;
        this.puntosDeAtaque = +3;
    }
}

