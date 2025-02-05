package yapp.be.domain.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import yapp.be.domain.port.inbound.DeleteTokenUseCase
import yapp.be.domain.port.outbound.TokenCommandHandler

@Service
class DeleteTokenDomainService(
    private val tokenCommandHandler: TokenCommandHandler
) : DeleteTokenUseCase {

    @Transactional
    override fun deleteTokenByAuthToken(authToken: String) {
        tokenCommandHandler.deleteTokenByAuthToken(authToken)
    }

    @Transactional
    override fun deleteToken(accessToken: String) {
        tokenCommandHandler.deleteToken(accessToken)
    }
}
