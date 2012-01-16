/**
 * Copyright (C) 2011 Stephen More
 *
 * This file is part of jamr.
 *
 * jamr is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jamr is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jamr.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.googlecode.jamr.plug;

public class JamrDataConfig {
	private String accessCode;
	private int itemsInQueue;
	private int minutesBetween;

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String ac) {
		this.accessCode = ac;
	}

	public int getItemsInQueue() {
		return itemsInQueue;
	}

	public void setItemsInQueue(int i) {
		this.itemsInQueue = i;
	}

	public int getMinutesBetween() {
		return minutesBetween;
	}

	public void setMinutesBetween(int mb) {
		this.minutesBetween = mb;
	}
}
