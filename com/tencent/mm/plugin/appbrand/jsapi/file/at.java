package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.io.File;
import java.util.Locale;
import org.json.JSONObject;

final class at extends d
{
  final f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102829);
    String str1 = paramJSONObject.optString("newPath");
    String str2 = String.format(Locale.US, "fail no such file or directory, rename \"%s\" -> \"%s\"", new Object[] { paramString, str1 });
    paramJSONObject = String.format(Locale.US, "fail permission denied, rename \"%s\" -> \"%s\"", new Object[] { paramString, str1 });
    File localFile = paramc.asE().Z(paramString, true);
    if ((localFile == null) || (!localFile.exists()))
    {
      paramc = new f.a(str2, new Object[0]);
      AppMethodBeat.o(102829);
    }
    while (true)
    {
      return paramc;
      if (l.F(localFile))
      {
        paramc = new f.a("fail \"%s\" not a regular file", new Object[] { paramString });
        AppMethodBeat.o(102829);
      }
      else
      {
        paramc = paramc.asE().a(str1, localFile, true);
        switch (at.1.hJS[paramc.ordinal()])
        {
        default:
          paramc = new f.a("fail " + paramc.name(), new Object[0]);
          AppMethodBeat.o(102829);
          break;
        case 1:
          paramc = new f.a(paramJSONObject, new Object[0]);
          AppMethodBeat.o(102829);
          break;
        case 2:
          paramc = new f.a(str2, new Object[0]);
          AppMethodBeat.o(102829);
          break;
        case 3:
          paramc = new f.a("fail sdcard not mounted", new Object[0]);
          AppMethodBeat.o(102829);
          break;
        case 4:
          paramc = new f.a("ok", new Object[0]);
          AppMethodBeat.o(102829);
        }
      }
    }
  }

  protected final String y(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102830);
    paramJSONObject = paramJSONObject.optString("oldPath");
    AppMethodBeat.o(102830);
    return paramJSONObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.at
 * JD-Core Version:    0.6.2
 */