package net.versteht.fever.Storage

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import java.sql.SQLException

class JVMDriverFactory : DriverFactoryInterface {
    override fun createDriver(dbName: String): SqlDriver {
        val driver: JdbcSqliteDriver
        if (dbName.isNotBlank()){
            driver =  JdbcSqliteDriver("jdbc:sqlite:$dbName")
        }
        else {
            driver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
        }

        try{
            AppDatabase.Schema.create(driver)
        }
        catch  (e: SQLException){
            //ToDo: Make something more usefull here
        }
        return driver
    }
}