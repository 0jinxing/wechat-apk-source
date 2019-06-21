package com.tencent.mm.splash;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class DexOptService extends Service
{
  private HandlerThread mHandlerThread;
  private volatile Throwable xGA;
  private Handler xGx;
  private volatile boolean xGy;
  private Handler xGz;

  public DexOptService()
  {
    AppMethodBeat.i(114815);
    this.mHandlerThread = new HandlerThread("DexOpt-Thread");
    this.xGy = false;
    this.xGz = new Handler()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(114813);
        h.g("WxSplash.DexOptService", "dexopt process quit.", new Object[0]);
        DexOptService.this.stopSelf();
        AppMethodBeat.o(114813);
      }
    };
    AppMethodBeat.o(114815);
  }

  private boolean dqX()
  {
    AppMethodBeat.i(114817);
    h.g("WxSplash.DexOptService", "doDexOpt start", new Object[0]);
    try
    {
      bool = h.xGH.aZ(getApplicationContext());
      h.g("WxSplash.DexOptService", "schedule to quit", new Object[0]);
      this.xGz.removeCallbacksAndMessages(null);
      this.xGz.sendEmptyMessageDelayed(0, 120000L);
      h.g("WxSplash.DexOptService", "doDexOpt done, result %s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(114817);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        this.xGA = localThrowable;
        boolean bool = false;
      }
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(114819);
    h.g("WxSplash.DexOptService", "onBind", new Object[0]);
    AppMethodBeat.o(114819);
    return null;
  }

  public void onCreate()
  {
    AppMethodBeat.i(114816);
    h.g("WxSplash.DexOptService", "onCreate", new Object[0]);
    super.onCreate();
    this.mHandlerThread.start();
    this.xGx = new Handler(this.mHandlerThread.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(114814);
        if (DexOptService.a(DexOptService.this))
        {
          h.g("WxSplash.DexOptService", "dex opt progressing.", new Object[0]);
          AppMethodBeat.o(114814);
          return;
        }
        DexOptService.a(DexOptService.this, true);
        if (DexOptService.b(DexOptService.this))
          DexOptService.BK();
        while (true)
        {
          DexOptService.aLT();
          DexOptService.a(DexOptService.this, false);
          AppMethodBeat.o(114814);
          break;
          DexOptService.BL();
          DexOptService.c(DexOptService.this);
        }
      }
    };
    AppMethodBeat.o(114816);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(114820);
    h.g("WxSplash.DexOptService", "onDestroy", new Object[0]);
    super.onDestroy();
    AppMethodBeat.o(114820);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(114818);
    this.xGx.sendEmptyMessage(0);
    h.g("WxSplash.DexOptService", "onStartCommand", new Object[0]);
    paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
    AppMethodBeat.o(114818);
    return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.DexOptService
 * JD-Core Version:    0.6.2
 */