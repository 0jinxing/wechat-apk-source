package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.luggage.g.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.json.JSONObject;

final class ao extends d
{
  final f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102818);
    String str1 = paramJSONObject.optString("destPath");
    paramJSONObject = String.format(Locale.US, "fail no such file or directory, copyFile \"%s\" -> \"%s\"", new Object[] { paramString, str1 });
    String str2 = String.format(Locale.US, "fail permission denied, copyFile \"%s\" -> \"%s\"", new Object[] { paramString, str1 });
    Object localObject = paramc.asE().yg(paramString);
    if ((localObject == null) || (!((File)localObject).exists()) || (!((File)localObject).isFile()))
    {
      localObject = new com.tencent.mm.plugin.appbrand.r.j();
      paramc.asE().b(paramString, (com.tencent.mm.plugin.appbrand.r.j)localObject);
      if (((com.tencent.mm.plugin.appbrand.r.j)localObject).value == null)
      {
        paramc = new f.a(paramJSONObject, new Object[0]);
        AppMethodBeat.o(102818);
      }
    }
    while (true)
    {
      label143: return paramc;
      paramString = new a((ByteBuffer)((com.tencent.mm.plugin.appbrand.r.j)localObject).value);
      paramc = paramc.asE().a(str1, paramString, false);
      bo.b(paramString);
      while (true)
        switch (ao.1.hJS[paramc.ordinal()])
        {
        default:
          paramc = new f.a("fail " + paramc.name(), new Object[0]);
          AppMethodBeat.o(102818);
          break label143;
          if (l.F((File)localObject))
          {
            paramc = new f.a("fail \"%s\" not a regular file", new Object[] { paramString });
            AppMethodBeat.o(102818);
            break label143;
          }
          paramc = paramc.asE().a(str1, (File)localObject, false);
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      paramc = new f.a(str2, new Object[0]);
      AppMethodBeat.o(102818);
      continue;
      paramc = new f.a(paramJSONObject, new Object[0]);
      AppMethodBeat.o(102818);
      continue;
      paramc = new f.a("fail sdcard not mounted", new Object[0]);
      AppMethodBeat.o(102818);
      continue;
      paramc = new f.a("fail illegal operation on a directory, open \"%s\"", new Object[] { str1 });
      AppMethodBeat.o(102818);
      continue;
      paramc = new f.a("fail \"%s\" is not a regular file", new Object[] { str1 });
      AppMethodBeat.o(102818);
      continue;
      paramc = new f.a("fail the maximum size of the file storage limit is exceeded", new Object[0]);
      AppMethodBeat.o(102818);
      continue;
      paramc = new f.a("ok", new Object[0]);
      AppMethodBeat.o(102818);
    }
  }

  protected final String y(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102819);
    paramJSONObject = paramJSONObject.optString("srcPath");
    AppMethodBeat.o(102819);
    return paramJSONObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.ao
 * JD-Core Version:    0.6.2
 */