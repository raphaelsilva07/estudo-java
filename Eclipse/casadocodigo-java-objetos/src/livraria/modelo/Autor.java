package livraria.modelo;

public class Autor {

	private String nome;
	private String email;
	private String cpf;

	// mostrando detalhes do Autor
	public void mostrarDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}

	// ----------------------------------------------
	// getters e setters
	// ----------------------------------------------
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
