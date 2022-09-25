package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.data.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class GetDocuments(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke(): List<Document> = documentRepository.getDocuments()
}