package com.tencent.mm.plugin.fav.ui.b;

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

public final class c extends com.tencent.mm.plugin.fts.ui.a
{
  public c(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(74500);
    i locali = new i();
    locali.hbo = 2;
    locali.query = this.query;
    locali.mEu = paramHashSet;
    locali.handler = paramak;
    locali.mEw = this;
    locali.mEv = d.mEX;
    paramak = ((n)g.M(n.class)).search(6, locali);
    AppMethodBeat.o(74500);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(74502);
    int i = paramInt - parama.mFb - 1;
    l locall = null;
    Object localObject = locall;
    if (i < parama.mFf.size())
    {
      localObject = locall;
      if (i >= 0)
      {
        locall = (l)parama.mFf.get(i);
        localObject = new a(paramInt);
        ((a)localObject).hpS = locall;
        ((a)localObject).mDz = parama.mDz;
        ((a)localObject).ej(locall.type, locall.mDw);
      }
    }
    if (localObject != null)
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFn = (i + 1);
    AppMethodBeat.o(74502);
    return localObject;
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(74501);
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -1;
      paramHashSet.mDz = paramj.mDz;
      paramHashSet.mFf = paramj.mEy;
      this.mHp.add(paramHashSet);
    }
    AppMethodBeat.o(74501);
  }

  public final int getType()
  {
    return 4192;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.b.c
 * JD-Core Version:    0.6.2
 */