package org.developersdelicias.roman;

import static org.developersdelicias.roman.RomanNumeralGenerator.romanFor;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralGeneratorShould {

	@Test
	public void generate_a_roman_numeral_for_a_given_decimal_number() throws Exception {
		assertThat(romanFor(1), is("I"));
		assertThat(romanFor(2), is("II"));
		assertThat(romanFor(3), is("III"));
		assertThat(romanFor(4), is("IV"));
		assertThat(romanFor(5), is("V"));
		assertThat(romanFor(7), is("VII"));
		assertThat(romanFor(9), is("IX"));
		assertThat(romanFor(10), is("X"));
		assertThat(romanFor(18), is("XVIII"));
		assertThat(romanFor(30), is("XXX"));
		assertThat(romanFor(2687), is("MMDCLXXXVII"));
		assertThat(romanFor(3499), is("MMMCDXCIX"));
		assertThat(romanFor(3999), is("MMMCMXCIX"));
	}

}
