package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.c.e;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.a.c;
import com.tencent.mm.plugin.fts.ui.a.o;
import com.tencent.mm.plugin.fts.ui.a.p;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class l extends k
{
  public String mEq;

  public l(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  public com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62092);
    this.mLK = false;
    paramHashSet = new i();
    paramHashSet.query = this.query;
    paramHashSet.mEv = e.mEY;
    paramHashSet.mEq = this.mEq;
    paramHashSet.mEw = this;
    paramHashSet.handler = paramak;
    paramHashSet.hbo = 10;
    paramak = ((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).search(3, paramHashSet);
    AppMethodBeat.o(62092);
    return paramak;
  }

  public com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62097);
    com.tencent.mm.plugin.fts.a.a.l locall = null;
    int i;
    Object localObject;
    if (parama.mFc)
    {
      i = paramInt - parama.mFb - 1;
      localObject = locall;
      if (i >= 0)
      {
        localObject = locall;
        if (i < parama.mFf.size())
        {
          locall = (com.tencent.mm.plugin.fts.a.a.l)parama.mFf.get(i);
          if (!locall.mDx.equals("no_result​"))
            break label105;
          localObject = new com.tencent.mm.plugin.fts.ui.a.l(paramInt);
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(62097);
      return localObject;
      i = paramInt - parama.mFb;
      break;
      label105: localObject = new p(paramInt);
      ((p)localObject).hpS = locall;
      ((p)localObject).mKp = parama.mFh;
      ((p)localObject).mDz = ((p)localObject).hpS.mDz;
      ((p)localObject).mFl = -14;
      ((p)localObject).showType = 2;
      ((p)localObject).ej(locall.type, locall.mDw);
    }
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62093);
    switch (paramj.bFZ)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(62093);
      while (true)
      {
        return;
        if (paramj.mEy.size() <= 0)
          break;
        int i = 0;
        if (i < paramj.mEy.size())
        {
          paramHashSet = new e.a();
          paramHashSet.mFc = true;
          paramHashSet.mFh = ((com.tencent.mm.plugin.fts.a.a.l)paramj.mEy.get(i));
          paramHashSet.mDz = paramj.mDz;
          paramHashSet.mFf = ((List)paramHashSet.mFh.userData);
          if ((paramHashSet.mFf.size() > 3) && (i != paramj.mEy.size() - 1))
            paramHashSet.mFg = true;
          for (paramHashSet.mFe = true; ; paramHashSet.mFe = false)
          {
            this.mHp.add(paramHashSet);
            i++;
            break;
            paramHashSet.mFg = false;
          }
        }
        AppMethodBeat.o(62093);
      }
      paramHashSet = new e.a();
      paramHashSet.businessType = -2;
      paramHashSet.mDz = paramj.mDz;
      paramHashSet.mFc = false;
      paramj = new com.tencent.mm.plugin.fts.a.a.l();
      paramj.mDx = "no_result​";
      paramHashSet.mFf = new ArrayList();
      paramHashSet.mFf.add(paramj);
      this.mHp.add(paramHashSet);
    }
  }

  public final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(62098);
    super.a(paramView, parama, paramBoolean);
    if ((parama instanceof c));
    for (int i = 0; ; i++)
      if (i < this.mHp.size())
      {
        paramView = (e.a)this.mHp.get(i);
        if (paramView.mFd == parama.position)
        {
          paramBoolean = bool;
          if (!paramView.mFg)
            paramBoolean = true;
          paramView.mFg = paramBoolean;
        }
      }
      else
      {
        AppMethodBeat.o(62098);
        return true;
      }
  }

  public com.tencent.mm.plugin.fts.ui.a.k b(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62095);
    o localo = new o(paramInt);
    localo.mKp = parama.mFh;
    localo.mDz = localo.mKp.mDz;
    AppMethodBeat.o(62095);
    return localo;
  }

  protected int bBl()
  {
    return 2;
  }

  public final com.tencent.mm.plugin.fts.ui.a.n c(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62096);
    c localc = new c(paramInt);
    localc.resId = 2131300113;
    localc.mJY = parama.mFg;
    AppMethodBeat.o(62096);
    return localc;
  }

  public int getType()
  {
    return 176;
  }

  public final int vY(int paramInt)
  {
    AppMethodBeat.i(62094);
    int i = this.mHp.size();
    int j = 0;
    if (j < i)
    {
      e.a locala = (e.a)this.mHp.get(j);
      locala.mFb = paramInt;
      int k = paramInt;
      if (locala.mFc)
        k = paramInt + 1;
      if (locala.mFf.size() > 3)
        if (locala.mFg)
        {
          k += 3;
          label84: locala.mFd = k;
          paramInt = k;
          if (locala.mFe)
            paramInt = k + 1;
        }
      while (true)
      {
        j++;
        break;
        k += locala.mFf.size();
        break label84;
        paramInt = k + locala.mFf.size();
        locala.mFd = paramInt;
      }
    }
    AppMethodBeat.o(62094);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.l
 * JD-Core Version:    0.6.2
 */