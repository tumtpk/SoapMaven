import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.demo.QuizService;

public class QuizTest {
	
	QuizService quiz;
	String[] arrMon = {"","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	@Before
	public void init() {
		quiz = new QuizService();
	}

	@Test
	public void toDayTest() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		
		String expected = dateFormat.format(date);
		String actual = quiz.toDay();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth1() {
		int month = 1;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth2() {
		int month = 2;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth3() {
		int month = 3;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth4() {
		int month = 4;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth5() {
		int month = 5;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth6() {
		int month = 6;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth7() {
		int month = 7;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth8() {
		int month = 8;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth9() {
		int month = 9;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth10() {
		int month = 10;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth11() {
		int month = 11;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth12() {
		int month = 12;
		String expected = arrMon[month];
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth0() {
		int month = 0;
		String expected = "hello world";
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void getMonth13() {
		int month = 13;
		String expected = "hello world";
		String actual = quiz.getMonth(month);
		
		assertEquals(expected, actual);
	}

}
