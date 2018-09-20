package com.hendisantika.samples.kotlinspringboot.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by hendisantika on 6/27/17.
 */
@Entity
class ApplicationUser(
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		var id: Long = 0,

		var username: String = "",

		var password: String = ""
)
