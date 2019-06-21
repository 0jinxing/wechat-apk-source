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
import com.tencent.mm.plugin.fts.ui.a.h;
import com.tencent.mm.plugin.fts.ui.a.q;
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
    AppMethodBeat.i(62059);
    i locali = new i();
    locali.hbo = 96;
    locali.mEt = 3;
    locali.query = this.query;
    locali.mEu = paramHashSet;
    locali.mEv = com.tencent.mm.plugin.fts.a.c.a.mEU;
    locali.mEw = this;
    locali.handler = paramak;
    paramak = ((n)g.M(n.class)).search(2, locali);
    AppMethodBeat.o(62059);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, l paraml, e.a parama)
  {
    AppMethodBeat.i(62062);
    q localq = new q(paramInt2);
    localq.hpS = paraml;
    localq.mDz = parama.mDz;
    localq.ej(paraml.type, paraml.mDw);
    AppMethodBeat.o(62062);
    return localq;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(62061);
    int i = paramInt - parama.mFb - 1;
    Object localObject;
    if ((i < parama.mFf.size()) && (i >= 0))
    {
      localObject = (l)parama.mFf.get(i);
      if (((l)localObject).mDx.equals("create_chatroom​"))
      {
        localObject = new h(paramInt);
        ((h)localObject).mDz = parama.mDz;
        parama = (e.a)localObject;
      }
    }
    while (true)
    {
      if (parama != null)
        parama.mFn = (i + 1);
      AppMethodBeat.o(62061);
      return parama;
      if (((l)localObject).type == 131075)
      {
        parama = a(131075, paramInt, (l)localObject, parama);
        parama.ej(((l)localObject).type, ((l)localObject).mDw);
      }
      else
      {
        parama = null;
      }
    }
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(62060);
    boolean bool;
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.mFf = paramj.mEy;
      paramHashSet.businessType = -3;
      paramHashSet.mDz = paramj.mDz;
      if (paramHashSet.mFf.size() > 3)
      {
        if (!((l)paramHashSet.mFf.get(3)).mDx.equals("create_chatroom​"))
          break label139;
        if (paramHashSet.mFf.size() <= 4)
          break label134;
        bool = true;
        paramHashSet.mFe = bool;
      }
    }
    for (paramHashSet.mFf = paramHashSet.mFf.subList(0, 4); ; paramHashSet.mFf = paramHashSet.mFf.subList(0, 3))
    {
      this.mHp.add(paramHashSet);
      AppMethodBeat.o(62060);
      return;
      label134: bool = false;
      break;
      label139: paramHashSet.mFe = true;
    }
  }

  public final int getType()
  {
    return 48;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.d.c
 * JD-Core Version:    0.6.2
 */