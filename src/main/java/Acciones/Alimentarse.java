package Acciones;
import Enumeradores.AlmacenAlimentos;
import Modelos.Mascota;

import javax.imageio.spi.ImageWriterSpi;

public class Alimentarse {

    private AlmacenAlimentos comida;
    private ComidasIngeridas comidasComidas;

    public void ingerirAlimentos(AlmacenAlimentos comida, Mascota mascota) {
        if (mascota.isLive()) {
                mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
                contabilizarComida(mascota);
                if (mascota.getPopo().tieneQueEvacuar(mascota)){
                    mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);
            } else {
                System.out.println("Esta mascota no tiene necesidad de subir la energia, su nivel de energia es cero");
            }
        } else {
            System.out.println("Lo siento esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
        }
    }
    public void contabilizarComida(ComidasIngeridas comidasComidas, Mascota mascota){
        if (mascota.isLive()) {
            mascota.setNivelEnergia();
        mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);
    }

    public int getComidasIngeridas {
        return getComidasIngeridas}
    }

}

