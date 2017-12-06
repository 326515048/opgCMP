package com.opg.jpademo.LoginUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by fan.shijun on 2017-12-04.
 */
public interface LoginUserRepository extends JpaRepository<LoginUser, Long> {
    @Query(value = "select * from login_user t where t.user_name = ?1 and t.user_pwd = ?2",nativeQuery = true)
    List<LoginUser> findByNameAndPwd(String username, String userpwd);
}
