public class Turista {
  public String nome;
  public String cpf;
  // construtor padrão
    Turista(){

    }
    //Sobrecarga do construtor
  Turista(String nome){
      this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
