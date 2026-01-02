package com.musin.news.presentation.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

object CustomIcons {

    val Share: ImageVector
        get() {
            if (_TablerShare != null) return _TablerShare!!

            _TablerShare = ImageVector.Builder(
                name = "share",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f
            ).apply {
                path(
                    fill = SolidColor(Color.Transparent),
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(6f, 12f)
                    moveToRelative(-3f, 0f)
                    arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                    arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
                }
                path(
                    fill = SolidColor(Color.Transparent),
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(18f, 6f)
                    moveToRelative(-3f, 0f)
                    arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                    arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
                }
                path(
                    fill = SolidColor(Color.Transparent),
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(18f, 18f)
                    moveToRelative(-3f, 0f)
                    arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                    arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
                }
                path(
                    fill = SolidColor(Color.Transparent),
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(8.7f, 10.7f)
                    lineToRelative(6.6f, -3.4f)
                }
                path(
                    fill = SolidColor(Color.Transparent),
                    stroke = SolidColor(Color.Black),
                    strokeLineWidth = 2f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(8.7f, 13.3f)
                    lineToRelative(6.6f, 3.4f)
                }
            }.build()

            return _TablerShare!!
        }

    private var _TablerShare: ImageVector? = null



    val OpenInNew: ImageVector
        get() {
            if (_MaterialIconsOpen_in_new != null) return _MaterialIconsOpen_in_new!!

            _MaterialIconsOpen_in_new = ImageVector.Builder(
                name = "open_in_new",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f
            ).apply {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Black)
                ) {
                    moveTo(19f, 19f)
                    horizontalLineTo(5f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(3f)
                    horizontalLineTo(5f)
                    curveToRelative(-1.11f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-7f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(7f)
                    close()
                    moveTo(14f, 3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3.59f)
                    lineToRelative(-9.83f, 9.83f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(19f, 6.41f)
                    verticalLineTo(10f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-7f)
                    close()
                }
            }.build()

            return _MaterialIconsOpen_in_new!!
        }

    private var _MaterialIconsOpen_in_new: ImageVector? = null



    val Add: ImageVector
        get() {
            if (_MaterialSymbolsAdd_2 != null) return _MaterialSymbolsAdd_2!!

            _MaterialSymbolsAdd_2 = ImageVector.Builder(
                name = "add_2",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(
                    fill = SolidColor(Color.Black)
                ) {
                    moveTo(440f, 840f)
                    verticalLineToRelative(-320f)
                    horizontalLineTo(120f)
                    verticalLineToRelative(-80f)
                    horizontalLineToRelative(320f)
                    verticalLineToRelative(-320f)
                    horizontalLineToRelative(80f)
                    verticalLineToRelative(320f)
                    horizontalLineToRelative(320f)
                    verticalLineToRelative(80f)
                    horizontalLineTo(520f)
                    verticalLineToRelative(320f)
                    horizontalLineToRelative(-80f)
                    close()
                }
            }.build()

            return _MaterialSymbolsAdd_2!!
        }

    private var _MaterialSymbolsAdd_2: ImageVector? = null

    val Settings: ImageVector
        get() {
            if (_MaterialSymbolsSettings != null) return _MaterialSymbolsSettings!!

            _MaterialSymbolsSettings = ImageVector.Builder(
                name = "settings",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(
                    fill = SolidColor(Color.Black)
                ) {
                    moveTo(370f, 880f)
                    lineToRelative(-16f, -128f)
                    quadToRelative(-13f, -5f, -24.5f, -12f)
                    reflectiveQuadTo(307f, 725f)
                    lineToRelative(-119f, 50f)
                    lineTo(78f, 585f)
                    lineToRelative(103f, -78f)
                    quadToRelative(-1f, -7f, -1f, -13.5f)
                    verticalLineToRelative(-27f)
                    quadToRelative(0f, -6.5f, 1f, -13.5f)
                    lineTo(78f, 375f)
                    lineToRelative(110f, -190f)
                    lineToRelative(119f, 50f)
                    quadToRelative(11f, -8f, 23f, -15f)
                    reflectiveQuadToRelative(24f, -12f)
                    lineToRelative(16f, -128f)
                    horizontalLineToRelative(220f)
                    lineToRelative(16f, 128f)
                    quadToRelative(13f, 5f, 24.5f, 12f)
                    reflectiveQuadToRelative(22.5f, 15f)
                    lineToRelative(119f, -50f)
                    lineToRelative(110f, 190f)
                    lineToRelative(-103f, 78f)
                    quadToRelative(1f, 7f, 1f, 13.5f)
                    verticalLineToRelative(27f)
                    quadToRelative(0f, 6.5f, -2f, 13.5f)
                    lineToRelative(103f, 78f)
                    lineToRelative(-110f, 190f)
                    lineToRelative(-118f, -50f)
                    quadToRelative(-11f, 8f, -23f, 15f)
                    reflectiveQuadToRelative(-24f, 12f)
                    lineTo(590f, 880f)
                    horizontalLineTo(370f)
                    close()
                    moveToRelative(70f, -80f)
                    horizontalLineToRelative(79f)
                    lineToRelative(14f, -106f)
                    quadToRelative(31f, -8f, 57.5f, -23.5f)
                    reflectiveQuadTo(639f, 633f)
                    lineToRelative(99f, 41f)
                    lineToRelative(39f, -68f)
                    lineToRelative(-86f, -65f)
                    quadToRelative(5f, -14f, 7f, -29.5f)
                    reflectiveQuadToRelative(2f, -31.5f)
                    quadToRelative(0f, -16f, -2f, -31.5f)
                    reflectiveQuadToRelative(-7f, -29.5f)
                    lineToRelative(86f, -65f)
                    lineToRelative(-39f, -68f)
                    lineToRelative(-99f, 42f)
                    quadToRelative(-22f, -23f, -48.5f, -38.5f)
                    reflectiveQuadTo(533f, 266f)
                    lineToRelative(-13f, -106f)
                    horizontalLineToRelative(-79f)
                    lineToRelative(-14f, 106f)
                    quadToRelative(-31f, 8f, -57.5f, 23.5f)
                    reflectiveQuadTo(321f, 327f)
                    lineToRelative(-99f, -41f)
                    lineToRelative(-39f, 68f)
                    lineToRelative(86f, 64f)
                    quadToRelative(-5f, 15f, -7f, 30f)
                    reflectiveQuadToRelative(-2f, 32f)
                    quadToRelative(0f, 16f, 2f, 31f)
                    reflectiveQuadToRelative(7f, 30f)
                    lineToRelative(-86f, 65f)
                    lineToRelative(39f, 68f)
                    lineToRelative(99f, -42f)
                    quadToRelative(22f, 23f, 48.5f, 38.5f)
                    reflectiveQuadTo(427f, 694f)
                    lineToRelative(13f, 106f)
                    close()
                    moveToRelative(42f, -180f)
                    quadToRelative(58f, 0f, 99f, -41f)
                    reflectiveQuadToRelative(41f, -99f)
                    quadToRelative(0f, -58f, -41f, -99f)
                    reflectiveQuadToRelative(-99f, -41f)
                    quadToRelative(-59f, 0f, -99.5f, 41f)
                    reflectiveQuadTo(342f, 480f)
                    quadToRelative(0f, 58f, 40.5f, 99f)
                    reflectiveQuadToRelative(99.5f, 41f)
                    close()
                    moveToRelative(-2f, -140f)
                    close()
                }
            }.build()

            return _MaterialSymbolsSettings!!
        }

    private var _MaterialSymbolsSettings: ImageVector? = null

    val Refresh: ImageVector
        get() {
            if (_MaterialIconsRefresh != null) return _MaterialIconsRefresh!!

            _MaterialIconsRefresh = ImageVector.Builder(
                name = "refresh",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f
            ).apply {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Black)
                ) {
                    moveTo(17.65f, 6.35f)
                    curveTo(16.2f, 4.9f, 14.21f, 4f, 12f, 4f)
                    curveToRelative(-4.42f, 0f, -7.99f, 3.58f, -7.99f, 8f)
                    reflectiveCurveToRelative(3.57f, 8f, 7.99f, 8f)
                    curveToRelative(3.73f, 0f, 6.84f, -2.55f, 7.73f, -6f)
                    horizontalLineToRelative(-2.08f)
                    curveToRelative(-0.82f, 2.33f, -3.04f, 4f, -5.65f, 4f)
                    curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                    reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                    curveToRelative(1.66f, 0f, 3.14f, 0.69f, 4.22f, 1.78f)
                    lineTo(13f, 11f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(4f)
                    lineToRelative(-2.35f, 2.35f)
                    close()
                }
            }.build()

            return _MaterialIconsRefresh!!
        }

    private var _MaterialIconsRefresh: ImageVector? = null

    val Close: ImageVector
        get() {
            if (_MaterialSymbolsClose != null) return _MaterialSymbolsClose!!

            _MaterialSymbolsClose = ImageVector.Builder(
                name = "close",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 960f,
                viewportHeight = 960f
            ).apply {
                path(
                    fill = SolidColor(Color.Black)
                ) {
                    moveTo(256f, 760f)
                    lineToRelative(-56f, -56f)
                    lineToRelative(224f, -224f)
                    lineToRelative(-224f, -224f)
                    lineToRelative(56f, -56f)
                    lineToRelative(224f, 224f)
                    lineToRelative(224f, -224f)
                    lineToRelative(56f, 56f)
                    lineToRelative(-224f, 224f)
                    lineToRelative(224f, 224f)
                    lineToRelative(-56f, 56f)
                    lineToRelative(-224f, -224f)
                    lineToRelative(-224f, 224f)
                    close()
                }
            }.build()

            return _MaterialSymbolsClose!!
        }

    private var _MaterialSymbolsClose: ImageVector? = null

}