package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a$3
  implements Animation.AnimationListener
{
  b$a$3(b.a parama)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(41399);
    ab.d("MicroMsg.WalletFaceIdDialog", "fail anim end");
    b.a.e(this.mrr);
    AppMethodBeat.o(41399);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(41398);
    ab.d("MicroMsg.WalletFaceIdDialog", "fail anim start");
    AppMethodBeat.o(41398);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.b.a.3
 * JD-Core Version:    0.6.2
 */