package paqAnimales;

/*Representa a un gato, un tipo específico de mamífero.
  Esta clase extiende a la clase Mamifero y proporciona métodos específicos de comportamiento de los gatos*/

public class Gato extends Mamifero {

    private int pelos;
            
       // Constructor de la clase Gato. Establece el nombre del gato.
    public Gato(String nombre) {
        super(nombre);
    }
      
    
   /* Método que simula el acto de dormir de un gato.
    Muestra un mensaje.*/
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /* Método que simula el maullido de un gato.
    Muestra un mensaje.*/
    
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }
    
    /*Obtiene la cantidad de pelos que tiene el gato*/
    public int getPelos(){
        return pelos;
    }
    
    /*Establece el número de pelos que tiene el gato*/
    public void setPelos(int pelos){
        this.pelos = pelos;
    }

    /*Método que simula la relación entre un gato y otro animal.*/
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

}
