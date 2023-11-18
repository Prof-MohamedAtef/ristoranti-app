package mo.ed.myristoranti.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mo.ed.myristoranti.R

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}