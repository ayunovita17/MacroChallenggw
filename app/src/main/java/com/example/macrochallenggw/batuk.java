package com.example.macrochallenggw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class batuk extends AppCompatActivity {
    ImageButton back;
    TextView tvdeskripsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batuk);
        back = (ImageButton) findViewById(R.id.panahbatuk);

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(batuk.this, kategoripenyakit.class);

                startActivity(intent);


            }

        });

        tvdeskripsi = (TextView) findViewById(R.id.pengertianbatuk);
        tvdeskripsi.setText("Batuk adalah respon alami dari tubuh sebagai sistem pertahanan untuk mengeluarkan zat dan partikel dari dalam saluran pernapasan, serta mencegah benda asing masuk ke saluran napas bawah.");

        tvdeskripsi = (TextView) findViewById(R.id.gejalabatuk);
        tvdeskripsi.setText("gejala batuk di tandai dengan, Pilek, Demam, Lemas, Nyeri tenggorokan, Susah menelan,  Bengek, dan Sesak Napas.");

        tvdeskripsi = (TextView) findViewById(R.id.penyebabbatuk);
        tvdeskripsi.setText("Penyebab umum batuk berdahak adalah infeksi oleh virus atau bakteri. Ketika saluran pernapasan terinfeksi, misalnya saat sedang flu, tubuh akan memproduksi lebih banyak lendir. Fungsinya adalah untuk menjebak dan mengeluarkan organisme penyebab infeksi. Batuk bertujuan untuk mengeluarkan lendir tersebut. Oleh karena itu, orang yang mengalami batuk berdahak disarankan untuk membuang dahak, bukan menelannya. Menelannya justru akan memperlambat penyembuhan.");

        tvdeskripsi = (TextView) findViewById(R.id.obatbatuk);
        tvdeskripsi.setText("Batuk Berdahak\n" +
                "\n" +
                "1. Jahe dan Kencur\n" +
                "siapkan jahe secukupnya dan juga sedikit kencur.parut jahe hingga" +
                " halus kemudian campur dengan kencur. setelah itu rebus dengan " +
                "segelas air hingga mendidih. Minum hasil rebusan tadi selagi hangat. " +
                "lakukan tersebut 2 kali sehari.\n"+
                "\n"+
                "2. Temulawak \n" +
                "siapkan 1 jari temulawak, Jeruk nipis 1/4  buah , Madu 2 sendok makan dan Air 1 gelas cuci temulawak dan jeruk nipis sampai bersih. Kemudian, potong kecil-kecil temulawak lalu rebus sampai mendidih. \n" +
                "saring potongan temulawak lalu tambahkan air jeruk nipis dan madu ke dalam air rebusan temulawak." +
                "dan minum dua kali sehari dengan takaran 1/2 gelas.");
    }
}