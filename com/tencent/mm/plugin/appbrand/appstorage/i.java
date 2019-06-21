package com.tencent.mm.plugin.appbrand.appstorage;

import android.os.Build.VERSION;
import android.system.Os;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

final class i
{
  static boolean bx(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(105365);
    if (Build.VERSION.SDK_INT >= 21);
    while (true)
    {
      try
      {
        long l = bo.anU();
        new i.a();
        Os.rename(paramString1, paramString2);
        ab.d("MicroMsg.AppBrand.FileMove", "move, os rename works, cost = %d", new Object[] { Long.valueOf(bo.anU() - l) });
        AppMethodBeat.o(105365);
        return bool;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrand.FileMove", "move, os rename exp = %s", new Object[] { bo.l(localException) });
      }
      bool = new File(paramString1).renameTo(new File(paramString2));
      AppMethodBeat.o(105365);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.i
 * JD-Core Version:    0.6.2
 */