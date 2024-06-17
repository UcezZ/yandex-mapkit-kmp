package ru.sulgik.mapkit.map

import ru.sulgik.mapkit.Color

data class TextStyle(
    val size: Float = 8f,
    val color: Color? = null,
    val outlinedWidth: Float = 1f,
    val outlineColor: Color? = null,
    val placement: Placement = Placement.CENTER,
    val offset: Float = 0f,
    val offsetFromIcon: Boolean = true,
    val textOptional: Boolean = false,
) {
    enum class Placement {
        CENTER,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
    }
}