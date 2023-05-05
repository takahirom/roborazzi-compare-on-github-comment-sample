package com.github.takahirom.roborazzi.compare.on.github.comment

import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.takahirom.roborazzi.DEFAULT_ROBORAZZI_OUTPUT_DIR_PATH
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.GraphicsMode

@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class MainActivityScreenshotTest {
  @get:Rule val composeRule =
    createAndroidComposeRule<MainActivity>()

  @Test
  fun launch() {
    // Espresso
    onView(ViewMatchers.isRoot())
      .captureRoboImage(outputPath("espresso_root"))

    // Compose test
    composeRule.onNode(hasTestTag("hello_text"))
      .captureRoboImage(outputPath("compose_text"))
  }

  private fun outputPath(name: String) = "$DEFAULT_ROBORAZZI_OUTPUT_DIR_PATH/$name.png"
}