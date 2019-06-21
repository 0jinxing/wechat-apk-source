package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.m;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class j extends k
{
  public j(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62085);
    this.mLK = false;
    com.tencent.mm.plugin.fts.a.a.i locali = new com.tencent.mm.plugin.fts.a.a.i();
    locali.query = this.query;
    locali.mEu = paramHashSet;
    locali.mEw = this;
    locali.handler = paramak;
    paramak = ((n)g.M(n.class)).search(3, locali);
    AppMethodBeat.o(62085);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62087);
    int i = paramInt - parama.mFb;
    if (parama.mFc)
      i--;
    while (true)
    {
      com.tencent.mm.plugin.fts.a.a.l locall = null;
      Object localObject = locall;
      if (i < parama.mFf.size())
      {
        localObject = locall;
        if (i >= 0)
        {
          locall = (com.tencent.mm.plugin.fts.a.a.l)parama.mFf.get(i);
          if (!locall.mDx.equals("create_talker_message​"))
            break label129;
          localObject = new com.tencent.mm.plugin.fts.ui.a.i(paramInt);
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFk = false;
          this.mLK = true;
        }
      }
      while (true)
      {
        if (localObject != null)
        {
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFn = (i + 1);
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mDz = parama.mDz;
        }
        AppMethodBeat.o(62087);
        return localObject;
        label129: if (locall.mDx.equals("no_result​"))
        {
          localObject = new com.tencent.mm.plugin.fts.ui.a.l(paramInt);
        }
        else
        {
          localObject = new m(paramInt);
          ((m)localObject).hpS = locall;
          ((m)localObject).ej(locall.type, locall.mDw);
        }
      }
    }
  }

  public final void a(com.tencent.mm.plugin.fts.a.a.j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62086);
    paramHashSet = paramj.mEy;
    e.a locala;
    if (bX(paramHashSet))
    {
      if (paramHashSet.size() > 0)
      {
        com.tencent.mm.plugin.fts.a.a.l locall = (com.tencent.mm.plugin.fts.a.a.l)paramHashSet.get(0);
        if (locall.mDx.equals("create_talker_message​"))
        {
          locala = new e.a();
          locala.mFc = false;
          locala.mFf = new ArrayList();
          locala.mFf.add(locall);
          locala.mDz = paramj.mDz;
          locala.businessType = -2;
          this.mHp.add(locala);
          paramHashSet.remove(0);
        }
      }
      locala = new e.a();
      locala.businessType = -2;
      locala.mDz = paramj.mDz;
      if (paramHashSet.size() != 0)
        break label220;
      locala.mFc = false;
      paramj = new com.tencent.mm.plugin.fts.a.a.l();
      paramj.mDx = "no_result​";
      locala.mFf = new ArrayList();
      locala.mFf.add(paramj);
    }
    while (true)
    {
      this.mHp.add(locala);
      AppMethodBeat.o(62086);
      return;
      label220: locala.mFf = paramHashSet;
    }
  }

  public final int getType()
  {
    return 4176;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.j
 * JD-Core Version:    0.6.2
 */