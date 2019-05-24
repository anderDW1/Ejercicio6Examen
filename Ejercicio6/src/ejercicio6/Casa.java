package ejercicio6;

public class Casa {

	private float superficie;
	private String calle;
	private int codigoPostal;
	
	/**
	 * Un equipo de limpiadores deja la casa libre de germenes
	 * y definfecta todas las superficies
	 */
	public void limpiarLaCasa() {
		mensaje();
	}

	private void mensaje() {
		String mensajito="Te hemos limpiado la casa, esta desinfectada y nadie te ha robado";
		System.out.println(mensajito);
	}
}
