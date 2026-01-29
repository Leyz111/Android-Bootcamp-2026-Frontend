package ru.sicampus.bootcamp2026

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InvitationsScreen() {
    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = Color.White,
                tonalElevation = 8.dp
            ) {
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Расписание") },
                    label = { Text("Расписание") }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            Icons.Default.AddCircle,
                            contentDescription = "Создать встречу"
                        )
                    },
                    label = { Text("Создать") }
                )

                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(
                            Icons.Default.Notifications,
                            contentDescription = "Отправленные вам пригашения"
                        )
                    },
                    label = { Text("Приглашения") }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {
                        Icon(
                            Icons.Default.AccountCircle,
                            contentDescription = "Создать встречу"
                        )
                    },
                    label = { Text("Профиль") }
                )
            }
        }
    ) { innerPadding ->

        Box(modifier = Modifier.padding(innerPadding)) {


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 110.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Ваши приглашения",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                MeetingInvitation("")
            }
        }
    }
}

@Composable
fun MeetingInvitation(name: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = name.ifEmpty { "Приглашение" }
                )
            }
            Row(
                modifier = Modifier,

                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(32),
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4059FF)
                    )
                ) {
                    Text(
                        text = "Принять",
                        fontSize = 10.sp
                    )
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(32),
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF4059FF)
                    )
                ) {
                    Text(
                        text = "Отказаться",
                        fontSize = 10.sp
                    )
                }
            }
        }

    }
}

@Preview
@Composable
fun InvitationsScreenPreview() {
    InvitationsScreen()
}