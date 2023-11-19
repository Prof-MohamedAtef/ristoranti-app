package mo.ed.myristoranti.core.repos

import mo.ed.myristoranti.core.Result
import mo.ed.myristoranti.core.api.EndPointBuilder
import mo.ed.myristoranti.core.api.data.NetworkConfiguration
import mo.ed.myristoranti.data.domain.network.NetworkConstants
import javax.inject.Inject

class EndPointRepository @Inject constructor(
    private val accountRepository: AccountRepository,
    private var networkConfiguration: NetworkConfiguration,
) {

    private fun endPointBuilder(): EndPointBuilder {
        return EndPointBuilder(networkConfiguration, accountRepository)
    }
    suspend fun getFoodItems(): Result<Any> {
        val endPointObject = endPointBuilder()
            .setEndPoint(NetworkConstants.Url.EndPoints.GETFOODITEMS.url)
            .build(NetworkConstants.NetworkEvents.UnDefined)
        return accountRepository.getFoodItems(endPointObject)
    }
}