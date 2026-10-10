package dulceramos.seminario.imc.rmi;

import dulceramos.seminario.imc.rmi.net.Servidor;

/**
 *
 * @author DULCE MARIA RAMOS PADILLA
 */
public class Principal {

    public static void main(String[] args) {
        Servidor servicio = new Servidor();
        try {
            servicio.iniciar();
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}