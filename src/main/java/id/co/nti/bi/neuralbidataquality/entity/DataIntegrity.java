package id.co.nti.bi.neuralbidataquality.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "data_integrity", schema = "data_quality")
public class DataIntegrity {
    @Id
    @GeneratedValue
    private UUID id;
    private String origin;
    private String time_ingest;
    private String time_dimension;
    private String time_value;
    private String name;
    private String measurement;
    private Integer value;
    private String unit;

//    @Column(name = "created_at", updatable = false, nullable = false)
//    @JsonProperty
//    private Timestamp createdAt = Timestamp.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//
//    @Column(name = "created_by", updatable = false, nullable = false)
//    @JsonProperty("created_by")
//    private String createdBy = "Unknown";
}
