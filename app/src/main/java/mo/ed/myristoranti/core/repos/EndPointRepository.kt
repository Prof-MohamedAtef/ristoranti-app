package mo.ed.myristoranti.core.repos

import mo.ed.myristoranti.core.Result
import mo.ed.myristoranti.core.api.EndPointBuilder
import mo.ed.myristoranti.core.api.data.NetworkConfiguration
import mo.ed.myristoranti.data.domain.network.NetworkConstants
import mo.ed.myristoranti.data.dto.LoginUserRequestBody
import javax.inject.Inject

class EndPointRepository @Inject constructor(
    private val accountRepository: AccountRepository,
    private var networkConfiguration: NetworkConfiguration,
    private var requestBody: Any
) {

    private fun endPointBuilder(): EndPointBuilder {
        return EndPointBuilder(networkConfiguration, accountRepository, requestBody)
    }
    suspend fun getFoodItems(): Result<Any> {
        val endPointObject = endPointBuilder()
            .setEndPoint(NetworkConstants.Url.EndPoints.GETFOODITEMS.url)
            .build(NetworkConstants.NetworkEvents.UnDefined)
        return accountRepository.getFoodItems(endPointObject)
    }

    suspend fun login(phone: String, password: String, deviceName: String): Result<Any> {
        val loginRequest = LoginUserRequestBody(phone, deviceName, password)
        val endPointObject = endPointBuilder()
            .setEndPoint(NetworkConstants.Url.EndPoints.LOGIN.url)
            .setRequestBody(loginRequest)
            .build(NetworkConstants.NetworkEvents.UnDefined)
        return accountRepository.getFoodItems(endPointObject)
    }
}