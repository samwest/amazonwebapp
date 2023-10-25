package com.amazon.webapp.amazonwebapp.data;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class Greeting {

    private long id;

    private String content;

}
