package Repositorio;

public class ClienteNaoCadastradoException extends Exception{
	public ClienteNaoCadastradoException() {
		super("CPF não encontrado");
	}
	

}
