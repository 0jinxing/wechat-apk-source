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
import com.tencent.mm.plugin.fts.ui.a.r;
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
    AppMethodBeat.i(62066);
    i locali = new i();
    locali.hbo = 64;
    locali.query = this.query;
    locali.mEr = new int[] { 131072, 131081 };
    locali.mEt = 3;
    locali.mEv = com.tencent.mm.plugin.fts.a.c.b.mEV;
    locali.mEu = paramHashSet;
    locali.mEw = this;
    locali.handler = paramak;
    paramak = ((n)g.M(n.class)).search(2, locali);
    AppMethodBeat.o(62066);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, l paraml, e.a parama)
  {
    AppMethodBeat.i(62069);
    Object localObject = null;
    if ((paraml.type == 131072) || (paraml.type == 131081))
    {
      localObject = new r(paramInt2);
      ((r)localObject).hpS = paraml;
      ((r)localObject).mDz = parama.mDz;
      ((r)localObject).ej(paraml.type, paraml.mDw);
    }
    while (true)
    {
      AppMethodBeat.o(62069);
      return localObject;
      if ((paraml.type == 131073) || (paraml.type == 131074))
        localObject = ((com.tencent.mm.plugin.fts.ui.a)((n)g.M(n.class)).createFTSUIUnit(33, this.context, this.mEZ, this.mFa)).a(paramInt1, paramInt2, paraml, parama);
    }
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62068);
    Object localObject = null;
    l locall = null;
    int i = 0;
    if (parama.mFc)
    {
      i = paramInt - parama.mFb - 1;
      localObject = locall;
      if (i < parama.mFf.size())
      {
        localObject = locall;
        if (i >= 0)
        {
          locall = (l)parama.mFf.get(i);
          parama = a(locall.type, paramInt, locall, parama);
          localObject = parama;
          if (parama != null)
          {
            parama.ej(locall.type, locall.mDw);
            localObject = parama;
          }
        }
      }
    }
    if (localObject != null)
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFn = (i + 1);
    AppMethodBeat.o(62068);
    return localObject;
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62067);
    paramHashSet = new e.a();
    paramHashSet.businessType = -4;
    paramHashSet.mFf = paramj.mEy;
    paramHashSet.mFc = bX(paramj.mEy);
    paramHashSet.mDz = paramj.mDz;
    if (paramHashSet.mFf.size() > 3)
    {
      paramHashSet.mFe = true;
      paramHashSet.mFf = paramHashSet.mFf.subList(0, 3);
    }
    if (bX(paramj.mEy))
      this.mHp.add(paramHashSet);
    AppMethodBeat.o(62067);
  }

  public final int getType()
  {
    return 32;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.e
 * JD-Core Version:    0.6.2
 */