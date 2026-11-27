package exception;

public class TrackNotFoundException extends RuntimeException {
    public TrackNotFoundException(long id) {
        super("指定されたIDのノートが見つかりません:" + id);
    }
}
