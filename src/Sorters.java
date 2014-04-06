import java.util.Random;


public class Sorters {
	public static void main( String [] argv) {
		Sorters my_app = new Sorters();
		Random my_rand = new Random();
		int[] array1 = my_app.makeRandomArray( 10, -10, 10, my_rand );
		int[] array2 = my_app.makeRandomArray( 20, -20, 20, my_rand );
		
		BubbleSort b_sort = new BubbleSort( array1 );
		InsertionSort i_sort = new InsertionSort( array1 );
		SelectionSort s_sort = new SelectionSort( array1 );
		
		System.out.println( "The initial array1 is:");
		my_app.printArray(array1);
		System.out.println();
		
		b_sort.sort();
		i_sort.sort();
		s_sort.sort();
		my_app.printResults( b_sort );
		my_app.printResults( i_sort );
		my_app.printResults( s_sort );
		
		b_sort = new BubbleSort( array2 );
		i_sort = new InsertionSort( array2 );
		s_sort = new SelectionSort( array2 );
		
		System.out.println( "\n\nThe initial array2 is:");
		my_app.printArray(array2);
		System.out.println();
		
		b_sort.sort();
		i_sort.sort();
		s_sort.sort();
		my_app.printResults( b_sort );
		my_app.printResults( i_sort );
		my_app.printResults( s_sort );
	}
	
	
	public int[] makeRandomArray( int size, int min_val, int max_val, Random rand ) {
		int[] array = new int[size];
		for( int idx = 0; idx < size; idx++ ) {
			array[idx] = getRandomBetween( min_val, max_val, rand );
		}
		return array;		
	}
	
	private int getRandomBetween( int minVal, int maxVal, Random rnd ) {
		if( maxVal < minVal ) { // just in case the numbers were accidently switched
			int temp = maxVal;
			maxVal = minVal;
			minVal = temp;
		}
		return rnd.nextInt( maxVal - minVal + 1 ) + minVal;
	}
	
	public void printArray( int[] array ) {
		for( int idx = 0; idx < array.length; idx++ ) {
			System.out.print( array[ idx ] + " " );
		}
		System.out.println();
	}
	//Notice below that "sorter" is of type "Sorter", but NO instance of Sorter
	// was created, only an instance of BubbleSort, InsertionSort, and SelectionSort
	public void printResults( Sorter sorter ) {
		if(sorter instanceof BubbleSort)
			System.out.println( "Results from bubblesort:" );
		else if( sorter instanceof InsertionSort)
			System.out.println( "Results from insertion sort:" );
		else if( sorter instanceof SelectionSort)
			System.out.println( "Results from selection sort:" );
		else
			System.out.println( "Results from unnamed sort:" );
		
		System.out.print( "  Sorted array: " );
		printArray( sorter.getSortedArray() );
		System.out.print( "  Number of assignments : " + sorter.getNumAssignments() );
		System.out.print( "  Number of comparisons : " + sorter.getNumComparisons() );
		System.out.println();
	}

}
