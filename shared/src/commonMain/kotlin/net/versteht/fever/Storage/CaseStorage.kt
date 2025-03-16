package net.versteht.fever.Storage

import kotlinx.datetime.LocalDate
import net.versteht.fever.Entities.Happening


class CaseStorage(dbDriverFactory: DriverFactoryInterface) : StorageInterface<Happening> {
    private val database = AppDatabase(dbDriverFactory.createDriver())
    private val dbQuery = database.appDatabaseQueries
    private fun mapMe(
        read: net.versteht.fever.Storage.Happening
    ): Happening{
        return net.versteht.fever.Entities.Happening(
            id = read.id.toInt(),
            name = read.name!!,
            started = LocalDate.parse(read.started!!),
            docChecked = read.docChecked!!
        )
    }

    override suspend fun create(t: Happening): Happening {

            dbQuery.insertHappening(
                null,
                t.name,
                t.docChecked,
                t.started.toString()
            )
            return  mapMe(dbQuery.getDateHappening(t.started.toString()).executeAsOne())


    }

    override suspend fun read(id: Int): Happening {
        TODO("Not yet implemented")
    }

    override suspend fun delete(t: Happening): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun update(t: Happening): Happening {
        TODO("Not yet implemented")
    }
}