public class categorias {

    String ocio;
    String bienestar;
    String transporte;
    String comida;
    String viajes;
    String otros;

    public categorias() {}

    public categorias(String ocio, String bienestar, String transporte, String comida, String viajes, String otros) {
        this.ocio = ocio;
        this.bienestar = bienestar;
        this.transporte = transporte;
        this.comida = comida;
        this.viajes = viajes;
        this.otros = otros;

    }

    public String getBienestar() {
        return bienestar;
    }

    public String getComida() {
        return comida;
    }

    public String getOcio() {
        return ocio;
    }

    public String getTransporte() {
        return transporte;
    }

    public String getOtros() {
        return otros;
    }

    public String getViajes() {
        return viajes;
    }

    public void setBienestar(String bienestar) {
        this.bienestar = bienestar;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public void setOcio(String ocio) {
        this.ocio = ocio;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public void setViajes(String viajes) {
        this.viajes = viajes;
    }
}
