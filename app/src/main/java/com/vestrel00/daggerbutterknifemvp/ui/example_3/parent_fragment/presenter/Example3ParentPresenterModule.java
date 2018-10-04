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

package com.vestrel00.daggerbutterknifemvp.ui.example_3.parent_fragment.presenter;

import com.vestrel00.daggerbutterknifemvp.inject.PerFragment;

import dagger.Binds;
import dagger.Module;

/**
 * Provides example 3 parent presenter dependencies.
 */
@Module
public abstract class Example3ParentPresenterModule {

    @Binds
    @PerFragment
    abstract Example3ParentPresenter
    example3ParentPresenter(Example3ParentPresenterImpl example3ParentPresenterImpl);
}
