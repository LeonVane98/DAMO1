package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iniciar()
    }

    private fun iniciar() {
        binding.btnSuma.setOnClickListener {
            val num1: Int = binding.eTNum1.text.toString().toInt()
            val num2: Int = binding.eTNum2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val suma = op.sumar()
            binding.tVRes.text = suma.toString()
        }
        binding.btnResta.setOnClickListener {
            val n1: Int = binding.eTNum1.text.toString().toInt()
            val n2: Int = binding.eTNum2.text.toString().toInt()
            val op = Operacion(n1, n2)
            binding.tVRes.text = op.restar().toString()
        }
        binding.btnProducto.setOnClickListener {
            val n1: Int = binding.eTNum1.text.toString().toInt()
            val n2: Int = binding.eTNum2.text.toString().toInt()
            val op = Operacion(n1, n2)
            binding.tVRes.text = op.multiplicar().toString()
        }
        binding.btnDiv.setOnClickListener {
            val n1: Int = binding.eTNum1.text.toString().toInt()
            val n2: Int = binding.eTNum2.text.toString().toInt()
            val op = Operacion(n1, n2)
            binding.tVRes.text = op.dividir().toString()
        }
    }
}