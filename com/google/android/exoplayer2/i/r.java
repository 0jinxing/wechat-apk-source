package com.google.android.exoplayer2.i;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class r
  implements b
{
  public final long elapsedRealtime()
  {
    AppMethodBeat.i(95940);
    long l = SystemClock.elapsedRealtime();
    AppMethodBeat.o(95940);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.r
 * JD-Core Version:    0.6.2
 */