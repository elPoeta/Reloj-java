
package reloj;

import vista.JFrameReloj;
/**
 *
 * @author leonardo
 */
public class Controlador {
    private JFrameReloj v;
    private Reloj r;

    public Controlador(JFrameReloj v, Reloj r) {
        this.v = v;
        this.r = r;
    }
    
    public void iniciarVista(){
        this.v.iniciar();
        this.r.mostrar();
    }
    
}
