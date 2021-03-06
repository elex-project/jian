/*
 * Project Jian
 * Morse Code
 *
 * Copyright (c) 2014-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.jian;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Elex on 2014-07-12.
 */
public class MorseCodeFactory {

	public static Set<MorseCode> buildRoman(Set<MorseCode> morseCodes) {
		if (morseCodes == null) morseCodes = new HashSet<>();

		morseCodes.add(new MorseCode('a', new byte[]{MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('b', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('c', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('d', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('e', new byte[]{MorseCode.SHORT}));
		morseCodes.add(new MorseCode('f', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('g', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('h', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('i', new byte[]{MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('j', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('k', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('l', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('m', new byte[]{MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('n', new byte[]{MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('o', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('p', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('q', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('r', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('s', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('t', new byte[]{MorseCode.LONG}));
		morseCodes.add(new MorseCode('u', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('v', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('w', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('x', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('y', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('z', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		return morseCodes;
	}

	public static Set<MorseCode> buildKorean(Set<MorseCode> morseCodes) {
		if (morseCodes == null) morseCodes = new HashSet<>();

		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('???', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));

		return morseCodes;
	}

	public static Set<MorseCode> buildNumeral(Set<MorseCode> morseCodes) {
		if (morseCodes == null) morseCodes = new HashSet<>();

		morseCodes.add(new MorseCode('1', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('2', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('3', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('4', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('5', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('6', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('7', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('8', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('9', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('0', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));

		return morseCodes;
	}

	public static ArrayList<MorseCode> buildPunctuation(ArrayList<MorseCode> morseCodes) {
		if (morseCodes == null) morseCodes = new ArrayList<MorseCode>();

		morseCodes.add(new MorseCode('.', "Full stop",
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode(',',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('?',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('\'', "Apostrophe",
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('!',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('/', "Fraction bar or division sign",
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('(',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode(')',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('&',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode(':', "Colon or division sign",
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode(';',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('=',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('+',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('-',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('_',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('"',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('$',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('@',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('*', "Multiplication sign",
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));

		return morseCodes;
	}

	public static Set<MorseCode> buildProsign(Set<MorseCode> morseCodes) {
		if (morseCodes == null) morseCodes = new HashSet<>();

		morseCodes.add(new MorseCode("End of Work",
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode("Error",
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode("Invitation to Transmit",
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode("Starting Signal",
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode("Understood",
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode("Wait",
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));

		return morseCodes;
	}

	public static Set<MorseCode> buildLatinExtension(Set<MorseCode> morseCodes) {
		if (morseCodes == null) morseCodes = new HashSet<>();

		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode("ch",
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('??',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));

		return morseCodes;
	}
}
