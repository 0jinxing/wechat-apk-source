package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class WaitNotify
{
  private static final String TAG = "WaitNotify";
  private volatile boolean isWaiting;
  private final MonitorObject myMonitorObject;
  private volatile boolean wasSignalled;

  public WaitNotify()
  {
    AppMethodBeat.i(128382);
    this.myMonitorObject = new MonitorObject();
    this.wasSignalled = false;
    this.isWaiting = false;
    AppMethodBeat.o(128382);
  }

  public void doNotify()
  {
    AppMethodBeat.i(128385);
    Logger.d("WaitNotify", "doNotify " + Thread.currentThread().getName());
    synchronized (this.myMonitorObject)
    {
      this.wasSignalled = true;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("doNotify internal ");
      Logger.d("WaitNotify", Thread.currentThread().getName());
      this.myMonitorObject.notifyAll();
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("doNotify over ");
      Logger.d("WaitNotify", Thread.currentThread().getName());
      AppMethodBeat.o(128385);
      return;
    }
  }

  public void doWait()
  {
    AppMethodBeat.i(128383);
    doWait(9223372036854775807L, 0, new WaitNotify.1(this));
    AppMethodBeat.o(128383);
  }

  public void doWait(long paramLong, int paramInt, WaitNotify.WaitListener paramWaitListener)
  {
    AppMethodBeat.i(128384);
    Logger.d("WaitNotify", "doWait " + Thread.currentThread().getName());
    synchronized (this.myMonitorObject)
    {
      this.wasSignalled = false;
      int i = 0;
      while (true)
      {
        boolean bool = this.wasSignalled;
        if (!bool);
        try
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("doWait internal ");
          Logger.d("WaitNotify", Thread.currentThread().getName());
          this.isWaiting = true;
          if (i < paramInt)
          {
            this.myMonitorObject.wait(paramLong, 0);
            if (!paramWaitListener.keepWaiting())
            {
              doNotify();
              this.isWaiting = false;
              AppMethodBeat.o(128384);
            }
          }
          else
          {
            this.myMonitorObject.wait();
          }
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("doWait wake ");
          Logger.d("WaitNotify", Thread.currentThread().getName());
          i++;
        }
        catch (InterruptedException localInterruptedException)
        {
          while (true)
            Logger.e("WaitNotify", localInterruptedException.toString());
        }
      }
    }
  }

  public boolean isWaiting()
  {
    return this.isWaiting;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.util.WaitNotify
 * JD-Core Version:    0.6.2
 */