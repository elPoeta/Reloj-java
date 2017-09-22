package reloj;


import java.time.*;
import vista.JFrameReloj;



/**
 *
 * @author leonardo
 */
public class Reloj implements Runnable{

  private LocalTime hora;

  public Reloj() {
    hora = LocalTime.now();

  }

  public void setHora() {
    this.hora = LocalTime.now();
  }

  public LocalTime getHora() {
    return this.hora;
  }

 public void mostrar() {
    Thread hilo = new Thread(this);
    hilo.start();

  }

  @Override

  public void run() {
    FechaActual fecha = new FechaActual();

    for (;;) {
    
        JFrameReloj.jLabelFecha.setText(fecha.diaTexto().toString());

        JFrameReloj.jLabelReloj.setText(horaTexto().toString());

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.err.println(e);
      }
    }
  }

  public StringBuilder horaTexto() {
    this.setHora();
    return new StringBuilder(ceroHora(this.getHora().getHour()) + ":" + cerominuto(this.getHora().getMinute()) + ":" + ceroSegundo(this.getHora().getSecond()));
  }

  public String ceroHora(int hor) {
    return (hor >= 0 && hor <= 9) ? "0" + hor : "" + hor;
  }

  public String cerominuto(int min) {
    return (min >= 0 && min <= 9) ? "0" + min : "" + min;
  }

  public String ceroSegundo(int seg) {
    return (seg >= 0 && seg <= 9) ? "0" + seg : "" + seg;
  }

}
