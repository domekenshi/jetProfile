package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.components.CompanySection
import com.example.jetprofile.components.DetailSection
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {

        // プロフィール画像
        Image(
            painter = painterResource(id = R.drawable.panda),
            contentDescription = "プロフィール",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        // スペース
        Spacer(modifier = Modifier.height(20.dp))
        // 名前
        Text(
            text = "田中　太郎",
            color = Color.Gray,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold
        )
        // スペース
        Spacer(modifier = Modifier.height(20.dp))
        // 職業
        Text(
            text = "職業:エンジニア",
            color = Color.Gray,
            fontSize = 16.sp,
        )
        // スペース
        Spacer(modifier = Modifier.height(20.dp))
        // 会社情報
        CompanySection()
        // スペース
        Spacer(modifier = Modifier.height(20.dp))
        // 詳細表示ボタン
        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(
                    0xFFF856FA
                )
            ),
            onClick = {/*TODO*/ },
        ) {
            Text(
                text = "詳細を表示",
                color = Color.White,
            )
        }

        // スペース
        Spacer(modifier = Modifier.height(20.dp))
        // 趣味と居住地
        DetailSection()
    }
}