package com.goodworkalan.cassandra.mix;

import com.goodworkalan.go.go.Artifact;
import com.goodworkalan.mix.BasicJavaModule;

public class FurnishModule extends BasicJavaModule {
    public FurnishModule() {
        super(new Artifact("com.goodworkalan", "furnish", "0.1"));
        addTestDependency(new Artifact("org.testng", "testng", "5.10"));
    }
}
