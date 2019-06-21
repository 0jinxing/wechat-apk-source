package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import org.json.JSONObject;

final class ap extends d
{
  final f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    boolean bool = true;
    AppMethodBeat.i(102821);
    paramc = paramc.asE().ye(paramString);
    switch (ap.1.hJS[paramc.ordinal()])
    {
    default:
      paramc = new f.a("fail " + paramc.name(), new Object[0]);
      AppMethodBeat.o(102821);
    case 1:
      while (true)
      {
        return paramc;
        paramc = new f.a("fail no such file or directory \"%s\"", new Object[] { paramString });
        AppMethodBeat.o(102821);
      }
    case 2:
    case 3:
    }
    paramString = new f.a("ok", new Object[0]);
    if (paramc == j.gXA);
    while (true)
    {
      paramc = paramString.o("result", Boolean.valueOf(bool));
      AppMethodBeat.o(102821);
      break;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.ap
 * JD-Core Version:    0.6.2
 */