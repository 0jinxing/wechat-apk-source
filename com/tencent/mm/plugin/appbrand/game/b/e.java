package com.tencent.mm.plugin.appbrand.game.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c.d;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;
import java.util.List;

public final class e extends com.tencent.mm.plugin.fts.ui.a
{
  public e(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(130084);
    i locali = new i();
    locali.query = this.query;
    locali.mEv = d.mEX;
    locali.mEw = this;
    locali.handler = paramak;
    locali.mEu = paramHashSet;
    locali.mEv = h.hri;
    paramak = ((n)g.M(n.class)).search(10, locali);
    AppMethodBeat.o(130084);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(130086);
    int i = paramInt - parama.mFb - 1;
    l locall = null;
    Object localObject = locall;
    if (i < parama.mFf.size())
    {
      localObject = locall;
      if (i >= 0)
      {
        locall = (l)parama.mFf.get(i);
        localObject = new c(paramInt);
        ((c)localObject).hpS = locall;
        ((c)localObject).mDz = parama.mDz;
        ((c)localObject).ej(locall.type, locall.mDw);
      }
    }
    if (localObject != null)
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFn = (i + 1);
    AppMethodBeat.o(130086);
    return localObject;
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(130085);
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -15;
      paramHashSet.mDz = paramj.mDz;
      paramHashSet.mFf = paramj.mEy;
      this.mHp.add(paramHashSet);
    }
    AppMethodBeat.o(130085);
  }

  public final int getType()
  {
    return 4240;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.e
 * JD-Core Version:    0.6.2
 */