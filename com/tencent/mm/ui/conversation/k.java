package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.a.iv;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.modelmulti.o;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.FLock;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.u.a;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.e.a;
import java.lang.ref.WeakReference;

public final class k
  implements f, com.tencent.mm.ai.g
{
  private static boolean zuK = false;
  Activity czX;
  ProgressDialog ehJ;
  WeakReference<Activity> gWO;
  PowerManager.WakeLock wakeLock;
  private com.tencent.mm.ui.widget.a.c zuE;
  private com.tencent.mm.ui.widget.a.c zuF;
  private boolean zuG;
  private g.a zuH;
  boolean zuI;
  private com.tencent.mm.modelmulti.e zuJ;
  a zuL;
  k.a zuM;
  com.tencent.mm.sdk.b.c zuN;
  com.tencent.mm.sdk.b.c zuO;
  FLock zuP;

  public k()
  {
    AppMethodBeat.i(34483);
    this.zuE = null;
    this.zuF = null;
    this.zuG = false;
    this.zuH = new g.a();
    this.wakeLock = null;
    this.zuI = false;
    this.zuJ = null;
    this.ehJ = null;
    this.zuN = new k.1(this);
    this.zuO = new k.6(this);
    AppMethodBeat.o(34483);
  }

  private boolean ay(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(34488);
    boolean bool;
    if (!com.tencent.mm.kernel.g.RK())
    {
      ab.w("MicroMsg.InitHelper", "account not ready");
      bool = false;
      AppMethodBeat.o(34488);
    }
    while (true)
    {
      return bool;
      aw.ZK();
      long l1 = com.tencent.mm.platformtools.ah.d((Long)com.tencent.mm.model.c.Ry().get(ac.a.xIH, null));
      aw.ZK();
      long l2 = com.tencent.mm.platformtools.ah.d((Long)com.tencent.mm.model.c.Ry().get(ac.a.xIJ, null));
      aw.ZK();
      long l3 = com.tencent.mm.platformtools.ah.d((Long)com.tencent.mm.model.c.Ry().get(ac.a.xII, null));
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xIH, Long.valueOf(0L));
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xII, Long.valueOf(0L));
      if ((l3 == d.vxo) && (com.tencent.mm.platformtools.ah.fp(l2) < 3600L))
      {
        if (l1 == 1L)
        {
          if (u.c(this.czX, 4, -17))
          {
            bool = true;
            AppMethodBeat.o(34488);
          }
        }
        else if ((l1 == 2L) && (u.c(this.czX, 4, -16)))
        {
          bool = true;
          AppMethodBeat.o(34488);
        }
      }
      else if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      {
        ab.i("MicroMsg.InitHelper", "trigger check update: errCode:%d, sceneType:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        if (ae.gim)
          com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", com.tencent.mm.platformtools.ah.anT() - 86400L - 1L).commit();
        if (u.c(this.czX, paramInt1, paramInt2))
        {
          bool = true;
          AppMethodBeat.o(34488);
        }
      }
      else
      {
        bool = false;
        AppMethodBeat.o(34488);
      }
    }
  }

  private void dIO()
  {
    AppMethodBeat.i(34485);
    if (this.zuG)
    {
      ab.i("MicroMsg.InitHelper", "summerinit doPreCreate but hasTryDoInitButFailed true ret");
      AppMethodBeat.o(34485);
    }
    while (true)
    {
      return;
      if (!this.wakeLock.isHeld())
      {
        ab.w("MicroMsg.InitHelper", "tryDoInit wakelock.acquire!");
        this.wakeLock.acquire();
      }
      this.zuM.dIR();
      if (this.zuJ == null)
      {
        if (com.tencent.mm.plugin.sns.b.n.qFy != null)
          com.tencent.mm.plugin.sns.b.n.qFy.cmk();
        this.zuJ = new com.tencent.mm.modelmulti.e(this);
        ab.d("MicroMsg.InitHelper", "dkinit doPreCreate t:%d initScene:%d", new Object[] { Long.valueOf(this.zuH.Mr()), Integer.valueOf(this.zuJ.hashCode()) });
        this.zuH.evE = SystemClock.elapsedRealtime();
        aw.Rg().a(this.zuJ, 0);
      }
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(34479);
          long l = k.f(k.this).Mr();
          if (k.g(k.this) == null);
          for (int i = -2; ; i = k.g(k.this).hashCode())
          {
            ab.d("MicroMsg.InitHelper", "dkinit showProgressDlg t:%d initScene:%d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
            if ((k.h(k.this) != null) && (k.h(k.this).isShowing()))
              k.h(k.this).dismiss();
            k localk = k.this;
            Activity localActivity = k.a(k.this);
            k.a(k.this).getString(2131297061);
            k.a(localk, com.tencent.mm.ui.base.h.b(localActivity, k.a(k.this).getString(2131296966), false, new k.10.1(this)));
            aw.RS().Bn();
            AppMethodBeat.o(34479);
            return;
          }
        }
      });
      AppMethodBeat.o(34485);
    }
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(34486);
    if ((paramm == null) || (paramm.getType() != 139))
    {
      AppMethodBeat.o(34486);
      return;
    }
    if (paramInt2 != 0);
    for (long l = paramInt1 * 100L / paramInt2; ; l = 0L)
    {
      al.d(new k.11(this, (int)l));
      AppMethodBeat.o(34486);
      break;
    }
  }

  final boolean dIN()
  {
    boolean bool = false;
    AppMethodBeat.i(34484);
    if (!com.tencent.mm.modelmulti.k.ahT())
      AppMethodBeat.o(34484);
    while (true)
    {
      return bool;
      if ((this.zuF == null) || (!this.zuF.isShowing()))
        break;
      AppMethodBeat.o(34484);
    }
    com.tencent.mm.kernel.g.RQ();
    if (com.tencent.mm.kernel.g.RP().Rr())
    {
      this.zuF = new c.a(this.czX).PV(2131298850).asE(this.czX.getString(2131298849)).rc(false).Qc(2131298851).a(new k.9(this)).Qd(2131298848).b(new k.8(this)).aMb();
      this.zuF.show();
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(34484);
      break;
      dIO();
    }
  }

  final int dIP()
  {
    AppMethodBeat.i(34489);
    int i;
    if (this.zuJ == null)
    {
      i = -2;
      AppMethodBeat.o(34489);
    }
    while (true)
    {
      return i;
      i = this.zuJ.hashCode();
      AppMethodBeat.o(34489);
    }
  }

  public final boolean dIQ()
  {
    if (this.zuJ != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(34487);
    if ((paramm.getType() != 138) && (paramm.getType() != 139))
    {
      if ((paramm.getType() != 113) && (paramm.getType() != 0))
      {
        ay(paramInt1, paramInt2, paramm.getType());
        AppMethodBeat.o(34487);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.InitHelper", "onSceneEnd from GetUpdateInfo, ignore it.");
        AppMethodBeat.o(34487);
      }
    }
    int i = paramm.getType();
    int j = hashCode();
    int k;
    label106: Object localObject;
    if (this.zuJ == null)
    {
      k = -2;
      ab.i("MicroMsg.InitHelper", "dkinit onSceneEnd:[%d,%d,%s] type:%d hash:%d init:%d ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      if ((this.zuJ != null) && (paramm.getType() == 139))
      {
        this.zuJ = null;
        ab.w("MicroMsg.InitHelper", "summerinit dkinit Kevin init FINISH : %d ", new Object[] { Long.valueOf(this.zuH.Mr()) });
        ao.a.flu.a(null, null, null);
        if (com.tencent.mm.plugin.sns.b.n.qFy != null)
          com.tencent.mm.plugin.sns.b.n.qFy.cml();
        this.zuM.dIS();
        if (this.wakeLock.isHeld())
        {
          ab.w("MicroMsg.InitHelper", "onSceneEnd wakelock.release!");
          this.wakeLock.release();
        }
        aw.RS().doM();
        if (this.ehJ != null)
        {
          this.ehJ.dismiss();
          this.ehJ = null;
        }
        Activity localActivity = (Activity)this.gWO.get();
        if ((!com.tencent.mm.kernel.g.RK()) || (!com.tencent.mm.kernel.g.RN().eJb) || (localActivity == null) || (this.czX.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_fontScaleTip", 0).getBoolean("font_scale_tip_login", false)))
          break label1281;
        if (1.0F != com.tencent.mm.bz.a.dm(this.czX))
          break label695;
        if (1.0F == this.czX.getResources().getConfiguration().fontScale)
          break label1281;
        com.tencent.mm.plugin.report.service.h.pYm.e(15181, new Object[] { Integer.valueOf(1) });
        e.a locala = new e.a(localActivity);
        localObject = locala.al(localActivity.getResources().getString(2131300020)).asL(localActivity.getResources().getString(2131300017));
        ((e.a)localObject).zQJ = localActivity.getResources().getString(2131300019);
        ((e.a)localObject).zQK = localActivity.getResources().getString(2131300018);
        locala.c(new k.12(this, localActivity)).show();
        this.czX.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_fontScaleTip", 0).edit().putBoolean("font_scale_tip_login", true).apply();
        k = 1;
      }
    }
    while (true)
    {
      if (k == 0)
        this.czX.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_fontScaleTip", 0).edit().putBoolean("font_scale_tip", false).apply();
      if (u.a(this.czX, paramInt1, paramInt2, new Intent().setClass(this.czX, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString))
      {
        ab.i("MicroMsg.InitHelper", "summerinit onSceneEnd accountExpired ret");
        AppMethodBeat.o(34487);
        break;
        k = this.zuJ.hashCode();
        break label106;
        label695: this.czX.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_fontScaleTip", 0).edit().putBoolean("font_scale_tip_login", true).apply();
        k = 1;
        continue;
      }
      if (!aw.RK())
      {
        ab.w("MicroMsg.InitHelper", "summerinit onSceneEnd not set uin");
        AppMethodBeat.o(34487);
        break;
      }
      if (!this.zuI)
      {
        this.zuI = true;
        aw.ZK();
        localObject = (String)com.tencent.mm.model.c.Ry().get(5, null);
        aw.ZK();
        if (((Integer)com.tencent.mm.model.c.Ry().get(57, Integer.valueOf(0))).intValue() == 0)
          break label974;
      }
      label974: for (k = 1; ; k = 0)
      {
        if ((k != 0) && (localObject != null))
          com.tencent.mm.ui.base.h.d(this.czX, this.czX.getString(2131302261, new Object[] { localObject }), this.czX.getString(2131297061), this.czX.getString(2131302263), this.czX.getString(2131302262), new k.3(this), new k.4(this));
        if ((paramInt1 == 4) && (paramInt2 == -17) && (!zuK))
        {
          com.tencent.mm.modelmulti.n.ahW().lN(7);
          zuK = true;
        }
        if (!ay(paramInt1, paramInt2, paramm.getType()))
          break label980;
        ab.w("MicroMsg.InitHelper", "summerinit onSceneEnd checkUpdate ret");
        AppMethodBeat.o(34487);
        break;
      }
      label980: if (paramm.getType() == 139)
      {
        localObject = new iv();
        if ((paramInt1 != 3) || (paramInt2 != -1))
          break label1063;
        this.zuG = true;
        ((iv)localObject).cDY.cCA = false;
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
        this.zuL.dIn();
      }
      while (true)
      {
        if (!u.a.a(this.czX, paramInt1, paramInt2, paramString, 4))
          break label1084;
        AppMethodBeat.o(34487);
        break;
        label1063: ((iv)localObject).cDY.cCA = true;
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
      }
      label1084: if (paramm.getType() == 139)
      {
        new com.tencent.mm.sdk.platformtools.ak().post(new k.13(this));
        if ((r.YF() & 0x80) != 0)
        {
          aw.ZK();
          if (com.tencent.mm.model.c.XR().aoZ("masssendapp") == null)
          {
            paramString = new com.tencent.mm.storage.ak();
            paramString.setUsername("masssendapp");
            paramString.setContent(com.tencent.mm.sdk.platformtools.ah.getContext().getResources().getString(2131298580));
            paramString.eD(com.tencent.mm.platformtools.ah.anU() + 2000L);
            paramString.hO(0);
            paramString.hM(0);
            aw.ZK();
            com.tencent.mm.model.c.XR().d(paramString);
            paramInt1 = r.YF();
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(40, Integer.valueOf(paramInt1 & 0xFFFFFF7F));
          }
        }
      }
      if ((paramm.getType() == 138) || (paramm.getType() == 139))
      {
        al.d(new k.2(this));
        this.zuL.dIn();
      }
      AppMethodBeat.o(34487);
      break;
      label1281: k = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k
 * JD-Core Version:    0.6.2
 */