package web3;

public class TesteThread {

	public static void main(String[] args) {
		
		System.out.println("Comecando");
		MinhaThread m = new MinhaThread();
		m.setTexto("Texto na Aula");
		new Thread(m).start();
		System.out.println("Fim thread principal");
	}

}
