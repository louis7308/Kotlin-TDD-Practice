package com.example.tdd.global.annotation.service

import org.springframework.stereotype.Service

@Service
//@Transactional(rollbackFor = [Exception::class])
annotation class TransactionalService()
