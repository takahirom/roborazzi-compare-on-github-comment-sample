package com.github.takahirom.roborazzi.compare.on.github.comment

import androidx.compose.ui.test.isRoot
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.GraphicsMode

@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class MainActivityScreenshotTest {
  @get:Rule val composeRule = createAndroidComposeRule<MainActivity>()
  @Test
  fun launch() {
    composeRule.onNode(isRoot())
      .captureRoboImage()
  }
}