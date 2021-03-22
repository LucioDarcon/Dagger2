package com.example.core.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long?      = null,
    val name: String?  = null,
    val email: String? = null
)