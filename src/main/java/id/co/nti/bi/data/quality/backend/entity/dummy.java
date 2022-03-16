package id.co.nti.bi.data.quality.backend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "data_quality_dummy", schema = "public")
public class dummy {
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
}
