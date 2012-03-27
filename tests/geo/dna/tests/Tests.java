package geo.dna.tests;

import static org.junit.Assert.*;
import geo.dna.GeoDNA;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMod() {
		fail("Not yet implemented");
	}

	@Test
	public void testNormalise() {
		fail("Not yet implemented");
	}

	@Test
	public void testEncodeDoubleDouble() {
		assertEquals("Encoded Position","etctttagatagtgacagtcta",GeoDNA.encode( -41.288889, 174.777222));
	}

	@Test
	public void testEncodeDoubleDoubleInt() {
		
		assertEquals("Encoded Position","etctttagatagtgacagtcta",GeoDNA.encode( -41.288889, 174.777222,22));
		
	}

	@Test
	public void testEncodeDoubleDoubleIntBoolean() {
		assertEquals("Encoded Position","etctttagatagtgacagtcta",GeoDNA.encode( -41.288889, 174.777222,22,false));
	}

	@Test
	public void testPair() {
		fail("Not yet implemented");
	}

	@Test
	public void testBoundingBox() {
		fail("Not yet implemented");
	}

	@Test
	public void testDecodeString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDecodeStringBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddVector() {
		fail("Not yet implemented");
	}

	@Test
	public void testPointFromPointBearingAndDistanceStringDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testPointFromPointBearingAndDistanceStringDoubleDoubleInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testDistanceInKm() {
		fail("Not yet implemented");
	}

	@Test
	public void testNeighbours() {
		fail("Not yet implemented");
	}

	@Test
	public void testNeighboursWithinRadius() {
		fail("Not yet implemented");
	}

	@Test
	public void testReduce() {
		fail("Not yet implemented");
	}

}
