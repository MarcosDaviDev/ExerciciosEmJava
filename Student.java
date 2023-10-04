package entities;

public class Student {
	
	public String name;
	public double primeiroTrimestre, segundoTrimestre, terceiroTrimestre;
	
	public double finalGrade(){
		return  primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
	}
	
	public double missingPoints(){
		 if(finalGrade() <= 60){
			 return 60.0 - finalGrade();
		 } else {
			 return 0.0;
		 }
	}
	
}
