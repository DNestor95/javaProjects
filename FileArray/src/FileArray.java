import java.io.*;
public class FileArray 
{
	
	public static void writeArray(int[] num, String fileName) throws IOException
	{
		//Create binary output objects
		FileOutputStream fstream = new FileOutputStream(fileName);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		System.out.println("Writing to the file.");

		//Write the array elements to the binary file
		for (int i = 0; i < num.length; i++)
			outputFile.writeInt(num[i]);

		//Close the file
		outputFile.close();
		System.out.println("Succesfully wrote to the file");

	}

	public static void readArray(int[] num, String fileName) throws IOException
	{
		int i = 0;
		boolean endOfFile = false;

		System.out.println("Reading numbers from the file: ");
		//Create binary output objects
		FileInputStream fstream = new FileInputStream(fileName);
		DataInputStream inputFile = new DataInputStream(fstream);

		while (!endOfFile)
		{
			try
			{
				num[i] = inputFile.readInt();
				i++;
				System.out.println(i + " ");
			}
			catch (EOFException e)
			{
				endOfFile = true;
			}
		}
		
		//Close the file
		inputFile.close();
		System.out.println("Succesfully closed the file.");
	}
}