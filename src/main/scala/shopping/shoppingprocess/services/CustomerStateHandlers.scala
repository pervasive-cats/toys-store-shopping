/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess.services

import shopping.shoppingprocess.domainevents.CustomerUnregistered

trait CustomerStateHandlers {

  def onCustomerUnregistered(event: CustomerUnregistered): Unit
}
