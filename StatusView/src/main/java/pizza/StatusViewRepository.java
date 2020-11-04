package pizza;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StatusViewRepository extends CrudRepository<StatusView, Long> {

    // LDH 20201104 중복 건 삭제
    List<StatusView> findByOrderId(Long orderId);

}