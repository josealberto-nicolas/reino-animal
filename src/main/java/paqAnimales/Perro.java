package paqAnimales;

public class Perro extends Mamifero {
    
    // Constructor que pasa el nombre a la clase padre (Mamifero)
    public Perro(String nombre) {
        super(nombre);
    }
    
 

    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

   @Override
    public String toString() {
        return "Animal [nombre=" + getNombre() + "]";
    }


    String ToString() {
        return this.getNombre();
    }
    


}
