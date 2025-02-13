package paqAnimales;

public class Principal {

    public static void main(String[] args) {

//                Animal
//                  |
//                  |
//               Mamifero
//              /       \
//             /         \        
//        Perro          Gato

        Animal ani = new Animal();

        Mamifero mami = new Mamifero();

        Perro toby = new Perro();

        Gato isidoro = new Gato();
        isidoro.pelos = 4;

        ani = isidoro;

        Gato g;
        g = (Gato) ani;
        System.out.println("pelos de gato: " + g.pelos);

        Animal array[] = new Animal[4];

        array[0] = ani;
        array[1] = mami;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}
