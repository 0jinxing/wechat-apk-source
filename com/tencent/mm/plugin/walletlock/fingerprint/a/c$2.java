package com.tencent.mm.plugin.walletlock.fingerprint.a;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.d.g;

final class c$2
  implements g
{
  c$2(c paramc, SharedPreferences paramSharedPreferences)
  {
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(51471);
    if (this.tVf.isCancelled)
      AppMethodBeat.o(51471);
    while (true)
    {
      return;
      if (paramInt == 0)
      {
        c.gP(this.tVg.getString("cpu_id", null), this.tVg.getString("uid", null));
        AppMethodBeat.o(51471);
      }
      else
      {
        if (this.tVf.tVc != null)
          this.tVf.tVc.aC(2, "init soter failed");
        AppMethodBeat.o(51471);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.a.c.2
 * JD-Core Version:    0.6.2
 */