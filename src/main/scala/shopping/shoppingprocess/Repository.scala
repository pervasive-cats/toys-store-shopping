/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess

import shopping.shoppingprocess.entities.ShoppingProcess
import shopping.Validated
import shopping.shoppingprocess.valueobjects.{CatalogItem, Customer, ItemId, Store}

trait Repository {

  def findByCustomer(customer: Customer): Validated[ShoppingProcess]

  def existsShoppingProcessWithItem(store: Store, catalogItem: CatalogItem, itemId: ItemId): Validated[Boolean]

  def add(shoppingProcess: ShoppingProcess): Validated[Unit]

  def update(shoppingProcess: ShoppingProcess): Validated[Unit]
}
