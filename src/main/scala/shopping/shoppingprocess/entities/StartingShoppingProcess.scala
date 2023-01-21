/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess.entities

import shopping.shoppingprocess.valueobjects.{Cart, Store}

trait StartingShoppingProcess extends ShoppingProcess {

  val store: Store

  def associateCart(cart: Cart): StartedShoppingProcess

  def cancel(): NotStartedShoppingProcess
}
