package mum.swe.mumsched.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import mum.swe.mumsched.repository.ScheduleRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScheduleServiceTests {

//    private FacultyRepository facultyRepository;
//    private StudentRepository studentRepository;
    
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@MockBean
    private ScheduleRepository scheduleRepository;

	@Autowired
    private ScheduleService scheduleService;
        
//	@Test
//	public void testSave()  throws Exception{
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFindByUsername() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSimple() {
		assertEquals(1,1);
	}

//	@Test
//	public void testFindOne() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDelete() {
//		fail("Not yet implemented");
//	}

}
