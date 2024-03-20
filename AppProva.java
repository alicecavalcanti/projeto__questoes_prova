package BancoQuestoesME2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AppProva {
		static Scanner input = new Scanner(System.in);

		static QuestaoMultiplaEscolha questaoME     = null;
		static QuestaoVerdadeiroFalso questaoVF     = null;
	    static QuestaoRespostaProporcional questaoRP = null;

		public static void main(String[] args) {
			
			int opcao = 0;
			do {
				System.out.println("\n*** Seletor de Opcoes ***\n");
				System.out.println("1 1- Criar questao de multipla escolha");
				System.out.println("2 - Criar questao de verdadeiro ou falso");
				System.out.println("3 - Criar questao de resposta proporcional");
				System.out.println("4 - Responder a questao de multipla escolha");
				System.out.println("5 - Responder a questao de verdadeiro ou falso");
				System.out.println("6 - Responder a questao de resposta proporcional");			
				System.out.println("0 - Finalizar");
				System.out.print("\nOpcao: ");
				opcao = input.nextInt();
				switch (opcao) {
				case 1: 
					criarQuestaoME();
					break;
				case 2: 
					criarQuestaoVF();
					break;
				case 3: 
					criarQuestaoRP();
					break;
				case 4: 
					responderQuestaoME();
					break;
				case 5: 
					responderQuestaoVF();
					break;
				case 6: 
					responderQuestaoRP();
					break;
				case 0: 
					break;
				default:
					System.out.println("Opcaoo invalida");
				}
				if (opcao == 0) {
					break;
				}
			} while (true);
			System.out.println("Programa finalizado");
			input.close();
		}
		
		public static void criarQuestaoME() {
			if(questaoME != null) {
				System.out.println("A questao de multipla escolha ja foi criada");
			}
			else {
				
				input.nextLine();
				System.out.print("Digite o texto do enunciado:  ");
				String enunciado = input.nextLine();
				
				System.out.print("Digite o texto da opcao A da questao:  ");
				String opcaoA = input.nextLine();
				
				System.out.print("Digite o texto da opcao B da questao:  ");
				String opcaoB = input.nextLine();
				
				System.out.print("Digite o texto da opcao C da questao:  ");
				String opcaoC = input.nextLine();
				
				char opcaoCorreta = ' ';
				
				double notaPadrao = 0;
				
				do{
					try {
						
						System.out.print("Digite qual opcao sera correta:  ");
						opcaoCorreta = Character.toUpperCase(input.next().charAt(0)); 
					
						if(opcaoCorreta != 'A' && opcaoCorreta != 'B' && opcaoCorreta != 'C') {
							throw new NonExistentCorrectAnswer("A letra da resposta indicada como correta não existe!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}
			
					break;
				}while(true);
				
				do {
					try {
						input.nextLine();
						System.out.print("Digite a nota que essa questao vale:  ");
						notaPadrao = input.nextDouble();
					}catch(InputMismatchException novo) {
						System.out.print("A nota precisa ser um numero\n\n");	
						continue;
					}
					break;
				}while(true);
				
				
				
				questaoME = new QuestaoMultiplaEscolha(enunciado,opcaoA,opcaoB,opcaoC,notaPadrao,opcaoCorreta);
				System.out.print(questaoME.toString());
				
			}
			
		}
		/*
		 Criticar se a questão já foi criada. Se sim, informar e retornar ao menu.
		 Receber o texto do enunciado
		 Receber os textos das 3 opções
		 Receber a letra da opção correta
		 Receber a nota padrão. Tratar as exceções possíveis
		 Instancia o objeto QuestaoME. Tratar a exceção criada.
		 Se o objeto foi instanciado, mostrar os dados da questão, conforme modelo do enunciado.
		*/
		
		public static void criarQuestaoVF() {
			if (questaoVF != null) {
				System.out.print("A questao já foi criada");
			}else {
				input.nextLine();
				System.out.print("Digite o texto do enunciado:  ");
				String enunciado = input.nextLine();
				
				System.out.print("Digite o texto da opcao A da questao:  ");
				String opcaoA = input.nextLine();
				
				System.out.print("Digite o texto da opcao B da questao:  ");
				String opcaoB = input.nextLine();
				
				System.out.print("Digite o texto da opcao C da questao:  ");
				String opcaoC = input.nextLine();
				
				char respostaCorretaA = ' ';
				
				char respostaCorretaB = ' ';
				
				char respostaCorretaC = ' ';
				
				double notaPadrao = 0;
				
				do{
					try {
						
						System.out.print("Digite se a alternativa A e V ou F :  ");
						respostaCorretaA = Character.toUpperCase(input.next().charAt(0)); 
					
						if(respostaCorretaA != 'F' && respostaCorretaA != 'V') {
							throw new NonExistentCorrectAnswer("A letra da resposta indicada como correta não existe!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}
			
					break;
				}while(true);
				do{
					try {
						
						System.out.print("Digite se a alternativa B e V ou F :  ");
						respostaCorretaB = Character.toUpperCase(input.next().charAt(0)); 
					
						if(respostaCorretaB != 'F' && respostaCorretaB != 'V') {
							throw new NonExistentCorrectAnswer("A letra da resposta indicada como correta não existe!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}
			
					break;
				}while(true);
				do{
					try {
						
						System.out.print("Digite se a alternativa C e V ou F :  ");
						respostaCorretaC = Character.toUpperCase(input.next().charAt(0)); 
					
						if(respostaCorretaC != 'F' && respostaCorretaC != 'V') {
							throw new NonExistentCorrectAnswer("A letra da resposta indicada como correta não existe!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}
			
					break;
				}while(true);
				
				do {
					try {
						input.nextLine();
						System.out.print("Digite a nota que essa questao vale:  ");
						notaPadrao = input.nextDouble();
					}catch(InputMismatchException novo) {
						System.out.print("A nota precisa ser um numero\n\n");	
						continue;
					}
					break;
				}while(true);
				
				
				
				questaoVF = new QuestaoVerdadeiroFalso(enunciado, opcaoA,  opcaoB, 
				opcaoC, notaPadrao, respostaCorretaA, respostaCorretaB, respostaCorretaC);
				
				System.out.print(questaoVF.toString());
				
			
			
			}
		
		}
		/*
		 Criticar se a questão já foi criada. Se sim, informar e retornar ao menu.
		 Receber o texto do enunciado
		 Receber os textos das 3 opções com a resposta correta de cada uma das opções
		 Receber a nota padrão. Tratar as exceções possíveis
		 Instancia o objeto QuestaoVF. Tratar a exceção criada.
		 Se o objeto foi instanciado, mostrar os dados da questão, conforme modelo do enunciado.
		*/

		public static void criarQuestaoRP() {
			if (questaoRP != null) {
				System.out.print("A questao já foi criada");
			}else {
				input.nextLine();
				System.out.print("\nDigite o texto do enunciado:  ");
				String enunciado = input.nextLine();
				
				System.out.print("Digite o texto da opcao A da questao:  ");
				String opcaoA = input.nextLine();
				
				System.out.print("Digite o texto da opcao B da questao:  ");
				String opcaoB = input.nextLine();
				
				System.out.print("Digite o texto da opcao C da questao:  ");
				String opcaoC = input.nextLine();
				
				int percentualOpcaoA = ' ';
				
				int percentualOpcaoB = ' ';
				
				int percentualOpcaoC = ' ';
				
				double notaPadrao = 0;
				
				do{
					try {
						
						System.out.print("Digite o percentual da questão A: ");
						percentualOpcaoA = input.nextInt(); 
					
						if(percentualOpcaoA != 25 && percentualOpcaoA != 50 && percentualOpcaoA != 100) {
							throw new NonExistentCorrectAnswer("A porcentagem indicada não é valida. \n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}catch(InputMismatchException tipoVar) {
						input.nextLine();
						System.out.print("A porcentagem precisa ser um numero\n\n");
						continue;
					}
			
					break;
				}while(true);
				do{
					input.nextLine();
					try {
						
						System.out.print("Digite o percentual da questão B ");
						percentualOpcaoB= input.nextInt(); 
					
						if(percentualOpcaoB != 25 && percentualOpcaoB != 50 && percentualOpcaoB != 100) {
							throw new NonExistentCorrectAnswer("A porcentagem indicada não é valida.!\n\n");
						}
						if(percentualOpcaoB == percentualOpcaoA ) {
							throw new NonExistentCorrectAnswer("A porcentagem indicada não é valida.!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}catch(InputMismatchException tipoVar) {
						input.nextLine();
						System.out.print("A porcentagem precisa ser um numero\n\n");
						continue;
					}
			
					break;
				}while(true);
				do{
					try {
						
						System.out.print("Digite o percentual da questão C ");
						percentualOpcaoC = input.nextInt(); 
					
						if(percentualOpcaoC != 25 && percentualOpcaoC != 50 && percentualOpcaoC != 100
						&& percentualOpcaoC == percentualOpcaoA && percentualOpcaoC == percentualOpcaoB ) {
							throw new NonExistentCorrectAnswer("A porcentagem indicada não é valida. \n\n");
						}
						if(percentualOpcaoC == percentualOpcaoA || percentualOpcaoC == percentualOpcaoB) {
							throw new NonExistentCorrectAnswer("A porcentagem indicada não é valida.!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}catch(InputMismatchException tipoVar) {
						input.nextLine();
						System.out.print("A porcentagem precisa ser um numero\n\n");
						continue;
					}
			
					break;
				}while(true);
				
				do {
					try {
						input.nextLine();
						System.out.print("Digite a nota que essa questao vale:  ");
						notaPadrao = input.nextDouble();
					}catch(InputMismatchException novo) {
						System.out.print("A nota precisa ser um numero\n\n");	
						continue;
					}
					break;
				}while(true);
				
				
				
				questaoRP = new QuestaoRespostaProporcional(enunciado, opcaoA, opcaoB, opcaoC, 
				 notaPadrao, percentualOpcaoA, percentualOpcaoB, percentualOpcaoC) ;
				
				
				System.out.print(questaoRP.toString());
				
			
			
			}
			/*
			 Criticar se a questão já foi criada. Se sim, informar e retornar ao menu.
			 Receber o texto do enunciado
			 Receber os textos das 3 opções com o percentual de cada uma das opções
			 Receber a nota padrão. Tratar as exceções possíveis
			 Instancia o objeto QuestaoRP. Tratar a exceção criada.
			 Se o objeto foi instanciado, mostrar os dados da questão, conforme modelo do enunciado.
			*/
		}
		
		public static void responderQuestaoME() {
			if(questaoME == null) {
				System.out.println("A questao ainda não foi criada!");
			}else {
				System.out.print(questaoME.toString());
				
				char opcaoMarcada;
				do{
					try {
						
						System.out.print("Digite a alternativa que você deseja marcar: ");
						opcaoMarcada = Character.toUpperCase(input.next().charAt(0)); 
					
						if(opcaoMarcada != 'A' && opcaoMarcada != 'B' && opcaoMarcada != 'C') {
							throw new NonExistentCorrectAnswer("A letra da resposta indicada como correta não existe!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}
			
					break;
				}while(true);
				
				questaoME.marcaOpcao(opcaoMarcada);
				System.out.print("Nota da questao: "+ questaoME.calculaNotaObtida()+ " \n\n");
				
			}
			/*
			 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
			 Mostrar a questão
			 Receber apenas as letras A, B ou C correspondente a opção considera como correta
			 Marca a questão
			 Calcular e mostrar a nota obtida.
			*/
			
		}	

		public static void responderQuestaoVF() {
			if (questaoVF == null) {
				System.out.print("A questao ainda não foi criada");
			}else {
				System.out.print(questaoVF.toString());
				
				char respostaMarcadaA;
				
				char respostaMarcadaB;
				
				char respostaMarcadaC;
				do{
					try {
						
						System.out.print("Digite a resposta para a alternativa A: ");
						respostaMarcadaA = Character.toUpperCase(input.next().charAt(0)); 
					
						if(respostaMarcadaA != 'F' && respostaMarcadaA != 'V') {
							throw new NonExistentCorrectAnswer("A letra da resposta indicada como correta não existe!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}
			
					break;
				}while(true);
				
				do{
					try {
						
						System.out.print("Digite a resposta para a alternativa B: ");
						respostaMarcadaB = Character.toUpperCase(input.next().charAt(0)); 
					
						if(respostaMarcadaB != 'F' && respostaMarcadaB != 'V') {
							throw new NonExistentCorrectAnswer("A letra da resposta indicada como correta não existe!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}
			
					break;
				}while(true);
				
				do{
					try {
						
						System.out.print("Digite a resposta para a alternativa C: ");
						respostaMarcadaC = Character.toUpperCase(input.next().charAt(0)); 
					
						if(respostaMarcadaC != 'F' && respostaMarcadaC != 'V') {
							throw new NonExistentCorrectAnswer("A letra da resposta indicada como correta não existe!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}
			
					break;
				}while(true);
				
				questaoVF.marcaOpcao('A', respostaMarcadaA);
				questaoVF.marcaOpcao('B', respostaMarcadaB);
				questaoVF.marcaOpcao('C', respostaMarcadaC);
				System.out.printf("Sua nota e %.2f \n\n", questaoVF.calculaNotaObtida(), "\n\n");
				
				
				
			}
				
			/*
			 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
			 Mostrar a questão
			 Receber apenas as letras V ou F para cada opção
			 Marca a questão
			 Calcular e mostrar a nota obtida.
			*/
		}	

		public static void responderQuestaoRP() {
			if (questaoRP == null) {
				System.out.print("A questao ainda não foi criada");
			}else {
				System.out.print(questaoRP.toString());
				char opcaoMarcada= ' ';
				
				do{
					try {
						
						System.out.print("Digite a alternativa correta: ");
						opcaoMarcada = Character.toUpperCase(input.next().charAt(0));
					
						if(opcaoMarcada != 'A' &&  opcaoMarcada != 'B' && opcaoMarcada != 'C') {
							throw new NonExistentCorrectAnswer("A letra da resposta indicada como correta não existe!\n\n");
						}
						
					}catch(NonExistentCorrectAnswer ex) {
						System.out.print(ex.getMessage());
						continue;
					}
			
					break;
				}while(true);
				
				questaoRP.opcaoMarcada(opcaoMarcada);
				System.out.print("Sua nota e: " + questaoRP.calculaNotaObtida());
				
			}
			/*
			 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
			 Mostrar a questão
			 Receber apenas as letras A, B ou C correspondente a opção considera como correta
			 Marca a questão
			 Calcular e mostrar a nota 
			 obtida.
			*/
		}	
		
	}

