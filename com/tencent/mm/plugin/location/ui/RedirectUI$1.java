package com.tencent.mm.plugin.location.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RedirectUI$1
  implements Runnable
{
  RedirectUI$1(RedirectUI paramRedirectUI, Intent paramIntent, double paramDouble1, double paramDouble2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113473);
    RedirectUI.a(this.nMt, this.val$intent, this.mkN, this.mkO);
    AppMethodBeat.o(113473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.RedirectUI.1
 * JD-Core Version:    0.6.2
 */