package com.example.notes.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Hello, Farish!",
                    )
                },
                colors = TopAppBarDefaults
                    .largeTopAppBarColors(MaterialTheme.colorScheme.background)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, end = 12.dp)
                    .background(MaterialTheme.colorScheme.background)
                    .height(70.dp)
            ) {
                Text(
                    text = "Hello, Farish",
                    fontSize = 28.sp,
                )
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon(Icons.Filled.Search, contentDescription = "Search")
                }
            }
        },
        bottomBar = {
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                FloatingActionButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(bottom = 30.dp, end = 20.dp)
                ) {
                    Icon(Icons.Filled.Add, "Tambah")
                }
            }
        }
    ) {
        Column(
            modifier = Modifier
                .padding(top = 90.dp)
                .verticalScroll(state = scrollState),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            for (i in 1..10) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .defaultMinSize(minHeight = 120.dp)
                        .padding(12.dp)
                        .clickable { },
                    colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(12.dp)
                    ) {
                        Text(text = """
                            Notes ${i}
                            askdjhak
                            askdjaskdhjkashdasjdhasajkdhaskjdhaskjdakshdkjasdjkahd
                        """.trimIndent(),
                            modifier = Modifier
                                .padding(4.dp),
                        )
                    }
                }
            }

        }
    }
}