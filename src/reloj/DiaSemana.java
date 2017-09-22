
package reloj;

/**
 *
 * @author leonardo
 */
public enum DiaSemana {
LUNES("Lunes"),
MARTES ("Martes"),
MIERCOLES("Miércoles"),
JUEVES("Jueves"),
VIERNES("Viernes"),
SABADO("Sábado"),
DOMINGO("Domingo");

private String diaSem;

  private DiaSemana(String diaSem) {
    this.diaSem = diaSem;
  }

  public String getDiaSem() {
    return diaSem;
  }

}
