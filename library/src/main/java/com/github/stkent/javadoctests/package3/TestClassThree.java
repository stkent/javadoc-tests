package com.github.stkent.javadoctests.package3;

import android.os.Bundle;

/**
 * This class depends on an Android-specific type only!
 */
public class TestClassThree {

    private final Bundle bundle;

    public TestClassThree(final Bundle bundle) {
        this.bundle = bundle;
    }

    public Bundle getBundle() {
        return bundle;
    }

}
