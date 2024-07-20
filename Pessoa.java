/**
 * Definir o que é uma Pessoa
 */

class Pessoa {
    String nome;
    String sexo;

    Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    //Receber nome e sexo, atribuir aos respetivos objetos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}