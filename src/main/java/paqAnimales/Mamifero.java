package paqAnimales;

public class Mamifero extends Animal {
    
      // Constructor que pasa el nombre a la clase padre (Animal)
    public Mamifero(String nombre) {
        super(nombre);
    }
  

    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}
