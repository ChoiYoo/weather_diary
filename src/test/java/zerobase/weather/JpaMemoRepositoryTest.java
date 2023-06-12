package zerobase.weather;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Memo;
import zerobase.weather.repository.JdbcMemoRepository;
import zerobase.weather.repository.JpaMemoRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;


@SpringBootTest
@Transactional
class JpaMemoRepositoryTest {
	@Autowired
	JpaMemoRepository jpaMemoRepository;

	@Test
	void insertMemoTest(){
	    //given
		Memo newMemo = new Memo(10, "this si jpa memo");

	    //when
		jpaMemoRepository.save(newMemo);

	    //then
		List<Memo> memoList = jpaMemoRepository.findAll();
		assertTrue(memoList.size() > 0);
	}
	@Test
	void findById(){
	    //given
		Memo newMemo = new Memo(11, "jpa");

	    //when
		Memo memo = jpaMemoRepository.save(newMemo);
		System.out.println(memo.getId());

	    //then
		Optional<Memo> result = jpaMemoRepository.findById(memo.getId());
		assertEquals(result.get().getText(), "jpa");
	}
}
