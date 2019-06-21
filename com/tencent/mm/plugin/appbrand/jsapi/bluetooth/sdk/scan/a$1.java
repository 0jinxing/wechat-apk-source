package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(94285);
    if (!this.hFl.hFh.get())
      AppMethodBeat.o(94285);
    while (true)
    {
      return;
      if ((this.hFl.hFk != null) && (this.hFl.hFi.size() > 0))
      {
        this.hFl.hFk.aK(this.hFl.hFi);
        this.hFl.hFi.clear();
      }
      this.hFl.mHandler.postDelayed(this.hFl.hFj, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.eCL);
      AppMethodBeat.o(94285);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a.1
 * JD-Core Version:    0.6.2
 */