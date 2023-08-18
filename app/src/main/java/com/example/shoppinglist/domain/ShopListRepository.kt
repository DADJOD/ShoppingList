package com.example.shoppinglist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem()
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList(): List<ShopItem>
}