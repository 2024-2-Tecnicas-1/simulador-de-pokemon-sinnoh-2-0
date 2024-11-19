package simulador.batalla;
import simulador.pokemon.Pokemon;

public class Batalla {
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2){
        boolean finBatalla = false;
        do {
            if (pokemon1.getSalud()>0){
                pokemon1.atacar(pokemon2);
                System.out.println(pokemon1.getNombre() + " ha atacado");
                System.out.println("La salud de "+pokemon2.getNombre()+" ahora es: "+pokemon2.getSalud());
            }else if(pokemon2.getSalud()>0){
                pokemon2.atacar(pokemon1);
                System.out.println(pokemon2.getNombre() + " ha atacado");
                System.out.println("La salud de "+pokemon1.getNombre()+" ahora es: "+pokemon1.getSalud());
            }else{
                finBatalla = true;
            }
        }while (finBatalla == false);
    }
}
