package com.tencent.mm.graphics.b;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.TimeUnit;

public enum c
  implements Choreographer.FrameCallback
{
  public Choreographer bsZ;
  private int eCJ;
  double eCK;
  private int eCL;
  public boolean eCM;
  private long frameStartTime;

  static
  {
    AppMethodBeat.i(57085);
    eCI = new c("INSTANCE");
    eCN = new c[] { eCI };
    AppMethodBeat.o(57085);
  }

  private c()
  {
    AppMethodBeat.i(57082);
    this.frameStartTime = 0L;
    this.eCJ = 0;
    this.eCK = 0.0D;
    this.eCL = 500;
    this.eCM = false;
    this.bsZ = Choreographer.getInstance();
    AppMethodBeat.o(57082);
  }

  public final void doFrame(long paramLong)
  {
    AppMethodBeat.i(57084);
    paramLong = TimeUnit.NANOSECONDS.toMillis(paramLong);
    if (this.frameStartTime > 0L)
    {
      long l = paramLong - this.frameStartTime;
      this.eCJ += 1;
      if (l > this.eCL)
      {
        this.eCK = (this.eCJ * 1000 / l);
        this.frameStartTime = paramLong;
        this.eCJ = 0;
      }
    }
    while (true)
    {
      this.bsZ.postFrameCallback(this);
      AppMethodBeat.o(57084);
      return;
      this.frameStartTime = paramLong;
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(57083);
    this.frameStartTime = 0L;
    this.eCJ = 0;
    this.eCM = false;
    ab.i("MicroMsg.Metronome", "[stop] stack:%s", new Object[] { bo.dpG() });
    this.bsZ.removeFrameCallback(this);
    AppMethodBeat.o(57083);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.b.c
 * JD-Core Version:    0.6.2
 */