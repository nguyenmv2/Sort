
public class InsertionSort extends Sorter {
	
	public InsertionSort( int[] a ) {
		super( a );
	}
	
	public void sort() {
		for (int idx = 1; idx < array.length; idx++) {
			int temp_value = array[idx]; //store the value that we are trying to insert
			int insert_idx = idx ; //index for searching where to insert temp_value	
			num_assignments +=2;
			while ((insert_idx > 0) && ( array[insert_idx-1] > temp_value)){
			   array[insert_idx] = array[insert_idx-1];
			   insert_idx--;
			   num_comparisons++;
			   num_assignments++;
			}
			array[insert_idx] = temp_value;
			num_assignments++;
		}
	}
}
