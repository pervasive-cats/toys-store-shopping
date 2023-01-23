/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess.entities

import shopping.shoppingprocess.valueobjects.Item

trait StartedShoppingProcessOps {

  def addItemToCart(item: Item): StartedShoppingProcess

  def removeItemFromCart(item: Item): StartedShoppingProcess

  def customerLeavesStore(): TerminatingShoppingProcess

  def cancel(): NotStartedShoppingProcess
}
