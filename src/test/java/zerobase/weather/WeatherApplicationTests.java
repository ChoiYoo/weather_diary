package zerobase.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// junit으로 불러오기
import static org.junit.Assert.*;


@SpringBootTest
class WeatherApplicationTests {

	@Test
	void equalTest(){
		assertEquals(1, 1); // (기댓값, 실제로 들어온 값)
	}

	@Test
	void nullTest(){
		assertNull(null);
//		assertNull(1); // result : fail
	}

	@Test
	void trueTest(){
		assertTrue(1==1);
	}

}
