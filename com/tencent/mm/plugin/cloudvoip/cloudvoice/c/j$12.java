package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class j$12
  implements l.a
{
  j$12(j paramj, a parama, String paramString1, String paramString2, String paramString3, int paramInt)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    AppMethodBeat.i(135530);
    ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: session result: %d, %d, %s, %s, %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk, Boolean.valueOf(paramBoolean) });
    this.kAJ.R(new j.12.1(this, paramInt1, paramInt2, paramk, paramBoolean, paramString));
    AppMethodBeat.o(135530);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.12
 * JD-Core Version:    0.6.2
 */