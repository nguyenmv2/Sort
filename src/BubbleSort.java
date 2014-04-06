
public class BubbleSort extends Sorter {
		
	public BubbleSort( int[] a ) {
		super( a );
	}
	
	public void sort() {
		for( int start_idx = 0; start_idx < array.length - 1; start_idx++ ){
			for( int run_idx = 0; run_idx < array.length-1-start_idx; run_idx++ ) {
				if( !adjacentInOrder( run_idx ) )
					switchAdjacent( run_idx );
			}
		}
	}
	
	
	private boolean adjacentInOrder( int idx ) {
		num_comparisons++;
		return array[idx] <= array[idx+1];
	}
	
	private void switchAdjacent( int idx ) {
		int temp = array[idx];
		array[idx] =  array[idx+1];
		array[idx+1] = temp;
		num_assignments += 3;
	}
}
