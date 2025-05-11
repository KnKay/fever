import kotlinx.datetime.LocalDate
import net.versteht.fever.Entities.Happening
import net.versteht.fever.Storage.CaseStorage
import net.versteht.fever.Storage.JVMDriverFactory
import kotlin.test.*
import kotlinx.coroutines.test.*

class CaseStorageTest {

    @Test
    fun TestCreate() = runTest{
        val dut = CaseStorage(JVMDriverFactory())
        val toWrite = Happening(
            null,
            "Test",
            LocalDate(2025,1,1),
            false
        )
        dut.create(toWrite)
        val readback = dut.list()
        assertTrue(readback.isNotEmpty())
    }
}