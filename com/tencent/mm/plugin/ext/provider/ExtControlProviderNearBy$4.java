package com.tencent.mm.plugin.ext.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kn;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;

final class ExtControlProviderNearBy$4
  implements b.a
{
  ExtControlProviderNearBy$4(ExtControlProviderNearBy paramExtControlProviderNearBy)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(20365);
    if (ExtControlProviderNearBy.g(this.lQB))
      AppMethodBeat.o(20365);
    while (true)
    {
      return false;
      ExtControlProviderNearBy.h(this.lQB);
      if (!paramBoolean)
      {
        ab.e("MicroMsg.ExtControlProviderNearBy", "get location failed");
        ExtControlProviderNearBy.f(this.lQB);
        ExtControlProviderNearBy.c(this.lQB).countDown();
        AppMethodBeat.o(20365);
      }
      else
      {
        kn localkn = new kn();
        localkn.cGk.czE = ExtControlProviderNearBy.i(this.lQB);
        localkn.cGk.cGm = paramFloat1;
        localkn.cGk.cEB = paramFloat2;
        localkn.cGk.cGn = ((int)paramDouble2);
        localkn.cGk.cGo = paramInt;
        localkn.cGk.cGp = "";
        localkn.cGk.cGq = "";
        if (a.xxA.m(localkn))
          ab.i("MicroMsg.ExtControlProviderNearBy", "do get nearby friend");
        AppMethodBeat.o(20365);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy.4
 * JD-Core Version:    0.6.2
 */