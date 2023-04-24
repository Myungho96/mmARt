package com.ssafy.mmart.repository

import com.ssafy.mmart.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Int> {

}