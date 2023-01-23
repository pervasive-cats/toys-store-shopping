/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess.services

import shopping.shoppingprocess.domainevents.*

trait ShoppingProcessHandlers {

  def onCustomerHasEnteredStore(event: CustomerHasEnteredStore): Unit

  def onCartAssociated(event: CartAssociated): Unit

  def onCustomerHasLeftStore(event: CustomerHasLeftStore): Unit

  def onTimeoutWasReached(event: TimeoutWasReached): Unit

  def onCustomerHasPaid(event: CustomerHasPaid): Unit

  def onItemAddedToCart(event: ItemAddedToCart): Unit

  def onItemReturned(event: ItemReturned): Unit
}
