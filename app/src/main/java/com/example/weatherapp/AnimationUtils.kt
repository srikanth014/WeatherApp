package com.example.weatherapp

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import kotlin.math.sin

/**
 * Premium animation utilities for enhanced weather app experience
 */

/**
 * Creates a shimmer loading effect for cards
 */
@Composable
fun shimmeringModifier(): Modifier {
    val shimmerAlpha = remember { Animatable(0.3f) }

    LaunchedEffect(Unit) {
        shimmerAlpha.animateTo(
            targetValue = 0.8f,
            animationSpec = tween(
                durationMillis = 1000,
                easing = FastOutSlowInEasing
            )
        )
        shimmerAlpha.animateTo(
            targetValue = 0.3f,
            animationSpec = tween(
                durationMillis = 1000,
                easing = LinearOutSlowInEasing
            )
        )
    }

    return Modifier.background(Color.Gray.copy(alpha = shimmerAlpha.value))
}

/**
 * Creates a pulsing animation for emphasis
 */
@Composable
fun pulsingModifier(): Modifier {
    val scale = remember { Animatable(1f) }

    LaunchedEffect(Unit) {
        scale.animateTo(
            targetValue = 1.05f,
            animationSpec = tween(
                durationMillis = 600,
                easing = FastOutSlowInEasing
            )
        )
        scale.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 600,
                easing = FastOutSlowInEasing
            )
        )
    }

    return Modifier
}

/**
 * Wave animation colors for dynamic backgrounds
 */
fun getWaveGradientColors(progress: Float): List<Color> {
    val angle = progress * 360f
    val wave = sin(Math.toRadians(angle.toDouble())).toFloat()

    return listOf(
        Color(0xFF6366F1).copy(alpha = 0.7f + (wave * 0.3f) / 2),
        Color(0xFF8B5CF6).copy(alpha = 0.7f - (wave * 0.3f) / 2)
    )
}

/**
 * Timing for consistent animations
 */
object AnimationTimings {
    const val SHORT = 200
    const val MEDIUM = 500
    const val LONG = 1000
    const val EXTRA_LONG = 1500
}

/**
 * Easing functions for natural motion
 */
object AnimationEasings {
    val FastOut = FastOutLinearInEasing
    val SlowIn = LinearOutSlowInEasing
    val EaseInOut = FastOutSlowInEasing
}

/**
 * Gradient animation spec for temperature card
 */
fun temperatureGradientBrush(
    colors: List<Color> = listOf(
        Color(0xFF6366F1),
        Color(0xFF8B5CF6)
    )
): Brush = Brush.linearGradient(colors = colors)

/**
 * Premium shadow effects
 */
object ShadowElevations {
    const val SMALL = 2
    const val MEDIUM = 4
    const val LARGE = 6
    const val EXTRA_LARGE = 8
    const val MAXIMUM = 10
}

/**
 * Spacing system for consistent layout
 */
object SpacingSystem {
    const val EXTRA_SMALL = 4
    const val SMALL = 8
    const val MEDIUM = 12
    const val LARGE = 16
    const val EXTRA_LARGE = 20
    const val HUGE = 24
    const val MASSIVE = 32
    const val EXTREME = 48
}

/**
 * Border radius for consistent rounded corners
 */
object CornerRadius {
    const val SMALL = 8
    const val MEDIUM = 10
    const val LARGE = 12
    const val EXTRA_LARGE = 16
    const val MAXIMUM = 20
    const val HERO = 24
}

/**
 * Typography scale for hierarchy
 */
object TypographyScale {
    const val CAPTION = 11
    const val SMALL_BODY = 12
    const val BODY = 14
    const val SUBHEADING = 16
    const val TITLE = 18
    const val LARGE_TITLE = 20
    const val HEADLINE = 28
    const val HERO = 40
    const val MEGA = 88
}
