
//An Abstract class is a "template" for the definition of an
// "actual" or "concrete" class.  It gives a "framework" in the 
// sense that it defines class variables and methods.  Some of the
// methods can be directly implemented within the abstract class,
// but others are only DECLARED (as in a Java interface).

//What this means is that one CANNOT create an instance of an
// an abstract class, (in this case class Sorter).  BUT one can
// define "concrete" classes (in this case classes BubbleSort, 
// InsertionSort, and SelectionSort) that extends the abstract
// class.  These subclasses inherit all of the "concrete" components
// of the abstract class and MUST ACTUALLY IMPLEMENT ALL OF THE
// ABSTRACT METHODS.
public abstract class Sorter {
	protected int[] array;
	protected int num_comparisons;
	protected int num_assignments;
	
	public Sorter( int[] a ) {
		array = new int[ a.length ];
		//Java built-in array copying method
		System.arraycopy(a, 0, array, 0, array.length);
		num_comparisons = num_assignments = 0;
	}
	//abstract method, depends on which sorting algorithm is 
	//  to be used.
	public abstract void sort();
	
	public int[] getSortedArray() { return array; }
	
	public int getNumComparisons() { return num_comparisons; }
	
	public int getNumAssignments() { return num_assignments; }
}
