package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ge;
import com.tencent.mm.g.a.ge.a;
import com.tencent.mm.g.a.ge.b;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
  implements h.a
{
  public c(Context paramContext)
  {
    AppMethodBeat.i(24190);
    ge localge = new ge();
    localge.cAt.opType = 3;
    localge.cAt.context = paramContext;
    a.xxA.m(localge);
    AppMethodBeat.o(24190);
  }

  public final Bitmap a(h.a.b paramb)
  {
    AppMethodBeat.i(24193);
    ge localge = new ge();
    localge.cAt.opType = 2;
    localge.cAt.cAA = false;
    if (paramb.cAy)
    {
      localge.cAt.cAv = paramb.cAv;
      localge.cAt.cAy = paramb.cAy;
    }
    while (true)
    {
      a.xxA.m(localge);
      ab.d("MicroMsg.FavImageServiceProxy", "getSuitableBigImg favLocalId %s, dataId %s, retBmp %s, fromCache", new Object[] { Long.valueOf(paramb.pKv), paramb.cAv.mnd, localge.cAu.cAB, Boolean.valueOf(localge.cAt.cAy) });
      paramb = localge.cAu.cAB;
      AppMethodBeat.o(24193);
      return paramb;
      localge.cAt.cAv = paramb.cAv;
      localge.cAt.cvv = paramb.pKv;
      localge.cAt.maxWidth = paramb.maxWidth;
      localge.cAt.cAz = paramb.cAz;
    }
  }

  public final Bitmap a(h.a.c paramc)
  {
    AppMethodBeat.i(24192);
    ge localge = new ge();
    localge.cAt.opType = 0;
    localge.cAt.cAv = paramc.cAv;
    localge.cAt.cvv = paramc.pKv;
    a.xxA.m(localge);
    ab.d("MicroMsg.FavImageServiceProxy", "getThumb favLocalId %s, retBmp %s", new Object[] { Long.valueOf(paramc.pKv), localge.cAu.cAB });
    paramc = localge.cAu.cAB;
    AppMethodBeat.o(24192);
    return paramc;
  }

  public final void a(h.a.a parama)
  {
    AppMethodBeat.i(24191);
    ab.d("MicroMsg.FavImageServiceProxy", "attachThumb favLocalId %s", new Object[] { Long.valueOf(parama.pKv) });
    ge localge = new ge();
    localge.cAt.opType = 1;
    localge.cAt.cAw = parama.cAw;
    localge.cAt.cAv = parama.cAv;
    localge.cAt.cvv = parama.pKv;
    localge.cAt.cAx = parama.cAx;
    localge.cAt.width = parama.width;
    localge.cAt.height = parama.height;
    a.xxA.m(localge);
    AppMethodBeat.o(24191);
  }

  public final void ceH()
  {
    AppMethodBeat.i(24194);
    ge localge = new ge();
    localge.cAt.opType = 4;
    a.xxA.m(localge);
    AppMethodBeat.o(24194);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.c
 * JD-Core Version:    0.6.2
 */