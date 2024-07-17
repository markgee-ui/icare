package com.example.icare.model

import android.os.Parcel
import android.os.Parcelable

data class Therapist(
    val id: String,
    val name: String,
    val specialization: String,
    val profileImageUrl: String,
    val bio: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(name)
        parcel.writeString(specialization)
        parcel.writeString(profileImageUrl)
        parcel.writeString(bio)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Therapist> {
        override fun createFromParcel(parcel: Parcel): Therapist {
            return Therapist(parcel)
        }

        override fun newArray(size: Int): Array<Therapist?> {
            return arrayOfNulls(size)
        }
    }
}
