package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$5
  implements ap.a
{
  c$5(c paramc)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(136742);
    if (!this.mGx.mGq)
    {
      this.mGx.mGq = true;
      this.mGx.eAX.a(131112, new c.a(this.mGx, (byte)0));
    }
    a.xxA.d(this.mGx.mGu);
    AppMethodBeat.o(136742);
    return false;
  }

  public final String toString()
  {
    AppMethodBeat.i(136743);
    String str = super.toString() + "|mBackgroundTimer";
    AppMethodBeat.o(136743);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c.5
 * JD-Core Version:    0.6.2
 */