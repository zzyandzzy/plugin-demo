package com.github.zzyandzzy.plugindemo.services

import com.github.zzyandzzy.plugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
