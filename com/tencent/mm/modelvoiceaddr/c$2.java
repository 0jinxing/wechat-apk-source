package com.tencent.mm.modelvoiceaddr;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ak;

final class c$2 extends ak
{
  c$2(c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(116673);
    if (paramMessage.what != 291)
      AppMethodBeat.o(116673);
    while (true)
    {
      return;
      if (this.gaI.amo())
        g.Rg().a(this.gaI, 0);
      AppMethodBeat.o(116673);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.c.2
 * JD-Core Version:    0.6.2
 */