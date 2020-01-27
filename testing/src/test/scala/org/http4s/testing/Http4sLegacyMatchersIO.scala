package org.http4s
package testing

import cats.effect.{ContextShift, IO, Timer}
import org.specs2.matcher.IOMatchers

trait Http4sLegacyMatchersIO extends Http4sLegacyMatchers[IO] with IOMatchers { self: Http4sSpec =>
  override val catsEffectContextShift: ContextShift[IO] = contextShift
  override val catsEffectTimer: Timer[IO] = timer
}
