package test;
import java.util.*;
public class principal {

	public static void main(String[] args) {
		Scanner ingreso= new Scanner(System.in);
		String colorAsiento= ingreso.next();
		int serialAsiento= ingreso.nextInt();
		int precioAsiento= ingreso.nextInt();
		int serialMotor= ingreso.nextInt();
		String clase= ingreso.next();
		int cilindraje= ingreso.nextInt();
		int numAsientos= ingreso.nextInt();
		asiento a= new asiento();
		motor b= new motor();
		auto c= new auto();
		// utilizando clase asiento.
		if((colorAsiento=="azul") || (colorAsiento== "rojo") || (colorAsiento=="verde")||(colorAsiento=="negro") ||(colorAsiento=="blanco") ) {
			a.cambiarColor(colorAsiento);
		}
		else {
			a.cambiarColor(null);
		}
		a.consecutivo(serialAsiento);
		a.valorAsiento(precioAsiento);
		// utilizando clase motor.
		b.cambiarRegistro(serialMotor);
		if(clase=="electrico" || clase=="gasolina") {
			b.asignarTipo(clase);
		}
		else {
			b.asignarTipo(null);
		}
		b.cantCilindros(cilindraje);
		
		

	}

}
