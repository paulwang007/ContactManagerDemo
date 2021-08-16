package com.anushka.androidtutz.contactmanager.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.anushka.androidtutz.contactmanager.db.entity.Contact

@Dao
interface ContactDAO {
    @Insert
    fun addContact(contact: Contact)

    @Update
    fun updateContact(contact: Contact)

    @Delete
    fun deleteContact(contact: Contact)

    @Query("SELECT * FROM contacts")
    fun getContacts() : List<Contact?>

    @Query("SELECT * FROM CONTACTS WHERE contact_id == :id")
    fun getContact(id : Long): Contact?
}
