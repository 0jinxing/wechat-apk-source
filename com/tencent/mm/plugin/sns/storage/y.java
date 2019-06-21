package com.tencent.mm.plugin.sns.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class y extends j<x>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(38034);
    fnj = new String[] { j.a(x.ccO, "UxCanvasInfo") };
    AppMethodBeat.o(38034);
  }

  public y(e parame)
  {
    this(parame, x.ccO, "UxCanvasInfo");
  }

  private y(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
  }

  public final void a(x paramx)
  {
    AppMethodBeat.i(38033);
    if ((paramx == null) || (bo.isNullOrNil(paramx.field_canvasXml)))
      AppMethodBeat.o(38033);
    while (true)
    {
      return;
      paramx.field_createTime = System.currentTimeMillis();
      if (!b(paramx))
        c(paramx, new String[0]);
      AppMethodBeat.o(38033);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.y
 * JD-Core Version:    0.6.2
 */