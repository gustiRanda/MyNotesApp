package com.gmind.mynotesapp.db

import android.net.Uri
import android.provider.BaseColumns

internal class DatabaseContract {

    internal class NoteColumns : BaseColumns {
        companion object {
            const val TABLE_NAME = "note"
            const val _ID = "_id"
            const val TITLE = "title"
            const val DESCRIPTION = "description"
            const val DATE = "date"

//            val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME)
//                    .authority(AUTHORITY)
//                    .appendPath(TABLE_NAME)
//                    .build()
        }

    }

//    companion object {
//        const val AUTHORITY = "com.gmind.mynoesapp"
//        const val SCHEME = "content"
//    }
}