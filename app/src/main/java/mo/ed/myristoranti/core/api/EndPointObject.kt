package mo.ed.myristoranti.core.api

import mo.ed.myristoranti.data.domain.network.NetworkConstants
import mo.ed.myristoranti.data.dto.LoginUserRequestBody

class EndPointObject(val endPoint: String, val requestBody: Any, val networkEvents: NetworkConstants.NetworkEvents)