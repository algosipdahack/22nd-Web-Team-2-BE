package yapp.be.domain.port.inbound

import yapp.be.domain.model.ObservationAnimal
import yapp.be.model.enums.observaitonanimal.Gender

interface CreateObservationAnimalUseCase {
    fun addObservationAnimal(
        shelterId: Long,
        images: List<String>,
        name: String,
        age: String?,
        gender: Gender?,
        breed: String??,
        specialNote: String
    ): ObservationAnimal
}
