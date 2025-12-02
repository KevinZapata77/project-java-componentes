public class SistemaElectrico {
    private int bateria;
    private boolean lucesEncendidas;
    private boolean sensoresActivos;

    public SistemaElectrico(int bateria) {
        this.bateria = bateria;
        this.lucesEncendidas = false;
        this.sensoresActivos = false;
    }

    public void encenderLuces() { lucesEncendidas = true; }

    // Getters y Setters
    public int getBateria() { return bateria; }
    public void setBateria(int bateria) { this.bateria = bateria; }

    public boolean isLucesEncendidas() { return lucesEncendidas; }
    public void setLucesEncendidas(boolean lucesEncendidas) { this.lucesEncendidas = lucesEncendidas; }

    public boolean isSensoresActivos() { return sensoresActivos; }
    public void setSensoresActivos(boolean sensoresActivos) { this.sensoresActivos = sensoresActivos; }
}
