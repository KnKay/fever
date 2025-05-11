package net.versteht.fever.Storage

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver

class IOSDriverFactory : DriverFactoryInterface {
    override fun createDriver(dbName: String): SqlDriver {
        return NativeSqliteDriver(AppDatabase.Schema, dbName)
    }
}