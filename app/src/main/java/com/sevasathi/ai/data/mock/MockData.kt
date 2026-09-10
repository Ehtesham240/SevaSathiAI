package com.sevasathi.ai.data.mock

import com.sevasathi.ai.data.model.Category
import com.sevasathi.ai.data.model.ServiceItem
import com.sevasathi.ai.data.model.StateItem

/**
 * MOCK DATA — Phase 1 only.
 * Phase 2 me yeh sab Room/Retrofit ke through backend se aayega.
 * URLs yahan REAL nahi hain — placeholder hain, taaki koi galat official link na dikhe.
 * Real URLs Phase 2 me service database banate waqt verify karke daalenge.
 */
object MockData {

    val states = listOf(
        StateItem("bihar", "बिहार", "Bihar"),
        StateItem("up", "उत्तर प्रदेश", "Uttar Pradesh"),
        StateItem("jharkhand", "झारखंड", "Jharkhand"),
        StateItem("delhi", "दिल्ली", "Delhi")
    )

    val categories = listOf(
        Category("land_records", "भूमि रिकॉर्ड", "🏠"),
        Category("certificates", "प्रमाण पत्र", "📄"),
        Category("scholarship", "छात्रवृत्ति", "🎓"),
        Category("govt_jobs", "सरकारी नौकरी", "💼"),
        Category("schemes", "योजनाएं", "🏛️"),
        Category("pan", "PAN", "🪪"),
        Category("aadhaar", "Aadhaar", "🆔"),
        Category("pension", "Pension", "💰")
    )

    val services = listOf(
        ServiceItem(
            id = "caste_certificate_bihar",
            categoryId = "certificates",
            nameHi = "जाति प्रमाण पत्र",
            nameEn = "Caste Certificate",
            department = "Revenue Department, Bihar",
            descriptionHi = "जाति प्रमाण पत्र सरकारी योजनाओं, आरक्षण और स्कूल/कॉलेज एडमिशन में काम आता है।",
            officialUrl = "PENDING_VERIFICATION",
            lastVerified = "PENDING_VERIFICATION",
            source = "PENDING_VERIFICATION"
        ),
        ServiceItem(
            id = "income_certificate_bihar",
            categoryId = "certificates",
            nameHi = "आय प्रमाण पत्र",
            nameEn = "Income Certificate",
            department = "Revenue Department, Bihar",
            descriptionHi = "आय प्रमाण पत्र छात्रवृत्ति, सरकारी योजनाओं और कई अन्य कामों के लिए ज़रूरी है।",
            officialUrl = "PENDING_VERIFICATION",
            lastVerified = "PENDING_VERIFICATION",
            source = "PENDING_VERIFICATION"
        )
    )
}
