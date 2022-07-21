package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        Cliente nathi = new Cliente();
        nathi.setNome("Nathi");

        IConta cc = new ContaCorrente(nathi);
        IConta poupanca = new ContaPoupanca(nathi);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
