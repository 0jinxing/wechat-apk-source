package com.tencent.mm.pluginsdk.g.a.c;

import android.os.Process;

public abstract class f$d<Req extends f.b>
  implements Runnable
{
  private final Req vfb;

  protected f$d(Req paramReq)
  {
    this.vfb = paramReq;
  }

  protected Req awh()
  {
    return this.vfb;
  }

  public void run()
  {
    if (Process.getThreadPriority(Process.myTid()) != 10)
      Process.setThreadPriority(10);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.f.d
 * JD-Core Version:    0.6.2
 */