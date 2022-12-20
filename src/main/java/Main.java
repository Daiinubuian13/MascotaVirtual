import Enumeradores.AlmacenAlimentos;
import Enumeradores.EntretenimientosEnum;
import Modelos.CatMascota;
import Modelos.DogMascota;
import Modelos.DukeMascota;
import Modelos.Mascota;
import Persistencia.persistenceCollections.IMascotaPersistenceUseList;

import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IMascotaPersistenceUseList persistence = new IMascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Duke-Merlina", "Daiana");
        CatMascota cat = new CatMascota("Cat-Giovanni","Daiana");
        DogMascota dog = new DogMascota("Dog-TJ","Daiana");

        //System.out.println(duke.getNombre());
        //System.out.println(duke.getPropietario());
        //System.out.println(duke.getFechaNacimiento());
        //System.out.println(duke.getNivelEnergia());
        //System.out.println(duke.getNivelHambre());
        //System.out.println(duke.getNivelFelicidad());
        //System.out.println(duke.getNivelAburrimiento());
        //System.out.println(duke.getNivelCansancio());

        //System.out.println(duke);
        //System.out.println(cat);
        //System.out.println(dog);

        persistence.guardar(duke);
        persistence.guardar(cat);
        persistence.guardar(dog);

        ///for (Mascota mascota : persistence.getAllMascotas()){
        ///    System.out.println(mascota);
        ///}

        //System.out.println("Antes de comer " + duke.getNivelEnergia());
        //duke.comer(AlmacenAlimentos.ASADO);
        //System.out.println("Despues de comer " + duke.getNivelEnergia());

        //System.out.println("Antes de jugar " + duke.getNivelAburrimiento());
        //duke.jugar(EntretenimientosEnum.POKER);
        //duke.jugar(EntretenimientosEnum.PASEAR);
        //duke.jugar(EntretenimientosEnum.PERINOLA);
        //duke.jugar(EntretenimientosEnum.BAILAR);
        //System.out.println("Despues de jugar " + duke.getNivelAburrimiento());
        //System.out.println("Antes de comer su nivel de hambre era " + duke.getNivelHambre());
        //duke.comer(AlmacenAlimentos.ASADO);

        System.out.println("antes de dormir " + duke.getNivelEnergia());
        duke.dormir(LocalTime.of(0,25));
        System.out.println("despues de dormir " + duke.getNivelEnergia());





    }
}
