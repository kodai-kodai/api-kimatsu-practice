package service;

import dto.Track;
import exception.TrackArgumentNotValidException;
import exception.TrackNotFoundException;
import org.springframework.stereotype.Service;
import repository.TrackRepository;

import java.util.List;

@Service
public class TrackService {
    private final TrackRepository trackRepository;

    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }
    public List<Track> findAll() {
        return trackRepository.findAll();
    }

    public Track saveTrack(Track track){
        if (track.getTitle() == null || track.getTitle().isEmpty()){
            throw new TrackArgumentNotValidException("Title is empty");
        }

        if(track.getArtist() == null || track.getArtist().isEmpty()){
            throw new TrackArgumentNotValidException("Artist is empty");
        }

        trackRepository.insertTrack(track);
        return track;
    }

    public Track findById(long id){
        Track track = trackRepository.findById(id);
        if (track == null){
            throw new TrackNotFoundException(id);
        }

        return track;
    }

    public boolean delete(long id){
        if (!trackRepository.delete(id)) {
            throw new TrackNotFoundException(id);
        }
        return true;
    }
}
