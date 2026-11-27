package repository;

import dto.Track;
import mapper.TrackMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrackRepository {
    private final TrackMapper trackMapper;

    public TrackRepository(TrackMapper trackMapper) {
        this.trackMapper = trackMapper;
    }
    public List<Track> findAll() {
        return trackMapper.findAll();
    }

    public int insertTrack(Track track){
        return trackMapper.insert(track);
    }

    public Track findById(long id){
        return trackMapper.findById(id);
    }

    public boolean delete(long id){
        return trackMapper.delete(id) > 0;
    }

//    public Track update(Track track){
//        if(trackMapper.update(track)== 0){
//            throw new TrackNotFoundException(track.getId());
//        }
//        return track;
//    }
}
