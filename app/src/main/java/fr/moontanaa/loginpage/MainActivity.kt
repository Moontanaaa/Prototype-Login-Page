package fr.moontanaa.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.moontanaa.loginpage.ui.theme.LoginPageTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginPageTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginPage(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun LoginPage(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(20.dp)
            .fillMaxSize(),
    ) {
        LoginIconButton()
        Spacer(modifier = Modifier.size(30.dp))
        // Titre de la page de connexion
        Text(
            text = "Login",
            style = androidx.compose.material3.MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 6.dp)
        )
        Text(
            text = "Login to continue the app",
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 26.dp)
        )

        // Champ pour l'email
        LoginTextField(
            label = "Email Address",
            placeholder = "Enter your email",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            isPassword = false
        )

        // Champ pour le mot de passe
        LoginTextField(
            label = "Password",
            placeholder = "Enter your password",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            isPassword = true
        )

        // Bouton "Forget Password"
        LoginOutlineButton(
            modifier = Modifier.align(Alignment.End),
            text = "Forget Password"
        )

        // Bouton de connexion
        LoginButton(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(bottom = 16.dp)
        )

        // Divider (séparateur)
        LoginDivider(
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxWidth()
        )

        // Row avec les boutons de connexion tierce partie
        LoginThirdPartyRow(
            modifier = Modifier.fillMaxWidth()
        )

        // Texte cliquable pour la création de compte
        LoginClickableText(
            modifier = Modifier.align(Alignment.End),
            text = BuildCreateAccountAnnotatedString()
        )

    }
}

@Composable
fun BuildCreateAccountAnnotatedString(): AnnotatedString {
    return buildAnnotatedString {
        append("don't have an account? ")


        withStyle(style = SpanStyle(color = Color.Blue)) {
            append("Sign up")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginPageTheme {
        LoginPage()
    }
}



