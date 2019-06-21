package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class an extends ay
{
  final f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102816);
    try
    {
      paramJSONObject.put("append", true);
      paramc = super.a(paramc, paramString, paramJSONObject);
      AppMethodBeat.o(102816);
      return paramc;
    }
    catch (Exception paramc)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.UnitAppendFile", "call with path(%s), put append fail ex = %s", new Object[] { paramString, paramc });
        paramc = new f.a("fail " + j.gXB.name(), new Object[0]);
        AppMethodBeat.o(102816);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.an
 * JD-Core Version:    0.6.2
 */