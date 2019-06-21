package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ax.d.a;
import com.tencent.mm.g.a.iw;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.to;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.r.a;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bm;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a.a;

public final class w
  implements n.b
{
  MMFragmentActivity yhZ;
  com.tencent.mm.sdk.b.c<px> yhq;
  com.tencent.mm.sdk.b.c yhr;
  LauncherUI.c ynS;
  c ynT;
  boolean ynU;
  Runnable ynV;
  a ynW;
  a.a ynX;
  n.b ynY;
  com.tencent.mm.sdk.b.c ynZ;

  public w()
  {
    AppMethodBeat.i(29672);
    this.ynV = new w.1(this);
    this.yhr = new com.tencent.mm.sdk.b.c()
    {
    };
    this.yhq = new w.5(this);
    this.ynX = new w.10(this);
    this.ynY = new w.11(this);
    this.ynZ = new com.tencent.mm.sdk.b.c()
    {
    };
    AppMethodBeat.o(29672);
  }

  public final void No(int paramInt)
  {
    AppMethodBeat.i(29677);
    if (this.ynT != null)
    {
      this.ynT.MM(paramInt);
      this.ynS.dxq();
    }
    AppMethodBeat.o(29677);
  }

  public final void Np(int paramInt)
  {
    AppMethodBeat.i(29679);
    if (this.ynT != null)
      this.ynT.setTo(paramInt);
    AppMethodBeat.o(29679);
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(29678);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(29678);
    }
    while (true)
    {
      return;
      aw.ZK();
      if (paramn == com.tencent.mm.model.c.XR())
      {
        ab.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "Launcherui onNotifyChange event type %d, username %s", new Object[] { Integer.valueOf(paramInt), paramObject });
        if (ad.mR((String)paramObject))
          dyE();
        AppMethodBeat.o(29678);
      }
      else
      {
        AppMethodBeat.o(29678);
      }
    }
  }

  protected final void dyC()
  {
    AppMethodBeat.i(29675);
    com.tencent.mm.blink.b.HQ().o(new w.9(this));
    AppMethodBeat.o(29675);
  }

  protected final void dyD()
  {
    AppMethodBeat.i(29676);
    if (this.ynU)
    {
      ab.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "start  setAppTagUnreadNow");
      dyI();
    }
    AppMethodBeat.o(29676);
  }

  protected final void dyE()
  {
    AppMethodBeat.i(29674);
    com.tencent.mm.blink.b.HQ().o(new w.8(this));
    AppMethodBeat.o(29674);
  }

  protected final void dyI()
  {
    AppMethodBeat.i(29673);
    com.tencent.mm.blink.b.HQ().o(new w.7(this));
    AppMethodBeat.o(29673);
  }

  public final int dyJ()
  {
    AppMethodBeat.i(29680);
    int i = 0;
    int j = i;
    if (this.ynT != null)
    {
      j = i;
      if (this.ynT.getMainTabUnread() > 0)
        j = this.ynT.getMainTabUnread();
    }
    AppMethodBeat.o(29680);
    return j;
  }

  static final class a
    implements d.a
  {
    c ynT;

    public a(c paramc)
    {
      this.ynT = paramc;
    }

    public final void e(bm parambm)
    {
      AppMethodBeat.i(29671);
      if (parambm.field_tipId == com.tencent.mm.ax.b.fKD)
      {
        a.bVv();
        if (com.tencent.mm.ax.c.lQ(com.tencent.mm.ax.b.fKD))
          this.ynT.py(true);
      }
      AppMethodBeat.o(29671);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.w
 * JD-Core Version:    0.6.2
 */