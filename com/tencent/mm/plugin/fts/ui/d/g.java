package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.c.e;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.f;
import com.tencent.mm.plugin.fts.ui.a.k;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;
import java.util.List;

public final class g extends l
{
  public String mEp;
  public int showType;
  public String talker;

  public g(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62074);
    this.mLK = false;
    paramHashSet = new i();
    paramHashSet.query = this.query;
    paramHashSet.mEv = e.mEY;
    paramHashSet.mEp = this.mEp;
    paramHashSet.mEq = this.mEq;
    paramHashSet.talker = this.talker;
    paramHashSet.mEw = this;
    paramHashSet.handler = paramak;
    paramHashSet.hbo = 11;
    paramak = ((n)com.tencent.mm.kernel.g.M(n.class)).search(3, paramHashSet);
    AppMethodBeat.o(62074);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62076);
    Object localObject1 = null;
    int i;
    Object localObject2;
    if (parama.mFc)
    {
      i = paramInt - parama.mFb - 1;
      localObject2 = localObject1;
      if (i >= 0)
      {
        localObject2 = localObject1;
        if (i < parama.mFf.size())
        {
          parama = (com.tencent.mm.plugin.fts.a.a.l)parama.mFf.get(i);
          if (!parama.mDx.equals("no_result​"))
            break label105;
          localObject2 = new com.tencent.mm.plugin.fts.ui.a.l(paramInt);
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(62076);
      return localObject2;
      i = paramInt - parama.mFb;
      break;
      label105: localObject2 = new com.tencent.mm.plugin.fts.ui.a.g(paramInt);
      ((com.tencent.mm.plugin.fts.ui.a.g)localObject2).hpS = parama;
      ((com.tencent.mm.plugin.fts.ui.a.g)localObject2).mDz = ((com.tencent.mm.plugin.fts.ui.a.g)localObject2).hpS.mDz;
      ((com.tencent.mm.plugin.fts.ui.a.g)localObject2).ej(parama.type, parama.mDw);
    }
  }

  public final k b(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62075);
    f localf = new f(paramInt);
    localf.mKp = parama.mFh;
    localf.mEp = this.mEp;
    AppMethodBeat.o(62075);
    return localf;
  }

  public final int bBl()
  {
    return this.showType;
  }

  public final int getType()
  {
    return 192;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.g
 * JD-Core Version:    0.6.2
 */