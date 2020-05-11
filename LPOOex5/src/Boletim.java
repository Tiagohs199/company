
public class Boletim {

	double notaNP1,notaNP2;
	
	Boletim(){
	}
	
	Boletim(double aNotaNP1,double aNotaNP2){
		if (aNotaNP1 >= 0 && aNotaNP1<=10) {
			this.notaNP1 = aNotaNP1;
		}else if(aNotaNP2 >= 0 && aNotaNP2 <=10) {
		
			this.notaNP2 = aNotaNP2;
		}else {
			System.out.println("formato de nota errado");
		}
	}
	
	public void display() {
		System.out.printf("Nota NP1: %.2f%nNota NP2: %.2f",notaNP1,notaNP2);
		
	}
	
}
