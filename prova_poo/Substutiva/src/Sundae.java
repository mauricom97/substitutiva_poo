import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sundae extends Sorvete {
    private int valor_calda;
    private int custoTotal;
    private int valor;
    private String cobertura;

    public Sundae() {
        valor_calda = 2;
        valor = 2;
        custoTotal = valor_calda + valor;
    }

    public Sundae (int valor_calda, int custoTotal, int valor, String cobertura) {
        this.valor_calda = valor_calda;
        this.custoTotal = custoTotal;
        this.valor = valor;
        this.cobertura = cobertura;
    }

    public Sundae(String sorvete_de_flocos, int custoTotal, String calda_de_caramelo, int i) {
    }

    public int getCusto(){
        return custoTotal;
    }

    public int getCustoDaCalda(){
        return valor_calda;
    }

    public int getValor(){
        return valor;
    }

    public String getCobertura(){
        return cobertura;
    }

    @Override
    public String toString() {
        return String.format("Um sundae de %s com\n%-25s %6s", getCobertura(),
                getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
    }

    }

