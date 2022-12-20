package Acciones;

import Modelos.Mascota;

public class hacerPopo {
    public boolean tieneQueEvacuar(Mascota mascota){
        return mascota.getComidasIngeridas () > 2;
    }

    public void evacuar(Mascota mascota){
        if (tieneQueEvacuar(mascota)){
            mascota.setComidasIngeridas(mascota.getComidasIngeridas() -1);
        }
    }
}