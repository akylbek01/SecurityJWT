package peaksoft.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyResponse {

    private Long id;
    private String companyName;
    private String locatedCountry;

}
