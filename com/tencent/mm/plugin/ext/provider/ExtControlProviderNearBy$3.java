package com.tencent.mm.plugin.ext.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kn;
import com.tencent.mm.g.a.kn.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class ExtControlProviderNearBy$3 extends com.tencent.mm.pluginsdk.c.b
{
  ExtControlProviderNearBy$3(ExtControlProviderNearBy paramExtControlProviderNearBy)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.sdk.b.b paramb)
  {
    AppMethodBeat.i(20364);
    if ((paramb instanceof kn))
    {
      if (ExtControlProviderNearBy.c(this.lQB) == null)
      {
        AppMethodBeat.o(20364);
        return;
      }
      paramString = (kn)paramb;
      ab.i("MicroMsg.ExtControlProviderNearBy", "get lbsfriend errcode: " + paramInt2 + ", errType: " + paramInt1);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label275;
      ExtControlProviderNearBy.a(this.lQB, paramString.cGl.cGs);
      if ((ExtControlProviderNearBy.d(this.lQB) != null) && (ExtControlProviderNearBy.d(this.lQB).size() != 0))
        break label148;
      ab.e("MicroMsg.ExtControlProviderNearBy", "get lbsfriend list size:0");
      ExtControlProviderNearBy.c(this.lQB).countDown();
    }
    while (true)
    {
      ExtControlProviderNearBy.f(this.lQB);
      AppMethodBeat.o(20364);
      break;
      label148: if (ExtControlProviderNearBy.d(this.lQB).size() > 10)
      {
        ab.i("MicroMsg.ExtControlProviderNearBy", "get lbsfriend size > 10," + ExtControlProviderNearBy.d(this.lQB).size());
        ExtControlProviderNearBy.d(this.lQB).subList(10, ExtControlProviderNearBy.d(this.lQB).size()).clear();
      }
      ExtControlProviderNearBy.a(this.lQB, new CountDownLatch(ExtControlProviderNearBy.d(this.lQB).size()));
      ExtControlProviderNearBy.c(this.lQB).countDown();
      ExtControlProviderNearBy.e(this.lQB);
      continue;
      label275: ab.e("MicroMsg.ExtControlProviderNearBy", "get lbsfriend failed: errCode = " + paramInt2 + ", errType=" + paramInt1);
      ExtControlProviderNearBy.c(this.lQB).countDown();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderNearBy.3
 * JD-Core Version:    0.6.2
 */