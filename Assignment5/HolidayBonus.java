package Assignment5;

public class HolidayBonus {
	HolidayBonus() {

	}


	public static double[] calculateHolidayBonus(double[][] data,
			double high,
			double low,
			double other) {
		double[] holidayBonusArr = new double[data.length];



		for(int i=0;i<data.length; i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.println(i + " "+ j + "000");
				double highestSale = TwoDimRaggedArrayUtility.getHighestInColumn(data,j);
				System.out.println(i + " "+ j + "111");
				double lowestSale=TwoDimRaggedArrayUtility.getLowestInColumn(data,j);
				System.out.println(i + " "+ j + "222");
				if(data[i][j] == highestSale ||highestSale == lowestSale) {
					holidayBonusArr[i] = holidayBonusArr[i]+high;
					System.out.println(holidayBonusArr[i]);
				}
				else if(data[i][j] == lowestSale) {
					holidayBonusArr[i] = holidayBonusArr[i]+low;
					System.out.println(holidayBonusArr[i]);
				}
				else {
					holidayBonusArr[i] = holidayBonusArr[i]+other;
					System.out.println(holidayBonusArr[i]);

				}
				System.out.println(i + " "+ j);
			}
		}
		System.out.println("111");
		return holidayBonusArr;
	}





	public static double calculateTotalHolidayBonus(double[][] data,
			double high,
			double low,
			double other) {
		double total = 0;
		//double[][] holidayBonusArr = new double[data.length][];

		/*double[] holidayBonusArr = new double[data.length];



		for(int i=0;i<data.length; i++) {
			for(int j=0;j<data[i].length;j++) {
				double highestSale = TwoDimRaggedArrayUtility.getHighestInColumn(data,j);
				double lowestSale=TwoDimRaggedArrayUtility.getLowestInColumn(data,j);

					if(data[i][j] == highestSale) {
						holidayBonusArr[i] = holidayBonusArr[i]+high;
					}
					else if(data[i][j] == lowestSale) {
						holidayBonusArr[i] = holidayBonusArr[i]+low;
					}
					else {
						holidayBonusArr[i] = holidayBonusArr[i]+other;

					}
					total += holidayBonusArr[i];
				}
			}*/
		double bonus [] =HolidayBonus.calculateHolidayBonus(data, high, low, other);



		for (int i=0;i<bonus.length;i++)

			total +=bonus[i];



		return total;
	}

}
