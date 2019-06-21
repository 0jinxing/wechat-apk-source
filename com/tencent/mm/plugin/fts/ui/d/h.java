package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c.c;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;
import java.util.List;

public final class h extends com.tencent.mm.plugin.fts.ui.a
{
  public h(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62077);
    i locali = new i();
    locali.query = this.query;
    locali.handler = paramak;
    locali.mEu = paramHashSet;
    locali.mEw = this;
    locali.mEv = c.mEW;
    paramak = ((n)g.M(n.class)).search(4, locali);
    AppMethodBeat.o(62077);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, l paraml, e.a parama)
  {
    AppMethodBeat.i(62080);
    com.tencent.mm.plugin.fts.ui.a.j localj = new com.tencent.mm.plugin.fts.ui.a.j(paramInt2);
    localj.hpS = paraml;
    localj.mDz = parama.mDz;
    localj.ej(paraml.type, paraml.mDw);
    AppMethodBeat.o(62080);
    return localj;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62079);
    int i = paramInt - parama.mFb - 1;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (i < parama.mFf.size())
    {
      localObject2 = localObject1;
      if (i >= 0)
        localObject2 = a(262144, paramInt, (l)parama.mFf.get(i), parama);
    }
    if (localObject2 != null)
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject2).mFn = (i + 1);
    AppMethodBeat.o(62079);
    return localObject2;
  }

  public final void a(com.tencent.mm.plugin.fts.a.a.j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62078);
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -6;
      paramHashSet.mDz = paramj.mDz;
      paramHashSet.mFf = paramj.mEy;
      paramHashSet.mFe = false;
      this.mHp.add(paramHashSet);
    }
    AppMethodBeat.o(62078);
  }

  public final int getType()
  {
    return 64;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.h
 * JD-Core Version:    0.6.2
 */