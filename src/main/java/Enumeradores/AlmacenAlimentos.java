package Enumeradores;

public enum AlmacenAlimentos {

    SOPA (15), ASADO (25), CHORIPAN(10), ENSALADA (20), PORORO (5);

    private int energiaAportada;
    AlmacenAlimentos (int energia) {
        this.energiaAportada = energia;
    }
    public int getEnergiaAportada() {
        return energiaAportada;
    }
    private int hambreDisminuida;
    public int getHambreDisminuida(){
        return hambreDisminuida;
    }

}
