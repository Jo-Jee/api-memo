package kr.co.jojee.memo.controller

import kr.co.jojee.memo.service.MemoService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/memo")
class MemoController(
    val memoService: MemoService
) {
}