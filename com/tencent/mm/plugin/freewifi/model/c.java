package com.tencent.mm.plugin.freewifi.model;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak;

public final class c
{
  private HandlerThread mvH;
  private ak mvI;

  public final ak byI()
  {
    AppMethodBeat.i(20696);
    if (this.mvH == null)
    {
      this.mvH = d.anM("FreeWifiHandlerThread_handlerThread");
      this.mvH.start();
    }
    if (this.mvI == null)
      this.mvI = new ak(this.mvH.getLooper());
    ak localak = this.mvI;
    AppMethodBeat.o(20696);
    return localak;
  }

  public final void release()
  {
    AppMethodBeat.i(20697);
    if (this.mvH != null)
    {
      this.mvH.quit();
      this.mvH = null;
    }
    this.mvI = null;
    AppMethodBeat.o(20697);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.c
 * JD-Core Version:    0.6.2
 */