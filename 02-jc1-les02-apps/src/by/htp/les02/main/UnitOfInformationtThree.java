package by.htp.les02.main;

import java.util.Scanner;

public class UnitOfInformationtThree {

	public static void main(String[] args) {
		int bytePackageSize = 1024;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number of bytes");
		long numberOfBt = number.nextLong();
		if (numberOfBt < bytePackageSize) {
			System.out.print(numberOfBt + " byte ");
		} else if (numberOfBt >= bytePackageSize) {
			long numberOfKb = (numberOfBt / bytePackageSize);
			long remainderOfKb = numberOfBt % bytePackageSize;
			if (numberOfKb >= bytePackageSize) {
				long numberOfMb = numberOfKb / bytePackageSize;
				long remainderOfMb = numberOfKb % bytePackageSize;
				if (numberOfMb >= bytePackageSize) {
					long numberOfGb = numberOfMb / bytePackageSize;
					long remainderOfGb = numberOfGb % bytePackageSize;
					System.out.print(numberOfGb + " gbytes " + "\n" + remainderOfGb + " mbytes ");
				} else {
					System.out.print(numberOfMb + " mbytes " + "\n" + remainderOfMb + " kbytes ");
				}
			}

			System.out.print(numberOfKb + " kbytes " + "\n" + remainderOfKb + " bytes ");

		}

	}
}
