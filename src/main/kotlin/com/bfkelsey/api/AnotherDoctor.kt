import org.springframework.data.cassandra.core.mapping.Table

@Table
data class AnotherDoctor (
        @Id
        val id: ObjectId = ObjectId.get(),
        val name: String,
        val description: String,
        val createdDate: LocalDateTime = LocalDateTime.now(),
        val modifiedDate: LocalDateTime = LocalDateTime.now()
        )