package Acciones;
import java.time.LocalTime;
import Modelos.Mascota;
public class Dormir {
    private int horasDormidas;
    private int minutosDormidos;

    public void hacerDormir (LocalTime tiempoADormir, Mascota mascota) {
        if (mascota.isLive()){
            horasDormidas = tiempoADormir.getHour();
            minutosDormidos = tiempoADormir.getMinute();
            modificadorEstado (horasDormidas, minutosDormidos, mascota);
            Mascota.ultimoDescanso = LocalTime.now();
        }else {
            System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
        }
    }
    private void modificadorEstado (int horasDormidas, int minutosDormidos, Mascota mascota){
        int minutosTotales = (horasDormidas * 60) + minutosDormidos;
        mascota.setNivelEnergia(mascota.getNivelEnergia() + ((minutosTotales * 5)/ 10));
    }

}