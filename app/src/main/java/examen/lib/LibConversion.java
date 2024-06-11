package examen.lib;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class LibConversion {
    /**
     * Metodo que convierte un String a LocalDate
     * @param fecha fecha a convertir
     * @return devuelve un LocalDate
     */
    public static LocalDate StringToLocalDate(String fecha) throws DateTimeParseException {
        try {
            return LocalDate.parse(fecha);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Error al convertir la fecha", fecha, 0);
        }
    }
    
    /**
     * Metodo que convierte un Date a LocalDate
     * @param date fecha a convertir
     * @return devuelve un LocalDate
     */
    public static LocalDate dateToLocalDate(Date date){
        return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * Metodo que convierte un LocalDate a Date
     * @param localDate fecha a convertir
     * @return devuelve un Date
     */
    public static Date localDateToDate(LocalDate localDate){
            return Date.from(localDate.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
       
    }


}
