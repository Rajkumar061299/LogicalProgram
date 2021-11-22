package program19_11_21;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QueueTimeCounter {

	public static int queue(List<Integer> list, int pos) {
		int count = 0;
		LinkedList<Integer> listOfPerson = new LinkedList<>(list);

		for (int i = 0; i < listOfPerson.size(); i++) {

			int currentValue = list.get(i);
			listOfPerson.removeFirst();
			listOfPerson.addLast(currentValue - 1);
			++count;

			if (listOfPerson.get(pos) == 0) {
				break;
			}
			if (listOfPerson.size() - 1 == i) {
				if ((listOfPerson.get(pos) - 1) == 0) {
					count++;
					break;
				}
				i = 0;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(queue(Arrays.asList(2, 5, 3, 6, 4), 1));
	}

}
