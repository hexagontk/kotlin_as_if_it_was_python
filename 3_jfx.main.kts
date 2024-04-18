#!/usr/bin/env kotlin

/*
 * 3. JAVAFX INTERFACES - You can create user interfaces
 */
@file:DependsOn("com.github.mouse0w0:darculafx:9.0.0")
@file:DependsOn("org.openjfx:javafx-controls:21")

import com.github.mouse0w0.darculafx.DarculaFX.applyDarculaStyle

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.text.Font
import javafx.stage.Stage
import kotlin.system.exitProcess

class Test : Application() {

    override fun start(stage: Stage) {

        stage.title = "Hello JFX"
        stage.scene = Scene(
            Label("Kotlin can make desktop apps from CLI too").apply {
                padding = Insets(5.0)
                font = Font(font.family, font.size * 2)
            }
        )

        applyDarculaStyle(stage.scene)

        stage.sizeToScene()
        stage.centerOnScreen()
        stage.show()
        stage.toFront()
    }

    override fun stop() {
        exitProcess(0)
    }
}

Application.launch(Test::class.java)
