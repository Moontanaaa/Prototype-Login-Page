package fr.moontanaa.loginpage

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import org.w3c.dom.Text

@Composable
fun LoginClickableText(
    modifier: Modifier = Modifier,
    text: AnnotatedString,
) {
    ClickableText(text = text, onClick = {})
}