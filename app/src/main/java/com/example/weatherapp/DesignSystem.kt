package com.example.weatherapp

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Weather App Design System
 * Defines all design tokens for consistent UI/UX across the app
 */

object WeatherAppDesignSystem {

    // ==================== SPACING ====================
    object Spacing {
        val xs = 4.dp      // Tight spacing
        val sm = 8.dp      // Small spacing
        val md = 12.dp     // Medium spacing
        val lg = 16.dp     // Large spacing
        val xl = 20.dp     // Extra large spacing
        val xxl = 24.dp    // 2x large spacing
        val xxxl = 32.dp   // 3x large spacing
        val huge = 48.dp   // Huge spacing
    }

    // ==================== CORNER RADIUS ====================
    object Corners {
        val xs = 8.dp      // Small corners
        val sm = 10.dp     // Small-medium corners
        val md = 12.dp     // Medium corners
        val lg = 16.dp     // Large corners
        val xl = 20.dp     // Extra large corners
        val xxl = 24.dp    // 2x large corners (hero cards)
    }

    // ==================== ELEVATION ====================
    object Elevation {
        val none = 0.dp
        val xs = 2.dp      // Subtle shadow
        val sm = 4.dp      // Small shadow
        val md = 6.dp      // Medium shadow
        val lg = 8.dp      // Large shadow
        val xl = 10.dp     // Extra large shadow (hero cards)
    }

    // ==================== TYPOGRAPHY ====================
    object Typography {
        // Font Sizes
        object FontSize {
            val caption = 11.sp      // Very small text
            val small = 12.sp        // Small text
            val body = 13.sp         // Body text
            val subtitle = 14.sp     // Subtitle text
            val label = 14.sp        // Label text
            val title = 16.sp        // Card titles
            val headline = 18.sp     // Section headlines
            val subheading = 20.sp   // Large subheading
            val header = 28.sp       // Page header
            val hero = 40.sp         // Page title
            val mega = 88.sp         // Temperature
        }

        // Font Weights
        object FontWeight {
            const val light = 300         // Light
            const val regular = 400       // Regular
            const val medium = 500        // Medium
            const val semibold = 600      // SemiBold
            const val bold = 700          // Bold
            const val extrabold = 800     // ExtraBold
        }

        // Line Heights
        val lineHeightCompact = 16.sp
        val lineHeightNormal = 18.sp
        val lineHeightRelaxed = 20.sp
    }

    // ==================== SIZES ====================
    object Sizes {
        val icon_xs = 16.dp        // Extra small icon
        val icon_sm = 20.dp        // Small icon
        val icon_md = 24.dp        // Medium icon
        val icon_lg = 32.dp        // Large icon
        val icon_xl = 40.dp        // Extra large icon
        val icon_xxl = 56.dp       // 2x large icon

        val card_height_sm = 80.dp      // Small card height
        val card_height_md = 120.dp     // Medium card height
        val card_height_lg = 160.dp     // Large card height

        val button_height = 48.dp       // Standard button height
        val input_height = 54.dp        // Input field height

        val image_hero = 100.dp         // Hero image size
        val image_large = 160.dp        // Large image
    }

    // ==================== Z-INDEX (for layering) ====================
    object ZIndex {
        const val background = 0
        const val surface = 1
        const val elevated = 2
        const val modal = 10
        const val toast = 100
    }

    // ==================== ANIMATION TIMINGS ====================
    object AnimationTimings {
        const val INSTANT = 0       // No animation
        const val FAST = 150        // Very fast
        const val QUICK = 200       // Quick
        const val NORMAL = 300      // Normal
        const val MEDIUM = 500      // Medium
        const val SLOW = 1000       // Slow
        const val VERY_SLOW = 1500  // Very slow
    }

    // ==================== OPACITY VALUES ====================
    object Opacity {
        const val DISABLED = 0.38f
        const val HOVER = 0.04f
        const val FOCUS = 0.12f
        const val ACTIVE = 0.12f
        const val PRESSED = 0.16f
        const val TRANSPARENT = 0.0f
        const val SEMI_TRANSPARENT = 0.5f
        const val NEARLY_OPAQUE = 0.8f
        const val OPAQUE = 1.0f
    }

    // ==================== BREAKPOINTS ====================
    object Breakpoints {
        val compact = 600.dp       // Phones
        val medium = 840.dp        // Tablets
        val expanded = 1200.dp     // Large tablets/desktops
    }

    // ==================== TOUCH TARGETS ====================
    object TouchTargets {
        val minimum = 48.dp        // Minimum touch target size
        val comfortable = 56.dp    // Comfortable touch target
    }
}

/**
 * Component-specific design tokens
 */
object ComponentTokens {

    object SearchCard {
        val height = 56.dp
        val cornerRadius = WeatherAppDesignSystem.Corners.sm
        val elevation = WeatherAppDesignSystem.Elevation.lg
        val paddingHorizontal = WeatherAppDesignSystem.Spacing.md
        val alphaBackground = 0.8f
    }

    object TemperatureCard {
        val cornerRadius = WeatherAppDesignSystem.Corners.xxl  // Hero radius
        val elevation = WeatherAppDesignSystem.Elevation.xl    // Max elevation
        val paddingVertical = WeatherAppDesignSystem.Spacing.xxxl
        val paddingHorizontal = WeatherAppDesignSystem.Spacing.xxxl
        val fontSize = WeatherAppDesignSystem.Typography.FontSize.mega
        val fontWeight = WeatherAppDesignSystem.Typography.FontWeight.extrabold
    }

    object LocationCard {
        val cornerRadius = WeatherAppDesignSystem.Corners.xl
        val elevation = WeatherAppDesignSystem.Elevation.lg
        val paddingVertical = WeatherAppDesignSystem.Spacing.xl
        val paddingHorizontal = WeatherAppDesignSystem.Spacing.xl
        val iconSize = 40.dp
    }

    object DetailCard {
        val cornerRadius = WeatherAppDesignSystem.Corners.lg
        val elevation = WeatherAppDesignSystem.Elevation.sm
        val paddingVertical = WeatherAppDesignSystem.Spacing.lg
        val paddingHorizontal = WeatherAppDesignSystem.Spacing.lg
        val minHeight = 120.dp
    }

    object Header {
        val fontSize = WeatherAppDesignSystem.Typography.FontSize.hero
        val fontWeight = WeatherAppDesignSystem.Typography.FontWeight.extrabold
        val bottomPadding = WeatherAppDesignSystem.Spacing.xl
    }

    object SubHeader {
        val fontSize = WeatherAppDesignSystem.Typography.FontSize.subtitle
        val fontWeight = WeatherAppDesignSystem.Typography.FontWeight.regular
        val bottomPadding = WeatherAppDesignSystem.Spacing.xxxl
    }
}

/**
 * Gradient definitions for consistent visual language
 */
object GradientTokens {
    const val TEMPERATURE_START = 0xFF6366F1      // Indigo
    const val TEMPERATURE_END = 0xFF8B5CF6        // Purple

    const val LOCATION_START_ALPHA = 1.0f
    const val LOCATION_END_ALPHA = 0.8f

    const val EMPTY_STATE_START_ALPHA = 0.2f
    const val EMPTY_STATE_END_ALPHA = 0.2f
}
