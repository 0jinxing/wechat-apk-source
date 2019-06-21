package com.tencent.d.e.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;

public final class f
{
  public static final long AtG;
  public static final long AtH;
  public static final int AtI;
  public static final long AtJ;

  static
  {
    AppMethodBeat.i(114554);
    AtG = TimeUnit.SECONDS.toMillis(1L);
    AtH = TimeUnit.MILLISECONDS.toMillis(50L);
    AtI = (int)(AtG / AtH);
    AtJ = AtG * 3L;
    AppMethodBeat.o(114554);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.a.f
 * JD-Core Version:    0.6.2
 */