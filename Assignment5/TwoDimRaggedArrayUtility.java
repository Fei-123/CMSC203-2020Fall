package Assignment5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TwoDimRaggedArrayUtility  {

	public static double[][] readFile(java.io.File file)
			throws java.io.FileNotFoundException{
		/*double [][] arr = new double[10][10];


		BufferedReader newFile = new BufferedReader(new FileReader(file));
		try {
			String a;
			int acount = 0;
			while( (a= newFile.readLine())!=null) {
				String[] temp = a.split(" ");
				int size = temp.length;

				for(int i=0;i<size;i++) {
					arr[acount][i]=Double.parseDouble(temp[i]);
					System.out.println(arr[size][i]);
				}
				acount++;*/
		double[][] arr = null;
		try {
			String[][] strArr = new String[10][10];
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			int row = 0;
			while( (line= br.readLine())!=null) {
				String currStrArr[] = line.split(" ");

				strArr[row++] = currStrArr;
			}
			arr = new double[row][];
			for(int i=0; i<row; i++){
				int column = strArr[i].length;
				double currArr[] = new double[column];
				for(int j=0; j<column; j++){
					currArr[j] = Double.parseDouble(strArr[i][j]);
					arr[i] = currArr;
				}
				//newFile.close();
				br.close();
				fr.close();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		return arr;
	}

	public static void writeToFile(double[][] data,
			java.io.File outputFile)
					throws java.io.FileNotFoundException{
		FileWriter aFile;

		try {
			aFile = new FileWriter(outputFile);
			BufferedWriter newFile = new BufferedWriter(aFile);
			for(int i=0; i<data.length;i++) {
				String str = "";
				for(int j=0;j<data[i].length;j++) {
					newFile.write(data[i][j] + " ");

				}

				newFile.newLine();
			}
			newFile.close();
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}

	public static double getTotal(double[][] data) {
		double total = 0;
		for(int i = 0; i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				total+=data[i][j];
			}
		}
		return total;

	}


	public static double getAverage(double[][] data) {
		double total = 0;
		int count =0;
		for(int i = 0; i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				total+=data[i][j];
				count ++;
			}
		}
		return  total/count;

	}

	public static double getRowTotal(double[][] data,
			int row) {
		double total=0;
		for(int i=0;i<data[row].length;i++) {
			total+=data[row][i];
		}
		return total;
	}

	public static double getColumnTotal(double[][] data,
			int col) {
		double total =0;
		for(int i=0;i<data.length;i++) {
			if(col<data[i].length) {
				total+=data[i][col];
			}
		}
		return total;
	}


	public static double getHighestInRow(double[][] data,
			int row) {
		double highest=data[row][0];
		for(int i=0;i<data[row].length;i++) {
			if(highest<data[row][i]) {
				highest = data[row][i];
			}
		}
		return highest;

	}

	public static int getHighestInRowIndex(double[][] data,
			int row) {
		int highIndex=0;

		for(int i=0;i<data[row].length;i++) {
			if(data[row][highIndex]<data[row][i]) {
				highIndex = i;
			}
		}
		return highIndex;
	}

	public static double getLowestInRow(double[][] data,
			int row) {
		double lowest=data[row][0];
		for(int i=0;i<data[row].length;i++) {
			if(lowest>data[row][i]) {
				lowest = data[row][i];
			}
		}
		return lowest;
	}


	public static int getLowestInRowIndex(double[][] data,
			int row) {
		int lowIndex=0;

		for(int i=0;i<data[row].length;i++) {
			if(data[row][lowIndex]>data[row][i]) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}

	public static double getHighestInColumn(double[][] data,
			int col) {
		double highest=Integer.MIN_VALUE;

		for(int i=0;i<data.length;i++) {
			if(col<=data[i].length-1) {
				if(highest<=data[i][col]) {

					highest = data[i][col];
				}
			}
		}
		return highest;
	}

	public static int getHighestInColumnIndex(double[][] data,
			int col) {
		int highIndex=0;

		for(int i=0;i<data.length;i++) {
			if(col<=data[i].length-1) {

				if(data[highIndex][col]<data[i][col]) {
					highIndex = i;
				}
			}
		}
		return highIndex;
	}


	public static int getLowestInColumnIndex(double[][] data,
			int col) {
		int lowIndex=0;

		for(int i=0;i<data.length;i++) {
			if(col<=data[i].length-1) {
				if(data[lowIndex][col]>data[i][col]) {
					lowIndex = i;
				}}
		}
		return lowIndex;
	}
	public static double getLowestInColumn(double[][] data,
			int col) {
		double lowest=Integer.MAX_VALUE;
		for(int i=0;i<data.length;i++) {
			if(col<=data[i].length-1) {
				if(lowest>data[i][col]) {
					lowest = data[i][col];
				}
			}}
		return lowest;
	}


	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				if(highest < data[i][j]) {
					highest = data[i][j];

				}


			}

		}

		//return highest;
		return highest;
	}

	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				if(lowest > data[i][j]) {

					lowest = data[i][j];
				}
			}
		}
		return lowest;
	}
}
