package com.example.apollokotlin

import android.service.autofill.UserData
import com.apollographql.apollo3.ApolloClient

class ApiNetWork {
    val apolloClient=ApolloClient.Builder()
        .serverUrl("https://example.com/graphql")
        .build()

}
