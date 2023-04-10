package proyectoccuenta;

/**
 * Clase que representa una cuenta bancaria.
 */

public class CCuenta {


    private String nombre; // Nombre del titular 
    private String cuenta; // Número de cuenta
    private double saldo; // Saldo actual
    private double tipoInterés; // Tipo de interés aplicable

    /**
     * Codigo por defecto.
     */
    
    public CCuenta()
    {
    }
    /**
     * codigo que inicializa los atributos de la clase.
     * @param nom Nombre del titular.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial.
     * @param tipo Tipo de interés aplicable.
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Devuelve el saldo actual de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Ingresa cantidad en la cuenta con posibles condicionantes.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Retira una cantidad de la cuenta con condicionantes.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
