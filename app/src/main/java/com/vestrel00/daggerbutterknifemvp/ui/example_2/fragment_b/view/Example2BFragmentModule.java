/*
 * Copyright 2018 Vandolf Estrellado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vestrel00.daggerbutterknifemvp.ui.example_2.fragment_b.view;

import android.app.Fragment;

import com.vestrel00.daggerbutterknifemvp.inject.PerFragment;
import com.vestrel00.daggerbutterknifemvp.ui.common.view.BaseFragmentModule;
import com.vestrel00.daggerbutterknifemvp.ui.example_2.fragment_b.presenter.Example2BPresenterModule;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 2 B fragment dependencies.
 */
@Module(includes = {
        BaseFragmentModule.class,
        Example2BPresenterModule.class
})
public abstract class Example2BFragmentModule {

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example2BFragment the example 2 B fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(Example2BFragment example2BFragment);

    @Binds
    @PerFragment
    abstract Example2BView example2BView(Example2BFragment example2BFragment);
}
