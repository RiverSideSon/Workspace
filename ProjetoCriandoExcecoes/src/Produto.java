
public class Produto {
	private int Id;
	private String Nome;
	private Double Preco;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		if (id <= 0) {
			throw new RuntimeException("ID nao pode ser negativo");
		}
		Id = id;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		if (nome == null && nome.length() == 0) {
			throw new RuntimeException("Nome precisa ter um valor");
		}
		Nome = nome;
	}
	
	public Double getPreco() {
		return Preco;
	}
	
	public void setPreco(Double preco) {
		if (preco < 0) {
			throw new RuntimeException("Preco nao pode ser negativo");
		}
		Preco = preco;
	}
}
