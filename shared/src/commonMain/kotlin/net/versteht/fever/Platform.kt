package net.versteht.fever

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform