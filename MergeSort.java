import java.util.*;
public class MergeSort implements Sorter{

public void sort(ArrayList<Integer> list){
	int n = list.size();
	int counter = 1, CInsertion = 0, MInsertion = 0;
	int i = 0, k = 0, d = 0; 
	int half = (n / 2);
	//int sechalf = n - half;
	int l = 0;
	if(n <= 1){
		return;
	}
	ArrayList<Integer> List1 = new ArrayList<Integer>();
	ArrayList<Integer> List2 = new ArrayList<Integer>();
	for(i = 0; i < half; i++){
		List1.add(list.get(i));
	}
	for(k = half; k < list.size(); k++){
		List2.add(list.get(k));
	}
	int p = List1.size(), r = List2.size();
	//System.arraycopy(list, 0, List1, k, p);
	//System.arraycopy(list, p, List2, k, r);
	sort(List1);
	sort(List2);
	//System.arraycopy(List1, i, list, l, p - i);
	//System.arraycopy(List2, k, list, l, r - k);
	merging(list, List1, List2);
}
public ArrayList<Integer> merging(ArrayList<Integer> list, ArrayList<Integer> List1, ArrayList<Integer> List2){
	int i = 0, k = 0, l = 0;
	int p = List1.size(), r = List2.size();
	ArrayList<Integer> List3 = new ArrayList<Integer>();
		while (i < p && k < r){
			if(List1.get(i) <= List2.get(k)){
				list.set(l, List1.get(i));
				i++;
		}else{
		list.set(l, List2.get(k));
		k++;
		}		
		l++;
	}
	while(i < p){
		list.set(l, List1.get(i));
		i++;
		l++;
	}
	while(k < r){
		list.set(l, List2.get(k));
		k++;
		l++;
	}
	return list;
}

public static void main (String[] args){
ArrayList<Integer> friends = new ArrayList<Integer>();
friends.add(1);
friends.add(0);
friends.add(-5);
friends.add(-6);
friends.add(8);
MergeSort sorter = new MergeSort();
sorter.sort(friends);
System.out.println (friends);
	}
}