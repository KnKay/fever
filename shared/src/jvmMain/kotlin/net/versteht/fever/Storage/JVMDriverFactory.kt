package net.versteht.fever.Storage

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver

class JVMDriverFactory : DriverFactoryInterface {
    override fun createDriver(dbName: String): SqlDriver {
        val driver =  JdbcSqliteDriver("jdbc:sqlite:$dbName")
        AppDatabase.Schema.create(driver)
        return driver
    }
}