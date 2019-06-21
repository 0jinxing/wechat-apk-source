package com.tencent.mm.plugin.appbrand.h;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class z
{
  private static String htk;

  public static String aBv()
  {
    AppMethodBeat.i(131680);
    Object localObject;
    if (!bo.isNullOrNil(htk))
    {
      localObject = htk;
      AppMethodBeat.o(131680);
    }
    while (true)
    {
      return localObject;
      try
      {
        localObject = (IPCString)XIPCInvoker.a("com.tencent.mm", IPCVoid.eGH, z.a.class);
        if (localObject == null)
        {
          String str2 = Environment.getExternalStorageDirectory().getAbsolutePath();
          localObject = str2;
          if (!str2.endsWith("/"))
            localObject = str2 + "/";
          localObject = (String)localObject + "Tencent/MicroMsg/wxajscache";
          AppMethodBeat.o(131680);
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
        AppMethodBeat.o(131680);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.z
 * JD-Core Version:    0.6.2
 */