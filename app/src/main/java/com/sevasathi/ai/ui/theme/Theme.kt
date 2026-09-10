package com.sevasathi.ai.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = SevaPrimary,
    secondary = SevaAccent,
    background = SevaBackground,
    surface = SevaSurface,
    onBackground = SevaTextPrimary,
    onSurface = SevaTextPrimary
)

private val DarkColors = darkColorScheme(
    primary = SevaPrimary,
    secondary = SevaAccent,
    background = SevaBackgroundDark,
    surface = SevaSurfaceDark,
    onBackground = SevaTextPrimaryDark,
    onSurface = SevaTextPrimaryDark
)

@Composable
fun SevaSathiAITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors,
        typography = SevaTypography,
        content = content
    )
}
