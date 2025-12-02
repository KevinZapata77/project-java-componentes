public class Neumatico {
    private String marca;
    private String tamaño;
    private double presion;

    public Neumatico(String marca, String tamaño, double presion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getTamaño() { return tamaño; }
    public void setTamaño(String tamaño) { this.tamaño = tamaño; }

    public double getPresion() { return presion; }
    public void setPresion(double presion) { this.presion = presion; }
}
