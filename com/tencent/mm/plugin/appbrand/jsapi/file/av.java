package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.k;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.appstorage.u;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

final class av extends d
{
  private static Map<String, Object> a(k paramk, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(102836);
    paramMap.put("mode", Integer.valueOf(paramk.st_mode));
    paramMap.put("size", Long.valueOf(paramk.st_size));
    paramMap.put("lastAccessedTime", Long.valueOf(paramk.st_atime));
    paramMap.put("lastModifiedTime", Long.valueOf(paramk.st_mtime));
    AppMethodBeat.o(102836);
    return paramMap;
  }

  private static f.a h(c paramc, String paramString)
  {
    AppMethodBeat.i(102835);
    Object localObject = new LinkedList();
    paramc = paramc.asE().g(paramString, (List)localObject);
    switch (av.1.hJS[paramc.ordinal()])
    {
    default:
      paramc = new f.a("fail " + paramc.name(), new Object[0]);
      AppMethodBeat.o(102835);
    case 1:
    }
    while (true)
    {
      return paramc;
      paramc = new f.a("ok", new Object[0]);
      paramString = ((List)localObject).iterator();
      while (paramString.hasNext())
      {
        localObject = (u)paramString.next();
        paramc.o(((u)localObject).gYf, a((k)localObject, new HashMap()));
      }
      AppMethodBeat.o(102835);
    }
  }

  final f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102834);
    boolean bool = paramJSONObject.optBoolean("recursive", false);
    k localk = new k();
    paramJSONObject = paramc.asE().a(paramString, localk);
    switch (av.1.hJS[paramJSONObject.ordinal()])
    {
    default:
      paramc = new f.a("fail " + paramJSONObject.name(), new Object[0]);
      AppMethodBeat.o(102834);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return paramc;
      if ((localk.st_mode & 0xF000) == 16384);
      for (int i = 1; ; i = 0)
      {
        if ((i != 0) && (bool))
          break label184;
        paramc = new f.a("ok", new Object[0]).y(a(localk, new HashMap()));
        AppMethodBeat.o(102834);
        break;
      }
      label184: paramc = h(paramc, paramString);
      AppMethodBeat.o(102834);
      continue;
      paramc = new f.a("fail no such file or directory \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102834);
      continue;
      paramc = new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102834);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.av
 * JD-Core Version:    0.6.2
 */