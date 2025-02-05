package yapp.be.domain.port.inbound.model

data class EditVolunteerCommand(
    val volunteerId: Long,
    val nickName: String,
    val phoneNum: String,
    val alarmEnabled: Boolean
)
