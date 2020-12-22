import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Doce extends ItemSobremesa {
    private int precoPorQuilo;
    private double peso;
    private int custoTotal;
    private String name;

    public Doce() {

    }

    public Doce(String name, double peso, int custoTotal) {
        new Doce = (new Doce("Jujuba", 0.83, 89));

    }

    public int getCusto(){
        return custoTotal;
    }

    public double getPeso(){
        return peso;
    }

    @Override
    public String toString() {
        return String.format("%.2f g @ %s /kg\n%-25s %6s", getPeso(),
                Sorveteria.centavos2ReaisECentavos(precoPorQuilo), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
    }

}
