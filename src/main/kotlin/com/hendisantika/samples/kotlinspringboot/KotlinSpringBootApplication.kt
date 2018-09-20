package com.hendisantika.samples.kotlinspringboot

import com.hendisantika.samples.kotlinspringboot.model.Customer
import com.hendisantika.samples.kotlinspringboot.persistence.CustomerRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinSpringBootApplication {

	@Bean
	fun init(repository: CustomerRepository) = CommandLineRunner {
		repository.save(Customer("Hendi", "Santika"))
		repository.save(Customer("Uzumaki", "Naruto"))
		repository.save(Customer("Uchiha", "Sasuke"))
		repository.save(Customer("Sakura", "Haruno"))
		repository.save(Customer("Hatake", "Kakashi"))
	}
}

fun main(args: Array<String>) {
	SpringApplication.run(KotlinSpringBootApplication::class.java, *args)
}
