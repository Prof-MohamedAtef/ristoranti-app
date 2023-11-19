package mo.ed.myristoranti.core

import mo.ed.myristoranti.core.repos.EndPointRepository

interface IRepository {
    fun getEndPointRepository(): EndPointRepository
}