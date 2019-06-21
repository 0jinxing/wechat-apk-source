package com.tencent.mm.service;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class MMIntentService extends MMService
{
  private String mName;
  private volatile Looper xFb;
  private volatile a xFc;

  public MMIntentService(String paramString)
  {
    this.mName = paramString;
  }

  public final void onCreate()
  {
    super.onCreate();
    HandlerThread localHandlerThread = new HandlerThread("IntentService[" + this.mName + "]");
    localHandlerThread.start();
    this.xFb = localHandlerThread.getLooper();
    this.xFc = new a(this.xFb);
  }

  public final void onDestroy()
  {
    this.xFb.quit();
  }

  protected abstract void onHandleIntent(Intent paramIntent);

  public final void onStart(Intent paramIntent, int paramInt)
  {
    Message localMessage = this.xFc.obtainMessage();
    localMessage.arg1 = paramInt;
    localMessage.obj = paramIntent;
    this.xFc.sendMessage(localMessage);
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    onStart(paramIntent, paramInt2);
    return 2;
  }

  final class a extends Handler
  {
    public a(Looper arg2)
    {
      super();
    }

    public final void handleMessage(Message paramMessage)
    {
      AppMethodBeat.i(115272);
      MMIntentService.this.onHandleIntent((Intent)paramMessage.obj);
      MMIntentService localMMIntentService = MMIntentService.this;
      int i = paramMessage.arg1;
      ab.i(localMMIntentService.getTag(), "%s stopSelf() startId = %d mStartId = %d", new Object[] { "MicroMsg.MMService", Integer.valueOf(i), Integer.valueOf(localMMIntentService.bWH) });
      if (i == localMMIntentService.bWH)
        localMMIntentService.q(new Intent(), "stop");
      AppMethodBeat.o(115272);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.service.MMIntentService
 * JD-Core Version:    0.6.2
 */