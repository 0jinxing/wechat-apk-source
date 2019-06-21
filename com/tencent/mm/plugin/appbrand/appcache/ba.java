package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import java.io.File;

public final class ba
{
  public static void clear(String paramString)
  {
    AppMethodBeat.i(59545);
    String str1 = g.RP().cachePath;
    String str2 = str1;
    if (!str1.endsWith("/"))
      str2 = str1 + "/";
    paramString = new File(str2 + "appbrand/loadingurl" + File.separator + paramString);
    if ((paramString.exists()) && (paramString.isDirectory()))
      com.tencent.mm.a.e.t(paramString);
    str2 = Environment.getExternalStorageDirectory().getAbsolutePath();
    paramString = str2;
    if (!str2.endsWith("/"))
      paramString = str2 + "/";
    paramString = new File(paramString + "Tencent/MicroMsg/appbrand/loadingurl");
    if ((paramString.exists()) && (paramString.isDirectory()))
      com.tencent.mm.a.e.t(paramString);
    AppMethodBeat.o(59545);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ba
 * JD-Core Version:    0.6.2
 */