package com.tencent.mm.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.mars.BaseEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bf.e;
import com.tencent.mm.bf.e.1;
import com.tencent.mm.booter.x;
import com.tencent.mm.g.a.cu;
import com.tencent.mm.g.a.hb;
import com.tencent.mm.g.a.k;
import com.tencent.mm.g.a.oe;
import com.tencent.mm.g.a.pc;
import com.tencent.mm.g.a.pw;
import com.tencent.mm.g.a.sn;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.a.tk;
import com.tencent.mm.g.a.vv;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bv;
import com.tencent.mm.modelmulti.h;
import com.tencent.mm.modelmulti.n;
import com.tencent.mm.plugin.performance.elf.AbstractProcessChecker;
import com.tencent.mm.plugin.performance.elf.MainProcessChecker;
import com.tencent.mm.pluginsdk.f.f;
import com.tencent.mm.pluginsdk.f.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class MMAppMgr$9
  implements ap.a
{
  MMAppMgr$9(MMAppMgr paramMMAppMgr)
  {
  }

  public final boolean BI()
  {
    boolean bool1 = true;
    AppMethodBeat.i(29557);
    if (MMAppMgr.a(this.ymQ) == MMAppMgr.b(this.ymQ))
    {
      ab.d("MicroMsg.MMAppMgr", "status not changed, cur=" + MMAppMgr.a(this.ymQ));
      AppMethodBeat.o(29557);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      if (!aw.ZD())
        break;
      AppMethodBeat.o(29557);
    }
    MMAppMgr.a(this.ymQ, MMAppMgr.b(this.ymQ));
    com.tencent.mrs.a.onForeground(MMAppMgr.a(this.ymQ));
    com.tencent.mm.plugin.performance.elf.a.as(MainProcessChecker.class).jJ(MMAppMgr.a(this.ymQ));
    Object localObject1 = com.tencent.mm.plugin.performance.a.peX;
    bool2 = MMAppMgr.a(this.ymQ);
    if ((!((com.tencent.mm.plugin.performance.a)localObject1).aFV) || (((com.tencent.mm.plugin.performance.a)localObject1).handler == null))
    {
      label145: com.tencent.mm.performance.a.a.any().caA = MMAppMgr.a(this.ymQ);
      BaseEvent.onForeground(MMAppMgr.a(this.ymQ));
      com.tencent.mm.an.a.cL(MMAppMgr.a(this.ymQ));
      if (!MMAppMgr.a(this.ymQ))
        break label851;
      ab.w("MicroMsg.MMAppMgr", "[ACTIVATED MODE]");
      aw.Rg().cE(true);
      if ((aw.RK()) && (g.RN().eJb) && (!aw.QT()))
      {
        localObject1 = x.ecN;
        if (!((x)localObject1).hasInit)
        {
          ((x)localObject1).hasInit = true;
          Object localObject2 = com.tencent.mm.model.c.c.abi().ll("100066");
          if (((com.tencent.mm.storage.c)localObject2).isValid())
          {
            localObject2 = ((com.tencent.mm.storage.c)localObject2).dru();
            ((x)localObject1).ecZ = com.tencent.mm.platformtools.ah.getInt((String)((Map)localObject2).get("maxCacheCount"), 20);
            ((x)localObject1).eda = com.tencent.mm.platformtools.ah.getInt((String)((Map)localObject2).get("maxCacheHours"), 24);
          }
          localObject2 = com.tencent.mm.model.c.c.abi().ll("100058");
          if (((com.tencent.mm.storage.c)localObject2).isValid())
          {
            localObject2 = ((com.tencent.mm.storage.c)localObject2).dru();
            ((x)localObject1).edb = com.tencent.mm.platformtools.ah.getInt((String)((Map)localObject2).get("cacheLogCount"), 30);
            ((x)localObject1).edc = com.tencent.mm.platformtools.ah.getInt((String)((Map)localObject2).get("maxCacheTime"), 10800);
          }
          ab.i("MicroMsg.StayTimeReport", "initAbtestChattingArg appMaxCnt:%d, appMaxHour:%d, chattingMaxCnt:%d, chattingMaxSeconds:%d", new Object[] { Integer.valueOf(((x)localObject1).ecZ), Integer.valueOf(((x)localObject1).eda), Integer.valueOf(((x)localObject1).edb), Integer.valueOf(((x)localObject1).edc) });
        }
        if (!MMAppMgr.ymL)
          break label844;
        com.tencent.mm.sdk.b.a.xxA.m(new pw());
      }
    }
    while (true)
    {
      com.tencent.mm.modelsimple.c.cQ(true);
      n.ahW().lN(3);
      aw.Rg().a(new h(), 0);
      com.tencent.mm.blink.b.HQ().o(new MMAppMgr.9.1(this));
      bv.aaq().c(19, new Object[] { Integer.valueOf(1) });
      localObject1 = e.ajY();
      ab.d("MicroMsg.SpeexUploadCore", "now pause speex uploader");
      ((e)localObject1).fBz.pk(true);
      com.tencent.mm.at.o.ahn().cE(true);
      if (f.vdy != null)
        f.vdy.cDy();
      localObject1 = new k();
      ((k)localObject1).csh.csi = true;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      com.tencent.mm.modelstat.o.mg(4);
      com.tencent.mm.modelstat.o.mg(3);
      com.tencent.mm.modelstat.o.cT(true);
      localObject1 = new su();
      ((su)localObject1).cOT.cOU = true;
      ((su)localObject1).cOT.scene = 1;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new vv();
      ((vv)localObject1).cSX.cuy = 5;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new hb();
      ((hb)localObject1).cBM.cuy = 2;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new sn();
      ((sn)localObject1).cON.state = 1;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      ((com.tencent.mm.plugin.downloader.a.d)g.K(com.tencent.mm.plugin.downloader.a.d.class)).fZ(true);
      aw.Rg().cD(false);
      com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences("notify_prep", 0).edit().putBoolean("longNoopIntervalFlag", false).commit();
      if (!MMAppMgr.c(this.ymQ).doT())
        MMAppMgr.c(this.ymQ).stopTimer();
      AppMethodBeat.o(29557);
      bool2 = bool1;
      break;
      ab.i("MicroMsg.PowerTest", "onAppForeground isForeground:%s", new Object[] { Boolean.valueOf(bool2) });
      if (!bool2)
      {
        ((com.tencent.mm.plugin.performance.a)localObject1).peY = false;
        ((com.tencent.mm.plugin.performance.a)localObject1).peW.pfc = false;
        ((com.tencent.mm.plugin.performance.a)localObject1).handler.removeCallbacks(((com.tencent.mm.plugin.performance.a)localObject1).peW);
        ((com.tencent.mm.plugin.performance.a)localObject1).handler.postDelayed(((com.tencent.mm.plugin.performance.a)localObject1).peW, 120000L);
      }
      ((com.tencent.mm.plugin.performance.a)localObject1).caA = bool2;
      break label145;
      label844: MMAppMgr.ymL = true;
    }
    label851: ab.w("MicroMsg.MMAppMgr", "[DEACTIVATED MODE]");
    MMAppMgr.a(this.ymQ, bo.yz());
    MMAppMgr.a(this.ymQ, "desktop");
    localObject1 = new k();
    ((k)localObject1).csh.csi = false;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    aw.Rg().cE(false);
    if (aw.RK())
    {
      g.RQ();
      if (g.RN().eJb)
      {
        com.tencent.mm.bq.a.akz(com.tencent.mm.bq.a.dlM());
        localObject1 = e.ajY();
        Looper.myQueue().addIdleHandler(new e.1((e)localObject1));
        localObject1 = new oe();
        ((oe)localObject1).cKx.state = 0;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = new tk();
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = new com.tencent.mm.g.a.d();
        ((com.tencent.mm.g.a.d)localObject1).crQ.crR = false;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = new pc();
        ((pc)localObject1).cLr.active = false;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        com.tencent.mm.at.o.ahn().cE(false);
        MMAppMgr.dyu();
        localObject1 = new cu();
        ((cu)localObject1).cvW.state = 0;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = new vv();
        ((vv)localObject1).cSX.cuy = 3;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = new hb();
        ((hb)localObject1).cBM.cuy = 1;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = new sn();
        ((sn)localObject1).cON.state = 0;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        ((com.tencent.mm.plugin.downloader.a.d)g.K(com.tencent.mm.plugin.downloader.a.d.class)).fZ(false);
        com.tencent.mm.modelsimple.c.cQ(false);
        com.tencent.mm.modelstat.o.cT(false);
      }
    }
    if (!MMAppMgr.c(this.ymQ).doT())
      MMAppMgr.c(this.ymQ).stopTimer();
    if ((bo.bI(com.tencent.mm.sdk.platformtools.ah.getContext(), com.tencent.mm.sdk.platformtools.ah.getPackageName() + ":tools")) || (bo.bI(com.tencent.mm.sdk.platformtools.ah.getContext(), com.tencent.mm.sdk.platformtools.ah.getPackageName() + ":toolsmp")));
    for (bool2 = true; ; bool2 = false)
    {
      ab.i("MicroMsg.MMAppMgr", "before kill tools, tools is running : %b", new Object[] { Boolean.valueOf(bool2) });
      if (!bool2)
        break;
      MMAppMgr.c(this.ymQ).ae(60000L, 60000L);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.9
 * JD-Core Version:    0.6.2
 */