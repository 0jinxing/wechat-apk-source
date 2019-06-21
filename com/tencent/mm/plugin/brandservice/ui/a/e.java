package com.tencent.mm.plugin.brandservice.ui.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c.b;
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
    AppMethodBeat.i(14093);
    String str = this.query;
    b localb = b.mEV;
    paramak = i.a(str, new int[] { 131076 }, null, 4, paramHashSet, localb, this, paramak);
    paramak = ((n)g.M(n.class)).search(2, paramak);
    AppMethodBeat.o(14093);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, l paraml, e.a parama)
  {
    AppMethodBeat.i(14096);
    a locala = new a(paramInt2);
    locala.hpS = paraml;
    locala.mDz = parama.mDz;
    locala.ej(paraml.type, paraml.mDw);
    AppMethodBeat.o(14096);
    return locala;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(14095);
    int i = paramInt - parama.mFb - 1;
    l locall = null;
    Object localObject = locall;
    if (i < parama.mFf.size())
    {
      localObject = locall;
      if (i >= 0)
      {
        locall = (l)parama.mFf.get(i);
        localObject = a(131076, paramInt, locall, parama);
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).ej(locall.type, locall.mDw);
      }
    }
    if (localObject != null)
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFn = (i + 1);
    AppMethodBeat.o(14095);
    return localObject;
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(14094);
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -7;
      paramHashSet.mFf = paramj.mEy;
      paramHashSet.mDz = paramj.mDz;
      if (paramHashSet.mFf.size() > 3)
      {
        paramHashSet.mFe = true;
        paramHashSet.mFf = paramHashSet.mFf.subList(0, 3);
      }
      this.mHp.add(paramHashSet);
    }
    AppMethodBeat.o(14094);
  }

  public final int getType()
  {
    return 96;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.a.e
 * JD-Core Version:    0.6.2
 */