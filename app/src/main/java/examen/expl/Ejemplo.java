package examen.expl;

import java.util.ArrayList;

import examen.lib.LibConf;

public class Ejemplo {
    
    public Ejemplo(){
        ArrayList<Multimedia> multimedia = new ArrayList<Multimedia>();
        for (int i = 0; i < 10; i++) {
            multimedia.add(new Multimedia(LibConf.faker.book().title(), LibConf.faker.number().numberBetween(1900, 2021), LibConf.faker.date().birthday().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()));
        }

        for (Multimedia multimedia2 : multimedia) {
            System.out.println(multimedia2);
        }
        multimedia.sort(new Multimedia.ComparatorTitulo());
        System.out.println("Ordenado por titulo");
        for (Multimedia multimedia2 : multimedia) {
            System.out.println(multimedia2);
        }

        multimedia.sort(new Multimedia.ComparatorYear());
        System.out.println("Ordenado por año");
        for (Multimedia multimedia2 : multimedia) {
            System.out.println(multimedia2);
        }
        
        multimedia.sort(new Multimedia.ComparatorFechaLanzamento());
        System.out.println("Ordenado por fecha de lanzamiento");
        for (Multimedia multimedia2 : multimedia) {
            System.out.println(multimedia2);
        }
    }
}
