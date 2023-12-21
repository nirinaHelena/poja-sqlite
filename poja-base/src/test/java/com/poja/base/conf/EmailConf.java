package com.poja.base.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.base.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
