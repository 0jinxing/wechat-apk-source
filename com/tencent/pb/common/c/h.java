package com.tencent.pb.common.c;

import android.os.Handler;
import android.os.Looper;

public final class h
{
  public static Handler sHandler = new Handler(Looper.getMainLooper());

  public static void aB(Runnable paramRunnable)
  {
    int i;
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      i = 1;
      if (i == 0)
        break label30;
      paramRunnable.run();
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label30: sHandler.post(paramRunnable);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.c.h
 * JD-Core Version:    0.6.2
 */