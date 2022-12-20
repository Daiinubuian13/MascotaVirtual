package Modelos;
import Acciones.Alimentarse;
import Acciones.Divertirse;
import Acciones.Dormir;
import Acciones.hacerPopo;
import Enumeradores.AlmacenAlimentos;
import Enumeradores.EntretenimientosEnum;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Mascota {
    protected String nombre;
    protected LocalDateTime fechaNacimiento;
    protected LocalDateTime fechaMuerte;
    protected boolean isLive;
    protected int nivelEnergia;
    protected int nivelHambre;
    protected int nivelCansancio;
    protected int nivelFelicidad;
    protected int nivelAburrimiento;
    protected String propietario;
    protected int id;
    protected Alimentarse alimentarse;
    protected Divertirse divertirse;
    public static LocalTime ultimoDescanso;
    protected Dormir descansar;
    protected int comidasIngeridas;
    protected hacerPopo popo;


    public Mascota (String nombre, String propietario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.isLive = true;
        this.nivelEnergia = (20);
        this.nivelHambre = (int) (Math.random() * 100);
        this.nivelCansancio = (int) (Math.random() * 100);
        this.nivelFelicidad = (int) (Math.random() * 100);
        this.nivelAburrimiento = (int) (Math.random() * 100);
        this.fechaNacimiento = LocalDateTime.now();
        this.alimentarse = new Alimentarse();
        this.divertirse = new Divertirse();
        this.descansar = new Dormir();
        this.popo = new hacerPopo();

        setNombre(nombre);
        setPropietario(propietario);
        setLive(true);
        setNivelEnergia(100);
        setNivelHambre((int) (Math.random() *100));
        setNivelCansancio((int) (Math.random() *100));
        setNivelFelicidad((int) (Math.random() *100));
        setNivelAburrimiento((int) (Math.random() *100));
        setFechaNacimiento(LocalDateTime.now());


    }
    //metodos de la instancia
    public void comer (AlmacenAlimentos alimentos){
        alimentarse.ingerirAlimentos(alimentos,this);
    };
    public void dormir (LocalTime tiempo){
        descansar.hacerDormir (tiempo, this);
    };
    public void jugar (EntretenimientosEnum entretenimiento){
        divertirse.entretenerseCon(entretenimiento,this);
    };


    public String getNombre (){
        return nombre;
    }
    public LocalDateTime getFechaNacimiento(){
        return fechaNacimiento;
    }
    public LocalDateTime getFechaMuerte(){
        return fechaMuerte;
    }
    public boolean isLive(){
        return isLive;
    }
    public int getNivelEnergia(){
        return nivelEnergia;
    }
    public int getNivelHambre(){
        return nivelHambre;
    }
    public int getNivelCansancio(){
        return nivelCansancio;
    }
    public int getNivelFelicidad(){
        return nivelFelicidad;
    }
    public int getNivelAburrimiento(){
        return nivelAburrimiento;
    }
    public String getPropietario(){
        return propietario;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFechaNacimiento(LocalDateTime fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setFechaMuerte(LocalDateTime fechaMuerte){
        this.fechaMuerte = fechaMuerte;
    }
    public void setLive(boolean live){
        isLive = live;
    }
    public void setNivelEnergia(int nivelEnergia){
        this.nivelEnergia = nivelEnergia;
    }
    public void setNivelHambre(int nivelHambre){
        this.nivelHambre = nivelHambre;
    }
    public void setNivelCansancio(int nivelCansancio){
        this.nivelCansancio = nivelCansancio;
    }
    public void setNivelFelicidad(int nivelFelicidad){
        this.nivelFelicidad = nivelFelicidad;
    }
    public void setNivelAburrimiento(int nivelAburrimiento){
        this.nivelAburrimiento = nivelAburrimiento;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

}