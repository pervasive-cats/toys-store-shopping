/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess.domainevents

import shopping.shoppingprocess.valueobjects.Customer

trait CustomerHasPaid {

  val customer: Customer
}
