package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import org.json.JSONObject;

final class aq extends d
{
  final f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102823);
    boolean bool = paramJSONObject.optBoolean("recursive", false);
    paramc = paramc.asE().X(paramString, bool);
    switch (aq.1.hJS[paramc.ordinal()])
    {
    default:
      paramc = new f.a("fail " + paramc.name(), new Object[0]);
      AppMethodBeat.o(102823);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return paramc;
      paramc = new f.a("fail no such file or directory \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102823);
      continue;
      paramc = new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102823);
      continue;
      paramc = new f.a("fail file already exists \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102823);
      continue;
      paramc = new f.a("ok", new Object[0]);
      AppMethodBeat.o(102823);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.aq
 * JD-Core Version:    0.6.2
 */