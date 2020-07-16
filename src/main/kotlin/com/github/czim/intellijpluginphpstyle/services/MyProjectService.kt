package com.github.czim.intellijpluginphpstyle.services

import com.intellij.openapi.project.Project
import com.github.czim.intellijpluginphpstyle.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
