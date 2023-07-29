package io.github.yaowenbin.auth.persistent;

import com.mybatisflex.core.BaseMapper;
import com.mybatisflex.core.query.QueryWrapper;
import io.github.yaowenbin.auth.model.User;
import org.apache.ibatis.annotations.Mapper;

import static io.github.yaowenbin.auth.model.table.UserTableDef.USER;

/**
 * @Author yaowenbin
 * @Date 2023/7/20
 */
public interface UserMapper extends BaseMapper<User> {

    default User selectOneByUsername(String username) {
        return selectOneByQuery(QueryWrapper.create().where(USER.USERNAME.eq(username)));
    }
}
