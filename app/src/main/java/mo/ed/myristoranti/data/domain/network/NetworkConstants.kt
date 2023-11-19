package mo.ed.myristoranti.data.domain.network

class NetworkConstants {
    enum class RequestHeaders(val value: String) {

        HEADER_NO_AUTHENTICATION("No-Authentication"),
        HEADER_AUTHORIZATION("Authorization"),
        HEADER_USER_AGENT("X-User-Agent"),
        HEADER_CONTENT_TYPE("Content-Type"),
        HEADER_ORIGIN("origin"),
        HEADER_API_DATE("X-Date"),
        HEADER_EDA_DATE("EDA-DATE"),
        HEADER_API_CONNECTION("Connection"),
        HEADER_API_CONNECTION_CLOSE("close"),
        HEADER_VERSION("x-version"),
        HEADER_STC_APP_VERSION("AppVersion"),
        HEADER_STC_DATE_TIME("DateAndTime"),
        HEADER_STC_CLIENT_ID("X-STC-ClientId"),
        HEADER_STC_USER_AGENT("UserAgent"),
        HEADER_EDA_CLIENT("EDA-CLIENT"),
        HEADER_STC_API_KEY("X-STC-API-Key"),
        HEADER_API_CLIENT_KEY("X-API-CLIENT-Key"),

        HEADER_ACCEPTED_LANGUAGE("Accept-Language"),
        HEADER_API_CLIENT("x-stcws-user"),
        HEADER_TEST("Test"),
        HEADER_MOCK("mock"),

        /**
         *  Requests that have this header will be intercepted and the @HEADER_AUTHORIZATION will not be added.
         */
        HEADER_NO_AUTH_FULL("$HEADER_NO_AUTHENTICATION: true")
    }

    // for only network operations
    enum class NetworkEvents {
        // for all apis we need to create their enums for analytics
        UnDefined,
        GetUserServiceNumbers,
        GetUserServiceNumbersByServiceNumberFilter,
        ;

        enum class Params {
            API_SUCCESS,
            API_FAIL,
            API_STATUS,
            RESPONSE_TIME_MS,
            RESPONSE_CODE,
            LOCALE,
            ERROR_CODE,
            ERROR_MESSAGE
        }
    }

    enum class Url {;
        enum class Locations(val url: String) {
//            OFFICE_TYPES("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/content/officesTypes"),
//            OFFICE_TYPES_BY_CATEGORY("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/content/offices"),
//            MAP_COVERAGE("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/mapCoverage"),
//            CONTENT_ENTERPRISE_OFFICES("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/content/enterpriseOffices"),
//            LOCATIONS("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/content/locations"),
        }


        enum class Payment(val url: String) {
//            SAVE_CREDIT_CARD("{${Params.VERSION.value}}/{${Params.LANG.value}}/private/businessUsers/{${Params.USER_NAME.value}}/creditCardForEBU"),
//            SAVED_CREDIT_CARD_LIST("{${Params.VERSION.value}}/{${Params.LANG.value}}/private/businessUsers/{${Params.USER_NAME.value}}/epaymentProfileEBU"),
//            BULK_PAYMENT_FOR_REGISTERED_CARD("{${Params.VERSION.value}}/{${Params.LANG.value}}/private/users/{${Params.USER_NAME.value}}/registeredPaymentForEBU"),
        }

        enum class Recover(val url: String) {
//            RECOVER_PASSWORD_OR_USERNAME("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/recover"),
//            FORGOT_PASSWORD("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/auth/forgotPassword"),
//            RESET_PASSWORD("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/auth/resetPassword"),
        }


        enum class PushNotification(val url: String) {
//            PUSH_NOTIFICATION_API("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/notifications/devices"),
        }

        enum class EndPoints(val url: String) {

            // Products (Postpaid - Prepaid - Flex - Landline)
            LOGIN("/foodItem/public/api/users/login"),
            //            ROAMING_PRODUCTS_TYPES("{${Params.VERSION.value}}/{${Params.LANG.value}}/public/content/products/{${Params.SERVICE_TYPES.value}}"),
            GETFOODITEMS("/foodItem/public/api/foodItem/28"),
        }
    }

    enum class Params(val value: String) {
        VERSION("version"),
    }

    enum class StatusCode(val code: String) {
        OK("200"),
        UNAUTHORIZED("401"),
        RECORD_ALREADY_EXIST("1013"),
        INCORRECT_USERNAME_PASSWORD("3104"),
        //        MAXIMUM_ATTEMPT_FOR_PIN("1115"),
        DUPLICATED_CREDIT_CARD("1304"),
        INVALID_PASSWORD("1002"),
        CLIENT_AUTH_ERROR("1103"),
        SESSION_EXPIRED("1104"),
        PIN_ALREADY_SENT("1110"),
        OTP_EXPIRED("otpExpired"),
        ERROR_CODE_NOT_HANDLED_ON_OCP("1010"),
        MAX_NUMBER_OF_PENDING_REQUESTS("20041"),
//        MAX_NUMBER_OF_PENDING_REQUESTS("1010"),
    }

    enum class ErrorCode(val code: Int) {
        ERROR_200(200),
        ERROR_201(201),
        ERROR_204(204),
        ERROR_299(299),
        ERROR_304(304),
        ERROR_400(400),
        ERROR_401(401),
        ERROR_404(404),
        ERROR_408(408),
        ERROR_409(409),
        ERROR_429(429),
        ERROR_500(500),
        ERROR_502(502),
        ERROR_599(599)
    }
}