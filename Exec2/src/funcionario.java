
public class funcionario {
	public String name;
	public double GrossSalary;
	public double tax;
	
	public double NetSalary() {
		return GrossSalary - tax;
		
	}
	public void IncreaseSalary(double percentage) {
		GrossSalary += (GrossSalary*percentage)/100;
	}
	
	public String toString() {
		return name +", $ "
				+ String.format("%.2f",NetSalary());
	}

}
