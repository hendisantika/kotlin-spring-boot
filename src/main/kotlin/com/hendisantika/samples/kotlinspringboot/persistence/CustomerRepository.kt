package com.hendisantika.samples.kotlinspringboot.persistence

import com.hendisantika.samples.kotlinspringboot.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {
	fun findByLastName(name: String): List<Customer>
}
