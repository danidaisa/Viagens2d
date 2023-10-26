public class Main {
    public static void main(String[] args) {
       Turista mochileiro = new Turista();
       mochileiro.setNome("Roberto");

       Turista novoTurista = new Turista("Maria");
       novoTurista.setNome ("Josenaldo");
       if(Util. ValidaçãoCPF("123")) {
           novoTurista.setCPF("788");
       }else{
           system.out.println("Cpf invalido!");
        }

    }
}