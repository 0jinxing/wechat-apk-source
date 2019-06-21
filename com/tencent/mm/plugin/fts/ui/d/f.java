package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.d;
import com.tencent.mm.plugin.fts.ui.a.e;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class f extends k
{
  public String mEp;
  public u mIy;

  public f(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(ak paramak, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62070);
    this.mLK = false;
    paramHashSet = new com.tencent.mm.plugin.fts.a.a.i();
    paramHashSet.query = this.query;
    paramHashSet.mEp = this.mEp;
    paramHashSet.mEw = this;
    paramHashSet.handler = paramak;
    paramHashSet.hbo = 3;
    paramak = ((n)g.M(n.class)).search(3, paramHashSet);
    AppMethodBeat.o(62070);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62073);
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
            break label138;
          localObject = new com.tencent.mm.plugin.fts.ui.a.i(paramInt);
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFk = false;
          ((com.tencent.mm.plugin.fts.ui.a.i)localObject).mEp = this.mEp;
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
        AppMethodBeat.o(62073);
        return localObject;
        label138: if (locall.mDx.equals("no_result​"))
        {
          localObject = new com.tencent.mm.plugin.fts.ui.a.l(paramInt);
        }
        else
        {
          localObject = new d(i);
          ((d)localObject).hpS = locall;
          ((d)localObject).mDz = parama.mDz;
          ((d)localObject).mIy = this.mIy;
          ((d)localObject).ej(locall.type, locall.mDw);
        }
      }
    }
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62071);
    paramHashSet = paramj.mEy;
    Object localObject;
    if (bX(paramHashSet))
    {
      if (paramHashSet.size() > 0)
      {
        localObject = (com.tencent.mm.plugin.fts.a.a.l)paramHashSet.get(0);
        if (((com.tencent.mm.plugin.fts.a.a.l)localObject).mDx.equals("create_talker_message​"))
        {
          e.a locala = new e.a();
          locala.mFc = false;
          locala.mFf = new ArrayList();
          locala.mFf.add(localObject);
          locala.mDz = paramj.mDz;
          locala.businessType = -2;
          this.mHp.add(locala);
          paramHashSet.remove(0);
        }
      }
      localObject = new e.a();
      ((e.a)localObject).businessType = -2;
      ((e.a)localObject).mDz = paramj.mDz;
      if (paramHashSet.size() != 0)
        break label213;
      ((e.a)localObject).mFc = false;
      paramj = new com.tencent.mm.plugin.fts.a.a.l();
      paramj.mDx = "no_result​";
      ((e.a)localObject).mFf = new ArrayList();
      ((e.a)localObject).mFf.add(paramj);
    }
    while (true)
    {
      this.mHp.add(localObject);
      AppMethodBeat.o(62071);
      return;
      label213: ((e.a)localObject).mFf = paramHashSet;
    }
  }

  public final com.tencent.mm.plugin.fts.ui.a.k b(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62072);
    e locale = new e(paramInt);
    locale.talker = this.mEp;
    locale.count = parama.mFf.size();
    AppMethodBeat.o(62072);
    return locale;
  }

  public final int getType()
  {
    return 160;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.f
 * JD-Core Version:    0.6.2
 */