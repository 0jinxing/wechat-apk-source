package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.luggage.g.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

final class as extends d
{
  final f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102827);
    paramJSONObject = paramJSONObject.optString("encoding");
    ab.i("MicroMsg.AppBrand.UnitReadFile", "call, path %s, encoding %s", new Object[] { paramString, paramJSONObject });
    if (bo.isNullOrNil(paramJSONObject))
      paramJSONObject = null;
    label341: 
    while (true)
    {
      com.tencent.mm.plugin.appbrand.r.j localj = new com.tencent.mm.plugin.appbrand.r.j();
      paramc = paramc.asE().b(paramString, localj);
      if (paramc == com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
        if (paramJSONObject == null)
        {
          paramc = (Comparable)localj.value;
          if (!(paramc instanceof ByteBuffer))
            a.j((ByteBuffer)localj.value);
          paramc = new f.a("ok", new Object[0]).o("data", paramc);
          AppMethodBeat.o(102827);
        }
      while (true)
      {
        return paramc;
        paramJSONObject = (e)e.a.hJH.get(paramJSONObject.toLowerCase());
        if (paramJSONObject != null)
          break label341;
        paramc = new f.a("fail invalid encoding", new Object[0]);
        AppMethodBeat.o(102827);
        continue;
        paramc = paramJSONObject.o((ByteBuffer)localj.value);
        break;
        switch (as.1.hJS[paramc.ordinal()])
        {
        default:
          paramc = new f.a("fail " + paramc.name(), new Object[0]);
          AppMethodBeat.o(102827);
          break;
        case 1:
          paramc = new f.a("fail no such file \"%s\"", new Object[] { paramString });
          AppMethodBeat.o(102827);
          break;
        case 2:
          paramc = new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
          AppMethodBeat.o(102827);
          break;
        case 3:
          paramc = new f.a("fail \"%s\" is not a regular file", new Object[] { paramString });
          AppMethodBeat.o(102827);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.as
 * JD-Core Version:    0.6.2
 */