package com.hendisantika.samples.kotlinspringboot.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GenerationType
import javax.persistence.GeneratedValue

@Entity
class Customer(
		var firstName: String = "",
		var lastName: String = "",
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		var id: Long = 0
)
