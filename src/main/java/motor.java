package test;
public class motor {
	int numeroCilindros;
	String tipo;
	int registro;
	public void cambiarRegistro(int registro) {
		this.registro= registro;
		
	}
	public void  asignarTipo(String tipo) {
		this.tipo = tipo;
		
	}
	public void cantCilindros(int numeroCilindros) {
		this.numeroCilindros = numeroCilindros;
	}
	
}
