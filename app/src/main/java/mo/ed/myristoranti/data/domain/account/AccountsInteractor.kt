package mo.ed.myristoranti.data.domain.account

import mo.ed.myristoranti.core.IRepository
import mo.ed.myristoranti.core.Result
import mo.ed.myristoranti.data.domain.Interactor.BaseInteractor
import javax.inject.Inject

class AccountsInteractor @Inject constructor(private val repositoryManager: IRepository) : BaseInteractor() {
    suspend fun login(phone: String, password: String, deviceName: String): Result<*> {
        return repositoryManager.getEndPointRepository().login(phone, password, deviceName)
    }

    suspend fun getFoodItems(): Result<*> {
        return repositoryManager.getEndPointRepository().getFoodItems()
    }
}