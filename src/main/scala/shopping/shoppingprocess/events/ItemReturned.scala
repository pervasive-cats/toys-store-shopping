/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess.events

import shopping.shoppingprocess.valueobjects.{CatalogItem, ItemId, Store}

trait ItemReturned {

  val store: Store

  val catalogItem: CatalogItem

  val itemId: ItemId
}
