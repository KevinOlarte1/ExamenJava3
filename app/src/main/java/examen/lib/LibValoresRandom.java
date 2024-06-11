package examen.lib;

import java.time.LocalDate;

public class LibValoresRandom {
    /**
     * Metodo que devuelve un valor random entre un rango de valores.
     * @param min valor minimo valido
     * @param max valor maximo valido
     * @return devuelve un valor random entre min y max
     */
    public static int valorRandom(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Metodo que devuelve un valor random entre un rango de valores.
     * @param min valor minimo valido
     * @param max valor maximo valido
     * @return devuelve un valor random entre min y max
     */
    public static double valorRandom(double min, double max){
        return (Math.random() * (max - min + 1) + min);
    }

    /**
     * Metodo que devuelve un valor random entre un rango de valores.
     * @param min valor minimo valido
     * @param max valor maximo valido
     * @return devuelve un valor random entre min y max
     */
    public static float valorRandom(float min, float max){
        return (float) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Metodo que devuelve un valor random entre un rango de valores.
     * @param min valor minimo valido
     * @param max valor maximo valido
     * @return devuelve un valor random entre min y max
     */
    public static LocalDate valorRandom(LocalDate min, LocalDate max){
        return LocalDate.ofEpochDay((long) (Math.random() * (max.toEpochDay() - min.toEpochDay() + 1) + min.toEpochDay()));
    }
}
