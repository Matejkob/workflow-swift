/*
 * Copyright 2019 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.workflow.ui.modal

/**
 * Interface implemented by screen classes that represent a stack of
 * zero or more [modal][M] screens above a [base screen][beneathModals].
 *
 * Use of this interface allows platform specific containers to share base classes,
 * like `ModalContainer` in the `workflow-ui:core-android` module.
 */
interface HasModals<out B : Any, out M : Any> {
  val beneathModals: B
  val modals: List<M>
}