package transporte;

public interface ConMotor {

        public default void encenderMotor() {
                    System.out.println("El motor está encendido.");
                }

}
