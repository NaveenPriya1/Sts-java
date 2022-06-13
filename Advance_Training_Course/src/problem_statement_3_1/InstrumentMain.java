package problem_statement_3_1;

public class InstrumentMain {

	public static void main(String[] args) {
		
		Instrument A[] = new Instrument[12];



		for (int iLoop=0; iLoop<12; iLoop++)

		{

		switch (iLoop%3)

		{

		case 0: { A[iLoop] = new Piano(); break; }

		case 1: { A[iLoop] = new Flute(); break; }

		case 2: { A[iLoop] = new Guitar(); break; }

		}

		}



		for (int iLoop=0; iLoop<12; iLoop++)

		{

		System.out.println("------------------------------------");

		System.out.println(" object # " + (iLoop+1));

		A[iLoop].play();

		if (A[iLoop] instanceof Piano) { System.out.println("Piano"); }

		if (A[iLoop] instanceof Flute) { System.out.println("Flute"); }

		if (A[iLoop] instanceof Guitar) { System.out.println("Guitar"); }



		}



	}}