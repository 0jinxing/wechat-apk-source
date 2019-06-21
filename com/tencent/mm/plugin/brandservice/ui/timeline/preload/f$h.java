package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.a.m;
import a.f.b.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"format", "", "kotlin.jvm.PlatformType", "", "digits", "", "invoke"})
final class f$h extends k
  implements m<Float, Integer, String>
{
  public static final h jSA;

  static
  {
    AppMethodBeat.i(14815);
    jSA = new h();
    AppMethodBeat.o(14815);
  }

  f$h()
  {
    super(2);
  }

  public static String c(float paramFloat, int paramInt)
  {
    AppMethodBeat.i(14814);
    String str = String.format("%." + paramInt + 'f', new Object[] { Float.valueOf(paramFloat) });
    AppMethodBeat.o(14814);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.f.h
 * JD-Core Version:    0.6.2
 */