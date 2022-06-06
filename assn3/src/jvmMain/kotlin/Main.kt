// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import Commands.*
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    val drawing = remember { Drawing() }
    val viewHelper = remember { TestViewHelper(drawing)}

    MaterialTheme {
        Column {
            Row {
                Button( onClick = {
                    viewHelper.setCommand(DrawEllipseCommand())
                }) {
                    Text("Draw Ellipses")
                }
                Button( onClick = {
                    viewHelper.setCommand(DrawCircleCommand())
                }) {
                    Text("Draw Circles")
                }
                Button( onClick = {
                    viewHelper.setCommand(DrawRectangleCommand())
                }) {
                    Text("Draw Rectangles")
                }
                Button( onClick = {
                    viewHelper.setCommand(DrawSquareCommand())
                }) {
                    Text("Draw Squares")
                }
                Button( onClick = {
                    viewHelper.setCommand(DrawTriangleCommand())
                }) {
                    Text("Draw Triangles")
                }
                Button( onClick = {
                    viewHelper.setCommand(DrawLineCommand())
                }) {
                    Text("Draw Lines")
                }
                Button( onClick = {
                    viewHelper.setCommand(DrawStarCommand())
                }) {
                    Text("Draw Stars")
                }
                Button( onClick = {
                    viewHelper.setCommand(DrawPentagonCommand())
                }) {
                    Text("Draw Pentagons")
                }
                Button( onClick = {
                    viewHelper.setCommand(DrawCompositeCommand())
                }) {
                    Text("Draw MickeyMouse")
                }
                Button( onClick = {
                    drawing.endDrawing()
                }) {
                    Text("Save Drawing and End")
                }
            }
            Row {
                Canvas(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .pointerInput(Unit) {
                            detectTapGestures {
                                viewHelper.executeCommand(it)
                            }
                        }) {
                    drawing.shapes.forEach() {
                        it.draw(this)
                    }
                }
            }
        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
