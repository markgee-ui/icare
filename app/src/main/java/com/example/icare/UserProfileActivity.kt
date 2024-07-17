package com.example.icare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.icare.databinding.ActivityUserProfileBinding
import com.example.icare.model.User

class UserProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example user data (replace with actual user data)
        val user = User(
            id = "1",
            name = "John Doe",
            email = "john.doe@example.com",
            profileImageUrl = "url_to_profile_image",
            bio = "I am a user of the icare platform."
        )

        // Bind user data to views
        binding.nameTextView.text = user.name
        binding.emailTextView.text = user.email
        binding.bioTextView.text = user.bio

        // Load profile image using Glide or Picasso library
        // Glide.with(this).load(user.profileImageUrl).into(binding.profileImageView)
    }
}
