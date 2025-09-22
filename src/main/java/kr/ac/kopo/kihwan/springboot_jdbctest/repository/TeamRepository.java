package kr.ac.kopo.kihwan.springboot_jdbctest.repository;

import kr.ac.kopo.kihwan.springboot_jdbctest.domain.Player;
import kr.ac.kopo.kihwan.springboot_jdbctest.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
}
