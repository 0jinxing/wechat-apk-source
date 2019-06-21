package com.tencent.mm.plugin.wallet_core.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class q$8$1
  implements Animation.AnimationListener
{
  q$8$1(q.8 param8)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(47599);
    ab.i("MicroMsg.WalletPwdDialog", "hy: on flash end");
    al.d(new q.8.1.2(this));
    AppMethodBeat.o(47599);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(47598);
    ab.i("MicroMsg.WalletPwdDialog", "hy: on flash start");
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(47596);
        q.8.1.this.tKt.tKq.tJW.setVisibility(0);
        AppMethodBeat.o(47596);
      }
    });
    AppMethodBeat.o(47598);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q.8.1
 * JD-Core Version:    0.6.2
 */