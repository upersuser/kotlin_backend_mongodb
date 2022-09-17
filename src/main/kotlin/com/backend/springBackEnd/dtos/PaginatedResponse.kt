package com.backend.springBackEnd.dtos

class PaginatedResponse(
    val data: List<Any>,
    val total: Int,
    val page: Int,
    val last_page: Int
) {
}