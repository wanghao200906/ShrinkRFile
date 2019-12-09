package com.example.shrink

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class ShrinkRFilePlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        def android = project.extensions.getByType(AppExtension)

        project.extensions.create("shrinkRConfig", ShrinkRFileExtension, project)
        android.registerTransform(new ShrinkRFileTransform(project))
    }

}