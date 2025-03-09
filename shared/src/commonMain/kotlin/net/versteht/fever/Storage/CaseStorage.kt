package net.versteht.fever.Storage

import net.versteht.fever.entities.Case

class CaseStorage : StorageInterface<Case> {
    override suspend fun Create(t: Case): Case {
        TODO("Not yet implemented")
    }

    override suspend fun Read(id: Int): Case {
        TODO("Not yet implemented")
    }

    override suspend fun Delete(t: Case): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun Update(t: Case): Case {
        TODO("Not yet implemented")
    }
}