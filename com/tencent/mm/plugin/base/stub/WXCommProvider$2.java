package com.tencent.mm.plugin.base.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fc;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class WXCommProvider$2
  implements ap.a
{
  WXCommProvider$2(WXCommProvider paramWXCommProvider)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(18163);
    if ((a.xxA != null) && (a.xxA.av(fc.class)));
    while (true)
    {
      synchronized (WXCommProvider.access$000())
      {
        ab.i("MicroMsg.WXCommProvider", "The lock was released.");
        WXCommProvider.aMx();
        WXCommProvider.access$000().notifyAll();
        bool = false;
        AppMethodBeat.o(18163);
        return bool;
      }
      boolean bool = true;
      AppMethodBeat.o(18163);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCommProvider.2
 * JD-Core Version:    0.6.2
 */