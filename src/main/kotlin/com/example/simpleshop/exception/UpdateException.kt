package com.example.simpleshop.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
data class UpdateException(val msg: String) : RuntimeException(msg)
