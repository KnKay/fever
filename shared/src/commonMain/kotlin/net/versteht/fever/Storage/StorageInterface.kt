package net.versteht.fever.Storage

interface StorageInterface<T> {
    suspend fun create(t: T): T
    suspend fun read(id: Int): T
    suspend fun update(t: T): T
    suspend fun delete(t: T): Boolean
}