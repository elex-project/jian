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

		morseCodes.add(new MorseCode('ㄱ', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㄴ', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㄷ', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㄹ', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅁ', new byte[]{MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅂ', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅅ', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅇ', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅈ', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅊ', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅋ', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅌ', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅍ', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅎ', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅏ', new byte[]{MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅑ', new byte[]{MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅓ', new byte[]{MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅕ', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅗ', new byte[]{MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅛ', new byte[]{MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅜ', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅠ', new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅡ', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ㅣ', new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅐ', new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ㅔ', new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));

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

		morseCodes.add(new MorseCode('à',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ä',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('å',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ą',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('æ',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ć',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ĉ',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ç',
				new byte[]{MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode("ch",
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('đ',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ð',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('é',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('è',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ę',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ĝ',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ĥ',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ĵ',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ł',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ń',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ñ',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ó',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ö',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ø',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ś',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ŝ',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('š',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('þ',
				new byte[]{MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ü',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ŭ',
				new byte[]{MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.LONG}));
		morseCodes.add(new MorseCode('ź',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG, MorseCode.SHORT}));
		morseCodes.add(new MorseCode('ż',
				new byte[]{MorseCode.LONG, MorseCode.LONG, MorseCode.SHORT, MorseCode.SHORT, MorseCode.LONG}));

		return morseCodes;
	}
}
