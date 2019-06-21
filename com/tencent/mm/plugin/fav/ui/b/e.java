package com.tencent.mm.plugin.fav.ui.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
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
    AppMethodBeat.i(74504);
    i locali = new i();
    locali.hbo = 1;
    locali.query = this.query;
    locali.mEt = 1;
    locali.mEu = paramHashSet;
    locali.handler = paramak;
    locali.mEw = this;
    paramak = ((n)g.M(n.class)).search(6, locali);
    AppMethodBeat.o(74504);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(74506);
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
    AppMethodBeat.o(74506);
    return localObject;
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(74505);
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -1;
      paramHashSet.mDz = paramj.mDz;
      paramHashSet.mFf = paramj.mEy;
      if (paramHashSet.mFf.size() > 1)
      {
        paramHashSet.mFe = true;
        paramHashSet.mFf = paramHashSet.mFf.subList(0, 1);
      }
      this.mHp.add(paramHashSet);
    }
    AppMethodBeat.o(74505);
  }

  public final int getType()
  {
    return 128;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.b.e
 * JD-Core Version:    0.6.2
 */