package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.luggage.g.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.q;
import com.tencent.mm.plugin.appbrand.s.q.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

class ay extends d
{
  f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102843);
    boolean bool = paramJSONObject.optBoolean("append", false);
    String str = paramJSONObject.optString("encoding");
    q.a(paramc.aBx(), paramJSONObject, (q.a)paramc.aa(q.a.class));
    Object localObject = paramJSONObject.opt("data");
    if ((localObject instanceof String))
      if (bo.isNullOrNil(str))
        paramJSONObject = (e)e.a.hJH.get("utf8");
    label555: 
    while (true)
    {
      try
      {
        paramJSONObject = paramJSONObject.AY((String)localObject);
        paramJSONObject = new a(paramJSONObject);
        paramc = paramc.asE().a(paramString, paramJSONObject, bool);
        switch (ay.1.hJS[paramc.ordinal()])
        {
        default:
          paramc = new f.a("fail " + paramc.name(), new Object[0]);
          AppMethodBeat.o(102843);
          return paramc;
          paramJSONObject = (e)e.a.hJH.get(str.toLowerCase());
          if (paramJSONObject != null)
            break label555;
          paramc = new f.a("fail invalid encoding", new Object[0]);
          AppMethodBeat.o(102843);
          continue;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      }
      catch (Exception paramc)
      {
        paramc = new f.a("fail " + paramc.getMessage(), new Object[0]);
        AppMethodBeat.o(102843);
        continue;
      }
      if ((localObject instanceof ByteBuffer))
      {
        paramJSONObject = new a((ByteBuffer)localObject);
      }
      else if (localObject == null)
      {
        if (bool)
        {
          paramc = new f.a("ok", new Object[0]);
          AppMethodBeat.o(102843);
        }
        else
        {
          paramJSONObject = new ByteArrayInputStream(new byte[0]);
        }
      }
      else
      {
        paramc = new f.a("fail invalid data", new Object[0]);
        AppMethodBeat.o(102843);
        continue;
        paramc = new f.a("fail no such file or directory, open \"%s\"", new Object[] { paramString });
        AppMethodBeat.o(102843);
        continue;
        paramc = new f.a("fail no such file \"%s\"", new Object[] { paramString });
        AppMethodBeat.o(102843);
        continue;
        paramc = new f.a("fail illegal operation on a directory, open \"%s\"", new Object[] { paramString });
        AppMethodBeat.o(102843);
        continue;
        paramc = new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
        AppMethodBeat.o(102843);
        continue;
        paramc = new f.a("fail \"%s\" is not a regular file", new Object[] { paramString });
        AppMethodBeat.o(102843);
        continue;
        paramc = new f.a("fail the maximum size of the file storage limit is exceeded", new Object[0]);
        AppMethodBeat.o(102843);
        continue;
        paramc = new f.a("ok", new Object[0]);
        AppMethodBeat.o(102843);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.ay
 * JD-Core Version:    0.6.2
 */