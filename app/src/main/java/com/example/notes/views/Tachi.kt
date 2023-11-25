package com.example.notes.views

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Tachi(navController: NavController) {
    val scrollState = rememberScrollState()
    val numbers = (0..23).toList()
    val icon = arrayOf("Build", "")

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth(),
                    ) {
                        Text(text = "Library")
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(-15.dp)
                        ) {
                            TextButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Search, contentDescription = "Search")
                            }
                            TextButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.Info, contentDescription = "Search")
                            }
                            TextButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.MoreVert, contentDescription = "Search")
                            }
                        }
                    }
                },
                colors = TopAppBarDefaults
                    .largeTopAppBarColors(MaterialTheme.colorScheme.background)
            )

        },
        bottomBar = {
            Card(
                shape = RoundedCornerShape(0),
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                        .padding(12.dp, 0.dp),
                ) {
                    TextButton(onClick = { }) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(Icons.Filled.Build, contentDescription = "icon 1")
                            Text(text = "Icon")
                        }
                    }
                    TextButton(onClick = { }) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(Icons.Filled.Phone, contentDescription = "icon 1")
                            Text(text = "Icon")
                        }
                    }
                    TextButton(onClick = { }) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(Icons.Filled.Email, contentDescription = "icon 1")
                            Text(text = "Icon")
                        }
                    }
                    TextButton(onClick = { }) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(Icons.Filled.AccountCircle, contentDescription = "icon 1")
                            Text(text = "Icon")
                        }
                    }
                    TextButton(onClick = { }) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(Icons.Filled.Lock, contentDescription = "icon 1")
                            Text(text = "Icon")
                        }
                    }
                }
            }
        }
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            modifier = Modifier
                .padding(top = 80.dp, bottom = 80.dp)
        ) {
            items(numbers.size) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Card(
                            modifier = Modifier
                                .clickable {  }
                                .width(150.dp)
                                .height(150.dp)
                                .padding(6.dp),
                            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.secondary),
                        ) {
                         Text(
                             text = "judul",
                             Modifier
                                 .padding(10.dp),
                             textAlign = TextAlign.Center
                         )
                        }
                    }
                }
            }
        }
    }
}