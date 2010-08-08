package com.goodworkalan.furnish;

import com.goodworkalan.cafe.ProjectModule;
import com.goodworkalan.cafe.builder.Builder;
import com.goodworkalan.cafe.outline.JavaProject;

/**
 * Builds the project definition for Furnish.
 *
 * @author Alan Gutierrez
 */
public class FurnishProject implements ProjectModule {
    /**
     * Build the project definition for Furnish.
     *
     * @param builder
     *          The project builder.
     */
    public void build(Builder builder) {
        builder
            .cookbook(JavaProject.class)
                .produces("com.github.bigeasy.furnish/furnish/0.1")
                .depends()
                    .development("org.testng/testng-jdk15/5.10")
                    .end()
                .end()
            .end();
    }
}
