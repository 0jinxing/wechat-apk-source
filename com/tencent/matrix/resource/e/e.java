package com.tencent.matrix.resource.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public final class e
{
  private final Handler bYm;
  private final long bYn;
  private final Handler mMainHandler;

  public e(long paramLong, HandlerThread paramHandlerThread)
  {
    this.bYm = new Handler(paramHandlerThread.getLooper());
    this.mMainHandler = new Handler(Looper.getMainLooper());
    this.bYn = paramLong;
  }

  public final void a(final a parama, final int paramInt)
  {
    this.bYm.postDelayed(new Runnable()
    {
      public final void run()
      {
        if (parama.zr() == e.a.a.bYs)
          e.this.a(parama, paramInt + 1);
      }
    }
    , this.bYn);
  }

  public final void zu()
  {
    this.bYm.removeCallbacksAndMessages(null);
    this.mMainHandler.removeCallbacksAndMessages(null);
  }

  public static abstract interface a
  {
    public abstract a zr();

    public static enum a
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.e.e
 * JD-Core Version:    0.6.2
 */