package fr.moontanaa.loginpage

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight

@Composable
fun LoginDivider(
    modifier: Modifier = Modifier,
    color: Color = Color.Gray,
    thickness: Dp = 1.dp,
    isAlternateText: Boolean = false
) {
    val displayText = if (isAlternateText) "Or Continue With" else "Or Login With"

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        // Diviseur à gauche
        Divider(
            color = color,
            thickness = thickness,
            modifier = Modifier.weight(1f)
        )

        // Texte au centre
        Text(
            text = displayText,
            modifier = Modifier.padding(horizontal = 16.dp),
            fontWeight = FontWeight.SemiBold
        )

        // Diviseur à droite
        Divider(
            color = color,
            thickness = thickness,
            modifier = Modifier.weight(1f)
        )
    }
}






