package com.google.android.exoplayer2.source.b;

import android.os.SystemClock;
import com.google.android.exoplayer2.g.b;
import com.google.android.exoplayer2.source.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$c extends b
{
  private int biG;

  public c$c(o paramo, int[] paramArrayOfInt)
  {
    super(paramo, paramArrayOfInt);
    AppMethodBeat.i(125901);
    this.biG = j(paramo.bhv[0]);
    AppMethodBeat.o(125901);
  }

  public final void ag(long paramLong)
  {
    AppMethodBeat.i(125902);
    paramLong = SystemClock.elapsedRealtime();
    if (!j(this.biG, paramLong))
    {
      AppMethodBeat.o(125902);
      return;
    }
    for (int i = this.length - 1; ; i--)
    {
      if (i < 0)
        break label66;
      if (!j(i, paramLong))
      {
        this.biG = i;
        AppMethodBeat.o(125902);
        break;
      }
    }
    label66: IllegalStateException localIllegalStateException = new IllegalStateException();
    AppMethodBeat.o(125902);
    throw localIllegalStateException;
  }

  public final int su()
  {
    return this.biG;
  }

  public final int sv()
  {
    return 0;
  }

  public final Object sw()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.c.c
 * JD-Core Version:    0.6.2
 */