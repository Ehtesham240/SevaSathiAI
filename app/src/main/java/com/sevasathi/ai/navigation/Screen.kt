package com.sevasathi.ai.navigation

/**
 * Sabhi screens ke navigation routes yahan ek jagah define hain.
 * Naya screen add karna ho to bas yahan ek naya object add karo.
 */
sealed class Screen(val route: String) {
    data object Splash : Screen("splash")
    data object Onboarding : Screen("onboarding")
    data object StateSelect : Screen("state_select")
    data object Home : Screen("home")
    data object Search : Screen("search")
    data object CategoryList : Screen("category/{categoryId}") {
        fun createRoute(categoryId: String) = "category/$categoryId"
    }
    data object ServiceDetail : Screen("service/{serviceId}") {
        fun createRoute(serviceId: String) = "service/$serviceId"
    }
}
