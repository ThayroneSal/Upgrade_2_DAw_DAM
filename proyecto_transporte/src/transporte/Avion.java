package transporte;

public final class Avion extends Vehiculo implements ConMotor {

    public Avion(int velocidadMaxima){
        super(velocidadMaxima);
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void encenderMotor(){
        System.out.println("El motor del avión está encendido.");
    }

    @Override
    public void describir() {
        System.out.println("Soy un avión que vuela a " + velocidadMaxima + " km/h.");
    }

}
