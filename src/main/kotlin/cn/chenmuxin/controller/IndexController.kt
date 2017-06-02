package cn.chenmuxin

import cn.chenmuxin.entity.User
import cn.chenmuxin.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class IndexController @Autowired constructor(var userRepository: UserRepository) {


    @RequestMapping("/")
    fun index() : String {
        return "Hello, world"
    }

    @RequestMapping("/users")
    fun getUser() : List<User> {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    fun newUser(@RequestBody user: User) {
        userRepository.save(user);
    }
}
