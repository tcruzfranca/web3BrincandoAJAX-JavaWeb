package web3;

public class MinhaThread implements Runnable {

	private String texto;
	private Boolean flag = false;
	private String novoTexto;
	
	
	public String getTexto() {
		this.flag = false;
		return this.novoTexto;
	}
	
	public boolean getFlag() {
		
		return flag;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void testando() {
		Long t = new Long(5000);
		
		try{
			Thread.sleep(t);
			this.flag = true;
			this.novoTexto = this.texto;
		}catch (Exception e){
			//e.printStackTrace("erro");
		}
	}
	
	@Override
	public void run() {
		testando();
	}

}
