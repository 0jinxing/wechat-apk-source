package com.tencent.mm.plugin.bbom;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.mm.AppCallBack;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.c;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.booter.MMReceivers.ExdeviceProcessReceiver;
import com.tencent.mm.booter.MMReceivers.SandBoxProcessReceiver;
import com.tencent.mm.booter.MMReceivers.ToolsMpProcessReceiver;
import com.tencent.mm.booter.MMReceivers.ToolsProcessReceiver;
import com.tencent.mm.booter.e.a;
import com.tencent.mm.booter.e.b;
import com.tencent.mm.booter.e.c;
import com.tencent.mm.booter.e.d;
import com.tencent.mm.booter.v;
import com.tencent.mm.compatible.loader.f.1;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.api.bucket.ApplicationLifeCycleBucket;
import com.tencent.mm.memory.a.a.b.b;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.m.1;
import com.tencent.mm.model.m.2;
import com.tencent.mm.model.m.3;
import com.tencent.mm.model.m.4;
import com.tencent.mm.model.m.5;
import com.tencent.mm.model.m.6;
import com.tencent.mm.model.m.7;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.r.a;
import com.tencent.mm.plugin.report.service.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.MMAppMgr.Receiver;
import com.tencent.mm.ui.chatting.h.b.1;
import com.tencent.mm.ui.chatting.h.b.2;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class PluginBigBallOfMud extends com.tencent.mm.kernel.b.f
  implements ApplicationLifeCycleBucket
{
  private static final String TAG = "MicroMsg.PluginBigBallOfMud";
  public Application app;
  private final MMAppMgr appMgr;
  private com.tencent.mm.compatible.loader.e mProfileCompat;

  public PluginBigBallOfMud()
  {
    AppMethodBeat.i(18300);
    this.appMgr = new MMAppMgr();
    AppMethodBeat.o(18300);
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(18302);
    com.tencent.mm.ui.d.a(new PluginBigBallOfMud.1(this));
    MMReceivers.ToolsProcessReceiver.a(new e.d());
    MMReceivers.ToolsMpProcessReceiver.a(new e.b());
    MMReceivers.SandBoxProcessReceiver.a(new e.c());
    MMReceivers.ExdeviceProcessReceiver.a(new e.a());
    Object localObject1 = (com.tencent.mm.plugin.zero.a.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.zero.a.d.class);
    ((com.tencent.mm.plugin.zero.a.d)localObject1).setILightPushDelegate(new j());
    ((com.tencent.mm.plugin.zero.a.d)localObject1).addNotifyReceiverCallback(new o());
    ((com.tencent.mm.plugin.zero.a.d)localObject1).addICoreServiceLifecycleCallback(new g());
    ab.i("MicroMsg.PluginBigBallOfMud", "zero %s", new Object[] { localObject1 });
    this.app = paramg.cc;
    com.tencent.mm.modelstat.d.d(this.app);
    long l = System.currentTimeMillis();
    com.tencent.mm.compatible.loader.f localf = new com.tencent.mm.compatible.loader.f();
    localObject1 = this.app;
    Object localObject2 = paramg.eHT;
    if ((localObject2 == null) || (((String)localObject2).length() <= 0))
    {
      HandlerThread localHandlerThread = com.tencent.mm.sdk.g.d.anM("ProfileFactoryImp_handlerThread");
      localHandlerThread.start();
      localObject2 = (String)new f.1(localf).b(new ak(localHandlerThread.getLooper()));
      localHandlerThread.getLooper().quit();
    }
    while (true)
    {
      if (localObject2 == null)
      {
        ab.e("MicroMsg.ProfileFactoryImpl", "get process name failed, retry later");
        localObject1 = null;
        this.mProfileCompat = ((com.tencent.mm.compatible.loader.e)localObject1);
        if ((this.mProfileCompat != null) && (!paramg.SG()))
        {
          ab.i("MicroMsg.PluginBigBallOfMud", "before profile oncreate.");
          this.mProfileCompat.onCreate();
        }
        ab.i("MicroMsg.PluginBigBallOfMud", "after profile oncreate.");
        com.tencent.mm.app.d.aT(this.app.getApplicationContext());
        ((com.tencent.mm.kernel.b.h)paramg).mProfileCompat = this.mProfileCompat;
        localObject1 = paramg.cc.getSharedPreferences("system_config_prefs", 0);
        if (localObject1 == null)
          break label3294;
      }
      label3094: label3263: label3294: for (int i = ((SharedPreferences)localObject1).getInt("default_uin", 0); ; i = 0)
        while (true)
        {
          ab.i("MicroMsg.PluginBigBallOfMud", "APPonCreate proc:%s time:%d (loader:%d) ueh:%d data[%s] sdcard[%s]", new Object[] { paramg.eHT, Long.valueOf(com.tencent.mm.sdk.platformtools.bo.gb(com.tencent.mm.app.b.cdW)), Long.valueOf(com.tencent.mm.sdk.platformtools.bo.gb(l)), Integer.valueOf(i), ac.eSj, com.tencent.mm.compatible.util.e.eSl });
          com.tencent.mm.l.a.a.a(new com.tencent.mm.l.a()
          {
            public final String F(String paramAnonymousString, int paramAnonymousInt)
            {
              AppMethodBeat.i(18289);
              if (com.tencent.mm.aj.f.kq(paramAnonymousString))
              {
                paramAnonymousString = com.tencent.mm.aj.a.e.rw(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramAnonymousInt).dqJ);
                AppMethodBeat.o(18289);
              }
              while (true)
              {
                return paramAnonymousString;
                paramAnonymousString = bh.aaf();
                AppMethodBeat.o(18289);
              }
            }

            public final void g(bi paramAnonymousbi)
            {
              AppMethodBeat.i(18288);
              if (com.tencent.mm.aj.f.kq(paramAnonymousbi.field_talker))
                paramAnonymousbi.ix(com.tencent.mm.aj.a.e.aae());
              AppMethodBeat.o(18288);
            }

            public final String h(bi paramAnonymousbi)
            {
              AppMethodBeat.i(18290);
              if (com.tencent.mm.aj.f.kq(paramAnonymousbi.field_talker))
              {
                paramAnonymousbi = com.tencent.mm.aj.a.e.rw(paramAnonymousbi.dqJ);
                AppMethodBeat.o(18290);
              }
              while (true)
              {
                return paramAnonymousbi;
                paramAnonymousbi = null;
                AppMethodBeat.o(18290);
              }
            }

            public final boolean kq(String paramAnonymousString)
            {
              AppMethodBeat.i(18291);
              boolean bool = com.tencent.mm.aj.f.kq(paramAnonymousString);
              AppMethodBeat.o(18291);
              return bool;
            }
          });
          com.tencent.mm.compatible.d.a.a(new PluginBigBallOfMud.12(this));
          if (paramg.SG())
          {
            com.tencent.mm.modelfriend.a.fBa = new PluginBigBallOfMud.13(this);
            com.tencent.mm.cd.f.a(new PluginBigBallOfMud.14(this));
            com.tencent.mm.storage.e.xHP = new PluginBigBallOfMud.15(this);
            com.tencent.mm.model.u.a(new PluginBigBallOfMud.16(this));
            com.tencent.mm.plugin.messenger.foundation.a.u.b(new PluginBigBallOfMud.17(this));
            paramg = new com.tencent.mm.modelmulti.a();
            r.a.a(69, paramg);
            r.a.a(68, paramg);
            r.a.a(22, paramg);
            r.a.a(13, paramg);
            r.a.a(15, paramg);
            r.a.a(23, paramg);
            r.a.a(25, paramg);
            r.a.a(24, paramg);
            r.a.a(33, paramg);
            r.a.a(35, paramg);
            r.a.a(44, paramg);
            r.a.a(999999, paramg);
            r.a.a(53, paramg);
            r.a.a(204, paramg);
            paramg = new c();
            ((com.tencent.mm.plugin.messenger.foundation.a.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.d.class)).a(paramg);
            com.tencent.mm.kernel.g.Rg().a(681, paramg);
            com.tencent.mm.plugin.messenger.foundation.a.u.a(5, new l());
            com.tencent.mm.plugin.messenger.foundation.a.u.a(1, new r());
            com.tencent.mm.plugin.messenger.foundation.a.u.a(4, new h());
            ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new a());
            paramg = new m();
            ((com.tencent.mm.plugin.messenger.foundation.a.q)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.q.class)).a(paramg);
            ((com.tencent.mm.plugin.messenger.foundation.a.q)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.q.class)).a(paramg);
            com.tencent.mm.model.e.a(new b());
            new com.tencent.mm.permission.a();
            new q().dnU();
            com.tencent.mm.kernel.g.Rg().b(138, n.jEu);
            com.tencent.mm.kernel.g.Rg().b(39, n.jEu);
            com.tencent.mm.kernel.g.Rg().b(268369922, n.jEu);
            if (n.jEu == null)
              n.jEu = new n();
            com.tencent.mm.kernel.g.Rg().a(138, n.jEu);
            com.tencent.mm.kernel.g.Rg().a(39, n.jEu);
            com.tencent.mm.kernel.g.Rg().a(268369922, n.jEu);
            p.cR(this.app);
            com.tencent.mm.ay.a.a.a("delchatroommember", new m.1());
            com.tencent.mm.ay.a.a.a("NewXmlChatRoomAccessVerifyApplication", new m.2());
            com.tencent.mm.ay.a.a.a("NewXmlChatRoomAccessVerifyApproval", new m.3());
            com.tencent.mm.ay.a.a.a("chatroommuteexpt", new m.4());
            com.tencent.mm.ay.a.a.a("NewXmlOpenIMChatRoomAddChatRoomMemberApplication", new m.5());
            com.tencent.mm.ay.a.a.a("NewXmlOpenIMChatRoomAddChatRoomMemberApplicationApproved", new m.6());
            ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("NewXmlDisableChatRoomAccessVerifyApplication", new m.7());
            com.tencent.mm.ay.a.a.a("invokeMessage", new b.1());
            com.tencent.mm.ay.a.a.a("NewXmlOpenIMFriReqAcceptedInWxWork", new b.2());
            com.tencent.mm.model.bo.Yu();
            com.tencent.mm.model.k.Yu();
            localObject2 = this.appMgr;
            paramg = this.app;
            if (((MMAppMgr)localObject2).ymI == null)
              ((MMAppMgr)localObject2).ymI = new MMAppMgr.Receiver((MMAppMgr)localObject2);
            MMActivity.dxV();
            localObject1 = new IntentFilter();
            ((IntentFilter)localObject1).addAction("com.tencent.mm.ui.ACTION_ACTIVE");
            ((IntentFilter)localObject1).addAction("com.tencent.mm.ui.ACTION_DEACTIVE");
            ((IntentFilter)localObject1).addAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
            ((IntentFilter)localObject1).addAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
            ((IntentFilter)localObject1).addAction("MINIQB_OPEN_RET");
            paramg.registerReceiver(((MMAppMgr)localObject2).ymI, (IntentFilter)localObject1, "com.tencent.mm.permission.MM_MESSAGE", null);
            paramg = new v(com.tencent.mm.booter.d.bo(this.app));
            paramg.jE("MM");
            ae.giF = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.use_cdn_down_thumb"), false);
            ae.ghN = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.display_errcode"), false);
            ae.ghO = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.display_msgstate"), false);
            ae.ghP = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.network.simulate_fault"), false);
            ae.ghQ = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.network.force_touch"), false);
            ae.ghR = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
            ae.ghS = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.crashIsExit"), false);
            ae.gir = com.tencent.mm.sdk.platformtools.bo.getInt(com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.datatransfer.times"), "0"), 0);
            ae.gis = com.tencent.mm.sdk.platformtools.bo.getInt(com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.datatransfer.duration"), "0"), 0);
            ae.ghU = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.album_drop_table"), false);
            ae.ghV = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.album_dle_file"), false);
            ae.ghW = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.album_show_info"), false);
            ae.ghX = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.location_help"), false);
            ae.gia = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.force_soso"), false);
            ae.gib = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.simulatePostServerError"), false);
            ae.gic = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
            ae.gid = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
            ae.gig = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.filterfpnp"), false);
            ae.gih = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.testForPull"), false);
            i = com.tencent.mm.sdk.platformtools.bo.a(paramg.getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
            ae.gie = i;
            if ((i != 4) && (ae.gie > 0))
            {
              com.tencent.mm.storage.ab.xIC = ae.gie;
              ab.e("MicroMsg.WorkerDebugger", "cdn thread num " + ae.gie);
            }
            ae.gif = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
            ae.gii = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.server.host.http"), "");
            ae.gij = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.server.host.socket"), "");
            if (com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.show_full_version"), false))
              com.tencent.mm.sdk.platformtools.g.xyd = true;
          }
          try
          {
            i = Integer.decode(paramg.getString(".com.tencent.mm.debug.log.setversion")).intValue();
            com.tencent.mm.protocal.d.Lw(i);
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("set up test protocal version = ");
            ((StringBuilder)localObject1).append(Integer.toHexString(i));
          }
          catch (Exception paramg)
          {
            try
            {
              localObject1 = paramg.getString(".com.tencent.mm.debug.log.setapilevel");
              if (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil((String)localObject1))
              {
                com.tencent.mm.protocal.d.eSg = "android-".concat(String.valueOf(localObject1));
                com.tencent.mm.protocal.d.vxk = "android-".concat(String.valueOf(localObject1));
                com.tencent.mm.protocal.d.vxm = String.valueOf(localObject1);
                com.tencent.mm.sdk.a.b.amf((String)localObject1);
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>("set up test protocal apilevel = ");
                ((StringBuilder)localObject1).append(com.tencent.mm.protocal.d.eSg).append(" ").append(com.tencent.mm.sdk.a.b.dnP());
              }
            }
            catch (Exception paramg)
            {
              try
              {
                l = Long.decode(paramg.getString(".com.tencent.mm.debug.log.setuin")).longValue();
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>("set up test protocal uin old: ");
                ((StringBuilder)localObject1).append(com.tencent.mm.protocal.d.vxn).append(" new: ").append(l);
                com.tencent.mm.protocal.d.vxn = l;
              }
              catch (Exception paramg)
              {
                try
                {
                  i = Integer.decode(paramg.getString(".com.tencent.mm.debug.log.setchannel")).intValue();
                  paramg.ecL.ebO = i;
                }
                catch (Exception paramg)
                {
                  try
                  {
                    boolean bool1 = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.report.debugmodel"), false);
                    boolean bool2 = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.report.kvstat"), false);
                    boolean bool3 = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.report.clientpref"), false);
                    boolean bool4 = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.report.useraction"), false);
                    com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                    localObject1 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject1).<init>("try control report : debugModel[");
                    ((StringBuilder)localObject1).append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                    ae.gim = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.update_test"), false);
                    ae.gin = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.scan_save_image"), false);
                    ae.gip = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.shake_get_config_list"), false);
                    ae.giq = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.test.shake_show_shaketv"), false);
                    ae.giu = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.jsapi.permission"), "");
                    ab.d("MicroMsg.WorkerDebugger", "Test.jsapiPermission = " + ae.giu);
                    ae.giJ = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.cdn.front"), "");
                    ae.giK = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.cdn.zone"), "");
                    ae.giL = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.cdn.wifi_elt"), "");
                    ae.giM = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.cdn.nowifi_elt"), "");
                    ae.giN = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.cdn.ptl"), "");
                    ae.giO = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.cdn.usestream"), false);
                    ae.giP = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.cdn.onlysendetl"), false);
                    ae.giQ = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.cdn.onlysendptl"), false);
                    ae.giS = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.cdn.enable_debug"), false);
                    ae.giT = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.cdn.enable_conn_verify"), false);
                    ae.giU = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.cdn.enable_video_redirect_oc"), false);
                    ae.gja = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.bakmove_hardcode"), false);
                    ab.d("MicroMsg.WorkerDebugger", "Test.bakmove_hardcode = " + ae.gja);
                    ae.gjb = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.bakmove_ip"), "");
                    ae.gjc = com.tencent.mm.sdk.platformtools.bo.getInt(com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.bakmove_port"), "0"), 0);
                    ae.giX = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.cursormode_enabled"), true);
                    ae.gjD = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.disaster_ignore_interval"), false);
                    ae.gjE = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.disaster_ignore_expire"), false);
                    ae.gjF = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.disaster_ignore_remove"), false);
                    ae.gjn = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.netscene_sniffer.enable_snapshot"), false);
                    ae.gjp = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.netscene_sniffer.snapshot_protocal"), "");
                    ae.gjo = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.netscene_sniffer.enable_inject"), false);
                    ae.gjq = com.tencent.mm.sdk.platformtools.bo.bc(paramg.getString(".com.tencent.mm.debug.netscene_sniffer.inject_protocal"), "");
                    ae.gjx = com.tencent.mm.sdk.platformtools.bo.a(paramg.jF(".com.tencent.mm.debug.netmock"), false);
                    paramg = com.tencent.mm.sdk.platformtools.bo.gV(ah.getContext());
                    if ((paramg != null) && (paramg.getPackageName().equals(ah.getPackageName())) && (paramg.getClassName().equals(ah.doy())))
                    {
                      WorkerProfile.Ca().cfN = true;
                      WorkerProfile.Ca().cfO = true;
                      ab.i("MicroMsg.PluginBigBallOfMud", "start time check currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s", new Object[] { paramg.getPackageName(), paramg.getClassName() });
                      com.tencent.mm.model.d.b.abr();
                      com.tencent.mm.model.d.b.setup();
                      AppLogic.setCallBack(new AppCallBack(ah.getContext()));
                      SmcLogic.setCallBack(new i());
                      i.pYC = (WorkerProfile)this.mProfileCompat;
                      com.tencent.mm.compatible.util.k.a(com.tencent.mm.sdk.a.xxo, getClass().getClassLoader());
                    }
                  }
                  catch (Exception paramg)
                  {
                    try
                    {
                      BaseEvent.onCreate();
                      SmcLogic.SetDebugFlag(com.tencent.mm.plugin.report.a.c.pXd);
                      if (getClass().getClassLoader() == null)
                      {
                        i = -1;
                        if (Thread.currentThread().getContextClassLoader() != null)
                          break label3263;
                        j = -1;
                        ab.i("MicroMsg.PluginBigBallOfMud", "SmcLogic, class loader %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
                      }
                    }
                    catch (Throwable paramg)
                    {
                      try
                      {
                        while (true)
                        {
                          if (com.tencent.mm.compatible.util.d.fP(20))
                          {
                            ab.i("MicroMsg.PluginBigBallOfMud", "weird");
                            SmcLogic.setUin(0L);
                          }
                          paramg = (com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class);
                          localObject1 = (com.tencent.mm.plugin.zero.a.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.zero.a.d.class);
                          new com.tencent.mm.plugin.e.d().after(paramg).before(this);
                          localObject2 = (com.tencent.mm.plugin.e.b)new com.tencent.mm.plugin.e.b().after(paramg).before(this);
                          new com.tencent.mm.plugin.e.f().after((com.tencent.mm.kernel.b.a)localObject2).before(this);
                          new com.tencent.mm.plugin.e.c().after(paramg).before(this);
                          new com.tencent.mm.plugin.e.a().after((com.tencent.mm.kernel.b.a)localObject1);
                          com.tencent.mm.bp.d.dlK();
                          com.tencent.mm.pluginsdk.g.a.a.m.a(new PluginBigBallOfMud.18(this));
                          j.c.a(new com.tencent.mm.ci.c()
                          {
                          });
                          j.c.a(new PluginBigBallOfMud.3(this));
                          j.c.a(new PluginBigBallOfMud.4(this));
                          j.c.a(new com.tencent.mm.ci.c()
                          {
                          });
                          j.c.a(new PluginBigBallOfMud.6(this));
                          j.c.a(new PluginBigBallOfMud.7(this));
                          j.c.a(new PluginBigBallOfMud.8(this));
                          j.c.a(new PluginBigBallOfMud.9(this));
                          j.c.a(new PluginBigBallOfMud.10(this));
                          AppMethodBeat.o(18302);
                          return;
                          ah.ce((String)localObject2);
                          if (((String)localObject2).equals(ah.getPackageName()))
                            localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.WorkerProfile");
                          while (true)
                          {
                            ab.w("MicroMsg.ProfileFactoryImpl", "application started, profile = %s", new Object[] { localObject2 });
                            break;
                            if (((String)localObject2).equals(ah.getPackageName() + ":push"))
                            {
                              localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.PusherProfile");
                            }
                            else if (((String)localObject2).startsWith(ah.getPackageName() + ":tools"))
                            {
                              localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.ToolsProfile");
                            }
                            else if (((String)localObject2).equals(ah.getPackageName() + ":sandbox"))
                            {
                              localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.SandBoxProfile");
                            }
                            else if (((String)localObject2).equals(ah.getPackageName() + ":exdevice"))
                            {
                              localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.ExDeviceProfile");
                            }
                            else if (((String)localObject2).equals(ah.getPackageName() + ":TMAssistantDownloadSDKService"))
                            {
                              localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.TMAssistantProfile");
                            }
                            else if (((String)localObject2).equals(ah.getPackageName() + ":nospace"))
                            {
                              localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.NoSpaceProfile");
                            }
                            else if (((String)localObject2).equals(ah.getPackageName() + ":patch"))
                            {
                              localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.PatchProfile");
                            }
                            else if (((String)localObject2).startsWith(ah.getPackageName() + ":appbrand"))
                            {
                              localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.AppBrandProfile");
                            }
                            else
                            {
                              if (!((String)localObject2).startsWith(ah.getPackageName() + ":support"))
                                break label3094;
                              localObject1 = com.tencent.mm.compatible.loader.f.c((Application)localObject1, ".app.SupportProfile");
                            }
                          }
                          com.tencent.mm.sdk.a.b.A("MMApplication onCreate profile == null", "profile is null and initMMcore failed");
                          localObject1 = null;
                          break;
                          localException1 = localException1;
                          ab.i("MicroMsg.WorkerDebugger", "no debugger was got");
                          continue;
                          localException2 = localException2;
                          ab.i("MicroMsg.WorkerDebugger", "no debugger was got");
                          continue;
                          localException3 = localException3;
                          ab.i("MicroMsg.WorkerDebugger", "no debugger was got");
                          continue;
                          localException4 = localException4;
                          ab.i("MicroMsg.WorkerDebugger", "no debugger was got");
                          continue;
                          localException5 = localException5;
                          ab.i("MicroMsg.WorkerDebugger", "no debugger was got");
                          continue;
                          if (paramg != null)
                            ab.i("MicroMsg.PluginBigBallOfMud", "start time check onCreate appOnCreate currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s", new Object[] { paramg.getPackageName(), paramg.getClassName() });
                          while ((paramg != null) && (!paramg.getPackageName().equals(ah.getPackageName())))
                          {
                            WorkerProfile.Ca().cfN = true;
                            break;
                            ab.i("MicroMsg.PluginBigBallOfMud", "start time check onCreate appOnCreate currentActivity == null");
                          }
                          paramg = paramg;
                          BaseEvent.onCreate();
                          continue;
                          i = getClass().getClassLoader().hashCode();
                        }
                        int j = Thread.currentThread().getContextClassLoader().hashCode();
                      }
                      catch (Throwable paramg)
                      {
                        while (true)
                          ab.printErrStackTrace("MicroMsg.PluginBigBallOfMud", paramg, "", new Object[0]);
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }
  }

  public void dependency()
  {
    AppMethodBeat.i(18301);
    dependsOn(com.tencent.mm.plugin.auth.a.b.class);
    dependsOn(com.tencent.mm.plugin.messenger.foundation.a.p.class);
    AppMethodBeat.o(18301);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void installed()
  {
  }

  public void onBaseContextAttached(Context paramContext)
  {
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(18304);
    Resources localResources = ah.getResources();
    if ((localResources instanceof com.tencent.mm.ca.b))
      ((com.tencent.mm.ca.b)localResources).onConfigurationChanged(paramConfiguration);
    if (this.mProfileCompat != null)
      this.mProfileCompat.onConfigurationChanged(paramConfiguration);
    AppMethodBeat.o(18304);
  }

  public void onCreate()
  {
  }

  public void onLowMemory()
  {
  }

  public void onTerminate()
  {
    AppMethodBeat.i(18303);
    ab.i("MicroMsg.PluginBigBallOfMud", "onTerminate(%s)", new Object[] { ah.getProcessName() });
    if (this.mProfileCompat != null)
      this.mProfileCompat.onTerminate();
    MMAppMgr localMMAppMgr = this.appMgr;
    Application localApplication = this.app;
    if (localMMAppMgr.ymI != null)
      localApplication.unregisterReceiver(localMMAppMgr.ymI);
    AppMethodBeat.o(18303);
  }

  public void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(18305);
    ab.i("MicroMsg.PluginBigBallOfMud", "onTrimMemory, level = %d, process = %s", new Object[] { Integer.valueOf(paramInt), ah.getProcessName() });
    if (this.mProfileCompat != null)
      this.mProfileCompat.onTrimMemory(paramInt);
    Object localObject = com.tencent.mm.memory.a.a.b.Xr();
    ab.i("MicroMsg.CacheInvoke", "CacheInvoke onTrimMemory");
    localObject = ((com.tencent.mm.memory.a.a.b)localObject).fdN.values().iterator();
    while (((Iterator)localObject).hasNext())
      ((b.b)((Iterator)localObject).next()).Xs();
    AppMethodBeat.o(18305);
  }

  public String toString()
  {
    return "plugin-big-ball-of-mud";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.PluginBigBallOfMud
 * JD-Core Version:    0.6.2
 */