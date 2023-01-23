/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess.events

import shopping.shoppingprocess.valueobjects.{Cart, Customer, Store}

trait CartAssociated {

  val customer: Customer

  val cart: Cart

  val store: Store
}
