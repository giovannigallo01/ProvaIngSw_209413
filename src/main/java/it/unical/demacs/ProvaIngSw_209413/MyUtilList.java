package it.unical.demacs.ProvaIngSw_209413;

import java.util.List;

public class MyUtilList {
	
	private List<Integer> list;

	public List<Integer> sort(List<Integer> list, int order) {
		if(order == 0) {
			boolean swap = true;
			while(swap) {
				swap = false;
				for(int i=0; i<list.size()-1; i++) {
					if(list.get(i) > list.get(i+1)) {
						int temp = list.get(i);
						list.set(i, list.get(i+1));
						list.set(i+1, temp);
						swap = true;
					}
				}
			}
		}
		else if(order == 1) {
			boolean swap = true;
			while(swap) {
				swap = false;
				for(int i=0; i<list.size()-1; i++) {
					if(list.get(i) < list.get(i+1)) {
						int temp = list.get(i);
						list.set(i, list.get(i+1));
						list.set(i+1, temp);
						swap = true;
					}
				}
			}
		}
		else {
			throw new IllegalArgumentException("Illegal value" + order);
		}
		
		return list;
	}
}
