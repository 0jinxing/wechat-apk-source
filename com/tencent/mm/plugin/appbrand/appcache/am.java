package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.io.FilenameFilter;

public final class am
{
  public static void a(FilenameFilter paramFilenameFilter)
  {
    AppMethodBeat.i(59481);
    String str = g.RP().cachePath;
    Object localObject = str;
    if (!str.endsWith("/"))
      localObject = str + "/";
    localObject = new File((String)localObject + "appbrand/jscache");
    if ((((File)localObject).exists()) && (((File)localObject).isDirectory()))
    {
      paramFilenameFilter = ((File)localObject).listFiles(paramFilenameFilter);
      if ((paramFilenameFilter != null) && (paramFilenameFilter.length > 0))
      {
        int i = paramFilenameFilter.length;
        for (int j = 0; j < i; j++)
        {
          localObject = paramFilenameFilter[j];
          com.tencent.mm.a.e.t((File)localObject);
          ab.i("WxaJsCacheStorage", "clear file:%s", new Object[] { ((File)localObject).getName() });
        }
      }
    }
    AppMethodBeat.o(59481);
  }

  public final void clear(String paramString)
  {
    AppMethodBeat.i(59482);
    a(new am.1(this, paramString));
    AppMethodBeat.o(59482);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.am
 * JD-Core Version:    0.6.2
 */