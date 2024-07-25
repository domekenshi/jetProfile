package com.example.jetprofile.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection(){
    // 会社情報
    Column(
        horizontalAlignment = Alignment.Start, modifier = Modifier.fillMaxWidth()
    ) {
        // 会社名
        Text(
            text = "Goooogle",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
        )
        // スペース
        Spacer(modifier = Modifier.height(10.dp))
        // 部署・グループ名
        Text(
            text = "カンパニー",
            color = Color.Gray,
            fontSize = 16.sp,
        )
        // スペース
        Spacer(modifier = Modifier.height(20.dp))
        // Email
        label(icon = Icons.Default.Email, text = "Email")

        // スペース
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "sample@email.com",
            fontSize = 16.sp,
        )
        // スペース
        Spacer(modifier = Modifier.height(5.dp))
        Divider(
            thickness = 2.dp,
            modifier = Modifier.clip(RoundedCornerShape(1000.dp))
        )
    }
}