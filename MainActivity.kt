package tia.tia203110041_tiaistiana_responsi // Nama Package

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun senin(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
        // pada tampilan utama terdapat lima hari yakni senin sampai jumat,nah pada button senin nnati
        // ketika di klik akan menuju ke halaman selanjutnya
    }
}