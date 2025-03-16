package net.versteht.fever.Storage

import app.cash.sqldelight.db.SqlDriver

class NativeDriverFactory : DriverFactoryInterface {
    override fun createDriver(): SqlDriver {
        return NativeSqliteDriver(AppDatabase.Schema, "fever.db")
    }
}