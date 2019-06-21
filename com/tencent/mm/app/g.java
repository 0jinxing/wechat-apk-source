package com.tencent.mm.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.blink.c.1;
import com.tencent.mm.ci.k;
import com.tencent.mm.kernel.j;
import com.tencent.mm.kiss.a.b.1;
import com.tencent.mm.kiss.a.b.b;
import com.tencent.mm.modelrecovery.PluginRecovery;
import com.tencent.mm.plugin.auth.PluginAuth;
import com.tencent.mm.plugin.bbom.PluginBigBallOfMud;
import com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.report.PluginReport;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.ui.v;
import com.tencent.mm.vfs.FileSystemManager;
import com.tencent.mm.vfs.FileSystemManager.a;
import com.tencent.xweb.WebView.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class g extends com.tencent.mm.kernel.a.d
{
  private static boolean cel = true;
  private k cej;
  private volatile boolean cek;

  public g()
  {
    AppMethodBeat.i(137994);
    this.cej = new k();
    this.cek = false;
    AppMethodBeat.o(137994);
  }

  private static void Bf()
  {
    AppMethodBeat.i(137998);
    long l = System.currentTimeMillis();
    q.Bz();
    l = System.currentTimeMillis() - l;
    com.tencent.mm.blink.a.s(4L, l);
    com.tencent.mm.blink.a.s(5L, 1L);
    ab.i("MicroMsg.DefaultBootStep", "SVG newInstance done, spent %s", new Object[] { Long.valueOf(l) });
    AppMethodBeat.o(137998);
  }

  public final void Bd()
  {
    AppMethodBeat.i(137995);
    super.Bd();
    com.tencent.mm.kernel.a.a.k("Hello WeChat, DefaultBootStep load debugger and newInstance xlog...", new Object[0]);
    ah.getContext().getSystemService("audio");
    l.cT(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).eHT);
    q.G(com.tencent.mm.boot.a.a.class);
    q.cY("com.tencent.mm.boot");
    q.a(((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).cc, ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).cc.getResources());
    if (ah.isAppBrandProcess())
      com.tencent.mm.k.a.a.a(new com.tencent.mm.k.a()
      {
        public final boolean Bi()
        {
          AppMethodBeat.i(138006);
          com.tencent.mm.cj.c.a(WebView.d.ANb);
          boolean bool = com.tencent.mm.cj.c.dPa();
          AppMethodBeat.o(138006);
          return bool;
        }
      });
    Application localApplication = ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).cc;
    ah.f(com.tencent.mm.ca.b.a(localApplication.getResources(), localApplication));
    com.tencent.mm.ca.a.a(new com.tencent.mm.ca.a.a()
    {
      public final void Bj()
      {
        AppMethodBeat.i(138010);
        Object localObject = (ActivityManager)ah.getContext().getSystemService("activity");
        int i = Process.myPid();
        int j = Process.myUid();
        Iterator localIterator = ((ActivityManager)localObject).getRunningAppProcesses().iterator();
        while (localIterator.hasNext())
        {
          localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if ((((ActivityManager.RunningAppProcessInfo)localObject).uid == j) && (((ActivityManager.RunningAppProcessInfo)localObject).pid != i))
            Process.killProcess(((ActivityManager.RunningAppProcessInfo)localObject).pid);
        }
        Process.killProcess(i);
        AppMethodBeat.o(138010);
      }
    });
    AppMethodBeat.o(137995);
  }

  public final void Be()
  {
    AppMethodBeat.i(137996);
    com.tencent.mm.kernel.g.RL().eJD = com.tencent.mm.plugin.zero.a.d.class;
    Q(PluginZero.class);
    Q(PluginMessengerFoundation.class);
    Q(PluginReport.class);
    Q(PluginAuth.class);
    Q(PluginBigBallOfMud.class);
    Q(PluginRecovery.class);
    lO("com.tencent.mm.plugin.bbom.PluginCompatOldStructure");
    lO("com.tencent.mm.plugin.bbom.PluginBigBallOfMudAsync");
    lO("com.tencent.mm.plugin.avatar.PluginAvatar");
    lO("com.tencent.mm.plugin.comm.PluginComm");
    lO("com.tencent.mm.plugin.audio.PluginVoice");
    lO("com.tencent.mm.plugin.biz.PluginBiz");
    lP("com.tencent.mm.plugin.bizui.PluginBIZUI");
    lO("com.tencent.mm.plugin.brandservice.PluginBrandService");
    lO("com.tencent.mm.plugin.readerapp.PluginReaderApp");
    lO("com.tencent.mm.plugin.notification.PluginNotification");
    lO("com.tencent.mm.plugin.messenger.PluginMessenger");
    lO("com.tencent.mm.plugin.welab.PluginWelab");
    lO("com.tencent.mm.plugin.sport.PluginSport");
    lO("com.tencent.mm.plugin.fts.PluginFTS");
    lO("com.tencent.mm.openim.PluginOpenIM");
    lP("com.tencent.mm.plugin.misc.PluginMisc");
    lO("com.tencent.mm.openim.room.PluginOpenIMRoom");
    lO("com.tencent.mm.roomsdk.PluginRoomSdk");
    lO("com.tencent.mm.ipcinvoker.wx_extension.PluginIPC");
    lO("com.tencent.mm.plugin.abtest.PluginABTest");
    lO("com.tencent.mm.plugin.backup.PluginBackup");
    lO("com.tencent.mm.plugin.hardcoder.PluginHardcoder");
    lP("com.tencent.mm.plugin.performance.PluginPerformance");
    lP("com.tencent.mm.plugin.chatroom.PluginChatroom");
    lP("com.tencent.mm.PluginFunctionMsg");
    lP("com.tencent.mm.insane_statistic.PluginInsaneStatistic");
    lP("com.tencent.mm.plugin.appbrand.app.PluginAppBrand");
    lP("com.tencent.mm.plugin.appbrand.compat.PluginAppBrandCompat");
    lP("com.tencent.mm.plugin.choosemsgfile.PluginChooseMsgFile");
    lP("com.tencent.mm.plugin.uishow.PluginUIShow");
    lP("com.tencent.mm.plugin.emoji.PluginEmoji");
    lP("com.tencent.mm.chatroom.plugin.PluginChatroomUI");
    lP("com.tencent.mm.plugin.game.PluginGame");
    lP("com.tencent.mm.game.report.PluginGameReport");
    lP("com.tencent.mm.plugin.wepkg.PluginWePkg");
    lP("com.tencent.mm.plugin.game.commlib.PluginCommLib");
    lP("com.tencent.mm.plugin.video.PluginVideo");
    lP("com.tencent.mm.plugin.hardwareopt.PluginHardwareOpt");
    lP("com.tencent.mm.plugin.sns.PluginSns");
    lP("com.tencent.mm.plugin.downloader.PluginDownloader");
    lP("com.tencent.mm.plugin.fav.PluginFav");
    lP("com.tencent.mm.plugin.fav.ui.PluginFavUI");
    lP("com.tencent.mm.plugin.record.PluginRecord");
    lP("com.tencent.mm.plugin.music.PluginMusic");
    lP("com.tencent.mm.plugin.MMPhotoEditPlugin");
    lP("com.tencent.mm.plugin.account.PluginAccount");
    lP("com.tencent.mm.plugin.facedetect.PluginFace");
    lP("com.tencent.mm.plugin.soter.PluginSoter");
    lP("com.tencent.mm.plugin.walletlock.PluginWalletLock");
    lP("com.tencent.mm.plugin.wxpay.PluginWxPay");
    lP("com.tencent.mm.plugin.wxpaysdk.PluginWxPaySdk");
    lP("com.tencent.mm.plugin.wxpayapi.PluginWxPayApi");
    lP("com.tencent.mm.plugin.radar.PluginRadar");
    lP("com.tencent.mm.plugin.topstory.PluginTopStory");
    lP("com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI");
    lP("com.tencent.mm.plugin.websearch.PluginWebSearch");
    lP("com.tencent.mm.plugin.fts.ui.PluginFTSUI");
    lP("com.tencent.mm.plugin.card.PluginCard");
    lP("com.tencent.mm.plugin.card.compat.PluginCardCompat");
    lP("com.tencent.mm.plugin.kitchen.PluginKitchen");
    lP("com.tencent.mm.plugin.expt.PluginExpt");
    lP("com.tencent.mm.plugin.forcenotify.PluginForceNotify");
    lP("com.tencent.mm.plugin.monitor.PluginMonitor");
    lP("com.tencent.mm.plugin.fcm.PluginFCM");
    lP("com.tencent.mm.plugin.emojicapture.model.PluginEmojiCapture");
    lP("com.tencent.mm.plugin.selectcontact.PluginSelectContact");
    lP("com.tencent.mm.plugin.cloudvoip.cloudvoice.PluginCloudVoice");
    lP("com.tencent.mm.plugin.webview.PluginWebView");
    lP("com.tencent.mm.plugin.priority.PluginPriority");
    lP("com.tencent.mm.plugin.mmsight.PluginMMSight");
    lP("com.tencent.mm.plugin.secinforeport.PluginSecInfoReport");
    lP("com.tencent.mm.plugin.normsg.PluginNormsg");
    lP("com.tencent.mm.plugin.netmock.PluginNetMock");
    if (f.xxZ.amr("ENABLE_STETHO"))
      lP("com.tencent.mm.plugin.stetho.PluginStetho");
    lP("com.tencent.mm.plugin.appbrand.functions.comm.preloader.PluginLFPreloader");
    lP("com.tencent.mm.plugin.boots.PluginBoots");
    lP("com.tencent.mm.plugin.downloader_app.PluginDownloaderApp");
    lP("com.tencent.mm.plugin.game.luggage.PluginLuggageGame");
    lP("com.tencent.mm.plugin.trafficmonitor.PluginTrafficMonitor");
    lP("com.tencent.mm.plugin.story.PluginStory");
    com.tencent.mm.kernel.a.b.g localg = com.tencent.mm.kernel.a.c.Sa().eKU;
    com.tencent.mm.kernel.b.a locala = com.tencent.mm.kernel.g.M(p.class);
    localg.eMh.put(com.tencent.mm.kernel.api.c.class, locala);
    AppMethodBeat.o(137996);
  }

  public final boolean Bg()
  {
    AppMethodBeat.i(138000);
    boolean bool;
    if (cel)
    {
      AppMethodBeat.o(138000);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (!((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
      {
        AppMethodBeat.o(138000);
        bool = true;
      }
      else
      {
        com.tencent.mm.kernel.g.RN();
        if ((!com.tencent.mm.kernel.a.QX()) || (!com.tencent.mm.kernel.g.RN().QY()))
        {
          AppMethodBeat.o(138000);
          bool = true;
        }
        else if (com.tencent.mm.splash.h.xGC.size() == 1)
        {
          Activity localActivity = (Activity)com.tencent.mm.splash.h.xGC.get(0);
          if (ah.doy().equals(com.tencent.mm.splash.h.an(localActivity)))
          {
            ab.i("MicroMsg.DefaultBootStep", "Found LauncherUI only.");
            AppMethodBeat.o(138000);
            bool = false;
          }
        }
        else
        {
          AppMethodBeat.o(138000);
          bool = true;
        }
      }
    }
  }

  public final void a(final com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(137997);
    if (!paramg.SG());
    for (boolean bool = true; ; bool = false)
    {
      FileSystemManager.rh(bool);
      FileSystemManager.a(new g.3(this));
      Bf();
      if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
        new al("Startup-SideWork").aa(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(137958);
            while (true)
            {
              try
              {
                Object localObject1 = g.a(g.this);
                synchronized (((k)localObject1).eHH)
                {
                  ((k)localObject1).eHH[0] = ((byte)-1);
                  j.i("MicroMsg.WxWaitingLock", "markUse %s", new Object[] { localObject1 });
                  g.a(g.this).done();
                  localObject4 = new android/content/ContextWrapper;
                  ((ContextWrapper)localObject4).<init>(paramg.cc);
                  ??? = com.tencent.mm.kiss.a.b.SM();
                  localObject1 = com.tencent.mm.kiss.a.a.SL().eMJ.getLooper();
                  localObject4 = v.hu((Context)localObject4);
                  if (!((com.tencent.mm.kiss.a.b)???).eMP)
                  {
                    ((com.tencent.mm.kiss.a.b)???).eMP = true;
                    ((com.tencent.mm.kiss.a.b)???).mInflater = ((LayoutInflater)localObject4);
                    ((com.tencent.mm.kiss.a.b)???).eMN = ((Looper)localObject1);
                    ((com.tencent.mm.kiss.a.b)???).mMode = 2;
                    localObject4 = new com/tencent/mm/kiss/a/b$1;
                    ((b.1)localObject4).<init>((com.tencent.mm.kiss.a.b)???, ((com.tencent.mm.kiss.a.b)???).eMN);
                    ((com.tencent.mm.kiss.a.b)???).eMO = ((ak)localObject4);
                    if (com.tencent.mm.compatible.util.d.fP(26))
                    {
                      localObject4 = new com/tencent/mm/kiss/a/b$b;
                      ((b.b)localObject4).<init>((Looper)localObject1);
                      ((com.tencent.mm.kiss.a.b)???).eMR = ((b.b)localObject4);
                    }
                  }
                  com.tencent.mm.blink.a.HJ();
                  ??? = ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).cc.getBaseContext();
                  localObject4 = com.tencent.mm.kiss.a.b.SM();
                  localObject1 = new android/widget/LinearLayout;
                  ((LinearLayout)localObject1).<init>((Context)???);
                  boolean bool = ((com.tencent.mm.kiss.a.b)localObject4).a("R.layout.actionbar_title_launcher", 1, 2130968619, (ViewGroup)localObject1, false, new int[0]);
                  com.tencent.mm.kiss.a.b.SM().a("R.layout.main_tab", 1, 2130970021, new int[0]);
                  if (com.tencent.mm.bz.a.ga((Context)???))
                  {
                    localObject4 = com.tencent.mm.kiss.a.b.SM();
                    localObject1 = new android/widget/LinearLayout;
                    ((LinearLayout)localObject1).<init>((Context)???);
                    ((com.tencent.mm.kiss.a.b)localObject4).a("R.layout.mm_bottom_tabitem_large", 4, 2130970103, (ViewGroup)localObject1, false, new int[0]);
                    com.tencent.mm.kiss.a.b.SM().a("R.layout.mm_activity", 4, 2130970087, new int[0]);
                    if ((!Build.BRAND.equals("vivo")) || (!com.tencent.mm.compatible.util.d.fP(20)))
                    {
                      com.tencent.mm.kiss.a.b.SM().a("R.layout.main", 1, 2130970018, new int[0]);
                      com.tencent.mm.kiss.a.b.SM().a("R.layout.address", 1, 2130968638, new int[0]);
                      com.tencent.mm.kiss.a.b.SM().a("R.layout.mm_preference_fragment_list_content", 2, 2130970177, new int[0]);
                    }
                    com.tencent.mm.kiss.a.b.SM().a("R.layout.actionview_with_dot_tips", 1, 2130968621, new int[0]);
                    if (!com.tencent.mm.bz.a.ga((Context)???))
                      break label579;
                    com.tencent.mm.kiss.a.b.SM().a("R.layout.conversation_item_with_cache_large", 8, 2130969244, null, false, new int[0]);
                    if (bool)
                    {
                      localObject1 = com.tencent.mm.kiss.a.b.SM();
                      ??? = new com/tencent/mm/blink/c$1;
                      ((c.1)???).<init>();
                      ((com.tencent.mm.kiss.a.b)localObject1).eMO.post((Runnable)???);
                    }
                  }
                }
              }
              catch (Exception localException)
              {
                ab.printErrStackTrace("MicroMsg.DefaultBootStep", localException, "", new Object[0]);
                com.tencent.mm.blink.a.s(10L, 1L);
                ab.i("MicroMsg.DefaultBootStep", "found a crash, %s %s %s", new Object[] { ah.getResources(), paramg.cc.getResources(), paramg.cc.getResources().getAssets() });
                g.a(g.this, paramg);
                g.b(g.this);
                g.a(g.this).done();
                AppMethodBeat.o(137958);
                continue;
                com.tencent.mm.kiss.a.b localb = com.tencent.mm.kiss.a.b.SM();
                Object localObject4 = new android/widget/LinearLayout;
                ((LinearLayout)localObject4).<init>(localException);
                localb.a("R.layout.mm_bottom_tabitem", 4, 2130970102, (ViewGroup)localObject4, false, new int[0]);
                continue;
              }
              finally
              {
                g.a(g.this).done();
                AppMethodBeat.o(137958);
              }
              label579: if (com.tencent.mm.bz.a.gc(localContext))
                com.tencent.mm.kiss.a.b.SM().a("R.layout.conversation_item_with_cache_small", 8, 2130969245, null, false, new int[0]);
              else
                com.tencent.mm.kiss.a.b.SM().a("R.layout.conversation_item_with_cache", 8, 2130969243, null, false, new int[0]);
            }
          }
        });
      if (paramg.SG())
      {
        Object localObject = FileSystemManager.dMv();
        ((FileSystemManager)localObject).zZk = false;
        localObject = ((FileSystemManager)localObject).dMx();
        ((FileSystemManager.a)localObject).zYT.clear();
        ((FileSystemManager.a)localObject).zYU.clear();
        ((FileSystemManager.a)localObject).zYW.clear();
        ((FileSystemManager.a)localObject).zZn = null;
        ((FileSystemManager.a)localObject).zZo = true;
        ((FileSystemManager.a)localObject).commit();
      }
      super.a(paramg);
      AppMethodBeat.o(137997);
      return;
    }
  }

  public final void b(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(137999);
    k localk;
    if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
      localk = this.cej;
    synchronized (localk.eHH)
    {
      try
      {
        if (localk.eHH[0] == -1)
        {
          j.i("MicroMsg.WxWaitingLock", "waiting %s", new Object[] { localk });
          localk.eHH.wait();
          j.i("MicroMsg.WxWaitingLock", "after waiting %s", new Object[] { localk });
        }
        if (this.cek)
          ab.e("MicroMsg.DefaultBootStep", "SVG still failed!");
        super.b(paramg);
        AppMethodBeat.o(137999);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WxWaitingLock", localInterruptedException, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.g
 * JD-Core Version:    0.6.2
 */