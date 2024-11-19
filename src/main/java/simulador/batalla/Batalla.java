package simulador.batalla;
import simulador.pokemon.Pokemon;

public class Batalla {
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2){
        boolean finBatalla = false;
        do {
            if (pokemon1.getSalud()>0){
                pokemon1.atacar(pokemon2);
            }else if(pokemon2.getSalud()>0){
                pokemon2.atacar(pokemon2);
            }else{
                finBatalla = true;
            }
        }while (finBatalla == false);
    }
}
