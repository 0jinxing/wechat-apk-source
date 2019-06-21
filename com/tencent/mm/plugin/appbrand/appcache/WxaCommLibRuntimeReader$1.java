package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.Callable;

final class WxaCommLibRuntimeReader$1
  implements Callable<Object>
{
  public final Object call()
  {
    AppMethodBeat.i(59454);
    try
    {
      Object localObject = XIPCInvoker.a("com.tencent.mm", IPCVoid.eGH, WxaCommLibRuntimeReader.a.class);
      AppMethodBeat.o(59454);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WxaCommLibRuntimeReader", localException, "load() ipc read lib", new Object[0]);
        AppMethodBeat.o(59454);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader.1
 * JD-Core Version:    0.6.2
 */