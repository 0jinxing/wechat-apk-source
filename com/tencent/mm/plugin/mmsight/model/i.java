package com.tencent.mm.plugin.mmsight.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

public final class i
{
  private static al ouv;

  static
  {
    AppMethodBeat.i(76521);
    ouv = new al("MMSightHandler");
    AppMethodBeat.o(76521);
  }

  public static void R(Runnable paramRunnable)
  {
    AppMethodBeat.i(76519);
    ouv.aa(paramRunnable);
    AppMethodBeat.o(76519);
  }

  public static void S(Runnable paramRunnable)
  {
    AppMethodBeat.i(76520);
    ouv.m(paramRunnable, 2000L);
    AppMethodBeat.o(76520);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.i
 * JD-Core Version:    0.6.2
 */