package transporte;

public class Bicicleta extends Vehiculo implements SinMotor {

    public Bicicleta(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void usarFuerzaHumana(){
        System.out.println("Usando fuerza humana para mover la bicicleta.");
    }

    @Override
    public void describir() {
        System.out.println("Soy una bicicleta con velocidad máxima de " + velocidadMaxima + " km/h.");
    }

}
