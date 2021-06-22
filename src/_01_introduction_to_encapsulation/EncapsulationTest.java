package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulationTest {

	@Test
	void testItemsReceived() {
		EncapsulateTheData eTD = new EncapsulateTheData();
		eTD.setItemsReceived(-3);
		assertEquals(0, eTD.getItemsReceived());
		eTD.setItemsReceived(13);
		assertEquals(13, eTD.getItemsReceived());
	}
	
	@Test
	void testDegreesTurned() {
		EncapsulateTheData eTD = new EncapsulateTheData();
		eTD.setDegreesTurned(-3);
		assertTrue(eTD.getDegreesTurned() - 357 < 0.0);
		eTD.setDegreesTurned(30);
		System.out.println(eTD.getDegreesTurned());
		assertTrue(eTD.getDegreesTurned() - 30 < 0.0);
		eTD.setDegreesTurned(380);
		assertTrue(eTD.getDegreesTurned() - 20 < 0.0);
	}
	
	@Test
	void testNomenclature() {
		EncapsulateTheData eTD = new EncapsulateTheData();
		eTD.setNomenclature("");
		assertEquals(" ", eTD.getNomenclature());
		eTD.setNomenclature("Month/Day/Year");
		assertEquals("Month/Day/Year", eTD.getNomenclature());
	}
	
	@Test
	void testMemberObj() {
		EncapsulateTheData eTD = new EncapsulateTheData();
		eTD.setMemberObj("Cookies");
		assertEquals(true, "Cookie" instanceof Object);
	}

}
