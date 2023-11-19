package mo.ed.myristoranti.core.api

import android.net.Uri
import mo.ed.myristoranti.core.api.data.NetworkConfiguration
import mo.ed.myristoranti.core.repos.AccountRepository
import mo.ed.myristoranti.data.domain.network.NetworkConstants
import javax.inject.Inject

class EndPointBuilder  @Inject constructor(
    private var networkConfiguration: NetworkConfiguration,
    private val accountRepository: AccountRepository,
) {

    enum class OfflinePolicy {
        LOAD_FROM_DB,
        IGNORE
    }
    enum class Versions {
        V1,
        V2,
        V3,
        V4
    }

    private var networkEvent: NetworkConstants.NetworkEvents = NetworkConstants.NetworkEvents.UnDefined

    private var isForceRefresh: Boolean = false
    private val pathParamMap = hashMapOf<String, String>()
    private val queryParamMap = mutableListOf<Pair<String, String>>()
    private var endPoint: String = ""
    private var prefLanguage: String = ""
    private var offlinePolicy: OfflinePolicy = OfflinePolicy.IGNORE

    // sets by default v1 - unless you override setVersion with other value
    private var version: String = Versions.V1.name.lowercase()
    private var versionInEnum: Versions = Versions.V1

    fun setOfflinePolicy(offlinePolicy: OfflinePolicy): EndPointBuilder {
        this.offlinePolicy = offlinePolicy
        return this
    }

    fun setEndPoint(endPoint: String): EndPointBuilder {
        this.endPoint = networkConfiguration.developmentUrl + endPoint
        return this
    }

    fun build(networkEvent: NetworkConstants.NetworkEvents): EndPointObject {
        return EndPointObject(endPoint, networkEvent)
    }

}