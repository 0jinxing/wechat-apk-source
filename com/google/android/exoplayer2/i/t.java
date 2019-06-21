package com.google.android.exoplayer2.i;

import android.os.Trace;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class t
{
  public static void beginSection(String paramString)
  {
    AppMethodBeat.i(95946);
    if (v.SDK_INT >= 18)
      Trace.beginSection(paramString);
    AppMethodBeat.o(95946);
  }

  public static void endSection()
  {
    AppMethodBeat.i(95947);
    if (v.SDK_INT >= 18)
      Trace.endSection();
    AppMethodBeat.o(95947);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.t
 * JD-Core Version:    0.6.2
 */