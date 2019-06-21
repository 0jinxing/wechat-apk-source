package com.tencent.mm.aj;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.c;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bxk;
import com.tencent.mm.protocal.protobuf.byj;
import com.tencent.mm.protocal.protobuf.sm;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;
import org.json.JSONObject;

public final class k
{
  private b.a ecy;
  int fwt;
  private com.tencent.mm.modelgeo.d fwu;
  private int fwv;
  int fww;
  boolean fwx;
  n.b fwy;
  public bxk fwz;
  String userName;

  protected k()
  {
    AppMethodBeat.i(11405);
    this.userName = null;
    this.fwt = 0;
    this.fwv = 2;
    this.fww = 10;
    this.fwx = false;
    this.fwy = new k.1(this);
    this.ecy = new k.2(this);
    this.fww = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nv().O("BrandService", "continueLocationReportInterval"), 5);
    if (this.fww < this.fwv)
      this.fww = this.fwv;
    ab.i("MicroMsg.ReportLocation", "reportLocation interval %d", new Object[] { Integer.valueOf(this.fww) });
    AppMethodBeat.o(11405);
  }

  public static void a(bxk parambxk, String paramString)
  {
    AppMethodBeat.i(11408);
    if ((parambxk == null) || (parambxk.wXt <= 0))
      AppMethodBeat.o(11408);
    while (true)
    {
      return;
      int i = Math.min(parambxk.wXt, 30);
      parambxk.wXw = 0;
      parambxk.wXx = 0;
      paramString = ((j)g.K(j.class)).bOr().i(paramString, i, 0L);
      while (paramString.moveToNext())
      {
        Object localObject = new bi();
        ((bi)localObject).d(paramString);
        if (((cy)localObject).field_isSend != 1)
          if (((bi)localObject).dtu())
          {
            parambxk.wXx += 1;
          }
          else
          {
            localObject = bf.oE(((cy)localObject).dqJ);
            if ((localObject != null) && (((bf.b)localObject).fmq == 3))
              parambxk.wXw += 1;
          }
      }
      paramString.close();
      AppMethodBeat.o(11408);
    }
  }

  static void a(String paramString, int paramInt1, float paramFloat1, float paramFloat2, int paramInt2)
  {
    AppMethodBeat.i(11412);
    b(paramString, paramInt1, paramFloat1, paramFloat2, paramInt2);
    AppMethodBeat.o(11412);
  }

  public static void a(String paramString, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, LinkedList<sm> paramLinkedList, int paramInt4, bxk parambxk, byj parambyj)
  {
    AppMethodBeat.i(11414);
    if (paramInt2 == 3);
    for (String str = "<event></event>"; ; str = String.format("<event><location><errcode>%d</errcode><data><latitude>%f</latitude><longitude>%f</longitude><precision>%d</precision></data></location></event>", new Object[] { Integer.valueOf(paramInt2), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt3) }))
    {
      ab.i("MicroMsg.ReportLocation", "doScene, info: %s", new Object[] { str });
      g.RO().eJo.a(new q(paramString, paramInt1, str, paramLinkedList, paramInt4, parambxk, parambyj), 0);
      AppMethodBeat.o(11414);
      return;
    }
  }

  public static void a(String paramString, byj parambyj, int paramInt)
  {
    AppMethodBeat.i(11409);
    a(paramString, paramInt, 0, 0.0F, 0.0F, 0, null, 0, null, parambyj);
    AppMethodBeat.o(11409);
  }

  private static void b(String paramString, int paramInt1, float paramFloat1, float paramFloat2, int paramInt2)
  {
    AppMethodBeat.i(11413);
    a(paramString, 11, paramInt1, paramFloat1, paramFloat2, paramInt2, null, 0, null, null);
    AppMethodBeat.o(11413);
  }

  public final void a(String paramString, bxk parambxk)
  {
    AppMethodBeat.i(11407);
    com.tencent.mm.sdk.g.d.xDG.execute(new k.4(this, parambxk, paramString));
    AppMethodBeat.o(11407);
  }

  public final void a(String paramString, bi parambi, int paramInt, bxk parambxk)
  {
    AppMethodBeat.i(11406);
    com.tencent.mm.sdk.g.d.xDG.execute(new k.3(this, parambxk, paramString, parambi, paramInt));
    AppMethodBeat.o(11406);
  }

  public final void aeJ()
  {
    AppMethodBeat.i(11411);
    ab.i("MicroMsg.ReportLocation", "Stop report");
    this.fwt = 0;
    if (this.fwu != null)
      this.fwu.c(this.ecy);
    if (g.RN().QY())
      ((j)g.K(j.class)).XM().b(this.fwy);
    AppMethodBeat.o(11411);
  }

  public final void rj(String paramString)
  {
    AppMethodBeat.i(11410);
    ab.i("MicroMsg.ReportLocation", "Start report");
    this.userName = paramString;
    Object localObject = f.qX(paramString);
    if (localObject == null)
      AppMethodBeat.o(11410);
    while (true)
    {
      return;
      if (this.fwt != 0)
        aeJ();
      this.fwt = 0;
      if (((d)localObject).adJ())
      {
        ab.i("MicroMsg.ReportLocation", "need update contact %s", new Object[] { paramString });
        com.tencent.mm.ah.b.pY(paramString);
      }
      d.b localb = ((d)localObject).cJ(false);
      if (localb == null)
      {
        AppMethodBeat.o(11410);
      }
      else if ((localb.adL()) && (((d)localObject).adI()))
      {
        this.fwu = com.tencent.mm.modelgeo.d.agz();
        localObject = ((d)localObject).cJ(false);
        boolean bool;
        if (((d.b)localObject).fvc != null)
        {
          if (bo.getInt(((d.b)localObject).fvc.optString("ReportLocationType"), 0) == 2)
          {
            bool = true;
            label152: ((d.b)localObject).fvp = bool;
          }
        }
        else
          if (!((d.b)localObject).fvp)
            break label213;
        label213: for (int i = 3; ; i = 2)
        {
          this.fwt = i;
          if ((!com.tencent.mm.modelgeo.d.agA()) && (!com.tencent.mm.modelgeo.d.agB()))
            break label219;
          this.fwu.a(this.ecy, true);
          AppMethodBeat.o(11410);
          break;
          bool = false;
          break label152;
        }
        label219: a(paramString, 2, 0.0F, 0.0F, 0);
        AppMethodBeat.o(11410);
      }
      else
      {
        if ((localb.adL()) && (!((d)localObject).adI()))
          a(paramString, 1, 0.0F, 0.0F, 0);
        AppMethodBeat.o(11410);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.k
 * JD-Core Version:    0.6.2
 */