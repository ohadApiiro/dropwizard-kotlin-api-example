import org.springframework.data.cassandra.core.mapping.*

@Table
data class Doctor (
        @Id
        val id: ObjectId = ObjectId.get(),
        val name: String,
        val description: String,
        val createdDate: LocalDateTime = LocalDateTime.now(),
        val modifiedDate: LocalDateTime = LocalDateTime.now()
        )