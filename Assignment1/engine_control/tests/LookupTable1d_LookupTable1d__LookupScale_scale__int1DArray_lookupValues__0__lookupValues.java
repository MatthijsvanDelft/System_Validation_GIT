/*
 * Test data strategy for LookupTable1d.
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2017-10-06 14:46 +0200.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;

/**
 * Test data strategy for LookupTable1d. Provides
 * test values for parameter "int[] lookupValues" 
 * of method "LookupTable1d(LookupScale, int[])". 
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2017-10-06 14:46 +0200
 */
public /*@ nullable_by_default */ class LookupTable1d_LookupTable1d__LookupScale_scale__int1DArray_lookupValues__0__lookupValues
  extends LookupTable1d_ClassStrategy_int1DArray {
  /**
   * @return local-scope values for parameter 
   *  "int[] lookupValues".
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add local-scope int[] values or generators here */ });
  }

  /**
   * Constructor.
   * The maximum length of generated arrays can be controlled here for
   * parameter "int[] lookupValues" of method "LookupTable1d(LookupScale, int[])"
   * by changing the parameter to <code>setMaxLength</code>.
   * In addition, the data generators used can be changed by adding 
   * additional data class lines, or by removing some of the automatically 
   * generated ones. Since this is the lowest level of strategy, the 
   * behavior will be exactly as you specify here if you clear the existing 
   * list of classes first.
   *
   * @see NonPrimitiveStrategy#addDataClass(Class<?>)
   * @see NonPrimitiveStrategy#clearDataClasses()
   * @see ArrayStrategy#setMaxLength(int)
   */
  public LookupTable1d_LookupTable1d__LookupScale_scale__int1DArray_lookupValues__0__lookupValues() {
    super();
    // uncomment to control the maximum array length, 1 by default
    // setMaxLength(1); 
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
