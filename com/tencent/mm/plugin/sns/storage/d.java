package com.tencent.mm.plugin.sns.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class d extends j<c>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(36919);
    fnj = new String[] { j.a(c.ccO, "CanvasInfo") };
    AppMethodBeat.o(36919);
  }

  public d(e parame)
  {
    this(parame, c.ccO, "CanvasInfo");
  }

  private d(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(36918);
    if (paramc == null)
      AppMethodBeat.o(36918);
    while (true)
    {
      return;
      paramc.field_createTime = System.currentTimeMillis();
      if (!b(paramc))
        c(paramc, new String[0]);
      AppMethodBeat.o(36918);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.d
 * JD-Core Version:    0.6.2
 */