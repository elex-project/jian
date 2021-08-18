/*
 * Project Jian
 * Morse Code
 *
 * Copyright (c) 2014-2021. Elex. All Rights Reserved.
 * https://www.elex-project.com/
 */

package com.elex_project.jian;

import java.util.ArrayList;

/**
 * Created by Elex on 2014-07-12.
 */
public class MorseCode implements Comparable<MorseCode> {
	public static final byte SHORT = 1;//1
	public static final byte LONG = 3;//3
	public static final byte SPACE = -1;//1
	public static final byte SPACE_LETTER = -3;//3
	public static final byte SPACE_WORD = -7;//7

	private char letter;
	private String tag;
	private byte[] morseCode;

	MorseCode(char letter, byte[] code) {
		this.letter = letter;
		this.morseCode = code;
		this.tag = String.valueOf(letter);
	}

	MorseCode(char letter, String tag, byte[] code) {
		this.letter = letter;
		this.morseCode = code;
		this.tag = tag;
	}

	MorseCode(String tag, byte[] code) {
		this.letter = ' ';
		this.morseCode = code;
		this.tag = tag;
	}

	MorseCode(ArrayList<Byte> buffer) {
		this.letter = ' ';
		this.morseCode = new byte[buffer.size()];
		for (int i = 0; i < morseCode.length; i++) {
			morseCode[i] = buffer.get(i);
		}
		this.tag = null;
	}

	public char getLetter() {
		return letter;
	}

	public byte[] getMorseCode() {
		return morseCode;
	}

	public String getTag() {
		return tag;
	}

	public boolean equals(MorseCode other) {
		if (this.morseCode.length != other.getMorseCode().length) {
			return false;
		}
		for (int i = 0; i < this.morseCode.length; i++) {
			if (this.morseCode[i] != other.getMorseCode()[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (byte b : morseCode) {
			switch (b) {
				case SHORT:
					str.append('＊');
					break;
				case LONG:
					str.append('-');
					break;
			}
		}
		return str.toString();
	}

	int estimateDuration() {
		int out = 0;
		for (byte b : morseCode) {
			switch (b) {
				case SHORT:
					out += 1;
					break;
				case LONG:
					out += 3;
					break;
			}
			out++;
		}
		return out;
	}

	@Override
	public int compareTo(MorseCode other) {
		// 소요 시간 비교
		if (this.estimateDuration() > other.estimateDuration()) {
			return 1;
		} else if (this.estimateDuration() < other.estimateDuration()) {
			return -1;
		}

		//
		if (this.letter > other.letter) {
			return 1;
		} else if (this.letter < other.letter) {
			return -1;
		}

		// 짧은게 먼저
		final int len = (this.morseCode.length < other.morseCode.length) ? this.morseCode.length : other.morseCode.length;
		for (int i = 0; i < len; i++) {
			if (this.morseCode[i] == other.morseCode[i]) {
				continue;
			} else if (this.morseCode[i] == LONG) {
				return 1;
			} else if (this.morseCode[i] == SHORT) {
				return -1;
			}
		}

		// 길이 비교
		if (this.morseCode.length > other.morseCode.length) {
			return 1;
		} else if (this.morseCode.length < other.morseCode.length) {
			return -1;
		} else {
			return 0;
		}

	}
}
