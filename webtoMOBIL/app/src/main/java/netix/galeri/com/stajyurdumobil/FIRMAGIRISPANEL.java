package netix.galeri.com.stajyurdumobil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FIRMAGIRISPANEL extends AppCompatActivity {
    Button btn;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31;
public  static boolean dondur3=false;
    EditText edd1,edd2,edd3,edd4,edd5;
    public static String stt1,stt2,stt3,stt4,stt5;
    String astt1,astt2,astt3,astt4,astt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firmagirispanel);

        edd1=(EditText)findViewById(R.id.editText7k);
        edd2=(EditText)findViewById(R.id.editText8k);
        edd3=(EditText)findViewById(R.id.editText9k);
        edd4=(EditText)findViewById(R.id.editText10k);
        edd5=(EditText)findViewById(R.id.editText11k);

        btn=(Button)findViewById(R.id.button666);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dondur3=true;


               FIRMAGIRIS.dondur=false;

                Intent i = new Intent(getApplicationContext(), FIRMAGIRIS.class);
                startActivity(i);
            }
        });

        button1=(Button) findViewById(R.id.button11);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button13);
        button4=(Button)findViewById(R.id.button15);
        button5=(Button)findViewById(R.id.button3);
        button6=(Button) findViewById(R.id.button16);
        button7=(Button)findViewById(R.id.button17);

        button9=(Button)findViewById(R.id.button4);
        button10=(Button)findViewById(R.id.button8);
        button11=(Button)findViewById(R.id.button7);
        button12=(Button)findViewById(R.id.button18);
        button13=(Button)findViewById(R.id.button19);
        button14=(Button)findViewById(R.id.button20);
        button15=(Button)findViewById(R.id.button22);
        button16=(Button)findViewById(R.id.button23);
        button17=(Button)findViewById(R.id.button24);
        button18=(Button)findViewById(R.id.button21);
        button19=(Button)findViewById(R.id.button6);
        button20=(Button)findViewById(R.id.button9);
        button21=(Button)findViewById(R.id.button10);

        button24=(Button)findViewById(R.id.button25);
        button25=(Button)findViewById(R.id.button26);
        button26=(Button)findViewById(R.id.button27);
        button27=(Button)findViewById(R.id.button28);
        button28=(Button)findViewById(R.id.button29);
        button29=(Button)findViewById(R.id.button30);
        button30=(Button) findViewById(R.id.button54k);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ANASAYFA.class);
                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ANASAYFA.class);
                startActivity(i);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ANASAYFA.class);
                startActivity(i);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ANASAYFA.class);
                startActivity(i);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILANLAR.class);
                startActivity(i);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILANLAR.class);
                startActivity(i);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILANLAR.class);
                startActivity(i);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FIRMALAR.class);
                startActivity(i);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ADAYLAR.class);
                startActivity(i);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILETISIM.class);
                startActivity(i);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILETISIM.class);
                startActivity(i);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILETISIM.class);
                startActivity(i);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HAKKIMIZDA.class);
                startActivity(i);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILETISIM.class);
                startActivity(i);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), KULLANICI.class);
                startActivity(i);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), GIZLILIK.class);
                startActivity(i);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ANASAYFA.class);
                startActivity(i);
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(FIRMAGIRIS.dondur==false){ Intent i = new Intent(getApplicationContext(), FIRMAGIRIS.class);
                    startActivity(i);}
                if(FIRMAGIRIS.dondur==true){ Intent i = new Intent(getApplicationContext(), FIRMAGIRISPANEL.class);
                    startActivity(i);}

            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(GIRIS.dondur==false){ Intent i = new Intent(getApplicationContext(), GIRIS.class);
                    startActivity(i);}
                if(GIRIS.dondur==true){ Intent i = new Intent(getApplicationContext(), GIRISPANEL.class);
                    startActivity(i);}

            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), KAYIT.class);
                startActivity(i);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILANLAR.class);
                startActivity(i);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILANLAR.class);
                startActivity(i);
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILANLAR.class);
                startActivity(i);
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ILANLAR.class);
                startActivity(i);
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILANLAR.class);
                startActivity(i);
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ILANLAR.class);
                startActivity(i);
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VeriTabanik vt = new VeriTabanik(FIRMAGIRISPANEL.this);
                astt1=edd1.getText().toString();
                astt2=edd2.getText().toString();
                astt3=edd3.getText().toString();
                astt4=edd4.getText().toString();
                astt5=edd5.getText().toString();
if(astt1.isEmpty()||astt2.isEmpty()||astt3.isEmpty()||astt4.isEmpty()||astt5.isEmpty()){
    Toast.makeText(getApplicationContext(),"LUTFEN BOŞLUKLARI DOLDURUNUZ",Toast.LENGTH_LONG).show();

}
else{
    Toast.makeText(getApplicationContext(),"ILAN YAYINLANDI",Toast.LENGTH_LONG).show();

    stt1=edd1.getText().toString();
    stt2=edd2.getText().toString();
    stt3=edd3.getText().toString();
    stt4=edd4.getText().toString();
    stt5=edd5.getText().toString();
    String eklek="\n"+stt2+"\n"+stt3+"\n"+stt4+"\n"+stt5;
    vt.VeriEklek("", "\n"+"\n"+stt1+"\n"+"\n", "\n"+"\n"+eklek+"\n"+"\n","");
    Intent i=new Intent(getApplicationContext(),ILANLAR.class);
    startActivity(i);
}


            }
        });
    }
}
