package ru.sicampus.bootcamp2026

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MeetingScreen() {
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
                    selected = true,
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
                    selected = false,
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
            var meetingName by remember { mutableStateOf("") }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 110.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Создайте встречу",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        shape = RoundedCornerShape(32),
                        value = meetingName,
                        onValueChange = { meetingName = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 50.dp, bottom = 30.dp)
                            .clickable {},
                        label = { Text("Введите название встречи") }
                    )

                    Button(
                        onClick = { },
                        shape = RoundedCornerShape(32),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp, bottom = 30.dp)
                            .height(52.dp)
                            .border(2.dp, color = Color(0xFF4059FF), shape = RoundedCornerShape(32)),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Black
                        )
                    ) {
                        Text(
                            text = "Забронировать время"
                        )
                    }

                    Button(
                        onClick = { },
                        shape = RoundedCornerShape(32),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp, bottom = 50.dp)
                            .height(52.dp).
                            border(2.dp, color = Color(0xFF4059FF), shape = RoundedCornerShape(32)),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color.Black
                        )
                    ) {
                        Text(
                            text = "Выбрать участников"
                        )
                    }

                    Button(
                        onClick = { },
                        shape = RoundedCornerShape(32),
                        modifier = Modifier
                            //.fillMaxWidth()
                            .height(52.dp)
                            .wrapContentWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF4059FF)
                        )
                    ) {
                        Text(
                            text = "Создать встречу"
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun MeetingScreenPreview() {
    MeetingScreen()
}