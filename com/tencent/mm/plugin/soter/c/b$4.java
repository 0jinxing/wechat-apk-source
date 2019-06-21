package com.tencent.mm.plugin.soter.c;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class b$4
  implements com.tencent.soter.a.d.b
{
  b$4(b paramb)
  {
  }

  public final void bxL()
  {
    AppMethodBeat.i(73869);
    ab.v("MicroMsg.SoterControllerFingerprint", "alvinluo mp onStartAuthencation");
    this.rNW.rNN = true;
    AppMethodBeat.o(73869);
  }

  public final void bxM()
  {
    AppMethodBeat.i(73871);
    ab.i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen success");
    this.rNW.rNN = false;
    this.rNW.mrV = null;
    b localb = this.rNW;
    localb.iqw.removeCallbacks(localb.rNV);
    localb.rNP.setImageResource(2130838824);
    localb.iqw.setTextColor(localb.iqw.getResources().getColor(2131690549));
    localb.iqw.setText(localb.iqw.getResources().getString(2131303882));
    AppMethodBeat.o(73871);
  }

  public final void onAuthenticationCancelled()
  {
    AppMethodBeat.i(73873);
    ab.v("MicroMsg.SoterControllerFingerprint", "alvinluo mp onAuthenticationCancelled");
    this.rNW.mrV = null;
    AppMethodBeat.o(73873);
  }

  public final void onAuthenticationError(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(73874);
    ab.e("MicroMsg.SoterControllerFingerprint", "hy: on mp authen error errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
    AppMethodBeat.o(73874);
  }

  public final void onAuthenticationFailed()
  {
    AppMethodBeat.i(73872);
    ab.w("MicroMsg.SoterControllerFingerprint", "hy: mp user trying failed");
    b localb = this.rNW;
    String str = ah.getContext().getString(2131303878);
    if (localb.rNT == null)
      localb.rNT = b.eS(localb.rNP.getContext());
    if (localb.rNU == null)
      localb.rNU = b.eS(localb.rNP.getContext());
    localb.rNT.setAnimationListener(new b.8(localb, str));
    localb.iqw.startAnimation(localb.rNT);
    localb.rNP.startAnimation(localb.rNU);
    this.rNW.mMainHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(73868);
        b.4.this.rNW.rNN = false;
        b.a(b.4.this.rNW, true);
        AppMethodBeat.o(73868);
      }
    }
    , 500L);
    AppMethodBeat.o(73872);
  }

  public final void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(73870);
    ab.i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen help errCode: %d, errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
    AppMethodBeat.o(73870);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.c.b.4
 * JD-Core Version:    0.6.2
 */