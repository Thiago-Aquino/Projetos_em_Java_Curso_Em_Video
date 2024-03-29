package projetolivro;
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Método construtor
    
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    // Método público
    
    public void fazerAniver(){
        this.idade++; // this.idade = this.idade + 1 ;
    }
    
    // Métodos abstratos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
