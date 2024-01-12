package ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufid.yoyo.R
import com.mufid.yoyo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mb.root)
    }
}