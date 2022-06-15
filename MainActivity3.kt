package tia.tia203110041_tiaistiana_responsi //Nama Package

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    //untuk menyimpan dan mengirim data serta berpindah ke halaman selanjutnya
    fun simpan(view: View) {
        val editMatakuliah = findViewById<EditText>(R.id.editMatakuliah)
        val message1 = editMatakuliah.text.toString()
        //Edit matakuliah dimana ini ini nnatinya diisi oleh matakuliah yang ada
        val editWaktu = findViewById<EditText>(R.id.editWaktu)
        val message2 = editWaktu.text.toString()
        // Edit  Waktu dimana nntinya ini akan diisi oleh waktu
        val editDosen = findViewById<EditText>(R.id.editDosen)
        val message3 = editDosen.text.toString()
        // Edit Dosen dimana nantinya ini akan diisi oleh nama-nama dosen yang sesuai dengan matakuliah
        // dan waktu jadwal 
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message1)
            putExtra(AlarmClock.EXTRA_MESSAGE, message2)
            putExtra(AlarmClock.EXTRA_MESSAGE, message3)
        }
        startActivity(intent)
    }
}