package com.example.tdd.global.annotation.service

import org.springframework.stereotype.Service

@Service
//@Transactional(readOnly = true, rollbackFor = [Exception::class])
annotation class ReadOnlyService()
