
public class Sort {
	private String[][] sequenceOrder = new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" }};

	public boolean isWellSorted(String[] sequence) {
		
		if(sequence == null || sequence.length != 2) {
			return false;
		}	
		
		for(int i = 0; i < sequenceOrder.length; i++) {
			if(sequence[0] == sequenceOrder[i][1]) {
				if(sequence[1] == sequenceOrder[i][0]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
}
