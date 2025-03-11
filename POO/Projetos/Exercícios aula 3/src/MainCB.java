public class MainCB {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria("Fulano", 5000);
        
        
        System.out.println(cb1.getSaldo());
        cb1.deposita(500);
        System.out.println(cb1.getSaldo());
    
        System.out.println((cb1.saca(1000)?"Sucesso\nSacado: " + 1000:"Saldo insuficiente") + "\nSaldo após operação: " + cb1.getSaldo());
    }
}
