package eserciziBitCamp;

import java.util.Scanner;

public class libreriaFinish {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);


		int indexLibri = 0;
		int indexRecensione=0;
		int contStelle5=0;
		int contStelle4=0;
		int contStelle3=0;
		int contStelle2=0;
		int contStelle1=0;

		String stelle1 = "\u2605";
		String stelle2 = "\u2605\u2605";
		String stelle3 = "\u2605\u2605\u2605";
		String stelle4 = "\u2605\u2605\u2605\u2605";
		String stelle5 = "\u2605\u2605\u2605\u2605\u2605";


		String[][] libri = new String[100][8];
		String[] recensione = new String[100];

		recensione[0] = stelle5;
		recensione[1] = "Capolavoro assoluto! Assolutamente da leggere! |";
		recensione[2] = "Pippo";
		recensione[3] = stelle4; 
		recensione[4] = "Fantasy epico che ti cattura fin dalla prima pagina! |";
		recensione[5] = "Ciccio";
		recensione[6] = stelle4; 
		recensione[7] = "Avvincente!! Consiglio spassionatamente |";
		recensione[8] = "Vincenzo";


		libri[0][0] = "Il signore degli anelli";
		libri[0][1] = "J.R.R. Tolkien";
		libri[0][2] = "Fantasy";
		libri[0][3] = "1954";
		libri[0][4] = "10";
		libri[0][5] = "5"; 
		libri[0][6] = recensione[0] + " - " + recensione[1] + " - " + recensione[2] + ".";
		libri[0][7]= "5";//valore che indica il numero di stelle

		libri[1][0] = "Harry Potter e i doni della morte";
		libri[1][1] = "J.K. Rowling";
		libri[1][2] = "Fantasy";
		libri[1][3] = "2007";
		libri[1][4] = "5";
		libri[1][5] = "4";
		libri[1][6] =  recensione[3] + " - " + recensione[4] + " - " + recensione[5] + ".";
		libri[1][7]=  "4";//valore che indica il numero di stelle

		libri[2][0] = "Codice da Vinci";
		libri[2][1] = "Dan Brown";
		libri[2][2] = "Thriller";
		libri[2][3] = "2003";
		libri[2][4] = "10";
		libri[2][5] = "4";
		libri[2][6] = recensione[6] + " - " + recensione[7] + " - " + recensione[8] + ".";
		libri[2][7]= "4";//valore che indica il numero di stelle

		//ottengo la posizione successive dove inserire il nuovo libro all'interno dell'array bidimensionale
		for(int i=0;i<libri.length;i++) {
			if(libri[i][0]!=null) {
				indexLibri++;
			}
		}


		for(int i=0;i<recensione.length;i++) {
			if(recensione[i]!=null) {
				indexRecensione++;
			}
		}

		for(int i=0;i<libri.length;i++) {
			if(libri[i][0]!=null) {
				if(libri[i][7].equals("5")) {
					contStelle5++;
				}
				if(libri[i][7].equals("4")) {
					contStelle4++;
				}
				if(libri[i][7].equals("3")) {
					contStelle3++;
				}
				if(libri[i][7].equals("2")) {
					contStelle2++;
				}
				if(libri[i][7].equals("1")) {
					contStelle1++;
				}
			}
		}
	
		int scelta;
		do {
			System.out.println("BENVENUTI NELLA LIBRERIA DI BITCAMP!");
			System.out.println();

			//stampa il menu delle opzioni disponibili
			System.out.println("|--------------------|");
			System.out.println("|Seleziona operazione|");
			System.out.println("|--------------------|");


			System.out.println("1. Visualizza l'elenco completo dei libri disponibili");
			System.out.println("2. Aggiungere un nuovo libro all'inventario");
			System.out.println("3. Cerca un libro per titolo o autore");
			System.out.println("4. Visualizza i dettagli completi di un libro");
			System.out.println("5. Aggiungi recensione di un libro");
			System.out.println("6. Esci");
			//prendiamo la scelta dell'utente
			System.out.println();

			System.out.print("|   Scegli   | ----> ");

			scelta = input.nextInt();


			//switch delle scelte
			switch (scelta) {
			//visualizzazione dei libri disponibili
			case 1:
				for(int i=0; i<libri.length;i++) {
					if(libri[i][0]!= null) {
						System.out.print("Titolo:" + libri[i][0] + " --> ");
						System.out.println("Autore: " + libri[i][1]);
						System.out.println();
					}
				}
				break;
			case 2:
				String risp = "si";
				while(risp.equalsIgnoreCase("si")) {
				Scanner in=new Scanner(System.in);


				System.out.println("Inserisci titolo: ");
				String titoloAggiuntivo = in.nextLine();

				System.out.println("Inserisci Autore: ");
				String autoreAggiuntivo = in.nextLine();

				System.out.println("Inserisci genere:");
				String genereAggiuntivo = in.nextLine();

				System.out.println("Inserisci anno pubblicazione:");
				String annoAggiuntivo = in.nextLine();
				

				libri[indexLibri][0] = titoloAggiuntivo;
				libri[indexLibri][1] = autoreAggiuntivo;
				libri[indexLibri][2] = genereAggiuntivo;
				libri[indexLibri][3] = annoAggiuntivo;
				libri[indexLibri][4] = "1";
				libri[indexLibri][5] = "";
				libri[indexLibri][6] = "";
				libri[indexLibri][7] = "";
				

				System.out.println("Il libro è stato aggiunto con successo.");
				
				//stampa in console di tutti i libri più quelli aggiuntivi
				for(int i=0; i<libri.length;i++) {
					if(libri[i][0]!= null) {
						System.out.println("Titolo:" + libri[i][0]);
						System.out.println("Autore: " + libri[i][1]);
						System.out.println("Genere: " + libri[i][2]);
						System.out.println("Anno: " + libri[i][3]);
						System.out.println();
					}
				}
				System.out.println("Vuoi aggiungere un'altro libro ? digita (si o no) ");
				risp=input.next();
				}
				indexLibri++;

				break;
			case 3:
				risp = "si";
				while(risp.equalsIgnoreCase("si")) {
				Scanner input2 = new Scanner (System.in);
				System.out.println("Inserisci titolo o autore:");
				String titoloAutore = input2.nextLine();

				boolean find=false;

				for(int i=0;i<libri.length;i++) {
					if(libri[i][0]!=null) {
						if(libri[i][0].contains(titoloAutore) || libri[i][1].contains(titoloAutore)) {
							find=true;
							System.out.println("Titolo:" + libri[i][0]);
							System.out.println("Autore: " + libri[i][1]);
							break;
						}
					}
				}
				if(find) {
					System.out.println("Il libro è stato trovato");
				}
				else {
					System.out.println("Libro non trovato");
				}
				System.out.println("Vuoi vedere un'altro libro ? digita (si o no) ");
				risp=input.next();
				}
				break;
			case 4:
			    // Visualizzare dettagli COMPLETI di un libro 
			    risp = "si";
			    while (risp.equalsIgnoreCase("si")) {
			        for (int i = 0; i < libri.length; i++) {
			            if (libri[i][0] != null) {
			                System.out.println((i + 1) + ") " + libri[i][0]);
			            }
			        }
			        System.out.println("Quale libro vuoi vedere?");
			        int index = input.nextInt() - 1;

			        while (index < 0 || index >= indexLibri) {
			            System.out.println("Indice non valido");
			            System.out.println("Inserisci uno dei seguenti indici che vedi nella schermata: ");
			            index = input.nextInt() - 1;
			        }

			        if (libri[index][0] != null) {
			            System.out.println("");
			            System.out.println("Titolo: " + libri[index][0]);
			            System.out.println("Autore: " + libri[index][1]);
			            System.out.println("Genere: " + libri[index][2]);
			            System.out.println("Anno: " + libri[index][3]);
			            System.out.println("Copie: " + libri[index][4]);
			            //System.out.println("Recensione " + libri[index][6]);
			            //System.out.println("valore stelline" + libri[index][7]);
			        }

			        // Stampa in ordine descrescente delle recensioni del singolo libro
			        if (libri[index][0] != null) {
			            String[] rec = libri[index][6].split("\\.");
			            String[] nSt = libri[index][7].split("-");
			            //System.out.println(rec[0]);
			            //System.out.println(rec[1]);
			            int minLength = Math.min(rec.length, nSt.length);

			            for (int i = 0; i < minLength; i++) {
			                if (nSt[i].equals("5")) {
			                    System.out.println(rec[i]);
			                    contStelle5++;
			                }
			            }

			            for (int i = 0; i < minLength; i++) {
			                if (nSt[i].equals("4")) {
			                    System.out.println(rec[i]);
			                    contStelle4++;
			                }
			            }

			            for (int i = 0; i < minLength; i++) {
			                if (nSt[i].equals("3")) {
			                    System.out.println(rec[i]);
			                    contStelle3++;
			                }
			            }

			            for (int i = 0; i < minLength; i++) {
			                if (nSt[i].equals("2")) {
			                    System.out.println(rec[i]);
			                    contStelle2++;
			                }
			            }

			            for (int i = 0; i < minLength; i++) {
			                if (nSt[i].equals("1")) {
			                    System.out.println(rec[i]);
			                    contStelle1++;
			                }
			            }

			            // Calcolo della media delle recensioni
			            double mediaVoti = 0;
			            double numRecensioni = 0;

			            for (int j = 0; j < minLength; j++) {
			                if (nSt[j].length() > 0) {
			                    mediaVoti += Integer.parseInt(nSt[j]);
			                    numRecensioni++;
			                }
			            }

			            if (numRecensioni > 0) {
			                mediaVoti /= numRecensioni;
			                System.out.println("Media Recensioni: " + mediaVoti);
			            }
			        }

			        System.out.println("Vuoi vedere un altro libro? digita (si o no) ");
			        risp = input.next();
			    }
			    break;

			case 5:
			    // Aggiunta di una recensione
			    String risposta = "si";
			    while (risposta.equalsIgnoreCase("si")) {
			        for (int i = 0; i < libri.length; i++) {
			            if (libri[i][0] != null) {
			                System.out.println((i + 1) + ") " + libri[i][0]);
			            }
			        }
			        System.out.println("A quale libro vuoi aggiungere una recensione?");
			        int index = input.nextInt() - 1;
			        // Controllo dell'indice se è valido altrimenti ricompare la schermata degli indici da selezionare
			        while (index < 0 || index >= indexLibri) {
			            System.out.println("Indice non valido");
			            System.out.println("Inserisci uno dei seguenti indici che vedi nella schermata: ");
			            index = input.nextInt() - 1;
			        }
			        input.nextLine();

			        System.out.println("Inserisci recensione: ");
			        String nuovaRecensione = input.nextLine();

			        System.out.println("Inserisci il tuo nome: ");
			        String nomeRecensore = input.nextLine();

			        System.out.println("Inserisci il numero di stelle (1-5): ");
			        int numeroStelle = input.nextInt();
			        input.nextLine();
			        // Controllo del numero stelle
			        String stelle = "";
			        switch (numeroStelle) {
			            case 1:
			                stelle = stelle1;
			                contStelle1++;
			                break;
			            case 2:
			                stelle = stelle2;
			                contStelle2++;
			                break;
			            case 3:
			                stelle = stelle3;
			                contStelle3++;
			                break;
			            case 4:
			                stelle = stelle4;
			                contStelle4++;
			                break;
			            case 5:
			                stelle = stelle5;
			                contStelle5++;
			                break;
			            default:
			                System.out.println("Numero di stelle non valido.");
			                continue; // Se il numero di stelle è invalido, ripeti il ciclo
			        }

			        // Inizializza i campi se sono nulli
			        if (libri[index][6] == null) libri[index][6] = "";
			        if (libri[index][7] == null) libri[index][7] = "";

			        // Aggiungi una recensione e un numero di stelle corrispondente
			        libri[index][6] += stelle + " - " + nuovaRecensione + " - " + nomeRecensore + ".";
			        libri[index][7] += numeroStelle + "-";
			        System.out.println("Recensione aggiunta con successo.");
			        
			        System.out.println("Vuoi aggiungere un'altra recensione? digita (si o no) ");
			        risposta = input.next();
			    }
			    break;


			case 6:
				System.out.println("Grazie per aver usato il nostro programma! Arrivederci!!");
				break;
			default:
				System.out.println("La tua scelta è errata, riprova.");
			}

		}while(scelta !=6);

	}

}
