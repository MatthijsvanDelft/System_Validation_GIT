/*
 * Test data strategy for package .
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2017-10-06 14:46 +0200.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */
import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;
import org.jmlspecs.jmlunitng.strategy.ArrayStrategy;

/**
 * Test data strategy for package <default>. Provides
 * package-scope test values for type int[].
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2017-10-06 14:46 +0200
 */
public /*@ nullable_by_default */ class PackageStrategy_int1DArray 
  extends ArrayStrategy {
  /**
   * @return package-scope values for type int[].
   */
  public RepeatedAccessIterator<?> packageValues() {
    return new ObjectArrayIterator<Object>
    (new Object[] 
     { /* add package-scope int[] values or generators here */ });
  }

  /**
   * Constructor. 
   * The maximum length of generated arrays can be controlled here for
   * parameters of type int[]
   * in this package by changing the parameter to <code>setMaxLength</code>.
   * In addition, the data generators used can be changed by adding 
   * additional data class lines, or by removing some of the automatically 
   * generated ones. Note that lower-level strategies can override any 
   * behavior specified here by calling the same control methods in 
   * their own constructors.
   *
   * @see NonPrimitiveStrategy#addDataClass(Class<?>)
   * @see NonPrimitiveStrategy#clearDataClasses()
   * @see ArrayStrategy#setMaxLength(int)
   */
  public PackageStrategy_int1DArray() {
    super(int[].class);
    // uncomment to control the maximum array length, 1 by default
    // setMaxLength(1);
    setReflective(true);
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
