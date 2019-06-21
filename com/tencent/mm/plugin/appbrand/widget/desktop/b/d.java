package com.tencent.mm.plugin.appbrand.widget.desktop.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Timer;

public enum d
{
  private WeakReference<Context> eCP;
  public HashMap<Integer, b> eCQ;
  public final Object eCR;
  public boolean isRunning;
  public Timer mTimer;

  static
  {
    AppMethodBeat.i(134250);
    jbz = new d("INSTANCE");
    jbA = new d[] { jbz };
    AppMethodBeat.o(134250);
  }

  private d()
  {
    AppMethodBeat.i(134247);
    this.eCP = null;
    this.eCQ = new HashMap();
    this.isRunning = false;
    this.mTimer = null;
    this.eCR = new Object();
    AppMethodBeat.o(134247);
  }

  public final void Pz()
  {
    AppMethodBeat.i(134248);
    synchronized (this.eCR)
    {
      if (!this.isRunning)
      {
        AppMethodBeat.o(134248);
        return;
      }
      if (this.mTimer != null)
        this.mTimer.cancel();
      this.isRunning = false;
      AppMethodBeat.o(134248);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(134249);
    ab.i("MicroMsg.PerformanceMonitor", "alvinluo PerformanceMonitor release");
    if (this.eCQ != null)
      this.eCQ.clear();
    AppMethodBeat.o(134249);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.b.d
 * JD-Core Version:    0.6.2
 */