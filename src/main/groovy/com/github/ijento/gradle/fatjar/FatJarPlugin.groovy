package com.github.ijento.gradle.fatjar

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author: Ollie Freeman
 * @date: 08/04/15
 */
class FatJarPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.extensions.add("fatJar", FatJarExtension)
        project.apply(plugin: 'java')
    }
}
