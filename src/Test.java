import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		BufferManagement buffer = new BufferManagement();
		int bufferID = 1;

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("\nCümle Girin : ");
			String[] words = input.nextLine().split(" ");

			for (String word : words) {

				if (!buffer.contains(word) && buffer.size() < 5) {
					buffer.put(bufferID++, word);
					buffer.print();
				} else if (!buffer.contains(word) && buffer.size() == 5) {
					buffer.checkForNewElement(word);
					buffer.print();
				} else if (buffer.contains(word)) {
					bufferID++;
					buffer.replace(word);
					buffer.print();
				}

			}
		}
	}

}