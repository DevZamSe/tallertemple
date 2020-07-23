package com.devzamse.android.tallertemple;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class broma extends AppCompatActivity {

    Button foto;
    ImageView imagen;
    int a = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broma);

        foto = findViewById(R.id.foto);
        imagen = findViewById(R.id.imagen);

        int permissionCheck = ContextCompat.checkSelfPermission(broma.this, Manifest.permission.CAMERA);
        if(permissionCheck != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(broma.this, new String[]{Manifest.permission.CAMERA},225);
        } else {
            EventoClick(foto);
        }
    }

    private void EventoClick(Button foto) {
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, a);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode != 0 && requestCode == a){
            Log.e("error", "no hay error");
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imagen.setImageBitmap(bitmap);
        }
    }

//    @Override
//    public void startActivityForResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.startActivityForResult(data, resultCode, requestCode);
//        if(requestCode == a){
//            Log.e("error", "no hay error");
//            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
//            imagen.setImageBitmap(bitmap);
//        }
//    }
}
