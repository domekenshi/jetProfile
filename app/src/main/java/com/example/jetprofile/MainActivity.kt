package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)
                    ) {
                        // スペース
                        Spacer(modifier = Modifier.height(20.dp))
                        // プロフィール画像
                        Image(
                            painter = painterResource(id = R.drawable.panda),
                            contentDescription = "プロフィール",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
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

                        Column(horizontalAlignment = Alignment.Start,
                        modifier = Modifier.fillMaxSize()) {
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
                            Row(verticalAlignment = Alignment.CenterVertically){
                                Icon(
                                    imageVector = Icons.Default.Email,
                                    contentDescription = "email"
                                )
                                // スペース
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "Email",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
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
                                modifier = Modifier.clip(RoundedCornerShape(1000.dp),
                                )
                            )
                            // スペース
                            Spacer(modifier = Modifier.height(20.dp))
                            // 詳細表示ボタン
                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF856FA)),
                                onClick = {/*TODO*/},
                            ){
                                Text(
                                    text = "詳細を表示",
                                    color=Color.White,
                                )
                            }

                        }

                    }
                }
            }
        }
    }
}
