package example;

import java.util.Scanner;

public class HubbaReader {
    int counter = 0;

    private void hubbaCounter() {
    	try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				String c = sc.next();
				if (c.compareTo("hubba") == 0) {
					counter++;
				}
			}
		}
    }

    public static void main(String[] args) {
        HubbaReader r = new HubbaReader();
        r.hubbaCounter();
        System.out.format("%s hubba!\n", r.counter);
    }
}
