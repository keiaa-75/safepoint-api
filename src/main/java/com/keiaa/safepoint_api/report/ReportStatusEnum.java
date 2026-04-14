/*
 * Copyright © 2026, Jill Abarte <keiaa.07.05.00@gmail.com>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.keiaa.safepoint_api.report;

public enum ReportStatusEnum {
	PENDING_REVIEW("Pending Review"),
	UNDER_REVIEW("Under Review"),
	RESOLVED("Resolved"),
	REJECTED("Rejected");

	private final String displayName;

	ReportStatus(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}