public class gastoxdia {

public String descripciongasto;
public double valorgastado;
public double valorconsumidodia;



    public gastoxdia(){}
    public gastoxdia(String descripciongasto, double valorgastado, double valorconsumidodia){

        this.descripciongasto=descripciongasto;
        this.valorgastado=valorgastado;
        this.valorconsumidodia=valorconsumidodia;

    }

    public String getDescripciongasto() {
        return descripciongasto;
    }

    public double getValorconsumidodia() {
        return valorconsumidodia;
    }

    public double getValorgastado() {
        return valorgastado;
    }

    public void setValorconsumidodia(double valorconsumidodia) {
        this.valorconsumidodia = valorconsumidodia;
    }

    public void setValorgastado(double valorgastado) {
        this.valorgastado = valorgastado;
    }

    public void setDescripciongasto(String descripciongasto) {
        this.descripciongasto = descripciongasto;
    }
}



