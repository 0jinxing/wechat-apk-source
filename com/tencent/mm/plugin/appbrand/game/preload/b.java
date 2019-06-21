package com.tencent.mm.plugin.appbrand.game.preload;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class b
{
  private static String htk;

  public static String aBv()
  {
    AppMethodBeat.i(130288);
    Object localObject;
    if (!bo.isNullOrNil(htk))
    {
      localObject = htk;
      AppMethodBeat.o(130288);
    }
    while (true)
    {
      return localObject;
      try
      {
        localObject = (IPCString)XIPCInvoker.a("com.tencent.mm", IPCVoid.eGH, b.a.class);
        if (localObject == null)
        {
          String str2 = Environment.getExternalStorageDirectory().getAbsolutePath();
          localObject = str2;
          if (!str2.endsWith("/"))
            localObject = str2 + "/";
          localObject = (String)localObject + "Tencent/MicroMsg/appbrand/loadingurl";
          AppMethodBeat.o(130288);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.V8CodeCachePathRetriever", "retrieve ipc ex = %s", new Object[] { localException });
          str1 = null;
        }
        String str1 = str1.value;
        htk = str1;
        AppMethodBeat.o(130288);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.preload.b
 * JD-Core Version:    0.6.2
 */