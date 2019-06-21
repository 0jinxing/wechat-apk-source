package com.google.android.exoplayer2.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class r$f
{
  private final Map<String, String> bqH;
  private Map<String, String> bqI;

  public r$f()
  {
    AppMethodBeat.i(95842);
    this.bqH = new HashMap();
    AppMethodBeat.o(95842);
  }

  public final Map<String, String> tv()
  {
    try
    {
      AppMethodBeat.i(95843);
      if (this.bqI == null)
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(this.bqH);
        this.bqI = Collections.unmodifiableMap((Map)localObject1);
      }
      Object localObject1 = this.bqI;
      AppMethodBeat.o(95843);
      return localObject1;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.r.f
 * JD-Core Version:    0.6.2
 */