package com.tencent.mm.plugin.normsg;

import android.os.Looper;
import android.support.annotation.Keep;
import com.tencent.mm.sdk.g.d;

@Keep
public abstract class Normsg
{
  static
  {
    initializeOnMainThread();
  }

  private static final void initializeOnMainThread()
  {
    boolean[] arrayOfBoolean = new boolean[1];
    arrayOfBoolean[0] = false;
    Normsg.1 local1 = new Normsg.1(arrayOfBoolean);
    if (Looper.myLooper() == Looper.getMainLooper())
      local1.run();
    while (true)
    {
      return;
      d.h(local1, "NormsgInit").start();
      label44: int i = arrayOfBoolean[0];
      if (i == 0);
      try
      {
        arrayOfBoolean.wait();
        break label44;
      }
      catch (InterruptedException localInterruptedException)
      {
        break label44;
      }
      finally
      {
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.Normsg
 * JD-Core Version:    0.6.2
 */