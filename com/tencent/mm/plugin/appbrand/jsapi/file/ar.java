package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.h;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class ar extends d
{
  final f.a a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102825);
    paramJSONObject = new LinkedList();
    com.tencent.mm.plugin.appbrand.r.j localj = new com.tencent.mm.plugin.appbrand.r.j();
    paramc = paramc.asE().a(paramString, localj);
    com.tencent.luggage.g.c.c(paramJSONObject, (List)localj.value);
    switch (ar.1.hJS[paramc.ordinal()])
    {
    default:
      paramc = new f.a("fail " + paramc.name(), new Object[0]);
      AppMethodBeat.o(102825);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      return paramc;
      paramc = new f.a("fail no such file or directory \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102825);
      continue;
      paramc = new f.a("fail not a directory \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102825);
      continue;
      paramc = new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102825);
      continue;
      paramc = new f.a("fail \"%s\" is not a regular file", new Object[] { paramString });
      AppMethodBeat.o(102825);
      continue;
      paramc = new JSONArray();
      paramString = paramJSONObject.iterator();
      while (paramString.hasNext())
        paramc.put(((h)paramString.next()).fileName);
      paramc = new f.a("ok", new Object[0]).o("files", paramc);
      AppMethodBeat.o(102825);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.ar
 * JD-Core Version:    0.6.2
 */