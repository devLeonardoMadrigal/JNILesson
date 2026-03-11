package com.example.jnilesson.domain

data class BenchmarkStats(
    val mode: String = "",
    val firstRun: Long = 0L,
    val warmAvg: Long = 0L,
    val isNative: Boolean = false,
)
