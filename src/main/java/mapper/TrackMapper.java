package mapper;

import dto.Track;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TrackMapper {
    @Select("SELECT * FROM tracks ORDER BY created_at DESC")
    List<Track> findAll();

    @Insert("INSERT INTO tracks (title, artist) VALUES (#{title}, #{artist})")
    @Options(useGeneratedKeys = true, keyProperty = "id,createdAt", keyColumn = "id,created_at")
    int insert(Track track);

    @Select("SELECT * FROM tracks WHERE id = #{id}")
    Track findById (long id);

    @Delete("DELETE FROM tracks WHERE id = #{id}")
    int delete(long id);

//    @Update("UPDATE tracks SET title = #{title}, content = #{content} WHERE id = #{id}")
//    int update(Track note);
//
//    @Update("UPDATE tracks SET listened_on = #{listenedOn}, comment = #{comment} WHERE id = #{id}")
//    int updateForComment (Track note);

}
