
package reloj;

/**
 *
 * @author leonardo
 */
public enum Meses {
ENERO("Enero"),
FEBRERO("Febrero"),
MARZO("Marzo"),
ABRIL("Abril"),
MAYO("Mayo"),
JUNIO("Junio"),
JULIO("Julio"),
AGOSTO("Agosto"),
SEPTIEMBRE("Septiembre"),
OCTUBRE("Octubre"),
NOVIEMBRE("Noviembre"),
DICIEMBRE("Diciembre");

private String mesA;

  private Meses(String mesA) {
    this.mesA = mesA;
  }

  public String getMesA() {
    return mesA;
  }


}
