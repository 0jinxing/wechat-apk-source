package com.tencent.mm.booter;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import com.jg.JgMethodChecked;
import com.tencent.mars.Mars;
import com.tencent.mars.comm.Alarm;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.mars.comm.PlatformComm.IResetProcess;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.magicbox.IPxxLogic;
import com.tencent.mars.stn.StnLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.l;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.aa.a;
import com.tencent.mm.network.ac;
import com.tencent.mm.network.m;
import com.tencent.mm.network.p;
import com.tencent.mm.network.t;
import com.tencent.mm.network.t.12;
import com.tencent.mm.network.w;
import com.tencent.mm.network.y;
import com.tencent.mm.network.z;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.plugin.zero.PluginZero.a;
import com.tencent.mm.sdk.platformtools.af.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;

public class CoreService extends Service
  implements PlatformComm.IResetProcess, aa.a, m
{
  private f ebA;
  private boolean ebB;
  private CoreService.a ebC;
  private final af.b ebD;
  private int ebE;
  private int ebF;
  private long ebG;
  private long ebH;
  private long ebI;
  private WakerLock ebJ;
  private s ebK;
  private ap ebL;
  private t ebz;

  public CoreService()
  {
    AppMethodBeat.i(57732);
    this.ebA = new f();
    this.ebB = true;
    this.ebC = null;
    this.ebD = new CoreService.1(this);
    this.ebE = -1;
    this.ebF = -1;
    this.ebG = 0L;
    this.ebH = 0L;
    this.ebI = 0L;
    this.ebJ = null;
    this.ebK = new s();
    this.ebL = new ap(new CoreService.4(this), false);
    AppMethodBeat.o(57732);
  }

  public static void Ie()
  {
    AppMethodBeat.i(57741);
    Intent localIntent = new Intent(aa.getContext(), NotifyReceiver.class);
    localIntent.putExtra("notify_option_type", 1);
    localIntent.putExtra("notify_uin", aa.ano().gcU.QF());
    try
    {
      aa.getContext().sendBroadcast(localIntent);
      AppMethodBeat.o(57741);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.f("MicroMsg.CoreService", "checker frequency limited hasDestroyed %s", new Object[] { localException.toString() });
        AppMethodBeat.o(57741);
      }
    }
  }

  private void If()
  {
    AppMethodBeat.i(57742);
    com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.CoreService", "[COMPLETE EXIT]");
    aa.anp().i(3, 10000, "");
    Mars.onDestroy();
    try
    {
      MMReceivers.AlarmReceiver.bs(getApplicationContext());
      MMReceivers.AlarmReceiver.bq(getApplicationContext());
      Alarm.resetAlarm(getApplicationContext());
      com.tencent.mm.sdk.platformtools.ab.appenderClose();
      Process.killProcess(Process.myPid());
      AppMethodBeat.o(57742);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.CoreService", localException, "", new Object[0]);
    }
  }

  public final void bt(boolean paramBoolean)
  {
    AppMethodBeat.i(57740);
    if (!paramBoolean)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.CoreService", "[NETWORK LOST]");
      aa.ank().geh = false;
      aa.anl().mF(0);
      if (this.ebB)
      {
        aa.ano().amN();
        this.ebA.ebY = null;
      }
      this.ebB = false;
      AppMethodBeat.o(57740);
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.CoreService", "[NETWORK CONNECTED]");
      aa.ank().geh = true;
      paramBoolean = this.ebA.Il();
      if ((this.ebB) && (!paramBoolean))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "network not change or can't get network info, lastStatus connect:%b", new Object[] { Boolean.valueOf(this.ebB) });
        AppMethodBeat.o(57740);
      }
      else
      {
        if (paramBoolean)
          aa.ano().amN();
        this.ebB = true;
        aa.anl().mF(6);
        if (this.ebJ == null)
          this.ebJ = new WakerLock(getApplicationContext(), "MicroMsg.CoreService");
        if (!this.ebJ.isLocking())
        {
          this.ebJ.lock(6000L, "CoreService.setNetworkAvailable");
          this.ebG += 1L;
        }
        if (0L == this.ebI)
          this.ebH = bo.anU();
        this.ebI += 1L;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "setNetworkAvailable start lockCount:%d delayCount:%d delayDur:%d", new Object[] { Long.valueOf(this.ebG), Long.valueOf(this.ebI), Long.valueOf(bo.anU() - this.ebH) });
        this.ebL.ae(3000L, 3000L);
        AppMethodBeat.o(57740);
      }
    }
  }

  public final boolean e(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(57739);
    boolean bool1;
    if (l.bL(this))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "fully exited, no need to notify worker");
      AppMethodBeat.o(57739);
      bool1 = false;
      return bool1;
    }
    if (paramInt == -255)
      paramInt = 138;
    while (true)
      while (true)
      {
        boolean bool2 = aa.anh().getBoolean("is_in_notify_mode", false);
        bool1 = this.ebz.gcU.adb();
        boolean bool3 = aa.ano().amV();
        if ((bool2) && (bool1) && (!bool3) && (g.a(2, paramInt, paramArrayOfByte, this.ebz.gcU.jQ(1), bo.anU())))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "deal with notify sync in push");
          AppMethodBeat.o(57739);
          bool1 = true;
          break;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "deal with notify sync to mm by broast, isLogin:%b, isMMProcessExist:%b, isInNotifyMode:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool3), Boolean.valueOf(bool2) });
        Intent localIntent = new Intent(this, NotifyReceiver.class);
        localIntent.putExtra("notify_option_type", 2);
        localIntent.putExtra("notify_uin", this.ebz.gcU.QF());
        localIntent.putExtra("notify_respType", paramInt);
        localIntent.putExtra("notify_respBuf", paramArrayOfByte);
        localIntent.putExtra("notfiy_recv_time", bo.anU());
        localIntent.putExtra("notify_skey", this.ebz.gcU.jQ(1));
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "notify broadcast:" + localIntent.getAction() + ", type=" + paramInt);
        try
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "notify broadcast: dknot recvTime:%d uin:%d type:%d buf:%d", new Object[] { Long.valueOf(localIntent.getLongExtra("notfiy_recv_time", 0L)), Integer.valueOf(localIntent.getIntExtra("notify_uin", 0)), Integer.valueOf(localIntent.getIntExtra("notify_respType", 0)), Integer.valueOf(bo.l(localIntent.getByteArrayExtra("notify_respBuf"), new byte[0]).length) });
          sendBroadcast(localIntent);
          com.tencent.mm.an.a.ll(paramInt);
          AppMethodBeat.o(57739);
          bool1 = true;
        }
        catch (Throwable paramArrayOfByte)
        {
          while (true)
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CoreService", "dknot sendBroadcast  failed:%s", new Object[] { bo.l(paramArrayOfByte) });
        }
      }
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(57737);
    int i = Process.myPid();
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.CoreService", "onBind~~~ lastpid:%d  pid:%d threadID:" + Thread.currentThread(), new Object[] { Integer.valueOf(this.ebF), Integer.valueOf(i) });
    if (i != this.ebF)
    {
      this.ebF = i;
      e.pXa.a(99L, 147L, 1L, false);
      if ((paramIntent != null) && ("auto".equals(paramIntent.getStringExtra("START_TYPE"))))
        e.pXa.a(99L, 146L, 1L, false);
    }
    paramIntent = this.ebz;
    AppMethodBeat.o(57737);
    return paramIntent;
  }

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public void onCreate()
  {
    Object localObject1 = null;
    AppMethodBeat.i(57733);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.CoreService", "onCreate~~~threadID:" + Thread.currentThread());
    super.onCreate();
    try
    {
      this.ebC = ((CoreService.a)Class.forName("com.tencent.mm.platformtools.BroadcastHelper").newInstance());
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.CoreService", "broadcastRegisterHelper = %s", new Object[] { this.ebC });
      this.ebC.registerBroadcasts();
      if ((com.tencent.mm.compatible.util.d.fP(26)) && (Build.VERSION.SDK_INT < 24) && (!com.tencent.mm.compatible.util.h.Ms()))
      {
        if (Build.VERSION.SDK_INT < 18)
          startForeground(-1213, new Notification());
      }
      else
      {
        localObject2 = new ak(Looper.getMainLooper());
        Mars.init(ah.getContext(), (ak)localObject2);
        StnLogic.setCallBack(new com.tencent.mm.network.af());
        IPxxLogic.setCallBack(new p());
        com.tencent.mm.jni.a.a.Qi();
        com.tencent.mm.sdk.b.a.xxA.c(new CoreService.2(this));
        aa.ani();
        com.tencent.mm.sdk.platformtools.af.a(this.ebD);
        if (PlatformComm.resetprocessimp == null)
          PlatformComm.resetprocessimp = this;
        aa.a((ak)localObject2);
        aa.setContext(getApplicationContext());
        aa.a(new com.tencent.mm.network.ab());
        aa.a(new ac());
        aa.a(this);
        aa.a(new w());
        this.ebz = aa.ano();
        if (this.ebz != null)
          break label765;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "autoAuth is null and new one");
        this.ebz = new t(aa.anm());
        aa.b(this.ebz);
        Mars.onCreate(true);
        if (aa.anp() != null)
          break label783;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "NetTaskAdapter is null and new one");
        aa.a(new z());
        if (aa.anq() == null)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "NetNotifyAdapter is null and new one");
          aa.a(new y());
          aa.anq().gdO = this;
        }
        localObject4 = ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).ecL;
        localObject2 = localObject4;
        if (localObject4 == null)
        {
          ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).ecL = d.bo(getApplicationContext());
          localObject2 = ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).ecL;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "summerauths init debug here[%s]", new Object[] { localObject2 });
        }
        if (localObject2 != null)
        {
          localObject5 = ((d)localObject2).getString(".com.tencent.mm.debug.server.host.http");
          localObject4 = ((d)localObject2).getString(".com.tencent.mm.debug.server.ports.http");
          String str2 = ((d)localObject2).getString(".com.tencent.mm.debug.server.host.socket");
          str3 = ((d)localObject2).getString(".com.tencent.mm.debug.server.ports.socket");
          this.ebz.d((String)localObject5, (String)localObject4, str2, str3);
          str3 = ((d)localObject2).getString(".com.tencent.mm.debug.server.wallet.host");
          localObject4 = ((d)localObject2).getString(".com.tencent.mm.debug.server.wallet.ip");
          localObject5 = this.ebz;
          if ((!bo.isNullOrNil(str3)) && (!bo.Q(new String[0])))
            break label800;
        }
        if (localObject2 != null)
          break label824;
        localObject2 = null;
        if ((localObject2 == null) || (!((String)localObject2).contains(":")))
          break label835;
        localObject4 = ((String)localObject2).split(":");
        localObject2 = localObject4[0];
        localObject4 = localObject4[1];
        this.ebz.setNewDnsDebugHost((String)localObject2, (String)localObject4);
        MMReceivers.AlarmReceiver.bs(getApplicationContext());
        MMReceivers.AlarmReceiver.br(getApplicationContext());
        localObject2 = (ConnectivityManager)getSystemService("connectivity");
      }
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          Object localObject5;
          String str3;
          Object localObject2 = ((ConnectivityManager)localObject2).getActiveNetworkInfo();
          if ((localObject2 != null) && (((NetworkInfo)localObject2).getState() == NetworkInfo.State.CONNECTED))
            break label885;
          if (localObject2 != null)
            break;
          localObject2 = "null";
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CoreService", "networkInfo.state: %s", new Object[] { localObject2 });
          aa.ank().geh = false;
          aa.anl().mF(0);
          ((PluginZero)com.tencent.mm.kernel.g.M(PluginZero.class)).uZV.a(this);
          al.n(new CoreService.3(this), 1000L);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "CoreService OnCreate ");
          AppMethodBeat.o(57733);
          return;
          localException1 = localException1;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CoreService", "onCreate Class.forName(com.tencent.mm.platformtools.BroadcastHelper) Exception = %s ", new Object[] { localException1.getMessage() });
          continue;
          if (getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getBoolean("set_service", false))
          {
            startForeground(-1213, new Notification());
            startService(new Intent(this, InnerService.class));
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "set service for push.");
            continue;
            label765: com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.CoreService", "autoAuth is not null and reset");
            this.ebz.reset();
            continue;
            label783: com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.CoreService", "NetTaskAdapter is not null and reset");
            aa.anp().reset();
            continue;
            label800: new t.12((t)localObject5, str3, (String)localObject4).b(((t)localObject5).handler);
            continue;
            label824: String str1 = localException1.getString(".com.tencent.mm.debug.server.host.newdns");
          }
        }
        label835: Object localObject4 = null;
      }
      catch (Exception localException2)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.CoreService", localException2, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CoreService", "getActiveNetworkInfo failed. %s", new Object[] { localException2.getMessage() });
          Object localObject3 = localObject1;
          continue;
          localObject3 = ((NetworkInfo)localObject3).getState();
          continue;
          label885: aa.ank().geh = true;
          aa.anl().mF(6);
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(57735);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "onDestroy~~~ threadID:" + Thread.currentThread());
    ((PluginZero)com.tencent.mm.kernel.g.M(PluginZero.class)).uZV.b(this);
    com.tencent.mm.jni.a.a.Qj();
    super.onDestroy();
    If();
    if (this.ebC != null);
    while (true)
    {
      try
      {
        this.ebC.unRegisterBroadcasts();
        AppMethodBeat.o(57735);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CoreService", "onDestroy unRegisterBroadcasts() Exception = %s ", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(57735);
    }
  }

  public void onRebind(Intent paramIntent)
  {
    AppMethodBeat.i(57738);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.CoreService", "onRebind~~~ threadID:" + Thread.currentThread());
    super.onRebind(paramIntent);
    AppMethodBeat.o(57738);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57734);
    int i = Process.myPid();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CoreService", "onStartCommand lastpid:%d  pid:%d flags:%d startId:%d", new Object[] { Integer.valueOf(this.ebE), Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (i != this.ebE)
    {
      this.ebE = i;
      e.pXa.a(99L, 141L, 1L, false);
      if ((paramIntent != null) && ("auto".equals(paramIntent.getStringExtra("START_TYPE"))))
        e.pXa.a(99L, 140L, 1L, false);
    }
    AppMethodBeat.o(57734);
    return 1;
  }

  public boolean onUnbind(Intent paramIntent)
  {
    AppMethodBeat.i(57736);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.CoreService", "onUnbind~~~ threadID:" + Thread.currentThread());
    aa.ank().geg = null;
    aa.ans().gdH = null;
    boolean bool = super.onUnbind(paramIntent);
    AppMethodBeat.o(57736);
    return bool;
  }

  public void restartProcess()
  {
    AppMethodBeat.i(57743);
    com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.CoreService", "restartProcess");
    If();
    AppMethodBeat.o(57743);
  }

  public static class InnerService extends Service
  {
    public IBinder onBind(Intent paramIntent)
    {
      return null;
    }

    public void onCreate()
    {
      AppMethodBeat.i(57730);
      super.onCreate();
      try
      {
        Notification localNotification = new android/app/Notification;
        localNotification.<init>();
        startForeground(-1213, localNotification);
        stopSelf();
        AppMethodBeat.o(57730);
        return;
      }
      catch (NullPointerException localNullPointerException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CoreService", "set service for push exception:%s.", new Object[] { localNullPointerException });
      }
    }

    public void onDestroy()
    {
      AppMethodBeat.i(57731);
      stopForeground(true);
      super.onDestroy();
      AppMethodBeat.o(57731);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.CoreService
 * JD-Core Version:    0.6.2
 */