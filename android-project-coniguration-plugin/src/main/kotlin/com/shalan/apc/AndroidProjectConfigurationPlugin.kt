package com.shalan.apc

import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidProjectConfigurationPlugin : Plugin<Project> {


    override fun apply(target: Project) {
        println("${AndroidProjectConfigurationPlugin::class.java.simpleName}: has been run")
    }
}