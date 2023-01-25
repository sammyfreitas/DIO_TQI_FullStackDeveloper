public class Main {
    public static void main(String[] args) {
       Cliente wagner = new Cliente();
       wagner.setNome("Wagner Mello");

        Conta cc = new ContaCorrente(wagner);
        Conta poupanca = new ContaPoupanca(wagner);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.depositar(250);
        cc.transferir(150, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}