public class Main {
    public static void main(String[] args) {

        Motor motor = new Motor("Gasolina", 1600, 120);
        Transmision transmision = new Transmision("Automática", 6, "4x2");
        Chasis chasis = new Chasis("Monocasco", 4.5, 1.8, 1200);
        SistemaFrenos frenos = new SistemaFrenos("Disco", true, "Bueno");

        Vehiculo carro = new Vehiculo("001", "Toyota", "Corolla");

        carro.setMotor(motor);
        carro.setTransmision(transmision);
        carro.setChasis(chasis);
        carro.setSistemaFrenos(frenos);

        carro.mostrarInfo();
        carro.getMotor().encender();
    }
}
