package com.editor.freephotoeditor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.editor.freephotoeditor.databinding.ActivityResultBinding;
public class result_Activity extends AppCompatActivity {

    ActivityResultBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        binding.image.setImageURI(getIntent().getData());

    }
}