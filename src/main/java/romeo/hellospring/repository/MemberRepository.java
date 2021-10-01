package romeo.hellospring.repository;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    romeo.hellospring.domain.Member save(romeo.hellospring.domain.Member member);

    Optional<romeo.hellospring.domain.Member> findById(Long id);
    Optional<romeo.hellospring.domain.Member> findByName(String name);
    List<romeo.hellospring.domain.Member> findAll();
}

