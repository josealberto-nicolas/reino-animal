package paqAnimales;

/*Clase principal que ejecuta el programa. Crea objetos de las clases Animal, Mamifero, Perro y Gato,
y demuestra la interacción entre ellas.
Se crea una jerarquia de clases, donde los animales pueden realizar acciones como comer, dormir,
reproducirse y relacionarse entre sí*/

public class Principal {
    
    /* Método principal que inicia la ejecución del programa.
    Crea instancias a diferentes clases de animales, establece sus nombres y simula 
    interacciones entre ellos. Además utiliza la herencia para mostrar como los métodos
    pueden ser sobrescritos en las subclases.*/

    public static void main(String[] args) {

/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/


        Animal animal = new Animal("Animal general");

        Mamifero mami = new Mamifero("Mamifero");

        Perro toby = new Perro("Toby");

        Gato isidoro = new Gato("Isidoro");
        isidoro.setPelos(4);
        
        // Cambiar la referencia de Animal a un Gato
        animal = isidoro;
        
        // Realizar un casting explicito para acceder a los métodos específicos de Gato.
        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());
        
        // Crear un array de objetos Animal.
        Animal array[] = new Animal[4];
        
        //Asignar las instancias al array.
        array[0] = animal;
        array[1] = mami;
        array[2] = toby;
        array[3] = isidoro;
        
        //Iterar sobre el array y mostrar las interacciones específicas de cada animal.
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");
         
                //Realizar un casting para acceder a métodos específicos de Perro.
                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                //Realizar un casting para acceder a métodos específcios de Gato.
                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}
