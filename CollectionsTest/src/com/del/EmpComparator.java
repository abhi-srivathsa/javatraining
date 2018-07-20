package com.del;

import java.util.Comparator;

import javax.swing.SortingFocusTraversalPolicy;

public class EmpComparator implements Comparator<Emp> {
	private SortingField sortField;
	public EmpComparator(SortingField sortField) {
		this.sortField= sortField;
		}
	public EmpComparator() {
		}

	@Override
	public int compare(Emp o1, Emp o2) {
		if(sortField==SortingField.Id)
			return  o1.getId()-o2.getId(); 
		else if(sortField==SortingField.Name)
			return  o1.getName().compareTo(o2.getName()); 
		else if(this.sortField==SortingField.Mobile)
			return  (int)(o1.getMobile()-o2.getMobile()); 
		else
			return 0;
	}

}
