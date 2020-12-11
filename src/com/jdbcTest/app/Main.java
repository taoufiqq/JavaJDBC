package com.jdbcTest.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbcTest.app.models.Person;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
    
        
        Scanner scanner = new Scanner(System.in);
        
			boolean var = true;
			while (var) {
				
				System.out.println("*********************Gestion Students*********************");
			    System.out.println("1- Ajouter Student");
		        System.out.println("2- Supprimer Student");
		        System.out.println("3- Modifier Student");
		        System.out.println("4- Afficher Student");
		        System.out.println("5- Quitter le Menu Student");
		        
		        System.out.println("Choix :");
		        
		        int choixStudent = scanner.nextInt();
		        switch (choixStudent) {
				case 1:
					 
					 System.out.println("Ajouter Student");
					 					 
					 System.out.println("Name :");
					 String name = scanner.next();					 
					 
					 System.out.println("Description :");
					 String description = scanner.next();
					
					 System.out.println("CIN :");
					 String cin = scanner.next(); 
					 
					 Person youcodeStudent = new Person();
				     youcodeStudent.addPerson(name, description, cin);
					 
					 System.out.println("Student Bien Ajouté");
					 
					  var=true;
					break;
					
				  default:
					
					break;
				}
		        
		        }
       
        
        
	}

}
