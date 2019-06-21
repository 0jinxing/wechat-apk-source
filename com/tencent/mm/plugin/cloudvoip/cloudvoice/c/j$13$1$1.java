package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$13$1$1
  implements l.a
{
  j$13$1$1(j.13.1 param1)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    AppMethodBeat.i(135531);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramk != null) && (paramk.isValid()))
    {
      g.HX(paramk.kBq);
      AppMethodBeat.o(135531);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: refresh session key error!");
      j.a(this.kAY.kAX.kAJ, j.a.kBi);
      AppMethodBeat.o(135531);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.13.1.1
 * JD-Core Version:    0.6.2
 */