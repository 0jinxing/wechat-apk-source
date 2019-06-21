package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashSet;
import java.util.List;

public class k extends com.tencent.mm.plugin.fts.ui.a
{
  protected boolean mLK = false;

  public k(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  public com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62088);
    this.mLK = false;
    com.tencent.mm.plugin.fts.a.a.i locali = new com.tencent.mm.plugin.fts.a.a.i();
    locali.query = this.query;
    locali.mEu = paramHashSet;
    locali.mEw = this;
    locali.handler = paramak;
    locali.hbo = 1;
    locali.mEt = 3;
    paramak = ((n)g.M(n.class)).search(3, locali);
    AppMethodBeat.o(62088);
    return paramak;
  }

  public com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62090);
    int i = paramInt - parama.mFb;
    if (parama.mFc)
      i--;
    while (true)
    {
      l locall = null;
      Object localObject = locall;
      boolean bool;
      if (i < parama.mFf.size())
      {
        localObject = locall;
        if (i >= 0)
        {
          locall = (l)parama.mFf.get(i);
          if (!locall.mDx.equals("create_talker_message​"))
            break label152;
          localObject = new com.tencent.mm.plugin.fts.ui.a.i(paramInt);
          if (parama.mFf.size() != 1)
            break label146;
          bool = true;
          ((com.tencent.mm.plugin.fts.ui.a.i)localObject).mKF = bool;
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
        AppMethodBeat.o(62090);
        return localObject;
        label146: bool = false;
        break;
        label152: localObject = new m(paramInt);
        ((m)localObject).hpS = locall;
        ((m)localObject).ej(locall.type, locall.mDw);
      }
    }
  }

  public void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62089);
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -2;
      paramHashSet.mDz = paramj.mDz;
      paramHashSet.mFf = paramj.mEy;
      if (paramHashSet.mFf.size() <= 3)
        break label142;
      if (!((l)paramj.mEy.get(3)).mDx.equals("create_talker_message​"))
        break label119;
      paramHashSet.mFe = false;
      paramHashSet.mFf = paramHashSet.mFf.subList(0, 4);
    }
    while (true)
    {
      this.mHp.add(paramHashSet);
      AppMethodBeat.o(62089);
      return;
      label119: paramHashSet.mFe = true;
      paramHashSet.mFf = paramHashSet.mFf.subList(0, 3);
      continue;
      label142: if ((paramj.mEy.size() == 1) && (((l)paramj.mEy.get(0)).mDx.equals("create_talker_message​")))
        paramHashSet.mFc = false;
    }
  }

  public boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(62091);
    int i;
    if ((parama instanceof m))
    {
      i = bBl();
      paramBoolean = this.mLK;
      if (parama.mFr != 65536);
    }
    label85: int j;
    switch (parama.pageType)
    {
    default:
      AppMethodBeat.o(62091);
      return false;
    case 1:
    case 2:
    case 3:
    case 4:
      i = parama.pageType;
      j = parama.bAw();
      if (!paramBoolean)
        break;
    case 5:
    }
    for (int k = 1; ; k = 0)
    {
      paramView = String.format("%s,%s,%s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
      ab.v("MicroMsg.FTS.FTSReportLogic", "reportFTSGlobalMsgResultClick: %d, %s", new Object[] { Integer.valueOf(14756), paramView });
      h.pYm.X(14756, paramView);
      break;
      if (i == 1)
      {
        i = 6;
        break label85;
      }
      if (i != 2)
        break;
      i = 5;
      break label85;
    }
  }

  protected int bBl()
  {
    return 0;
  }

  public int getType()
  {
    return 112;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.k
 * JD-Core Version:    0.6.2
 */