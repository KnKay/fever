package net.versteht.fever.Storage
import app.cash.sqldelight.db.SqlDriver


interface DriverFactoryInterface {
    fun createDriver(dbName: String): SqlDriver
}
