/*
 * Copyright © 2026, Jill Abarte <keiaa.07.05.00@gmail.com>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.keiaa.safepoint_api.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Name is required")
	@Size(max = 100, message = "Name must be at most 100 characters only")
	private String name;

	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	@Column(unique = true)
	private String email;

	@NotBlank(message = "LRN is required")
	@Size(min = 12, max = 12, message = "LRN must be 12 characters")
	@Column(unique = true)
	private String lrn;

	@NotBlank(message = "Password is required")
	private String password;

	@Column(name = "email_verified", nullable = false)
	private boolean emailVerified = false;
}