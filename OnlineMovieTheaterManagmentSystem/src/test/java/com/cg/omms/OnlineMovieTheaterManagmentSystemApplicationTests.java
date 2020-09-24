package com.cg.omms;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.omms.entity.Theater;
import com.cg.omms.exception.TheaterException;
import com.cg.omms.service.TheaterService;

@SpringBootTest
class OnlineMovieTheaterManagmentSystemApplicationTests {
	@Autowired
	TheaterService theaterService;
	
	@Test
	void viewTheater() throws TheaterException {
		List<Theater> list=theaterService.listAllTheaters();
		Assertions.assertThat(list.isEmpty());
	}
	@Test
	void viewTheaterById() throws TheaterException {
		Theater theater=theaterService.findTheaterById(1004);
		assertNotNull(theater);
		
	}

}
