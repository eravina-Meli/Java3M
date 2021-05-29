package clases;

public class MainPersona {

    public static void main(String[] args) {
        Celular[] celulares = {
                new Celular(10,"Celular 1"),
                new Celular(660,"Celular 2"),
                new Celular(70,"Celular 3"),
                new Celular(40,"Celular 3"),
                new Celular(110,"Celular 3"),
        };
        SortUtil.ordenar(celulares);
                System.out.println("\nLista ordenada de personas");

        for (Celular p : celulares) {
            System.out.println(p);
        }
        Persona[] personas = {
                new Persona("Marcos Galperin", 456),
                new Persona("Steve Jobs", 234),
                new Persona("Bill Gates", 12),
                new Persona("Jeff Bezos", 2),
                new Persona("Elon Musk", 199)
        };
        SortUtil.ordenar(personas);
        System.out.println("\nLista ordenada de personas");
        for (Persona p : personas) {
            System.out.println(p);
        }

    }


}

