package workshopPreLists;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListPracticalTest {
	private ArrayList<Integer> list;
	private ArrayList<Integer> emptyList;
	private ArrayList<Integer> singleItemList;
	private ArrayList<Integer> nullList;

	@BeforeEach
	public void setup() {
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(20);
		list.add(-90);
		list.add(0);
		list.add(-80);
		emptyList = new ArrayList<Integer>();
		singleItemList = new ArrayList<Integer>();
		singleItemList.add(50);
		nullList = null;
	}

	@Test
	void testFirstItemV1() {
		assertNotNull(ListPractical.firstItemV3(list));
		assertNotNull(ListPractical.firstItemV3(singleItemList));
		assertEquals((Integer)10, ListPractical.firstItemV1(list));
		assertEquals((Integer)50, ListPractical.firstItemV1(singleItemList));
	}

	@Test
	void testFirstItemV2() {
		assertNull(ListPractical.firstItemV2(emptyList));
		assertNotNull(ListPractical.firstItemV3(list));
		assertNotNull(ListPractical.firstItemV3(singleItemList));
		assertEquals((Integer)10, ListPractical.firstItemV3(list));
		assertEquals((Integer)50, ListPractical.firstItemV2(singleItemList));
	}

	@Test
	void testFirstItemV3() {
		assertNull(ListPractical.firstItemV3(nullList));
		assertNull(ListPractical.firstItemV3(emptyList));
		assertNotNull(ListPractical.firstItemV3(list));
		assertNotNull(ListPractical.firstItemV3(singleItemList));
		assertEquals((Integer)10, ListPractical.firstItemV3(list));
		assertEquals((Integer)50, ListPractical.firstItemV3(singleItemList));
	}

	@Test
	void testLastItem() {
		assertTrue(ListPractical.lastItem(nullList)==null);
		assertTrue(ListPractical.lastItem(emptyList)==null);
		assertTrue(ListPractical.lastItem(list)==-80);
	}

	@Test
	void testSumFirstLast() {
		assertTrue(ListPractical.sumFirstLast(nullList)==null);
		assertTrue(ListPractical.sumFirstLast(emptyList)==null);
		assertTrue(ListPractical.sumFirstLast(singleItemList)==50);
		assertTrue(ListPractical.sumFirstLast(list)==-70);
	}
	
	@Test
	void testSum() {
		assertEquals(0, ListPractical.sum(nullList));
		assertEquals(0, ListPractical.sum(emptyList));
		assertEquals(50, ListPractical.sum(singleItemList));
		assertEquals(-70, ListPractical.sum(list));
		list.add(3, 200); //item 200 added at index 3
		assertEquals(130, ListPractical.sum(list));
	}

	@Test
	void testCountPositives() {
		assertTrue(ListPractical.countPositives(nullList)==0);
		assertTrue(ListPractical.countPositives(emptyList)==0);
		assertTrue(ListPractical.countPositives(singleItemList)==1);
		assertTrue(ListPractical.countPositives(list)==3);
		list.add(90); //another 90 added to the end of the list
		assertTrue(ListPractical.countPositives(list)==4);
	}

	@Test
	void testMedian() {
		assertTrue(ListPractical.median(nullList)==null);
		assertTrue(ListPractical.median(emptyList)==null);
		assertTrue(ListPractical.median(singleItemList)==50);
		assertTrue(ListPractical.median(list)==20);
	}

	@Test
	void testAllInRange() {
		assertFalse(ListPractical.allInRange(null, -100, 100));
		assertTrue(ListPractical.allInRange(emptyList, -100, 100));
		assertTrue(ListPractical.allInRange(list, -100, 100));
		assertTrue(ListPractical.allInRange(list, -90, 70));
		assertFalse(ListPractical.allInRange(list, -89, 70));
		assertFalse(ListPractical.allInRange(list, -90, 69));
	}
}
