package br.com.alura.escola.dominio.aluno;

/**
 * 
 * @author igorcastro.dsn
 *
 */
public class CPF {

	private String numero;

	public CPF(String numero) {
		setNumero(numero);
	}

	private void setNumero(String numero) {
		if (numero == null || !numero.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$")) {
			throw new IllegalArgumentException("CPF inv�lido");
		}
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

}
