package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;

final class c$b extends a
{
  private long edW;

  public c$b(c paramc, long paramLong)
  {
    this.edW = paramLong;
  }

  public final String aAo()
  {
    AppMethodBeat.i(136749);
    String str = String.format("{MsgId: %d}", new Object[] { Long.valueOf(this.edW) });
    AppMethodBeat.o(136749);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136748);
    this.mGx.mGp.c(com.tencent.mm.plugin.fts.a.c.mCc, this.edW);
    AppMethodBeat.o(136748);
    return true;
  }

  public final String getName()
  {
    return "DeleteMessageTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c.b
 * JD-Core Version:    0.6.2
 */