package projetoIP;

public class Cozinheiro extends Funcionarios {

	private double salario = 0;
	private double rendimento = 0;
	private int reclamacoes = 0;
	private boolean beneficios = true;
	
	public Cozinheiro(String aux) {
		// TODO Auto-generated constructor stub
	}
	public void rendimento (double valor) {this.rendimento += valor;}
	public void salario () {this.salario += (this.rendimento * 0.1);}
	public void reclamacoes (String reclamacao) {if (!reclamacao.equals(null)){this.reclamacoes += 1;}}
	public void beneficios () {if (this.reclamacoes >= 19) {this.beneficios = false;}}
}
