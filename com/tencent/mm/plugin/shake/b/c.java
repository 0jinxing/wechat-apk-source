package com.tencent.mm.plugin.shake.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.modelstat.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.List;

public final class c extends l.b
  implements f
{
  private Context context;
  float ecs;
  float ect;
  private b.a ecy;
  d fwu;
  int qfv;
  int qfw;
  boolean qfz;
  boolean qrF;
  b qrG;
  a qrH;
  private int qrI;
  ak qrJ;
  Runnable qrK;

  public c(Context paramContext, l.a parama)
  {
    super(parama);
    AppMethodBeat.i(24419);
    this.ecs = -85.0F;
    this.ect = -1000.0F;
    this.qfv = 1;
    this.qfw = -1000;
    this.qfz = false;
    this.qrF = true;
    this.qrI = 0;
    this.qrJ = new ak();
    this.qrK = new c.1(this);
    this.ecy = new b.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        AppMethodBeat.i(24418);
        e locale = e.akf();
        boolean bool1;
        boolean bool2;
        if (paramAnonymousInt == 0)
        {
          bool1 = false;
          if (c.this.fwu != null)
            break label114;
          bool2 = false;
          label32: locale.a(2002, bool1, bool2, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
          ab.i("MicroMsg.ShakeFriendService", "getlocaion lat %f lng %f hasGetLbsInfo " + c.this.qfz, new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
          if (paramAnonymousBoolean)
            break label129;
          paramAnonymousBoolean = true;
          AppMethodBeat.o(24418);
        }
        while (true)
        {
          return paramAnonymousBoolean;
          bool1 = true;
          break;
          label114: bool2 = c.this.fwu.fBD;
          break label32;
          label129: if ((c.this.qrF) && (c.this.ecs == -85.0F) && (c.this.ect == -1000.0F))
          {
            c.this.qrF = false;
            c.this.ecs = paramAnonymousFloat2;
            c.this.ect = paramAnonymousFloat1;
            c.this.qfw = ((int)paramAnonymousDouble2);
            c.this.qfv = paramAnonymousInt;
            c.this.qfz = true;
          }
          paramAnonymousBoolean = false;
          AppMethodBeat.o(24418);
        }
      }
    };
    this.context = paramContext;
    AppMethodBeat.o(24419);
  }

  private void cjv()
  {
    AppMethodBeat.i(24422);
    this.fwu = d.agz();
    this.qrF = true;
    this.fwu.a(this.ecy, true);
    AppMethodBeat.o(24422);
  }

  public final void cjw()
  {
    AppMethodBeat.i(24426);
    super.cjw();
    aw.Rg().b(161, this);
    aw.Rg().b(162, this);
    aw.Rg().b(1251, this);
    if (this.fwu != null)
      this.fwu.c(this.ecy);
    AppMethodBeat.o(24426);
  }

  public final void init()
  {
    AppMethodBeat.i(24420);
    aw.Rg().a(161, this);
    aw.Rg().a(162, this);
    aw.Rg().a(1251, this);
    cjv();
    AppMethodBeat.o(24420);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(24427);
    switch (paramm.getType())
    {
    default:
    case 161:
    case 162:
    case 1251:
    }
    while (true)
    {
      AppMethodBeat.o(24427);
      while (true)
      {
        return;
        paramString = (b)paramm;
        if ((paramString.cju() == 3) || (paramString.cju() == 4))
        {
          ab.v("MicroMsg.ShakeFriendService", "onSceneEnd ignore location report response");
          AppMethodBeat.o(24427);
        }
        else if ((paramInt2 != 0) || (paramInt1 != 0) || (paramString.ret != 0))
        {
          ab.e("MicroMsg.ShakeFriendService", "onSceneEnd reprot failed");
          this.qrT.b(null, 3L);
          AppMethodBeat.o(24427);
        }
        else
        {
          this.qrJ.postDelayed(this.qrK, 3000L);
          AppMethodBeat.o(24427);
          continue;
          paramString = (a)paramm;
          if ((paramInt2 != 0) || (paramInt1 != 0) || (paramString.ret != 0))
          {
            this.qrT.b(null, 3L);
            AppMethodBeat.o(24427);
          }
          else
          {
            paramString = paramString.qrD;
            if (paramString.size() == 0)
            {
              ab.i("MicroMsg.ShakeFriendService", "empty shake get list");
              this.qrT.b(null, 3L);
              AppMethodBeat.o(24427);
            }
            else
            {
              this.qrT.b(paramString, 1L);
              AppMethodBeat.o(24427);
              continue;
              paramString = (com.tencent.mm.plugin.shake.c.a.b)paramm;
              if ((paramInt2 == 0) && (paramInt1 == 0))
                break label309;
              if (this.qrT == null)
                break;
              this.qrT.a(1251, null, 2L);
              AppMethodBeat.o(24427);
            }
          }
        }
      }
      label309: if (this.qrT != null)
        this.qrT.a(1251, paramString.qsm, 1L);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(24424);
    if (this.fwu != null)
      this.fwu.c(this.ecy);
    AppMethodBeat.o(24424);
  }

  public final void reset()
  {
    AppMethodBeat.i(24423);
    if (this.qrG != null)
      aw.Rg().c(this.qrG);
    if (this.qrH != null)
      aw.Rg().c(this.qrH);
    if ((this.qrJ != null) && (this.qrK != null))
      this.qrJ.removeCallbacks(this.qrK);
    AppMethodBeat.o(24423);
  }

  public final void resume()
  {
    AppMethodBeat.i(24425);
    if (this.fwu != null)
      this.fwu.a(this.ecy, true);
    AppMethodBeat.o(24425);
  }

  public final void start()
  {
    AppMethodBeat.i(24421);
    reset();
    init();
    this.qrG = new b(this.ect, this.ecs, this.qfw, this.qfv, "", "");
    aw.Rg().a(this.qrG, 0);
    if (!this.qfz)
    {
      if (this.fwu == null)
        cjv();
      this.fwu.b(this.ecy, true);
    }
    if (this.qrI <= 0);
    for (this.qrI += 1; ; this.qrI = 0)
    {
      ab.i("MicroMsg.ShakeFriendService", "do doGetLbsCard");
      com.tencent.mm.plugin.shake.c.a.b localb = new com.tencent.mm.plugin.shake.c.a.b(this.ect, this.ecs);
      aw.Rg().a(localb, 0);
      AppMethodBeat.o(24421);
      while (true)
      {
        return;
        if ((this.qrI <= 0) || (this.qrI > 10))
          break;
        this.qrI += 1;
        AppMethodBeat.o(24421);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.c
 * JD-Core Version:    0.6.2
 */