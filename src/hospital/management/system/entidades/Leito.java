package hospital.management.system.entidades;

import java.io.Serializable;

public class Leito extends Base implements Serializable   {
    private int numero;
    private String tipo;
    private int id_enfermeiro;

    public Leito() {
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getEnfermeiro() {
        return id_enfermeiro;
    }

    public void setEnfermeiro(int id_enfermeiro) {
        this.id_enfermeiro = id_enfermeiro;
    }
}
