/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package examen;

import java.time.LocalDate;
import java.util.ArrayList;

import examen.expl.Ejemplo;
import examen.expl.Multimedia;
import examen.lib.LibConf;
import examen.lib.LibConversion;
import examen.lib.LibInput;
import examen.lib.LibMenu;
import examen.lib.LibValoresRandom;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        LocalDate fecha1 = LibConversion.StringToLocalDate("2021-01-01");
        LocalDate fecha2 = LibConversion.StringToLocalDate("2021-01-10");
        for (int i = 0; i < 10; i++) {
            System.out.println(LibValoresRandom.valorRandom(fecha1, fecha2));
        }
        


    }
}
