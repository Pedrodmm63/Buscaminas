package partida;

public class Mina {

	private boolean hayMina;
	
	
	public Mina() {
		hayMina = false;
	}
	
	public void setHayMina(boolean siHay) {
		hayMina = siHay; 
	}
	
	public boolean getHaymina() {
		return hayMina;
	}
	public String toString() {
		if(hayMina) return "x";
		else 
			 return "-";
		}
	
}
