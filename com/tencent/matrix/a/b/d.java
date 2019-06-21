package com.tencent.matrix.a.b;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.d.b;

public final class d
{
  Handler mDetectHandler;
  private boolean started = false;

  public final void j(Runnable paramRunnable)
  {
    this.mDetectHandler.post(paramRunnable);
  }

  public final void quit()
  {
    if (this.started)
    {
      this.mDetectHandler.removeCallbacksAndMessages(null);
      this.started = false;
    }
  }

  public final void start()
  {
    if (this.started);
    while (true)
    {
      return;
      this.mDetectHandler = new Handler(b.zL().getLooper());
      this.started = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.b.d
 * JD-Core Version:    0.6.2
 */