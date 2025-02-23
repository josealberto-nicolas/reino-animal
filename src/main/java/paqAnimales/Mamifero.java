package paqAnimales;

public class Mamifero extends Animal {
    /* Representa a un mamifero, que es un tipo de animal.
       Esta clase extiende de la clase Animal y sobreescribe algunos metodos*/
    
      // Constructor de la clase Mamifero. Establece el nombre del mamifero.
    public Mamifero(String nombre) {
        super(nombre);
    } 
  
    /* Metodo que simula la reproducción de un mamífero.
       La reproducción es vivipara.*/
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /* Metodo que simula la relación entre un mamifero y otros animales.*/
       
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}
