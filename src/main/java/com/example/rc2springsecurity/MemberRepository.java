package com.example.rc2springsecurity;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface MemberRepository extends JpaRepository<Member, Long>{

    // traduce select * from members where name = 'paquito'
    Member findByName(String name);
    
}
