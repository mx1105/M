package com.mnaik.m.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val md_theme_light_primary = Color(0xFF984062)
val md_theme_light_onPrimary = Color(0xFFFFFFFF)
val md_theme_light_primaryContainer = Color(0xFFFFD9E2)

val md_theme_dark_primary = Color(0xFFFFB0C9)
val md_theme_dark_onPrimary = Color(0xFF5E1133)
val md_theme_dark_primaryContainer = Color(0xFF7B294A)

val bottomBackgroundColor
    @Composable
    get() = if (isSystemInDarkTheme()) Color.Blue
    else Color.Blue