package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,user_image,create_time,update_time) values (#{name},#{accountId},#{token},#{userImage},#{createTime},#{updateTime})")
    void insert(User user);
}
