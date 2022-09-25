package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.data.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class SetDocument(private val documentRepository: DocumentRepository) {

    operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}