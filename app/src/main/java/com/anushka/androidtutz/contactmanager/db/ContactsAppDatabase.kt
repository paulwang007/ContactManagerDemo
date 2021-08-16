package com.anushka.androidtutz.contactmanager.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anushka.androidtutz.contactmanager.db.entity.Contact

@Database(entities = [Contact::class], version = 1)
abstract class ContactsAppDatabase : RoomDatabase() {

    abstract fun getContactDAO(): ContactDAO
}
