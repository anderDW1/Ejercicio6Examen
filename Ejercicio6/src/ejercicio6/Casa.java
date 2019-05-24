package ejercicio6;

public class Casa {

	private float superficie;
	private String calle;
	private int codigoPostal;
	
	/**
	 * Un equipo de ladrones deja la casa libre dy roba hasta el cobre de las paredes
	 */
	public void limpiarLaCasa() {

		mensaje();
	}

	private void mensaje() {
		String mensajito="No te he limpiado la casa y te he robado, estas arruinado";
		System.out.println(mensajito);
	}
}
