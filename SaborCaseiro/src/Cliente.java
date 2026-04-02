public class Cliente {
    String nome;
    String primeironome;
    String nomemaiusculo;
    int mesa;

    Cliente(String nome, int mesa){
        this.nome = nome;
        this.mesa = mesa;
    }
    
    void getPrimeiroNome(){
        primeironome = this.nome.split(" ")[0];
    }

    void getNomeMaiusculo(){
        nomemaiusculo = this.nome.toUpperCase();
    }
}
