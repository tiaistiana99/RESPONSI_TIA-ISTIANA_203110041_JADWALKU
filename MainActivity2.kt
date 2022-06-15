package tia.tia203110041_tiaistiana_responsi // Nama Package

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Intent digunakan untuk memulai aktivitas mengekstrak string
        val message = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE)

        // Textview dimana saya beri nama matakuliah,yang mana nanntinya bisa kita isi dengan matakuliah
        // yang ada misal saja Prak Native
        val textMatakuliah = findViewById<TextView>(R.id.textMatakuliah).apply {
            text = message
        }

        // Textview saya beri nama waktu,yang mana nantinya bisa diisi dengan waktu kuliah mosal saja pagi siang
        // dan malam
        val textWaktu = findViewById<TextView>(R.id.textWaktu).apply {
            text = message
        }

        // Textview saya beri nama Dosen,yang mana nantinya bisa diisi dengan nama-nama deosen yang mengajar
        val textDosen = findViewById<TextView>(R.id.textDosen).apply {
            text = message
        }
    }

    fun edit(view: View) {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
        //Button edit yang mana ketika kita mengklik kita akan beralih ke mainactivity3 yang berisi data yang
        //akan diedit atau di update
    }

    fun kembali(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        // Button Kembali yang mana ketika kita mengklik kita akan beralih ke maiinactivyty tepatnya di halaman
        //utama atau pertama
    }
}