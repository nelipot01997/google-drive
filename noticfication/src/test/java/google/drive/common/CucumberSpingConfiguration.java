package google.drive.common;

import google.drive.NoticficationApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NoticficationApplication.class })
public class CucumberSpingConfiguration {}
