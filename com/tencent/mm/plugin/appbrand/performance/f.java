package com.tencent.mm.plugin.appbrand.performance;

import android.annotation.TargetApi;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@TargetApi(16)
public final class f
  implements Choreographer.FrameCallback
{
  private boolean OH;
  public f.a ivJ;
  private Choreographer ivZ;
  private long iwa;
  private int iwb;
  public volatile double iwc;
  public long mInterval;

  public f()
  {
    AppMethodBeat.i(114391);
    this.iwa = 0L;
    this.iwb = 0;
    this.OH = true;
    this.iwc = 0.0D;
    this.ivZ = Choreographer.getInstance();
    this.mInterval = 200L;
    AppMethodBeat.o(114391);
  }

  public final void doFrame(long paramLong)
  {
    double d1 = 60.0D;
    AppMethodBeat.i(114394);
    double d2;
    if (this.OH)
    {
      paramLong /= 1000000L;
      if (this.iwa <= 0L)
        break label136;
      long l = paramLong - this.iwa;
      this.iwb += 1;
      if (l > this.mInterval)
      {
        d2 = this.iwb * 1000 / l;
        if (d2 < 60.0D)
          break label144;
      }
    }
    while (true)
    {
      this.iwa = paramLong;
      this.iwb = 0;
      this.iwc = d1;
      if (this.ivJ != null)
        this.ivJ.v(d1);
      while (true)
      {
        if (this.OH)
          this.ivZ.postFrameCallback(this);
        AppMethodBeat.o(114394);
        return;
        label136: this.iwa = paramLong;
      }
      label144: d1 = d2;
    }
  }

  public final void start()
  {
    AppMethodBeat.i(114392);
    if (this.OH)
      AppMethodBeat.o(114392);
    while (true)
    {
      return;
      this.OH = true;
      ab.i("FPSMetronome", "[start] stack:%s", new Object[] { bo.dpG() });
      this.ivZ.postFrameCallback(this);
      AppMethodBeat.o(114392);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(114393);
    if (!this.OH)
      AppMethodBeat.o(114393);
    while (true)
    {
      return;
      this.OH = false;
      this.iwa = 0L;
      this.iwb = 0;
      ab.i("FPSMetronome", "[stop] stack:%s", new Object[] { bo.dpG() });
      this.ivZ.removeFrameCallback(this);
      AppMethodBeat.o(114393);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.performance.f
 * JD-Core Version:    0.6.2
 */