package com.tencent.mm.sandbox.monitor;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.service.MMService;

public class ExceptionMonitorService extends MMService
{
  public static long eRt = 0L;
  public static int xvo = 0;
  private static ExceptionMonitorService xvs = null;
  private long xvp;
  private ak xvq;
  private Runnable xvr;
  private long xvt;

  public ExceptionMonitorService()
  {
    AppMethodBeat.i(28789);
    this.xvp = 300000L;
    this.xvq = new ak();
    this.xvr = new ExceptionMonitorService.1(this);
    AppMethodBeat.o(28789);
  }

  private void dnd()
  {
    AppMethodBeat.i(28795);
    if (System.currentTimeMillis() - this.xvt <= 600000L)
      AppMethodBeat.o(28795);
    while (true)
    {
      return;
      this.xvt = System.currentTimeMillis();
      d.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(28788);
          com.tencent.mm.modelrecovery.a.aiz();
          AppMethodBeat.o(28788);
        }
      }
      , "RecoveryWriteLogThread");
      AppMethodBeat.o(28795);
    }
  }

  public static void gg(Context paramContext)
  {
    AppMethodBeat.i(28796);
    Object localObject = new Intent(paramContext, CrashUploadAlarmReceiver.class);
    if (PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject, 536870912) == null)
    {
      localObject = PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject, 0);
      paramContext = (AlarmManager)paramContext.getSystemService("alarm");
      long l = bo.anU() + 1800000L;
      paramContext.set(0, l, (PendingIntent)localObject);
      ab.d("MicroMsg.CrashMonitorService", "dkcrash startAlarmMgr pendingIntent:%d %d", new Object[] { Integer.valueOf(((PendingIntent)localObject).hashCode()), Long.valueOf(l) });
    }
    AppMethodBeat.o(28796);
  }

  private void o(Intent paramIntent)
  {
    AppMethodBeat.i(28794);
    if (paramIntent == null)
      AppMethodBeat.o(28794);
    while (true)
    {
      return;
      this.xvq.removeCallbacks(this.xvr);
      this.xvq.postDelayed(this.xvr, this.xvp);
      String str1 = paramIntent.getAction();
      ab.d("MicroMsg.CrashMonitorService", "dkcrash handleCommand action:".concat(String.valueOf(str1)));
      String str2;
      String str3;
      String str4;
      boolean bool;
      try
      {
        str2 = paramIntent.getStringExtra("tag");
        str3 = str2;
        if (str2 == null)
          str3 = "exception";
        int i = paramIntent.getIntExtra("exceptionPid", 0);
        str3.equals("exception");
        xvo = i;
        eRt = paramIntent.getLongExtra("exceptionTime", SystemClock.elapsedRealtime());
        str4 = paramIntent.getStringExtra("exceptionMsg");
        str2 = paramIntent.getStringExtra("userName");
        bool = paramIntent.getBooleanExtra("exceptionWriteSdcard", true);
        ab.d("MicroMsg.CrashMonitorService", "dkcrash handleCommand. action=" + str1 + " pid:" + i + " tag=" + str3 + ", userName=" + str2 + ", message" + str4);
        if (!bo.isNullOrNil(str4))
          break label238;
        AppMethodBeat.o(28794);
      }
      catch (Exception paramIntent)
      {
        ab.printErrStackTrace("MicroMsg.CrashMonitorService", paramIntent, "", new Object[0]);
        AppMethodBeat.o(28794);
      }
      continue;
      label238: if (a.a(str2, str3, new b.a(str2, str3, bo.anT(), str4, bool)) == 0)
        gg(ah.getContext());
      dnd();
      AppMethodBeat.o(28794);
    }
  }

  public final IBinder Iu()
  {
    return null;
  }

  public final String getTag()
  {
    return "MicroMsg.CrashMonitorService";
  }

  public final void onCreate()
  {
    AppMethodBeat.i(28790);
    super.onCreate();
    xvs = this;
    c.l(hashCode(), this);
    this.xvq.postDelayed(this.xvr, this.xvp);
    AppMethodBeat.o(28790);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(28793);
    super.onDestroy();
    xvs = null;
    c.m(hashCode(), this);
    this.xvq.removeCallbacks(this.xvr);
    AppMethodBeat.o(28793);
  }

  public final void onStart(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(28791);
    super.onStart(paramIntent, paramInt);
    o(paramIntent);
    AppMethodBeat.o(28791);
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(28792);
    o(paramIntent);
    AppMethodBeat.o(28792);
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.ExceptionMonitorService
 * JD-Core Version:    0.6.2
 */