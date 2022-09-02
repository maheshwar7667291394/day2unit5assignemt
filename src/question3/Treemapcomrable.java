package question3;

import java.util.Comparator;

public class Treemapcomrable implements Comparator<Members> {

	@Override
	public int compare(Members o1, Members o2) {
		return o1.getMembershipEnddate().compareTo(o2.getMembershipEnddate())>1 ? 1:-1;
	}

}
