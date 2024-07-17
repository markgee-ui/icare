package com.example.icare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.icare.databinding.ActivityTherapistProfileBinding
import com.example.icare.model.Therapist

class TherapistProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTherapistProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTherapistProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve therapist object from intent extras
        val therapist = intent.getParcelableExtra<Therapist>("therapist")

        // Use therapist object to populate UI
        therapist?.let {
            binding.nameTextView.text = it.name
            binding.specializationTextView.text = it.specialization
            binding.bioTextView.text = it.bio

            // Load profile image using Glide or Picasso if needed
            // Glide.with(this).load(it.profileImageUrl).into(binding.profileImageView)
        }
    }
}