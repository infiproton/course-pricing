package org.sample.course.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.sample.course.model.enums.CoursePricingType;
import org.sample.course.model.enums.CurrencyUom;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CourseDto {
    private Integer courseId;
    private String name;
    private CoursePricingType coursePricingType;

    private CurrencyUom currencyUom;
    private BigDecimal coursePrice = BigDecimal.ZERO;
}
