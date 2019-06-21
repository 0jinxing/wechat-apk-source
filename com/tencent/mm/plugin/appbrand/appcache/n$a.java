package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class n$a
{
  static void xo(String paramString)
  {
    AppMethodBeat.i(129335);
    e.deleteFile(paramString);
    try
    {
      Runtime localRuntime = Runtime.getRuntime();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("rm -r ");
      localRuntime.exec(paramString + "_xdir");
      AppMethodBeat.o(129335);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.PkgCleanupLogic.CleanupUtil", "rm -r %s, e = %s", new Object[] { paramString + "_xdir", localException });
        AppMethodBeat.o(129335);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.n.a
 * JD-Core Version:    0.6.2
 */