package mo.ed.myristoranti.core.api.data

class NetworkConfiguration {

//    private val contentProdBaseUrl: String = BuildConfig.PROD_CONTENT_HOST_URL
//    private val accountProdBaseUrl: String = BuildConfig.PROD_ACCOUNT_HOST_URL
//    private val securityProdBaseUrl: String = BuildConfig.PROD_SECURITY_HOST_URL
//    private val notificationProdBaseUrl: String = BuildConfig.PROD_NOTIFICATION_HOST_URL
//    private val chatProdBaseUrl: String = BuildConfig.DEV_CHAT_URL
//
//    private val contentDevBaseUrl: String = BuildConfig.DEV_CONTENT_HOST_URL
//    private val chatDevBaseUrl: String = BuildConfig.DEV_CHAT_URL
//    private val accountDevBaseUrl: String = BuildConfig.DEV_ACCOUNT_HOST_URL
//    private val securityDevBaseUrl: String = BuildConfig.DEV_SECURITY_HOST_URL
//    private val notificationDevBaseUrl: String = BuildConfig.DEV_NOTIFICATION_HOST_URL
//
//    private val contentMockBaseUrl: String = BuildConfig.MOCK_CONTENT_HOST_URL
//    private val accountMockBaseUrl: String = BuildConfig.MOCK_ACCOUNT_HOST_URL
//    private val securityMockBaseUrl: String = BuildConfig.MOCK_SECURITY_HOST_URL
//    private val notificationMockBaseUrl: String = BuildConfig.MOCK_NOTIFICATION_HOST_URL
//    val isLogsEnabled: Boolean = BuildConfig.LOGS_ENABLED

    var contentBaseUrl = ""
//    var appVersion = BuildConfig.APP_BUILD_VERSION + "-" + BuildConfig.APP_BUILD_NUMBER
    var accountBaseUrl = ""
    var securityBaseUrl = ""
    var notificationBaseUrl = ""
    var chatBaseUrl = ""
    var developmentUrl = "http://216.219.83.182"

    //    val storeAppLink: String = BuildConfig.STORE_APP_LINK
    val isProductionEnvironment: Boolean = false
    val isMockEnvironment: Boolean = false

    init {
        if (isProductionEnvironment) {
//            contentBaseUrl = contentProdBaseUrl
//            accountBaseUrl = accountProdBaseUrl
//            securityBaseUrl = securityProdBaseUrl
//            notificationBaseUrl = notificationProdBaseUrl
//            chatBaseUrl = chatDevBaseUrl
        } else {

            if (isMockEnvironment) {
//                contentBaseUrl = contentMockBaseUrl
//                accountBaseUrl = accountMockBaseUrl
//                securityBaseUrl = securityMockBaseUrl
//                notificationBaseUrl = notificationMockBaseUrl
//                chatBaseUrl = chatDevBaseUrl
            } else {
                developmentUrl
            }
        }
    }
}