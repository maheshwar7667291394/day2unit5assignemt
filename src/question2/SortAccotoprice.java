package question2;

import java.util.Comparator;

public class SortAccotoprice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductName().compareTo(o2.getProductName())>1 ? 1:-1;
	
	}

}
