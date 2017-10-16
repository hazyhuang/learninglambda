package test.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import junit.framework.TestCase;

public class StreamSampleTest extends TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void testStreamToList() {
		List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
		assertEquals(Arrays.asList("a", "b", "c"), collected);
	}
	
	@Test
	public void testStreamMap() {
		List<String> collected = Stream.of("a", "b", "hello").map(string -> string.toUpperCase())
				.collect(Collectors.toList());
		assertEquals(Arrays.asList("A", "B", "HELLO"), collected);
	}
	
	@Test
	public void testStreamFilter() {
		List<String> beginningWithNumbers
		= Stream.of("a", "1abc", "abc1")
		.filter(value -> Character.isDigit(value.charAt(0)))
		.collect(Collectors.toList());
		assertEquals(Arrays.asList("1abc"), beginningWithNumbers);
	}
	
	public void testStreamFlatMap() {
	List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
			.flatMap(numbers -> numbers.stream())
			.collect(Collectors.toList());
			assertEquals(Arrays.asList(1, 2, 3, 4), together);
			
		
			
	}

}
