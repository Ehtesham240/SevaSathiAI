package com.sevasathi.ai.data.model

/**
 * Yeh sab models baad me backend API se aayenge (Phase 2/3).
 * Abhi Phase 1 me sirf UI/Navigation test karne ke liye mock objects use ho rahe hain.
 */

data class StateItem(
    val id: String,
    val nameHi: String,
    val nameEn: String
)

data class Category(
    val id: String,
    val nameHi: String,
    val icon: String // emoji ya icon-name placeholder
)

data class ServiceItem(
    val id: String,
    val categoryId: String,
    val nameHi: String,
    val nameEn: String,
    val department: String,
    val descriptionHi: String,
    val officialUrl: String,
    val lastVerified: String,
    val source: String
)
