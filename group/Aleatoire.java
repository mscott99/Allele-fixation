package group;

import java.util.Random;

public class Aleatoire {
 static int totalAmount=0;
 static int numAlleles=10;
	 static void fixate(int limit){
	totalAmount++;
		Random random  =new Random();
	 int number = 0;
	 int count = 0;
	 for(int x =0;x<numAlleles;x++){
		 number=random.nextInt(10);
		 
		 if(number<limit){
			  count ++;
		 }
	Expose.field.append(Integer.toString(number));
	
	 }
	 Expose.field.append(""+'\n');
	
	 Expose.field.append("the new limit is "+count+'\n');
	 if(count == numAlleles ){
		 
		 Expose.field.append("the allele is fixated, all alleles are on the lower side"+'\n');
		 
	 }
	 else if(count == 0){
		 
		 Expose.field.append("the allele is fixated, all alleles are on the upper side"+'\n');
		 
	 }
	 else{
		fixate(count);
		 
	 }
 }
	
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			Expose window = new Expose();
			window.setVisible(true);
			
		
		

	}
}
