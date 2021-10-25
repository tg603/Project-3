import java.util.*;
public class BubbleSort implements Sorter{
	
public void sort(ArrayList<Integer> list){
	int n = list.size();
	int a, b;
	int counter = 0;
	if(n <= 1){
		return;
	}
	for(counter = 0; counter < n; counter++){
		int i, k = 0;
		for(i = 0; i < n && k < n - 1; i++){
			k = i + 1;
			a = list.get(i);
			b = list.get(k);
			if(list.get(i).compareTo(list.get(k)) > 0){
				counter = 0;
				list.set(i, b);
				list.set(k, a);
			}
			else{
				System.out.println(counter);
				counter++;
			}
		}
	}
}
public static void main (String[] args){
ArrayList<Integer> friends = new ArrayList<Integer>();
friends.add(1);
friends.add(0);
friends.add(-5);
friends.add(-6);
friends.add(8);
BubbleSort sorter = new BubbleSort();
sorter.sort(friends);
System.out.println (friends);
	}
}