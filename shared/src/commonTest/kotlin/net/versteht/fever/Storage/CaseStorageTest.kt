import kotlinx.datetime.LocalDate
import net.versteht.fever.Entities.Happening
import net.versteht.fever.Storage.CaseStorage
import net.versteht.fever.Storage.NativeDriverFactory
import kotlin.test.Test

class CaseStorageTest {

    @Test
    fun TestCreate() = runTest{
        val dut = CaseStorage(NativeDriverFactory())
        val toWrite = Happening(
            null,
            "Test",
            LocalDate(2025,1,1),
            false
        )
        dut.create(toWrite)
    }
}