/*
 * Test Oracle Class for LookupScale
 * For Use With OpenJML RAC
 *
 * Generated by JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178), 2017-10-06 15:00 +0200.
 * (do not modify this comment, it is used by JMLUnitNG clean-up routines)
 */

import java.io.PrintWriter;
import java.util.ArrayList;

import org.jmlspecs.jmlunitng.iterator.IteratorWrapper;
import org.jmlspecs.jmlunitng.iterator.ParameterArrayIterator;
import org.jmlspecs.jmlunitng.testng.BasicTestListener;
import org.jmlspecs.jmlunitng.testng.PreconditionSkipException;
import org.testng.Assert;
import org.testng.TestException;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import org.jmlspecs.utils.JmlAssertionError;
import org.jmlspecs.utils.Utils; 

/**
 * Test oracles generated by JMLUnitNG for OpenJML RAC of class
 * LookupScale.
 * 
 * @author JMLUnitNG 1.4 (116/OpenJML-20131218-REV3178)
 * @version 2017-10-06 15:00 +0200
 */

public /*@ nullable_by_default */ class LookupScale_JML_Test {
  /**
   * The main method. Allows the tests to be run without a testng.xml or
   * the use of the TestNG executable/plugin.
   *
   * @param the_args Command line arguments, ignored.
   */
  public static void main(String[] the_args) {
    final TestNG testng_runner = new TestNG();
    final Class<?>[] classes = {LookupScale_JML_Test.class};
    final BasicTestListener listener =
      new BasicTestListener(new PrintWriter(System.out));
    testng_runner.setUseDefaultListeners(false);
    testng_runner.setXmlSuites(new ArrayList<XmlSuite>());
    testng_runner.setTestClasses(classes);
    testng_runner.addListener(listener);
    testng_runner.run();
  }

  /** 
   * A test to ensure that RAC is enabled before running other tests;
   * this also turns on RAC exceptions if they were not already turned on.
   */
  @Test
  public void test_racEnabled() {
    Utils.useExceptions = true;
    Assert.assertFalse
    (Utils.isRACCompiled(LookupScale_JML_Test.class),
     "JMLUnitNG tests must not be RAC-compiled when using OpenJML RAC.");
    Assert.assertTrue
    (Utils.isRACCompiled(LookupScale.class),
     "JMLUnitNG tests can only run on RAC-compiled code.");
  } 

  /**
   * A test for method toString.
   *
   * @param the_test_object The LookupScale to call the test method on.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_instance_only")
  public void test_toString__0
  (final LookupScale the_test_object ) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.toString();
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_toString__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for method lookupValue.
   *
   * @param the_test_object The LookupScale to call the test method on.
   * @param sv The SensorValue to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_lookupValue__SensorValue_sv__0")
  public void test_lookupValue__SensorValue_sv__0
  (final LookupScale the_test_object, 
   final SensorValue sv) {
      if (the_test_object == null) {
        throw new PreconditionSkipException
        ("could not construct an object to test");
      }
    try {
      the_test_object.lookupValue(sv);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_lookupValue__SensorValue_sv__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for a constructor.
   *
   * @param values The int[] to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_LookupScale__int1DArray_values__0")
  public void test_LookupScale__int1DArray_values__0
  (final int[] values) {
    try {
      new LookupScale(values);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_LookupScale__int1DArray_values__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * A test for a constructor.
   *
   * @param min The int to be passed.
   * @param max The int to be passed.
   * @param size The int to be passed.
   */
  @Test(dependsOnMethods = { "test_racEnabled" }, 
        dataProvider = "p_LookupScale__int_min__int_max__int_size__0")
  public void test_LookupScale__int_min__int_max__int_size__0
  (final int min, final int max, final int size) {
    try {
      new LookupScale(min, max, size);
    }
    catch (final JmlAssertionError $e) {
      if ($e.jmlAssertionType.equals("Precondition") &&
          $e.getStackTrace().length >= 4 &&
          "test_LookupScale__int_min__int_max__int_size__0".equals($e.getStackTrace()[3].getMethodName())) {
        // meaningless test because precondition failed
        throw new PreconditionSkipException($e.getMessage());
      } else {
        // test failure because something else failed
        throw new TestException($e.getMessage());
      }
    } catch (final Throwable $e) {
      // test failure for some reason other than assertion violation
      throw new TestException($e.getMessage());
    }
  }

  /**
   * Data provider for method ScaleIndex lookupValue(SensorValue).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_lookupValue__SensorValue_sv__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_lookupValue__SensorValue_sv__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (LookupScale_InstanceStrategy.class,
          LookupScale_lookupValue__SensorValue_sv__0__sv.class));
  }


  /**
   * Data provider for constructor LookupScale(int[]).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_LookupScale__int1DArray_values__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_LookupScale__int1DArray_values__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (LookupScale_LookupScale__int1DArray_values__0__values.class));
  }


  /**
   * Data provider for constructor LookupScale(int, int, int).
   * @return An iterator over strategies to use for parameter generation.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_LookupScale__int_min__int_max__int_size__0", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_LookupScale__int_min__int_max__int_size__0() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator
         (LookupScale_LookupScale__int_min__int_max__int_size__0__min.class,
          LookupScale_LookupScale__int_min__int_max__int_size__0__max.class,
          LookupScale_LookupScale__int_min__int_max__int_size__0__size.class));
  }


  /**
   * Data provider for methods with no parameters.
   * @return An iterator over the main class strategy.
   */
  @SuppressWarnings({"unchecked"})
  @DataProvider(name = "p_instance_only", 
                parallel = false)
  public static IteratorWrapper<Object[]> p_instance_only() {
    return new IteratorWrapper<Object[]>
    (new ParameterArrayIterator(LookupScale_InstanceStrategy.class));
  }
}