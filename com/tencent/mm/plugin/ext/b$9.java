package com.tencent.mm.plugin.ext;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedList;

final class b$9
  implements k.a
{
  b$9(b paramb)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(20268);
    if (!b.b(this.lPx).contains(paramString))
      b.b(this.lPx).add(paramString);
    b.c(this.lPx).removeMessages(0);
    b.c(this.lPx).sendEmptyMessageDelayed(0, 60L);
    AppMethodBeat.o(20268);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b.9
 * JD-Core Version:    0.6.2
 */