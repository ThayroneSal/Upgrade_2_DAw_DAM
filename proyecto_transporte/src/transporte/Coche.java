package transporte;

public class Coche extends Vehiculo implements ConMotor {

    public Coche(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void encenderMotor() {
        System.out.print("El motor del coche está encendido. ");
    }

    @Override
    public void describir() {
        System.out.println("\nSoy un coche que puede alcanzar " + velocidadMaxima + " km/h.");
    }


}
