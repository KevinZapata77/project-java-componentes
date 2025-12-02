public class Mantenimiento {
    private String descripcion;
    private String fecha;

    public Mantenimiento(String descripcion, String fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    // Getters y Setters
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}
