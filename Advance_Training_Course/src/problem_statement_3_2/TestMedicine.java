package problem_statement_3_2;


public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedicineInfo[] A = new MedicineInfo[10];

		for (int iLoop = 0; iLoop < 10; iLoop++)

		{

			switch (iLoop % 3)

			{

			case 0: {
				A[iLoop] = new Tablet();
				break;
			}

			case 1: {
				A[iLoop] = new Ointment();
				break;
			}

			case 2: {
				A[iLoop] = new Syrup();
				break;
			}

			}

		}

		for (int iLoop = 0; iLoop < 10; iLoop++)

		{

			System.out.println("------------------------------------");

			System.out.println(" object # " + (iLoop + 1));

			A[iLoop].displayLabel();

			

		}

	}
}
