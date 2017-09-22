
package reloj;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author leonardo
 */
public class FechaActual {
   private LocalDate dia;
   
   
  public FechaActual() {
    dia = LocalDate.now();
  }
  
   public void setDia() {
    this.dia = LocalDate.now();
  }

  public LocalDate getDia() {
    return this.dia;
  }
  
  public StringBuilder diaTexto() {
    this.setDia();
    return new StringBuilder(diaEsp(this.getDia().getDayOfWeek()) + ", " + this.getDia().getDayOfMonth() + " de " + mesEsp(this.getDia().getMonth()) + " de " + this.getDia().getYear());
  }
 public String diaEsp(DayOfWeek d) {
    DiaSemana dS = null;
    switch (d) {
      case MONDAY:
        return dS.LUNES.getDiaSem();
      case TUESDAY:
        return dS.MARTES.getDiaSem();
      case WEDNESDAY:
        return dS.MIERCOLES.getDiaSem();
      case THURSDAY:
        return dS.JUEVES.getDiaSem();
      case FRIDAY:
        return dS.VIERNES.getDiaSem();
      case SATURDAY:
        return dS.SABADO.getDiaSem();
      case SUNDAY:
        return dS.DOMINGO.getDiaSem();

    }
    return "";
  }

  public String mesEsp(Month m) {
    Meses mA = null;
    switch (m) {
      case JANUARY:
        return mA.ENERO.getMesA();
      case FEBRUARY:
        return mA.FEBRERO.getMesA();
      case MARCH:
        return mA.MARZO.getMesA();
      case APRIL:
        return mA.ABRIL.getMesA();
      case MAY:
        return mA.MAYO.getMesA();
      case JUNE:
        return mA.JUNIO.getMesA();
      case JULY:
        return mA.JULIO.getMesA();
      case AUGUST:
        return mA.AGOSTO.getMesA();
      case SEPTEMBER:
        return mA.SEPTIEMBRE.getMesA();
      case OCTOBER:
        return mA.OCTUBRE.getMesA();
      case NOVEMBER:
        return mA.NOVIEMBRE.getMesA();
      case DECEMBER:
        return mA.DICIEMBRE.getMesA();
    }
    return "";
  }
}
