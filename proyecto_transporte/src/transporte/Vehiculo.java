package transporte;

public abstract class Vehiculo {

    protected int velocidadMaxima;

    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void arrancar() {
        System.out.println("\nEl vehículo está en marcha.");
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void describir();


}
