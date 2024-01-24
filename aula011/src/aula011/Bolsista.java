package aula011;
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(getNome() + "eh bolsista, pagamento facilitado!!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
