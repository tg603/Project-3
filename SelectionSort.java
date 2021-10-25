import java.util.*;
public class SelectionSort implements Sorter{
	
public void sort(ArrayList<Integer> list){
		int n = list.size();
		for(int i = 0; i < n; i++){
			int k = i;
			for(int l = i + 1; l < n; l++){
				if (list.get(l).compareTo(list.get(k)) < 0){
					k = l;
				}
			}
		int a = list.get(k);
		int b = list.get(i);
		list.set(i, a);
		list.set(k, b);
		}
	}
public static void main (String[] args){
ArrayList<Integer> friends = new ArrayList<Integer>();
friends.add(1);
friends.add(0);
friends.add(-5);
friends.add(-6);
friends.add(8);
SelectionSort sorter = new SelectionSort();
sorter.sort(friends);
System.out.println (friends);
	}
}
