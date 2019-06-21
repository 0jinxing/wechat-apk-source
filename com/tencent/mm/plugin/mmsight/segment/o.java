package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bj.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class o
{
  public static d k(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(3688);
    ab.i("MicroMsg.ThumbFetcherFactory", "get thumb fetcher, ish265: %s", new Object[] { Boolean.valueOf(e.uD(paramString)) });
    k localk = new k();
    localk.init(paramString, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(3688);
    return localk;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.o
 * JD-Core Version:    0.6.2
 */