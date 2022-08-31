package com.example.layoutmigration.di

import com.example.layoutmigration.CompanyDataSource
import com.example.layoutmigration.UserDataSource
import com.example.layoutmigration.data.CompanyDataInterface
import com.example.layoutmigration.data.UserDataInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class ActivityModule {
    @Binds
    abstract fun bindCompany(companyImpl: CompanyDataSource): CompanyDataInterface

    @Binds
    abstract fun bindUser(userImpl: UserDataSource): UserDataInterface
}