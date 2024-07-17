package com.example.icare

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.icare.databinding.ActivityTherapistListBinding
import com.example.icare.model.Therapist

class TherapistListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTherapistListBinding

    private val therapists = listOf(
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling.") ,
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling."),
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling."),
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling."),
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling."),
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling."),
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling."),
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling."),
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling."),
        Therapist("1", "Dr. Jane Smith", "Clinical Psychology", "url_to_profile_image", "I am a therapist specializing in clinical psychology."),
        Therapist("2", "Dr. John Doe", "Counseling", "url_to_profile_image", "I am a therapist specializing in counseling.")

        // Add more therapists here
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTherapistListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.therapistRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.therapistRecyclerView.adapter = TherapistAdapter(therapists) { therapist ->
            val intent = Intent(this, TherapistProfileActivity::class.java)
            intent.putExtra("therapist", therapist)
            startActivity(intent)
        }
    }
}
