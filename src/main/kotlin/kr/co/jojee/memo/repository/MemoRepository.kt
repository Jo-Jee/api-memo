package kr.co.jojee.memo.repository

import kr.co.jojee.memo.entity.Memo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemoRepository: JpaRepository<Memo, Long?> {
}