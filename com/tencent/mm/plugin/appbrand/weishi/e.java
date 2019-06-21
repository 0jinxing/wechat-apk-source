package com.tencent.mm.plugin.appbrand.weishi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.q;
import com.tencent.mm.g.a.q.a;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class e
{
  public static boolean E(i parami)
  {
    AppMethodBeat.i(133642);
    boolean bool;
    if (parami != null)
    {
      bool = "wxfe02ecfe70800f46".equalsIgnoreCase(parami.mAppId);
      AppMethodBeat.o(133642);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133642);
    }
  }

  static void Eu(String paramString)
  {
    AppMethodBeat.i(133644);
    ab.i("MicroMsg.AppBrandWeishiUtil", "doSendEventAppBrandUIClose");
    q localq = new q();
    localq.csA = new q.a();
    localq.csA.csB = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localq);
    AppMethodBeat.o(133644);
  }

  public static void aOz()
  {
    AppMethodBeat.i(133643);
    if (ah.bqo())
    {
      Eu("wxfe02ecfe70800f46");
      AppMethodBeat.o(133643);
    }
    while (true)
    {
      return;
      XIPCInvoker.a("com.tencent.mm", new IPCString("wxfe02ecfe70800f46"), a.class, new e.1());
      AppMethodBeat.o(133643);
    }
  }

  static class a
    implements com.tencent.mm.ipcinvoker.a<IPCString, IPCVoid>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.e
 * JD-Core Version:    0.6.2
 */