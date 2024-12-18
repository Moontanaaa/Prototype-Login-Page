package fr.moontanaa.loginpage

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginTextField(
    label: String,
    placeholder: String,
    modifier: Modifier = Modifier,
    isPassword: Boolean = false,
) {
    // État de la valeur du champ de texte
    val textState = remember { mutableStateOf(TextFieldValue("")) }
    // État pour afficher/masquer le mot de passe
    val passwordVisible = remember { mutableStateOf(false) }

    Column {
        Text(
            modifier = modifier.padding(bottom = 8.dp),
            text = label,
            fontWeight = FontWeight.SemiBold,
        )
    }

    TextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        modifier = modifier,
        trailingIcon = {
            if (isPassword) {
                IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                    Icon(
                        imageVector = if (passwordVisible.value) Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
                        contentDescription = if (passwordVisible.value)
                            "Hide password"
                        else
                            "Show password"
                    )
                }
            }
        },
        visualTransformation = if (isPassword && !passwordVisible.value) PasswordVisualTransformation() else VisualTransformation.None,
        shape = androidx.compose.foundation.shape.RoundedCornerShape(30.dp),
        singleLine = true,
        placeholder = { Text(placeholder, color = Color(0xFFD2D2D2)) },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(0xFFEEEEEE),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        )
    )
}
