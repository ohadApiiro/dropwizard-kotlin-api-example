import org.springframework.data.mongodb.core.mapping.*

@Document
data class AnotherPatient (
        @Id
        val id: ObjectId = ObjectId.get(),
        val name: String,
        val description: String,
        val createdDate: LocalDateTime = LocalDateTime.now(),
        val modifiedDate: LocalDateTime = LocalDateTime.now()
        )