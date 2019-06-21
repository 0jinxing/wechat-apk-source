package com.tencent.mm.plugin.appbrand.s;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class u
{
  public static String a(com.tencent.mm.plugin.appbrand.i parami, String paramString1, String paramString2)
  {
    AppMethodBeat.i(133597);
    ab.i("MicroMsg.SourceMapUtil", "hy: getting sourcemap %s, %s", new Object[] { paramString1, paramString2 });
    if ((parami == null) || (paramString1 == null) || (paramString1.length() == 0))
    {
      ab.w("MicroMsg.SourceMapUtil", "runtime or jsRuntime or filePath is null.");
      parami = "";
      AppMethodBeat.o(133597);
    }
    while (true)
    {
      return parami;
      if (j.a.np(parami.ye().hhd.gVt))
      {
        ab.i("MicroMsg.SourceMapUtil", "current running type is ReleaseType do not need to inject sourceMap.");
        parami = "";
        AppMethodBeat.o(133597);
      }
      else
      {
        parami = aw.a(parami, paramString1 + ".map");
        if ((parami == null) || (parami.length() == 0))
        {
          ab.i("MicroMsg.SourceMapUtil", "sourceMap of the script(%s) is null or nil.", new Object[] { paramString1 });
          parami = "";
          AppMethodBeat.o(133597);
        }
        else
        {
          parami = String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap['%s'] = %s)", new Object[] { paramString2 + paramString1, parami });
          AppMethodBeat.o(133597);
        }
      }
    }
  }

  public static void a(com.tencent.mm.plugin.appbrand.i parami, com.tencent.mm.plugin.appbrand.h.i parami1)
  {
    AppMethodBeat.i(133596);
    ab.i("MicroMsg.SourceMapUtil", "hy: injecting sourcemap.js");
    if (parami == null)
    {
      ab.w("MicroMsg.SourceMapUtil", "hy: not valid runtime");
      AppMethodBeat.o(133596);
    }
    while (true)
    {
      return;
      if (j.a.np(parami.ye().hhd.gVt))
      {
        ab.i("MicroMsg.SourceMapUtil", "current running type is ReleaseType do not need to inject sourceMap.");
        AppMethodBeat.o(133596);
      }
      else
      {
        n.a(parami1, WxaCommLibRuntimeReader.xu("WASourceMap.js"), new n.a()
        {
          public final void lo(String paramAnonymousString)
          {
            AppMethodBeat.i(133595);
            ab.e("MicroMsg.SourceMapUtil", "hy: Inject '%s' Script Failed: %s", new Object[] { "WASourceMap.js", paramAnonymousString });
            AppMethodBeat.o(133595);
          }

          public final void onSuccess(String paramAnonymousString)
          {
            AppMethodBeat.i(133594);
            ab.i("MicroMsg.SourceMapUtil", "hy: Inject '%s' Script Success: %s", new Object[] { "WASourceMap.js", paramAnonymousString });
            AppMethodBeat.o(133594);
          }
        });
        parami1.evaluateJavascript(getSysInfo(), null);
        AppMethodBeat.o(133596);
      }
    }
  }

  @SuppressLint({"DefaultLocal"})
  public static String getSysInfo()
  {
    AppMethodBeat.i(133598);
    String str = String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap.__system = 'Android %s')", new Object[] { Build.VERSION.RELEASE });
    AppMethodBeat.o(133598);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.u
 * JD-Core Version:    0.6.2
 */