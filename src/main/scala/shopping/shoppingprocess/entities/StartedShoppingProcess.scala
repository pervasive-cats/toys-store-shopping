/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess.entities

import shopping.shoppingprocess.valueobjects.{Cart, Item, Store}

trait StartedShoppingProcess extends ShoppingProcess {

  val store: Store

  val cart: Cart

  val cartContents: List[Item]

  def addItemToCart(item: Item): StartedShoppingProcess

  def removeItemFromCart(item: Item): StartedShoppingProcess

  def customerLeavesStore(): TerminatingShoppingProcess

  def cancel(): NotStartedShoppingProcess
}
