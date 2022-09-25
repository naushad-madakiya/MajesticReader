package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.data.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class GetOpenDocument(private val documentRepository: DocumentRepository) {

    operator fun invoke(): Document = documentRepository.getOpenDocument()
}