
package reloj;

import vista.JFrameReloj;

/**
 *
 * @author leonardo
 */
public class Main {
       public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Controlador c = new Controlador(new JFrameReloj(), new Reloj());
                c.iniciarVista();
            }
        });
    }
}
