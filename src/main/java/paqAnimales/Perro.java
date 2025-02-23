package paqAnimales;

/* Representa a un perro, un tipo específico de mamifero.
   Esta clase extiende a la clase Mamifero y proporciona metodos específicos de comportamiento de los perros. */

public class Perro extends Mamifero {
    
    // Constructor de la clase Perro. Establece el nombre del perro.
    public Perro(String nombre) {
        super(nombre);
    }
    
 /*Metodo que simula el acto de dormir de un perro.
    Muestra un mensaje*/

    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }
/*Metodo que simula el ladrido de un perro.
    Muestra un mensaje*/
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }
    
    /*Metodo que simula un gruñido de un perro.
    Muestra un mensaje.*/
    

    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /*Representación en formato String de un objeto de tipo Perro.*/
   @Override
    public String toString() {
        return "Animal [nombre=" + getNombre() + "]";
    }

/* Método adicional que devuelve solo el nombre del perro.*/
    String ToString() {
        return this.getNombre();
    }
    


}
