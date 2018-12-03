package projetoIP;

public class ClienteJaCadastradoException extends Exception {
	public ClienteJaCadastradoException() {
		super("CPF já cadastrado");
	}

}
