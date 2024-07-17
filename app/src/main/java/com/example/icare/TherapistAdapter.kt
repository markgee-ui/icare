package com.example.icare

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.icare.databinding.ItemTherapistBinding
import com.example.icare.model.Therapist

class TherapistAdapter(
    private val therapists: List<Therapist>,
    private val onItemClick: (Therapist) -> Unit
) : RecyclerView.Adapter<TherapistAdapter.TherapistViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TherapistViewHolder {
        val binding = ItemTherapistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TherapistViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TherapistViewHolder, position: Int) {
        holder.bind(therapists[position], onItemClick)
    }

    override fun getItemCount(): Int = therapists.size

    inner class TherapistViewHolder(private val binding: ItemTherapistBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(therapist: Therapist, onItemClick: (Therapist) -> Unit) {
            binding.therapistNameTextView.text = therapist.name
            binding.therapistSpecializationTextView.text = therapist.specialization
            binding.root.setOnClickListener { onItemClick(therapist) }

            // Load profile image using Glide or Picasso if needed
            // Glide.with(binding.root.context).load(therapist.profileImageUrl).into(binding.therapistProfileImageView)
        }
    }
}
