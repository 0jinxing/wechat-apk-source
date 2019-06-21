package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(16)
public final class d
{
  final d.a bsL;
  final boolean bsM;
  final long bsN;
  final long bsO;
  long bsP;
  long bsQ;
  long bsR;
  boolean bsS;
  long bsT;
  long bsU;
  long bsV;

  public d()
  {
    this(-1.0D);
  }

  private d(double paramDouble)
  {
    AppMethodBeat.i(96036);
    boolean bool;
    if (paramDouble != -1.0D)
    {
      bool = true;
      this.bsM = bool;
      if (!this.bsM)
        break label75;
      this.bsL = d.a.tZ();
      this.bsN = (()(1000000000.0D / paramDouble));
      this.bsO = (this.bsN * 80L / 100L);
      AppMethodBeat.o(96036);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label75: this.bsL = null;
      this.bsN = -1L;
      this.bsO = -1L;
      AppMethodBeat.o(96036);
    }
  }

  public d(Context paramContext)
  {
  }

  final boolean m(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(96037);
    long l = this.bsU;
    boolean bool;
    if (Math.abs(paramLong2 - this.bsT - (paramLong1 - l)) > 20000000L)
    {
      bool = true;
      AppMethodBeat.o(96037);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(96037);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.video.d
 * JD-Core Version:    0.6.2
 */