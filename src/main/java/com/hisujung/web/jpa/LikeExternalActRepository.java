package com.hisujung.web.jpa;

import com.hisujung.web.entity.ExternalAct;
import com.hisujung.web.entity.LikeExternalAct;
import com.hisujung.web.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LikeExternalActRepository extends JpaRepository<LikeExternalAct, Long> {

    List<LikeExternalAct> findByMember(Member member);
    @Query("SELECT l FROM LikeExternalAct l WHERE l.member = :m AND l.activity = :e")
    Optional<LikeExternalAct> findByMemberAndAct(@Param("m") Member m, @Param("e") ExternalAct e);

}
