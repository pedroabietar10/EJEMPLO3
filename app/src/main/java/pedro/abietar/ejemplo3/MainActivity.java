package pedro.abietar.ejemplo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.e("ESTADOS","6-ESTOY EN EL METODO DESTROY");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5-ESTOY EN EL METODO STOP");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4-ESTOY EN EL METODO PAUSE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3-Estoy en el metodo Resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2-Estoy en el metodo Start");
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ESTADOS","1-Estoy en el metodo Create");
    }
}