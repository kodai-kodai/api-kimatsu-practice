package dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Track {
    private long id;
    private String title;
    private String artist;
    private LocalDateTime createdAt;
    private Date listenedOn;
    private String comment;

}
