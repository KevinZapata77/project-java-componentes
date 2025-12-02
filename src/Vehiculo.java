public class Vehiculo {
    private String id;
    private String marca;
    private String modelo;

    // Relaciones
    private Motor motor;
    private Transmision transmision;
    private Chasis chasis;
    private SistemaElectrico sistemaElectrico;
    private SistemaFrenos sistemaFrenos;
    private RegistroVehicular registro;

    public Vehiculo(String id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + " (ID: " + id + ")");
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public Transmision getTransmision() { return transmision; }
    public void setTransmision(Transmision transmision) { this.transmision = transmision; }

    public Chasis getChasis() { return chasis; }
    public void setChasis(Chasis chasis) { this.chasis = chasis; }

    public SistemaElectrico getSistemaElectrico() { return sistemaElectrico; }
    public void setSistemaElectrico(SistemaElectrico sistemaElectrico) { this.sistemaElectrico = sistemaElectrico; }

    public SistemaFrenos getSistemaFrenos() { return sistemaFrenos; }
    public void setSistemaFrenos(SistemaFrenos sistemaFrenos) { this.sistemaFrenos = sistemaFrenos; }

    public RegistroVehicular getRegistro() { return registro; }
    public void setRegistro(RegistroVehicular registro) { this.registro = registro; }
}
