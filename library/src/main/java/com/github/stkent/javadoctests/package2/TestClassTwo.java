package com.github.stkent.javadoctests.package2;

import com.github.stkent.javadoctests.package1.TestClassOne;

/**
 * This class depends on a user-created and -imported type only!
 */
public class TestClassTwo {

    private final TestClassOne testClassOne;

    public TestClassTwo(final TestClassOne testClassOne) {
        this.testClassOne = testClassOne;
    }

    public TestClassOne getTestClassOne() {
        return testClassOne;
    }

}
