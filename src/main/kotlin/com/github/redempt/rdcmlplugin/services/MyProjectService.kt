package com.github.redempt.rdcmlplugin.services

import com.github.redempt.rdcmlplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
