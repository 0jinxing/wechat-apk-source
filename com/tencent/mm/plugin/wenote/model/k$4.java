package com.tencent.mm.plugin.wenote.model;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.sdk.platformtools.ak;

final class k$4 extends ak
{
  k$4(k paramk)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(26667);
    if (k.c(this.uNS).uOi.booleanValue())
    {
      k.d(this.uNS).ddT();
      k.c(this.uNS).uOi = Boolean.FALSE;
    }
    k.c(this.uNS).uOB = ((int)com.tencent.mm.bk.a.fY(k.e(this.uNS)));
    sendEmptyMessageDelayed(4096, 250L);
    AppMethodBeat.o(26667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.k.4
 * JD-Core Version:    0.6.2
 */