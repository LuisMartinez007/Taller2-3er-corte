package Taller2;

public class ClaseB {
    public static void main(String[] args) {
        ClaseA objetoA = new ClaseA();
        // Intento de acceso directo a la propiedad privada
        objetoA.numero = 10; // Esto causará un error de compilación
    }
}
