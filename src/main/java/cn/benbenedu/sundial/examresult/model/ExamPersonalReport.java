package cn.benbenedu.sundial.examresult.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Document
public class ExamPersonalReport {

    @Id
    private String aticket;

    private Long createTime;
    @JsonProperty("lUTime")
    private Long lUTime;

    private String owner;
    private String exam;

    private ExamPersonalReportType type;

    private Map<String, String> data;
    private List<ReportFile> files;
}
