package com.nnt.diceapp2023_turmad.appusers.database

import android.content.ContentValues
import com.nnt.diceapp2023_turmad.appusers.User

fun UsersDatabase.insertUser(item: User): Long {
    val idUser = writableDatabase.insert("Users", null, ContentValues().apply {
        put("name", item.name)
        put("email", item.email)
        put("password", item.password)
    })

    return idUser
}

fun UsersDatabase.selectUser(_email: String, _password: String): Boolean {
    val sql = "SELECT * FROM Users WHERE email=? AND password=?"

    val cursor = readableDatabase.rawQuery(sql, arrayOf(_email, _password))

    if (cursor.count > 0) {
        return true
    }
    return false
}