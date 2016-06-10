package com.github.stkent.javadoctests.package4;

import com.google.gson.Gson;

/**
 * This class depends on a third party type only!
 */
public class TestClassFour {

    private final Gson gson;

    public TestClassFour(final Gson gson) {
        this.gson = gson;
    }

    public Gson getGson() {
        return gson;
    }

}
