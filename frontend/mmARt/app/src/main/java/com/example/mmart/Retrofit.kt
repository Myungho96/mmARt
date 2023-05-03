package com.example.mmart

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

// http request
interface APIS {

    // 카테고리 별 아이템
    @GET("items/categories")
    suspend fun getCategories(@Query("userIdx") userIdx: Int, @Query("categoryIdx") categoryIdx: Int): ItemResult

    // 바코드 스캔
    @GET("items/barcode")
    suspend fun getItemByBarcode(@Query("barcode") barcode: Long): ItemResult

    // 장볼구니 조회
    @GET("getcarts/{userId}")
    suspend fun getCartsRead(@Path("userId") userId: Int): CartResult

    companion object {
        private const val BASE_URL = "http://k8a405.p.ssafy.io:8090/api/v1/"

        fun create(): APIS {
            val gson : Gson =   GsonBuilder().setLenient().create();
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(APIS::class.java)
        }
    }
}

// Item Controller 관련 result
data class ItemResult(
    var resultCode : String?,
    var result: List<ItemInfo>
)

data class ItemInfo(
    val itemIdx: Int,
    val itemName: String,
    val price: Int,
    val inventory: Int,
    val barcode: String,
    val thumbnail: String,
    val placeInfo: String?,
    val weight: Int,
    val category: CategoryInfo,
    val createTime: List<Int>,
    val updateTime: List<Int>
)

data class CategoryInfo(
    val categoryIdx: Int,
    val categoryName: String,
    val placeInfo: String?,
    val createTime: List<Int>,
    val updateTime: List<Int>
)

// 카트 관련 Result
data class CartResult(
    val resultCode : String?,
    val result: CartContent
)

data class CartContent(
    val itemList: List<ItemList>,
    val total: Int,
    val errorCode: String,
    val message: String
)

data class ItemList(
    val itemIdx: Int,
    val quantity: Int
)