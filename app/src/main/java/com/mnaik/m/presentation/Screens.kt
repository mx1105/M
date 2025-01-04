package com.mnaik.m.presentation

/**
 * Created by Monil Naik on 04-01-2025.
 */
sealed class Screen(val route: String) {
    data object CoinListScreen: Screen("m_home_screen")
}