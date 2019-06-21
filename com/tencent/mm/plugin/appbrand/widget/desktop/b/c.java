package com.tencent.mm.plugin.appbrand.widget.desktop.b;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;

public enum c
  implements Choreographer.FrameCallback
{
  public Choreographer bsZ;
  public int eCJ;
  double eCK;
  private int eCL;
  public boolean eCM;
  public long frameStartTime;

  static
  {
    AppMethodBeat.i(134243);
    jbx = new c("INSTANCE");
    jby = new c[] { jbx };
    AppMethodBeat.o(134243);
  }

  private c()
  {
    AppMethodBeat.i(134241);
    this.frameStartTime = 0L;
    this.eCJ = 0;
    this.eCK = 0.0D;
    this.eCL = 500;
    this.eCM = false;
    this.bsZ = Choreographer.getInstance();
    AppMethodBeat.o(134241);
  }

  public final void doFrame(long paramLong)
  {
    AppMethodBeat.i(134242);
    long l = TimeUnit.NANOSECONDS.toMillis(paramLong);
    if (this.frameStartTime > 0L)
    {
      paramLong = l - this.frameStartTime;
      this.eCJ += 1;
      if (paramLong > this.eCL)
      {
        this.eCK = (this.eCJ * 1000 / paramLong);
        this.frameStartTime = l;
        this.eCJ = 0;
      }
    }
    while (true)
    {
      this.bsZ.postFrameCallback(this);
      AppMethodBeat.o(134242);
      return;
      this.frameStartTime = l;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.b.c
 * JD-Core Version:    0.6.2
 */