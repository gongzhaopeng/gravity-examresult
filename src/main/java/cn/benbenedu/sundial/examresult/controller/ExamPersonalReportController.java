package cn.benbenedu.sundial.examresult.controller;

import cn.benbenedu.sundial.examresult.model.ExamPersonalReport;
import cn.benbenedu.sundial.examresult.model.ExamPersonalReportType;
import org.bson.types.ObjectId;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/genesis/examreports")
public class ExamPersonalReportController {

    @GetMapping("/to/ticket/{ticket-id}")
    public ExamPersonalReport getExamReportByAticket(
            @PathVariable("ticket-id") String ticketId,
            OAuth2Authentication auth) {

        // TODO this implementation is just a placeholder.

        final var mockedReport = new ExamPersonalReport();
        mockedReport.setAticket(ticketId);

        final var now = System.currentTimeMillis();
        mockedReport.setCreateTime(now);
        mockedReport.setLUTime(now);

        mockedReport.setOwner(ObjectId.get().toString());
        mockedReport.setExam(ObjectId.get().toString());

        mockedReport.setType(ExamPersonalReportType.Undefined);

        mockedReport.setData(Map.of(
                "title", "Mocked Personal Exam Report",
                "k1", "v1",
                "k2", "v2",
                "kn", "vn"
        ));

        return mockedReport;
    }
}
