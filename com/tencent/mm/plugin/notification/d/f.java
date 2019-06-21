package com.tencent.mm.plugin.notification.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.notification.ui.FailSendMsgNotification;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class f
  implements at
{
  private static f oWl = null;
  com.tencent.mm.plugin.notification.c.c oWm;
  com.tencent.mm.plugin.notification.c.c oWn;
  private com.tencent.mm.plugin.notification.a.a oWo;
  private boolean oWp;
  private com.tencent.mm.sdk.b.c oWq;
  private com.tencent.mm.sdk.b.c oWr;
  private com.tencent.mm.sdk.b.c oWs;
  private com.tencent.mm.sdk.b.c oWt;
  private com.tencent.mm.sdk.b.c oWu;
  private com.tencent.mm.sdk.b.c oWv;

  private f()
  {
    AppMethodBeat.i(23185);
    this.oWm = null;
    this.oWn = null;
    this.oWo = null;
    this.oWp = false;
    this.oWq = new f.1(this);
    this.oWr = new f.2(this);
    this.oWs = new f.3(this);
    this.oWt = new f.4(this);
    this.oWu = new f.5(this);
    this.oWv = new f.6(this);
    b.init();
    if (this.oWn == null)
      this.oWn = new e();
    if (this.oWm == null)
      this.oWm = new d();
    AppMethodBeat.o(23185);
  }

  public static FailSendMsgNotification At(int paramInt)
  {
    AppMethodBeat.i(23186);
    FailSendMsgNotification localFailSendMsgNotification;
    if ((paramInt == 2) && (bWP().oWn != null))
    {
      ab.d("MicroMsg.SubCoreNotification", "get sns notificaiton");
      localFailSendMsgNotification = bWP().oWn.bWB();
      AppMethodBeat.o(23186);
    }
    while (true)
    {
      return localFailSendMsgNotification;
      if ((paramInt == 1) && (bWP().oWm != null))
      {
        ab.d("MicroMsg.SubCoreNotification", "get msg notificaiton");
        localFailSendMsgNotification = bWP().oWm.bWB();
        AppMethodBeat.o(23186);
      }
      else
      {
        localFailSendMsgNotification = null;
        AppMethodBeat.o(23186);
      }
    }
  }

  public static boolean aJt()
  {
    AppMethodBeat.i(23190);
    boolean bool = bWP().oWp;
    AppMethodBeat.o(23190);
    return bool;
  }

  public static ArrayList<Long> ae(bi parambi)
  {
    AppMethodBeat.i(23191);
    if (parambi == null)
    {
      parambi = null;
      AppMethodBeat.o(23191);
    }
    while (true)
    {
      return parambi;
      aw.ZK();
      com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
      Object localObject = ((j)g.K(j.class)).bOr().bOC();
      parambi = new ArrayList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        parambi.add(Long.valueOf(((bi)((Iterator)localObject).next()).field_msgId));
      AppMethodBeat.o(23191);
    }
  }

  public static f bWP()
  {
    AppMethodBeat.i(23187);
    if (oWl == null)
    {
      oWl = new f();
      aw.ZE().a("plugin.notification", oWl);
    }
    f localf = oWl;
    AppMethodBeat.o(23187);
    return localf;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(23188);
    this.oWm.bWK();
    this.oWm.bWL();
    this.oWn.bWK();
    this.oWn.bWL();
    if (this.oWo == null)
      this.oWo = new com.tencent.mm.plugin.notification.a.a();
    com.tencent.mm.plugin.notification.a.a locala = this.oWo;
    if (!aw.RK())
      ab.e("MicroMsg.NotificationObserver", "account not ready!");
    while (true)
    {
      com.tencent.mm.sdk.b.a.xxA.c(this.oWq);
      com.tencent.mm.sdk.b.a.xxA.c(this.oWr);
      com.tencent.mm.sdk.b.a.xxA.c(this.oWs);
      com.tencent.mm.sdk.b.a.xxA.c(this.oWt);
      com.tencent.mm.sdk.b.a.xxA.c(this.oWu);
      com.tencent.mm.sdk.b.a.xxA.c(this.oWv);
      aw.getNotification().ik(com.tencent.mm.m.f.Nr());
      aw.getNotification().bw(false);
      ab.d("MicroMsg.SubCoreNotification", "onAccountPostReset");
      AppMethodBeat.o(23188);
      return;
      ab.d("MicroMsg.NotificationObserver", "added");
      try
      {
        aw.ZK();
        com.tencent.mm.model.c.XR().b(locala);
        aw.ZK();
        com.tencent.mm.model.c.XR().a(locala);
        locala.oVn = true;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.NotificationObserver", "exception:%s", new Object[] { bo.l(localException) });
      }
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(23189);
    this.oWm.bWM();
    this.oWm.bWN();
    this.oWn.bWM();
    this.oWn.bWN();
    com.tencent.mm.plugin.notification.a.a locala;
    if (this.oWo != null)
    {
      locala = this.oWo;
      if (!aw.RK());
    }
    try
    {
      aw.ZK();
      com.tencent.mm.model.c.XR().b(locala);
      com.tencent.mm.sdk.b.a.xxA.d(this.oWq);
      com.tencent.mm.sdk.b.a.xxA.d(this.oWr);
      com.tencent.mm.sdk.b.a.xxA.d(this.oWs);
      com.tencent.mm.sdk.b.a.xxA.d(this.oWt);
      com.tencent.mm.sdk.b.a.xxA.d(this.oWu);
      com.tencent.mm.sdk.b.a.xxA.d(this.oWv);
      aw.getNotification().ik(0);
      aw.getNotification().bw(true);
      ab.d("MicroMsg.SubCoreNotification", "onAccountRelease");
      AppMethodBeat.o(23189);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.NotificationObserver", "exception:%s", new Object[] { bo.l(localException) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.f
 * JD-Core Version:    0.6.2
 */