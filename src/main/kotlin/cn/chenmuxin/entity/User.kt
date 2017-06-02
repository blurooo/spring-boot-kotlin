package cn.chenmuxin.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id

data class User(
        @Id
        var id : String = ObjectId.get().toString(),
        var username : String = "",
        var password : String = ""
)
