package fr.moontanaa.loginpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.ui.draw.clip


@Composable
fun LoginButton(modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
    ) {
        Text(text = "Login", color = Color.White) // Texte blanc pour contraster avec le rouge
    }
}

@Composable
fun LoginOutlineButton(
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {},
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.Black
        ),
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.SemiBold,
        )
    }
}


@Composable
fun LoginThirdPartyRow(
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {

        IconButton(onClick = { /* Action pour Facebook */ }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_facebook),
                contentDescription = stringResource(id = R.string.btn_login_with_facebook),
                tint = Color.Unspecified,
            )
        }


        IconButton(onClick = { /* Action pour Apple */ }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_apple),
                contentDescription = stringResource(id = R.string.btn_login_with_apple),
                tint = Color.Unspecified,
            )
        }


        IconButton(onClick = { /* Action pour Google */ }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_google),
                contentDescription = stringResource(id = R.string.btn_login_with_google),
                tint = Color.Unspecified,
            )
        }
    }
}

@Composable
fun LoginIconButton() {
    IconButton(
        modifier = Modifier
            .size(40.dp),
        onClick = { /* Handle the click event here */ }) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.baseline_keyboard_return_24),
            contentDescription = "Naviguer sur la page précédente"
        )
    }
}


@Preview
@Composable
fun LoginThirdPartyRowPreview() {
    LoginThirdPartyRow(

    )
}
