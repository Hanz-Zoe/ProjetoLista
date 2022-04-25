

import java.util.Scanner;
public class Main {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        StudentList studentList = new StudentList();
        String response = null;
        int rgmSearched = 0;
        int menu;
        
        do {
        
	        System.out.println("O que voce quer fazer?\n");
	        System.out.println("1. Inserir um Aluno na lista\n ");
	        System.out.println("2. search por um Aluno na lista\n ");
	        System.out.println("3. Mostrar Aluno: ");
	        System.out.println("4.Excluir um Aluno da lista\n");
	        System.out.println("5. Sair ");
	        System.out.println();
	        System.out.println("Escolha: ");
	        menu = input.nextInt();
	        
        
	        switch(menu) {
	    	case 1:  // Incluir aluno 
	    		
	    		System.out.println("Quantos alunos deseja inserir ? ");
	    		int studentsQuant = input.nextInt(); // Quantidade de Alunos
	    		
	    		for(int i = 0; i < studentsQuant ; i++) {
	                Student aluno = new Student();
	
	                System.out.println("\nDigite seu RGM: ");
	                aluno.rgm = input.nextInt();
	                do {
	                    Subject disciplina = new Subject();
	                    System.out.println("Digite o nome da disciplina: ");
	                    disciplina.setName(input.next());
	
	                    System.out.println("Digite a nota da disciplina: ");
	                    disciplina.setGrades(input.nextDouble());
	
	                    aluno.subjects.insertEnd(disciplina);
	
	                    input.nextLine();
	                    System.out.println("Você quer adicionar outra disciplina? (s/n) ");
	                 response = input.nextLine();
	                }while( response.equals("n")){
						studentList.insertStudent(i, aluno);
					}

	    		}
	            
	           
	    		break;
	    	
	    	case 2: // search - Busca pelo RGM
	    		
	    		System.out.println("Digite o RGM do aluno: ");
	            rgmSearched = input.nextInt();
	            Student alunoprocurado = null;
	            for(int i = 0; i<studentList.listSize; i++) {
	                if(rgmSearched == studentList.search(i).rgm) {
	                    alunoprocurado = studentList.search(i);
	                }
	            }
	            if(alunoprocurado != null) {
	                System.out.println("Encontrou o aluno: " + alunoprocurado.rgm);
	                System.out.println("Disciplinas: " );
	                alunoprocurado.subjects.DisplayList();
	            }
	            else {
	                System.out.println("Esse RGM não existe");
	            }

	    		break;
	    	
	    	case 3: // Mostrar lista de alunos 
	    		
	    		 if(!studentList.ListVoid()) {
	                 studentList.viewList();
	             }
	             else {
	                 System.out.println("está vazio :(");
	             }
	    		break;
	    		
	    	case 4:  // Remove aluno pelo RGM
	    		
	    		System.out.println("Digite o RGM do aluno que você quer remover: ");
	            rgmSearched = input.nextInt();
	            int position = 0;
	            boolean find = false;
	            for(int i = 0; i<studentList.listSize;i++) {
	                if(rgmSearched == studentList.search(i).rgm) {
	                    find = true;
	                    position = i;
	                }
	            }
	            if(find == true) {
	                studentList.remove(position); 
	            }
	            else {
	                System.out.println("RGM incorreto");
	            }
	    		break;
	    		
	    	default:
	    		if(menu == 5) {
	    			System.out.println("Programa finalizado!");
	    		} else {
	    			System.out.println();
	    			System.out.println("Número invalido");
	    		}
	        }
	        
    } while (menu != 5);

        input.close();
    }
}