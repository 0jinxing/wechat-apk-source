package com.tencent.mm.plugin.base.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.il;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class WXCommProvider$3
  implements Runnable
{
  WXCommProvider$3(WXCommProvider paramWXCommProvider, il paramil)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18164);
    if (!a.xxA.m(this.jDS))
      ab.e("MicroMsg.WXCommProvider", "handle scan result failed again");
    AppMethodBeat.o(18164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCommProvider.3
 * JD-Core Version:    0.6.2
 */