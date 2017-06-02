package cn.chenmuxin.repository

import cn.chenmuxin.entity.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * Created by cmx on 2017/6/2.
 */
@Repository
interface UserRepository : MongoRepository<User, String> {

}