package com.tencent.mm.plugin.multitalk.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak;

public final class k
{
  public ak oGX;
  public k.a oGY;
  b oGq;

  public k(b paramb)
  {
    AppMethodBeat.i(54062);
    this.oGY = new k.a(this, (byte)0);
    this.oGq = paramb;
    AppMethodBeat.o(54062);
  }

  public final void start()
  {
    AppMethodBeat.i(54063);
    d.a(new k.1(this), "MultiTalkVideoTaskManager_native_drawer_handler", 1).start();
    AppMethodBeat.o(54063);
  }

  public final void stop()
  {
    AppMethodBeat.i(54064);
    this.oGq = null;
    this.oGY.eBB = false;
    this.oGY.oHc = null;
    if (this.oGX != null)
    {
      this.oGX.removeCallbacksAndMessages(null);
      this.oGX.getLooper().quit();
      this.oGX = null;
    }
    AppMethodBeat.o(54064);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.k
 * JD-Core Version:    0.6.2
 */