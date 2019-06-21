package com.tencent.mm.plugin.appbrand.dynamic.d.a;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.h;
import com.tencent.mm.plugin.appbrand.dynamic.i.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

final class c$1 extends ae<String, JSONObject>
{
  c$1(c paramc)
  {
    super(10);
  }

  private static JSONObject Ag(String paramString)
  {
    AppMethodBeat.i(10868);
    String str = paramString;
    try
    {
      if (bo.isNullOrNil(paramString))
        str = "{}";
      long l = System.nanoTime();
      paramString = h.lw(str);
      b.f(System.nanoTime() - l, str.length());
      AppMethodBeat.o(10868);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.DefaultJsApiExecutor", Log.getStackTraceString(paramString));
        paramString = null;
        AppMethodBeat.o(10868);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.a.c.1
 * JD-Core Version:    0.6.2
 */