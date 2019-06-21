package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class j$3
  implements ap.a
{
  j$3(j paramj)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(25309);
    ab.d("MicroMsg.VoiceRemindService", "onTimerExpired");
    try
    {
      j.h(this.stp);
      AppMethodBeat.o(25309);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.VoiceRemindService", localException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.j.3
 * JD-Core Version:    0.6.2
 */