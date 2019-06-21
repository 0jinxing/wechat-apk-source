package com.tencent.mm.plugin.normsg;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class Normsg$1
  implements Runnable
{
  Normsg$1(boolean[] paramArrayOfBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10253);
    synchronized (this.oTC)
    {
      System.loadLibrary("stlport_shared");
      System.loadLibrary("wechatxlog");
      System.loadLibrary("wechatnormsg");
      this.oTC[0] = true;
      this.oTC.notifyAll();
      AppMethodBeat.o(10253);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.Normsg.1
 * JD-Core Version:    0.6.2
 */