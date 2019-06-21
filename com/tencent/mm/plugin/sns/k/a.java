package com.tencent.mm.plugin.sns.k;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.i;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class a extends com.tencent.mm.vending.app.a
  implements f
{
  String igi;
  protected volatile am.a rCU;
  public volatile com.tencent.mm.plugin.sns.ui.a.b.b rEB;
  private h.a rNm;
  boolean rjn;
  String ryC;
  boolean ryD;
  int ryE;

  static c.b cvD()
  {
    AppMethodBeat.i(40535);
    c.b localb = new c.b();
    Object localObject1 = af.cnK().cqF();
    int i = ((Cursor)localObject1).getCount();
    Object localObject2 = "";
    Object localObject3 = localObject2;
    if (i > 0)
    {
      ((Cursor)localObject1).moveToFirst();
      localObject3 = new j();
      ((j)localObject3).d((Cursor)localObject1);
    }
    Object localObject4;
    try
    {
      can localcan = new com/tencent/mm/protocal/protobuf/can;
      localcan.<init>();
      localObject3 = ((can)localcan.parseFrom(((j)localObject3).field_curActionBuf)).wPm;
      ((Cursor)localObject1).close();
      localObject2 = ((String)g.RP().Ry().get(ac.a.xVu, "")).split("&");
      localObject1 = new ArrayList();
      for (int j = 2; j < localObject2.length; j++)
      {
        long l = bo.getLong(localObject2[j], 0L);
        if (l != 0L)
          ((List)localObject1).add(Long.valueOf(l));
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsTimelineInteractor", localException, "", new Object[0]);
        localObject4 = localObject2;
      }
      Collections.reverse((List)localObject1);
      if (((List)localObject1).size() <= 0);
    }
    for (localObject2 = (Long)((List)localObject1).get(0); ; localObject2 = null)
    {
      i.h((Long)localObject2);
      localb.rNt = i;
      localb.rNs = localObject4;
      localb.rNu = ((List)localObject1);
      AppMethodBeat.o(40535);
      return localb;
    }
  }

  public final void a(h.a parama)
  {
    AppMethodBeat.i(40532);
    this.rCU = af.cnv();
    c.a locala = (c.a)x(c.a.class);
    this.rNm = parama;
    this.rCU.a(1, locala.igi, this.rNm);
    AppMethodBeat.o(40532);
  }

  public final am.a cnv()
  {
    return this.rCU;
  }

  public final void f(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(40537);
    this.rCU.a(1, paramString, paramBoolean, paramInt);
    AppMethodBeat.o(40537);
  }

  public final void g(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(40538);
    this.rCU.b(1, paramString, paramBoolean, paramInt);
    AppMethodBeat.o(40538);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(40533);
    super.onCreate();
    a(c.b.class, new a.1(this));
    a(c.a.class, new a.2(this));
    ab.i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor onCreate %s", new Object[] { this });
    com.tencent.mm.plugin.sns.model.b localb = af.cnA();
    synchronized (localb.eHH)
    {
      localb.qHH.clear();
      af.cnA();
      AppMethodBeat.o(40533);
      return;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(40534);
    ab.i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor onDestroy %s", new Object[] { this });
    g.RQ();
    if ((g.RN().QY()) && (this.rCU != null) && (this.rNm != null))
      this.rCU.a(this.rNm, 1);
    super.onDestroy();
    AppMethodBeat.o(40534);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40536);
    ab.i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor onSceneEnd  errType %d %d %s %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm.toString() });
    AppMethodBeat.o(40536);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.k.a
 * JD-Core Version:    0.6.2
 */