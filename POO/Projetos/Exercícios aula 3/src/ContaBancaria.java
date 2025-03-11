public class ContaBancaria {
    private String cliente;
    private double saldo;
    
    //Construtor:
    public ContaBancaria(String cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void deposita(double valor){
        saldo += valor;
    }
    
    public boolean saca(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "Operação:" + "\n\tCliente: " + cliente + "\n\tSaldo: " + saldo;
    }
}
