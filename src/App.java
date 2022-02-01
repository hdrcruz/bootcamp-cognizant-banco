public class App {
    public static void main(String[] args) throws Exception {
        Cliente helder = new Cliente();
		helder.setNome("Helder Cruz");
		
		Conta cc = new ContaCorrente(helder);
		Conta poupanca = new ContaPoupanca(helder);

		cc.depositar(3000);
		cc.transferir(650, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
