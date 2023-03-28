package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String Id;
    private String VideoId;
    private String Url;
}
