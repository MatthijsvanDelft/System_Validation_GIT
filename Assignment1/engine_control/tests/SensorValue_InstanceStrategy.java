/*
 * Test data strategy for SensorValue.
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2017-10-06 14:46 +0200.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

import java.util.LinkedList;
import java.util.List;

import org.jmlspecs.jmlunitng.iterator.InstantiationIterator;
import org.jmlspecs.jmlunitng.iterator.IteratorAdapter;
import org.jmlspecs.jmlunitng.iterator.NonNullMultiIterator;
import org.jmlspecs.jmlunitng.iterator.ObjectArrayIterator;
import org.jmlspecs.jmlunitng.iterator.RepeatedAccessIterator;
import org.jmlspecs.jmlunitng.strategy.ObjectStrategy;

/**
 * Test data strategy for SensorValue. Provides
 * instances of SensorValue for testing, using
 * parameters from constructor tests.
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2017-10-06 14:46 +0200
 */
public /*@ nullable_by_default */ class SensorValue_InstanceStrategy extends ObjectStrategy {
  /**
   * @return local-scope instances of SensorValue.
   */
  public RepeatedAccessIterator<?> localValues() {
    return new ObjectArrayIterator<Object>
    (new Object[]
     { /* add SensorValue values or generators here */ });
  }

  /**
   * @return default instances of SensorValue, generated
   *  using constructor test parameters.
   */ 
  public RepeatedAccessIterator<SensorValue> defaultValues() {
    final List<RepeatedAccessIterator<SensorValue>> iters = 
      new LinkedList<RepeatedAccessIterator<SensorValue>>();

    // an instantiation iterator for the default constructor
    // (if there isn't one, it will fail silently)
    iters.add(new InstantiationIterator<SensorValue>
      (SensorValue.class, 
       new Class<?>[0], 
       new ObjectArrayIterator<Object[]>(new Object[][]{{}})));

    // parameters for method SensorValue(int, int, int)
    iters.add(new InstantiationIterator<SensorValue>
      (SensorValue.class, 
       new Class<?>[]
       {int.class, 
        int.class, 
        int.class},
       SensorValue_JML_Test.p_SensorValue__int_failSafe__int_minValue__int_maxValue__0().wrapped()));

    return new NonNullMultiIterator<SensorValue>(iters);
  }

  /**
   * Constructor. The boolean parameter to <code>setReflective</code>
   * determines whether or not reflection will be used to generate
   * test objects, and the int parameter to <code>setMaxRecursionDepth</code>
   * determines how many levels reflective generation of self-referential classes
   * will recurse.
   *
   * @see ObjectStrategy#setReflective(boolean)
   * @see ObjectStrategy#setMaxRecursionDepth(int)
   */
  public SensorValue_InstanceStrategy() {
    super(SensorValue.class);
    setReflective(true);
    // uncomment to control the maximum reflective instantiation
    // recursion depth, 0 by default
    // setMaxRecursionDepth(0);
  }
}