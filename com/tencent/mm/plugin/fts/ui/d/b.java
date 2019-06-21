package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.h;
import com.tencent.mm.plugin.fts.ui.a.q;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;
import java.util.List;

public final class b extends com.tencent.mm.plugin.fts.ui.a
{
  public b(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62056);
    i locali = new i();
    locali.hbo = 32;
    locali.query = this.query;
    locali.mEu = paramHashSet;
    locali.mEv = com.tencent.mm.plugin.fts.a.c.a.mEU;
    locali.mEw = this;
    locali.handler = paramak;
    paramak = ((n)g.M(n.class)).search(2, locali);
    AppMethodBeat.o(62056);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62058);
    int i = paramInt - parama.mFb - 1;
    l locall = null;
    Object localObject = locall;
    if (i < parama.mFf.size())
    {
      localObject = locall;
      if (i >= 0)
      {
        locall = (l)parama.mFf.get(i);
        if (!locall.mDx.equals("create_chatroom​"))
          break label110;
        localObject = new h(paramInt);
        ((h)localObject).mDz = parama.mDz;
      }
    }
    while (true)
    {
      if (localObject != null)
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFn = (i + 1);
      AppMethodBeat.o(62058);
      return localObject;
      label110: localObject = new q(paramInt);
      ((q)localObject).hpS = locall;
      ((q)localObject).mDz = parama.mDz;
      ((q)localObject).ej(locall.type, locall.mDw);
    }
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62057);
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -3;
      paramHashSet.mFf = paramj.mEy;
      paramHashSet.mDz = paramj.mDz;
      paramHashSet.mFe = false;
      this.mHp.add(paramHashSet);
    }
    AppMethodBeat.o(62057);
  }

  public final int getType()
  {
    return 4128;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.b
 * JD-Core Version:    0.6.2
 */