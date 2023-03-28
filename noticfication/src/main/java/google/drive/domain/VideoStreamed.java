package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String id;
    private String videoId;
    private String url;
}
