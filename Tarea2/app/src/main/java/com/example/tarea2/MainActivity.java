package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private static HashMap<String, Boolean> checkbox_states = new HashMap<>();

    // Método estático para inicializar el diccionario checkbox_states
    static {
        checkbox_states.put("agrega_seguro", false);
        checkbox_states.put("agrega_financiamiento", false);
        checkbox_states.put("agrega_taller", false);
        checkbox_states.put("agrega_programa_de_fidelidad", false);
        checkbox_states.put("agrega_arrendamiento", false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Interface Autos
        setContentView(R.layout.autos);

        // Interface especificaciones
        // setContentView(R.layout.especificaciones);
    }

    public void guardarVersion(View view) {

        RadioButton botonSeleccionado = (RadioButton) view;

        int idView = view.getId();

        if(idView == R.id.radioButtonAdvance) {
            Toast.makeText(this,"Has seleccionado Advance",Toast.LENGTH_SHORT).show();
        }
        else if(idView == R.id.radioButtonSRTurbo) {
            Toast.makeText(this,"Has seleccionado SR Turbo",Toast.LENGTH_SHORT).show();
        }
        else if(idView == R.id.radioButtonExclusive){
            Toast.makeText(this,"Has seleccionado Exclusive Turbo",Toast.LENGTH_SHORT).show();
        }
    }

    public void agrega_seguro(View view) {
        if(checkbox_states.get("agrega_seguro")==false){
            checkbox_states.put("agrega_seguro",true);
        } else {
            checkbox_states.put("agrega_seguro",false);
        }
    }

    public void agrega_financiamiento(View view) {
        if(checkbox_states.get("agrega_financiamiento")==false){
            checkbox_states.put("agrega_financiamiento",true);
        } else {
            checkbox_states.put("agrega_financiamiento",false);
        }
    }

    public void agrega_taller(View view) {
        if(checkbox_states.get("agrega_taller")==false){
            checkbox_states.put("agrega_taller",true);
        } else {
            checkbox_states.put("agrega_taller",false);
        }
    }

    public void agrega_programa_de_fidelidad(View view) {
        if(checkbox_states.get("agrega_programa_de_fidelidad")==false){
            checkbox_states.put("agrega_programa_de_fidelidad",true);
        } else {
            checkbox_states.put("agrega_programa_de_fidelidad",false);
        }
    }

    public void agrega_arrendamiento(View view) {
        if(checkbox_states.get("agrega_arrendamiento")==false){
            checkbox_states.put("agrega_arrendamiento",true);
        } else {
            checkbox_states.put("agrega_arrendamiento",false);
        }
    }
}