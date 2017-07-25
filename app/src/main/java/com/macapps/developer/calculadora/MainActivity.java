package com.macapps.developer.calculadora;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.macapps.developer.calculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Operacion operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operacion = new Operacion();


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + ".");
            }
        });

        binding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "0");
            }
        });

        binding.buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "1");
            }
        });

        binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "2");
            }
        });

        binding.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "3");
            }
        });

        binding.buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "4");
            }
        });

        binding.buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "5");
            }
        });

        binding.buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "6");
            }
        });

        binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "7");
            }
        });

        binding.buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "8");
            }
        });

        binding.buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "9");
            }
        });
        binding.buttonDot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText().append("."));
            }
        });
        binding.buttonAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion.setOperando1(Long.parseLong(binding.editText.getText().toString()));
                operacion.setOperando(1);
                binding.editText.setText("0");



            }
        });
        binding.buttonSubtract.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion.setOperando1(Long.parseLong(binding.editText.getText().toString()));
                operacion.setOperando(2);
                binding.editText.setText("0");
            }
        });
        binding.buttonDivide.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion.setOperando1(Long.parseLong(binding.editText.getText().toString()));
                operacion.setOperando(3);
                binding.editText.setText("");

            }
        });
        binding.buttonClear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.infoTextView.setText("0");
                binding.editText.setText("0");
            }
        });
        binding.buttonMultiply.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion.setOperando1(Long.parseLong(binding.editText.getText().toString()));
                operacion.setOperando(4);
                binding.editText.setText("");
            }
        });

        binding.buttonEqual.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                if (!binding.editText.getText().toString().equals("")) {
                    operacion.setOperando2(Long.parseLong(binding.editText.getText().toString()));

                    switch (operacion.getOperando()) {
                        case 1:
                            operacion.suma();
                            binding.infoTextView.setText(String.valueOf(operacion.getResultado()));
                            binding.editText.setText("0");
                            break;
                        case 2:
                            operacion.resta();
                            binding.infoTextView.setText(String.valueOf(operacion.getResultado()));
                            binding.editText.setText("0");
                            break;
                        case 3:
                            if (operacion.getOperando2() != 0) {


                                operacion.division();
                                binding.infoTextView.setText(String.valueOf(operacion.getResultado()));
                                binding.editText.setText("");
                            } else {
                                Toast.makeText(MainActivity.this, "MathError, no se puede dividir entre 0", Toast.LENGTH_SHORT).show();
                            }
                            break;
                        case 4:
                            operacion.multiplicacion();
                            binding.infoTextView.setText(String.valueOf(operacion.getResultado()));
                            binding.editText.setText("0");
                            break;

                        default:
                            Toast.makeText(MainActivity.this, "Nada", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Ingrese numero 2", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
