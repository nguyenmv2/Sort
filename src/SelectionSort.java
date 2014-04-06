
public class SelectionSort extends Sorter {
	
	public SelectionSort( int[] a ){
		super( a );
	}
	
	public void sort() {
		int idx_of_min_val;
		for(int idx=0; idx < array.length; idx++) {
			idx_of_min_val = idx;
			for(int run_idx = idx; run_idx < array.length; run_idx++) {
				num_comparisons++;
				if( array[run_idx]<array[idx_of_min_val]) {
					idx_of_min_val = run_idx;
					num_assignments++;
				}
			}			   			   
			int temp = array[idx];
			array[idx] = array[idx_of_min_val];
			array[idx_of_min_val] = temp;
			num_assignments += 3;
		}//outer for loop			 
	}
}
