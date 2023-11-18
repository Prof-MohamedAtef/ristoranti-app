package mo.ed.myristoranti.network.api

import android.util.Log
import com.airbnb.lottie.utils.Utils
import com.google.gson.GsonBuilder
import mo.ed.myristoranti.utils.Constants
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit


public class Http {
//    private val TAG = "HTTP"
//
//    var authorizationToken: String? = null
//    var language: String? = null
//    var retrofit: Retrofit? = null
//
//
//    fun initialize() {
//        val gson = GsonBuilder()
//            .setLenient()
//            .create()
//
////        String bUrl = Constants.baseUrl;
//        val bUrl: String = Constants.base_url
//        retrofit = Retrofit.Builder()
//            .baseUrl(bUrl)
//            .client(getHeader())
//            .addConverterFactory(GsonConverterFactory.create(gson))
//            .addConverterFactory(ScalarsConverterFactory.create())
//            .build()
//    }
//
//    fun getRetrofit(): Retrofit? {
//        return retrofit
//    }
//
//    fun <T> create(`object`: Class<T>?): T {
//        //initialize(App.getConfig());
//        if (retrofit == null) {
//            initialize()
//        }
//        return retrofit!!.create(`object`)
//    }
//
//    fun <T> create(`object`: Class<T>?, url: String?): T {
//        return Retrofit.Builder()
//            .baseUrl(url)
//            .client(getHeader())
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(`object`)
//    }
//
//    private fun getHeader(): OkHttpClient? {
//        val logging = HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
//
//
//            override fun log(message: String) {
//                Log.e("InterceptorMessage :", message!!)
//            }
//        })
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
//        //        okClient.interceptors().add()
//        return OkHttpClient.Builder()
//            .addInterceptor(logging)
//            .connectTimeout(15, TimeUnit.SECONDS)
//            .readTimeout(15, TimeUnit.SECONDS)
//            .addNetworkInterceptor { chain: Interceptor.Chain ->
//                var request: Request = chain.request()
//                val requestBuilder: Request.Builder = request.newBuilder()
//                requestBuilder.addHeader("Content-Type", Constants.MULTIPART)
//                //                            requestBuilder.addHeader("Content-Type", "application/json");
//                requestBuilder.addHeader("Accept", "application/json")
//                request = requestBuilder.build()
//                chain.proceed(request)
//            }
//            .build()
//    }
}