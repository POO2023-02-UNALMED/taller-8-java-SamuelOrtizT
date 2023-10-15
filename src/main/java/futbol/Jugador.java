package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;
    public boolean jugarConLasManos() {
        return false;
    }
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
    public String toString() {
        return super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
    }
    //implementar interface
    public int compareTo(Futbolista p) {
        return Math.abs(this.getEdad() - p.getEdad());
    }
}
