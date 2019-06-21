package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.sdk.platformtools.ab;

final class k$1
  implements b.a
{
  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(15854);
    if (paramBoolean)
    {
      ab.d("MicroMsg.PostTaskStartRangeForIBeacon", "on location get ok");
      k.aa(paramFloat2);
      k.ab(paramFloat1);
      k.access$202(true);
      if (k.Iw() != null)
      {
        k.Iw().c(k.Ix());
        k.access$202(false);
      }
    }
    while (true)
    {
      AppMethodBeat.o(15854);
      return false;
      ab.w("MicroMsg.PostTaskStartRangeForIBeacon", "getLocation fail");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.k.1
 * JD-Core Version:    0.6.2
 */