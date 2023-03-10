package wst.sample.mvvm.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import wst.sample.mvvm.ui.first.FirstViewModel

val appModule = module {

    viewModel { FirstViewModel() }
}