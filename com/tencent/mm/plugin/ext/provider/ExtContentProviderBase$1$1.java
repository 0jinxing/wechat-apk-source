package com.tencent.mm.plugin.ext.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;
import com.tencent.mm.pluginsdk.d.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class ExtContentProviderBase$1$1
  implements bk.a
{
  ExtContentProviderBase$1$1(ExtContentProviderBase.1 param1)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(20324);
    ab.i("MicroMsg.ExtContentProviderBase", "checkIsLogin() onSceneEnd()");
    this.lQb.jDX.countDown();
    AppMethodBeat.o(20324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtContentProviderBase.1.1
 * JD-Core Version:    0.6.2
 */