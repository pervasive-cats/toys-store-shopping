/*
 * Copyright © 2022-2023 by Pervasive Cats S.r.l.s.
 *
 * All Rights Reserved.
 */

package io.github.pervasivecats
package shopping.shoppingprocess.entities

trait TerminatingShoppingProcess extends ShoppingProcess {

  def timeoutIsReached(): TerminatedShoppingProcess

  def cancel(): NotStartedShoppingProcess
}
