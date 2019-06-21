package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
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
    AppMethodBeat.i(129980);
    i locali = new i();
    locali.query = this.query;
    locali.mEv = com.tencent.mm.plugin.fts.a.c.d.mEX;
    locali.mEw = this;
    locali.handler = paramak;
    locali.mEu = paramHashSet;
    paramak = ((n)g.M(n.class)).search(7, locali);
    AppMethodBeat.o(129980);
    return paramak;
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    AppMethodBeat.i(129982);
    int i = paramInt - parama.mFb - 1;
    l locall = null;
    Object localObject = locall;
    if (i < parama.mFf.size())
    {
      localObject = locall;
      if (i >= 0)
      {
        locall = (l)parama.mFf.get(i);
        localObject = new d(paramInt);
        ((d)localObject).hpS = locall;
        ((d)localObject).mDz = parama.mDz;
        ((d)localObject).ej(locall.type, locall.mDw);
      }
    }
    if (localObject != null)
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).mFn = (i + 1);
    AppMethodBeat.o(129982);
    return localObject;
  }

  public final void a(j paramj, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(129981);
    List localList = paramj.mEy;
    if ((localList != null) && (!localList.isEmpty()))
    {
      com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
      String str = this.query;
      paramHashSet = str;
      if (str != null)
        paramHashSet = str.replaceAll(",", " ");
      locald.l("20KeyWordId", paramHashSet + ",");
      locald.l("21ViewType", "1,");
      locald.l("22OpType", "1,");
      locald.l("23ResultCount", localList.size() + ",");
      locald.l("24ClickPos", ",");
      locald.l("25ClickAppUserName", ",");
      ab.i("MicroMsg.FTSWeAppUIUnit", "report oreh LocalSearchWeApp(13963), %s", new Object[] { locald.Fk() });
      com.tencent.mm.plugin.report.service.h.pYm.e(13963, new Object[] { locald });
    }
    if (bX(paramj.mEy))
    {
      paramHashSet = new e.a();
      paramHashSet.businessType = -13;
      paramHashSet.mFf = paramj.mEy;
      paramHashSet.mDz = paramj.mDz;
      if (paramHashSet.mFf.size() > 3)
      {
        paramHashSet.mFe = true;
        paramHashSet.mFf = paramHashSet.mFf.subList(0, 3);
      }
      this.mHp.add(paramHashSet);
    }
    AppMethodBeat.o(129981);
  }

  public final int getType()
  {
    return 144;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.h
 * JD-Core Version:    0.6.2
 */