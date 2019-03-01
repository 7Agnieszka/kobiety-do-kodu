package mojProjekt;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InterfejsTest
{
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("rozpoczynam klase testow");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("koncze klase testow");
	}
	
	@Before
	public void setUp() throws Exception
	{
		System.out.println("rozpoczynam test");
	}
	
	@After
	public void tearDown() throws Exception
	{
		System.out.println("koncze test");
	}
	
	@Test
	public void powinienZamienicPoprawnaDate()
	{
		
		String datka = "2018.08.12";
		LocalDate oczekiwane = LocalDate.of(2018, 8, 12);
		
		LocalDate wynik = Interfejs.zamienDate(datka);
		
		assertEquals(oczekiwane, wynik);
	}
	
	@Test
	public void powinienZamienicPustaDate()
	{
		
		String datka = "";
		LocalDate oczekiwane = LocalDate.MIN;
		
		LocalDate wynik = Interfejs.zamienDate(datka);
		
		assertEquals(oczekiwane, wynik);
	}
	
	
	@Test
	public void powinienZamienicNullDate()
	{
		
		String datka = null;
		LocalDate oczekiwane = LocalDate.MIN;
		
		LocalDate wynik = Interfejs.zamienDate(datka);
		
		assertEquals(oczekiwane, wynik);
	}
	
	@Test(expected=DateTimeParseException.class)
	public void powinienZwrocicWyjatekGdyBlednaData()
	{
		
		String datka = "abc";
		
		Interfejs.zamienDate(datka);
	}
	
}
