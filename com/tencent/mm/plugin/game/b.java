package com.tencent.mm.plugin.game;

import android.content.Context;
import android.content.Intent;
import com.facebook.device.yearclass.YearClass;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ky;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
  implements com.tencent.mm.plugin.game.a.a
{
  private boolean mSP = false;
  private boolean mSQ = false;

  public final void W(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111128);
    com.tencent.mm.game.report.api.c.eBG.i(paramString, paramInt1, paramInt2);
    AppMethodBeat.o(111128);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(111131);
    com.tencent.mm.game.report.api.c.eBG.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramString4, 0L, paramString5, paramString6);
    AppMethodBeat.o(111131);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2)
  {
    AppMethodBeat.i(111126);
    com.tencent.mm.game.report.api.c.eBG.a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramString4, paramInt2);
    AppMethodBeat.o(111126);
  }

  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, int paramInt3)
  {
    AppMethodBeat.i(111125);
    com.tencent.mm.game.report.api.c.eBG.a(paramString1, paramString2, paramInt1, paramInt2, paramString3, paramInt3);
    AppMethodBeat.o(111125);
  }

  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, long paramLong, String paramString4)
  {
    AppMethodBeat.i(111127);
    f localf = com.tencent.mm.pluginsdk.model.app.g.bT(paramString1, true);
    if (localf != null)
      com.tencent.mm.game.report.api.c.eBG.a(paramString1, paramString2, paramInt1, paramInt2, paramString3, paramLong, localf.xy(), paramString4);
    AppMethodBeat.o(111127);
  }

  public final boolean bCS()
  {
    AppMethodBeat.i(111124);
    try
    {
      bool = com.tencent.mm.plugin.game.commlib.a.bDd();
      AppMethodBeat.o(111124);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool = true;
        AppMethodBeat.o(111124);
      }
    }
  }

  public final String bCT()
  {
    AppMethodBeat.i(111133);
    String str = e.ef(ah.getContext());
    AppMethodBeat.o(111133);
    return str;
  }

  public final void dV(Context paramContext)
  {
    AppMethodBeat.i(111132);
    e.dV(paramContext);
    AppMethodBeat.o(111132);
  }

  public final void hH(boolean paramBoolean)
  {
    AppMethodBeat.i(111134);
    if (!this.mSQ)
    {
      if ((((com.tencent.mm.game.report.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.game.report.a.b.class)).a(a.a.lFH)) && (((com.tencent.mm.game.report.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.game.report.a.b.class)).a(a.a.lFJ)))
        break label144;
      paramBoolean = false;
    }
    while (true)
    {
      this.mSP = paramBoolean;
      this.mSQ = true;
      Object localObject;
      if (this.mSP)
      {
        String str = com.tencent.mm.plugin.game.f.c.bFG();
        if (!bo.isNullOrNil(str))
        {
          ab.i("MicroMsg.GameDelegateImpl", "preload");
          ky localky = new ky();
          localky.cGQ.type = 3;
          localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", str);
          localky.cGQ.intent = ((Intent)localObject);
          com.tencent.mm.sdk.b.a.xxA.m(localky);
        }
      }
      AppMethodBeat.o(111134);
      return;
      label144: ab.i("MicroMsg.GameDelegateImpl", "hit expt preload");
      h.pYm.k(939L, 4L, 1L);
      if (YearClass.get(ah.getContext()) < 2014)
      {
        ab.i("MicroMsg.GameDelegateImpl", "device score smaller than 2014");
        h.pYm.k(939L, 5L, 1L);
        paramBoolean = false;
      }
      else
      {
        long l = e.bEd();
        if (System.currentTimeMillis() - l > 21600000L)
        {
          ab.i("MicroMsg.GameDelegateImpl", "larger than 6 hours");
          if (paramBoolean)
          {
            ((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
            localObject = q.bEm();
            if ((localObject == null) || (System.currentTimeMillis() - ((n)localObject).field_receiveTime * 1000L > 21600000L))
            {
              ab.i("MicroMsg.GameDelegateImpl", "red dot larger than 6 hours");
              h.pYm.k(939L, 7L, 1L);
              paramBoolean = false;
            }
          }
          else
          {
            h.pYm.k(939L, 6L, 1L);
            paramBoolean = false;
          }
        }
        else if (com.tencent.mm.sdk.platformtools.g.dnY())
        {
          ab.i("MicroMsg.GameDelegateImpl", "isGPVersion");
          h.pYm.k(939L, 8L, 1L);
          paramBoolean = false;
        }
        else if (bo.isNullOrNil(com.tencent.mm.plugin.game.f.c.bFG()))
        {
          h.pYm.k(939L, 9L, 1L);
          paramBoolean = false;
        }
        else
        {
          paramBoolean = true;
        }
      }
    }
  }

  public final void j(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(111130);
    com.tencent.mm.game.report.api.c.eBG.j(paramContext, paramString1, paramString2);
    AppMethodBeat.o(111130);
  }

  public final void m(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(111129);
    com.tencent.mm.game.report.api.c.eBG.m(paramString1, paramString2, paramString3);
    AppMethodBeat.o(111129);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.b
 * JD-Core Version:    0.6.2
 */