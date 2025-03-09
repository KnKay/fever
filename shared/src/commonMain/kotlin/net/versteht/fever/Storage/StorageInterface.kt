package net.versteht.fever.Storage

interface StorageInterface<T> {
    suspend fun Create(t: T): T
    suspend fun Read(id: Int): T
    suspend fun Update(t: T): T
    suspend fun Delete(t: T): Boolean
}