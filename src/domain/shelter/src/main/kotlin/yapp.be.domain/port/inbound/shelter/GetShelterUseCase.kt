package yapp.be.domain.port.inbound.shelter

import yapp.be.domain.model.Shelter
import yapp.be.domain.model.ShelterOutLink
import yapp.be.domain.model.dto.ShelterDto

interface GetShelterUseCase {
    fun getShelterByAddressAndIsFavorite(address: String, volunteerId: Long?, isFavorite: Boolean?): List<Shelter>
    fun getShelterById(shelterId: Long): Shelter
    fun getShelterByLocationAndIsFavorite(latitude: Double, longitude: Double, size: Int, volunteerId: Long?, isFavorite: Boolean?): List<Shelter>
    fun getVolunteerBookMarkedShelterByVolunteerId(volunteerId: Long): List<Shelter>
    fun getNonMemberShelterInfoById(shelterId: Long): ShelterDto
    fun getMemberShelterInfoByIdAndVolunteerId(shelterId: Long, volunteerId: Long): ShelterDto
    fun getShelterOutLinkByShelterId(shelterId: Long): List<ShelterOutLink>
}
