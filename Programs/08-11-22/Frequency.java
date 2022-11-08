import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Frequency {
	public static void main(String[] args) {
		Start start=new Start();
		start.getList();
		System.out.println(start.sortByFrequency());
	}
}

class Start {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

	void getList() {
		int length = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < length; i++) {
			list.add(Integer.parseInt(scan.nextLine()));
		}
	}

	ArrayList<Integer> sortByFrequency() {
		for (int i = 0; i < list.size(); i++) {
			if (map.containsKey(list.get(i))) {
				int count = map.get(list.get(i));
				map.put(list.get(i), ++count);
			} else {
				map.put(list.get(i), 1);
			}
		}

		list.removeAll(list);

		int mapLength = map.size();
		for (int i = 0; i < mapLength; i++) {
			int key = 0;
			int count = 0;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() > key) {
					key = entry.getKey();
					count = entry.getValue();
				}
			}

			for (int j = 0; j < count; j++) {
				list.add(key);
			}
			map.remove(key);
			count = 0;
		}
		
		return list;
	}
}
