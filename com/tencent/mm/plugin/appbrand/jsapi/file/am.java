package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import org.json.JSONObject;

final class am extends d
{
  final f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102815);
    if (paramc.asE().yd(paramString) == j.gXA);
    for (paramc = "ok"; ; paramc = String.format("fail no such file or directory \"%s\"", new Object[] { paramString }))
    {
      paramc = new f.a(paramc, new Object[0]);
      AppMethodBeat.o(102815);
      return paramc;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.am
 * JD-Core Version:    0.6.2
 */