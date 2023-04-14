
import java.util.Scanner;
	public class Riva
	{
		static Scanner in = new Scanner(System.in);
		public static void main(String[] args)
		{
			while(true)
			{
				stampaMenu();
				int scelta = Integer.parseInt(in.nextLine());
				switch(scelta)
				{
					case 1:
						stampaPari();
					break;
					case 2:
						minimoDiArray();
					break;
					case 3:
						paroleMisteriose();
					break;
					default:
						System.out.println("Scelta errata, riprova!");

				}
			}
		}
		static void stampaMenu()
		{
			System.out.println("1 - Stampa pari");
			System.out.println("2 - Minimo di array");
			System.out.println("3 - Parole misteriose");
			System.out.println("4 - Es n. * - Titolo es. *");
			System.out.println("5 - Es n. * - Titolo es. *");
		}
		
		public static void stampaPari ()
		{
			int [] array = new int [20];
			for (int i=0; i<array.length; i++)
			{
				array[i] = (int) ((Math.random()*100)+1);
			}
			for (int i=0; i<array.length; i++)
			{
				for (int j=0; j<array.length; j++)
				{
					if (array[i] < array[j])
					{
						swap (array, i, j);
					}
				}
			}
			int somma = 0;
			System.out.println("L'array stampato ordinatamente con solo i numeri pari �: ");
			for (int m=0; m<array.length; m++)
			{
				if (array[m]%2==0)
				{
					somma += array[m];
				}
				System.out.println(somma);//Colucci: perchè stampi una somma, dove ti viene richiesto? 
			}
		}
		public static void swap (int [] arrayTemporaneo, int a, int b)
		{
			int temp = arrayTemporaneo[a];
			arrayTemporaneo[a] = arrayTemporaneo[b];
			arrayTemporaneo[b] = temp;
		}// Colucci: un pò confuso ma vicino alla soluzione
		
		public static void minimoDiArray()
		{
			int [] array = new int [10];
			for (int i=0; i<array.length; i++)
			{
				array[i] = (int) ((Math.random()*11)-5);
			}
			
			System.out.println("L'array �: ");
			for (int i=0; i<array.length; i++)
			{
				System.out.print(array[i] + " ");
			}
			
			for (int i=0; i<array.length; i++)
			{
				for (int j=0; j<array.length; j++)
				{
					if (array[i] < array[j])
					{
						swap (array, i, j);
					}
				}
			}
			System.out.println("L'array stampato ordinatamente con solo i numeri pari �: ");
			for (int i=0; i<array.length; i++)
			{
				System.out.println(array[i]);
			}
		}//Colucci: hai completamente confuso gli esercizi, in questo non dovevi ordinare gli elementi ma individuare il minore e la sua prima occorrenza
			
			/*
			System.out.println("L'array �: ");
			for (int i=0; i<array.length; i++)
			{
				System.out.println(array[i]);
			}
			
			System.out.println("Il valore minimo dell'array �: ");
			for (int i=0; i<1; i++)
			{
				System.out.println(array[0]);
			}
		*/	
			
			//for (int i=0; i<array.length; i++)
			//{
				//int posizione=0;
				//System.out.println("L'array casuale �: " + array[0]);
				// + " e il suo indice �: " + posizione++
				//posizione++;
			//}
		
		
		public static void paroleMisteriose()
		{
			String [] paroleDaIndovinare = new String [] {"oratorio", "estate", "isola", "mare", "montagna"};
			String parolaInserita = in.nextLine();
			for (int i=0; i<paroleDaIndovinare.length; i++)
			{
				System.out.println("Prova ad indovinare una delle 5 parole");
				parolaInserita = in.nextLine();
				for (int j=0; j<3; j++)
				{
					if (parolaInserita == paroleDaIndovinare[i])
					{
						System.out.println("Ne hai indovinata una!");
					}
					else
					{
						System.out.println("Non hai pi� tentativi!");
					}
				}
			}
		}
	}//Colucci: nei tre tentativi dovevi considerare l'ipotesi della parola sbagliata e riprovare!


