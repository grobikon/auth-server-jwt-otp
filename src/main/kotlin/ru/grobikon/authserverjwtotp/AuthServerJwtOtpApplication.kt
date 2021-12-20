package ru.grobikon.authserverjwtotp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthServerJwtOtpApplication

fun main(args: Array<String>) {
    runApplication<AuthServerJwtOtpApplication>(*args)
}
