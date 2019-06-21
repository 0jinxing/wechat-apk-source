package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class k
{
  String kBq = null;
  long kBr = -1L;
  long kBs = -1L;

  public final boolean isValid()
  {
    AppMethodBeat.i(135587);
    boolean bool;
    if ((!bo.isNullOrNil(this.kBq)) && (bo.az(this.kBs + 3600L) / 1000L < this.kBr))
    {
      bool = true;
      AppMethodBeat.o(135587);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(135587);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(135588);
    String str = "OpenVoiceSessionKey{sessionKey='" + this.kBq + '\'' + ", expireTicks=" + this.kBr + ", initTicks=" + this.kBs + '}';
    AppMethodBeat.o(135588);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.k
 * JD-Core Version:    0.6.2
 */