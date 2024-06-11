package examen.expl;

import java.time.LocalDate;
import java.util.Comparator;

public class Multimedia {
    private final String titulo;
    private final int year;
    private final LocalDate fechaLanzamento;

    public Multimedia(String titulo, int year, LocalDate fechaLanzamento) {
        this.titulo = titulo;
        this.year = year;
        this.fechaLanzamento = fechaLanzamento;
    }



    public String getTitulo() {
        return titulo;
    }

    public int getYear() {
        return year;
    }

    public LocalDate getFechaLanzamento() {
        return fechaLanzamento;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", year=" + year +
                ", fechaLanzamento=" + fechaLanzamento +
                '}';
    }

   public static class ComparatorTitulo implements Comparator<Multimedia> {
        @Override
        public int compare(Multimedia o1, Multimedia o2) {
            return o1.titulo.compareTo(o2.titulo);
        }
    }

    public static class ComparatorYear implements Comparator<Multimedia> {
        @Override
        public int compare(Multimedia o1, Multimedia o2) {
            return o1.year - o2.year;
        }
    }

    public static class ComparatorFechaLanzamento implements Comparator<Multimedia> {
        @Override
        public int compare(Multimedia o1, Multimedia o2) {
            return o1.fechaLanzamento.compareTo(o2.fechaLanzamento);
        }
    }
}
