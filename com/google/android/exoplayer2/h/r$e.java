package com.google.android.exoplayer2.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.Map;

public final class r$e extends r.c
{
  public final Map<String, List<String>> bqG;
  public final int responseCode;

  public r$e(int paramInt, Map<String, List<String>> paramMap, i parami)
  {
    super("Response code: ".concat(String.valueOf(paramInt)), parami);
    AppMethodBeat.i(95841);
    this.responseCode = paramInt;
    this.bqG = paramMap;
    AppMethodBeat.o(95841);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.r.e
 * JD-Core Version:    0.6.2
 */