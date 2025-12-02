📘 Proyecto de Componentes Vehiculares

Sistema orientado a objetos para modelar diferentes componentes de un vehículo.

🚗 Descripción General

Este proyecto implementa un conjunto de clases que representan los diferentes componentes que conforman un vehículo: motor, transmisión, chasis, neumáticos, sistema eléctrico, sistema de frenos, mantenimiento, sensores, etc.
El objetivo es aplicar principios de POO, encapsulamiento, composición y responsabilidad única.

📂 Estructura del Proyecto
src/
 └── com.vehiculos/
      ├── Vehiculo.java
      ├── Motor.java
      ├── Transmision.java
      ├── Chasis.java
      ├── Neumatico.java
      ├── SistemaElectrico.java
      ├── SistemaFrenos.java
      ├── RegistroVehicular.java
      ├── Mantenimiento.java
      ├── Sensor.java
      └── Main.java

🧩 Funcionalidades principales
✔ Vehiculo

Clase principal que integra todos los componentes.

Incluye:

Datos básicos (marca, modelo, año)

Asociación con: Motor, Transmisión, Chasis, Neumáticos, Sistema eléctrico, Sistema de frenos

Métodos: mostrarInfo(), encender(), apagar()

✔ Motor

Tipo, cilindrada, caballos de fuerza

Método: encenderMotor(), apagarMotor()

✔ Transmisión

Tipo: automática / manual

Número de marchas

✔ Chasis

Material, peso, tipo

✔ Neumático

Tipo, tamaño, presión

✔ Sistema Eléctrico

Voltaje, estado batería

✔ Sistema de Frenos

Tipo de freno, nivel de desgaste

✔ Registro Vehicular

Placa, fecha de registro, propietario

Método: mostrarRegistro()

✔ Mantenimiento

Fecha, tipo, técnico

Método: realizarMantenimiento()

✔ Sensor

Tipo: temperatura, presión, velocidad

Método: leerValor()

▶ Ejecución del proyecto
Si trabajas en VS Code:

Instalar extensiones:

Extension Pack for Java

Debugger for Java

Abrir la carpeta del proyecto.

Ejecutar Main.java:

Clic en el botón Run arriba del método main

O presionar Ctrl + F5