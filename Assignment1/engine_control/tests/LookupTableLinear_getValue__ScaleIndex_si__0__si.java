/*
 * Test data strategy for LookupTableLinear.
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2017-10-06 14:46 +0200.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;

/**
 * Test data strategy for LookupTableLinear. Provides
 * test values for parameter "ScaleIndex si" 
 * of method "int getValue(ScaleIndex)". 
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2017-10-06 14:46 +0200
 */
public /*@ nullable_by_default */ class LookupTableLinear_getValue__ScaleIndex_si__0__si
  extends LookupTableLinear_ClassStrategy_ScaleIndex {
  /**
   * @return local-scope values for parameter 
   *  "ScaleIndex si".
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add local-scope ScaleIndex values or generators here */ });
  }

  /**
   * Constructor.
   * The use of reflection can be controlled here for  
   * "ScaleIndex si" of method "int getValue(ScaleIndex)" 
   * by changing the parameters to <code>setReflective</code>
   * and <code>setMaxRecursionDepth<code>.
   * In addition, the data generators used can be changed by adding 
   * additional data class lines, or by removing some of the automatically 
   * generated ones. Since this is the lowest level of strategy, the 
   * behavior will be exactly as you specify here if you clear the existing 
   * list of classes first.
   *
   * @see NonPrimitiveStrategy#addDataClass(Class<?>)
   * @see NonPrimitiveStrategy#clearDataClasses()
   * @see ObjectStrategy#setReflective(boolean)
   * @see ObjectStrategy#setMaxRecursionDepth(int)
   */
  public LookupTableLinear_getValue__ScaleIndex_si__0__si() {
    super();
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}
