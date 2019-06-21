package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.xweb.x5.sdk.d;

public final class e$c
  implements MMReceivers.a
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15843);
    if ((paramContext == null) || (paramIntent == null))
      AppMethodBeat.o(15843);
    while (true)
    {
      return;
      ab.i("MicroMsg.SandBoxProcessReceiver", "onReceive");
      d.reset(paramContext);
      al.n(new e.c.1(this), 5000L);
      AppMethodBeat.o(15843);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.e.c
 * JD-Core Version:    0.6.2
 */